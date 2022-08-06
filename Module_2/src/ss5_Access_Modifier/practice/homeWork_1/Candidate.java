package ss5_Access_Modifier.practice.homeWork_1;

public class Candidate {
    private int codeCandidate;
    private String nameCadidate;
    private int birthDay;
    private int scoreMaths;
    private int scoreLiterature;
    private int scoreEnglish;
    static int count;

    public Candidate(int codeCandidate, String nameCadidate, int birthDay, int scoreMaths, int scoreLiterature, int scoreEnglish) {
        this.codeCandidate = codeCandidate;
        this.nameCadidate = nameCadidate;
        this.birthDay = birthDay;
        this.scoreMaths = scoreMaths;
        this.scoreLiterature = scoreLiterature;
        this.scoreEnglish = scoreEnglish;
        count ++;
    }

    public Candidate() {
    }

    public int getCodeCandidate() {
        return codeCandidate;
    }

    public void setCodeCandidate(int codeCandidate) {
        this.codeCandidate = codeCandidate;
    }

    public String getNameCadidate() {
        return nameCadidate;
    }

    public void setNameCadidate(String nameCadidate) {
        this.nameCadidate = nameCadidate;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getScoreMaths() {
        return scoreMaths;
    }

    public void setScoreMaths(int scoreMaths) {
        if (scoreMaths < 0 || scoreMaths > 10) {
            System.out.println("Yêu cầu nhập lại");
        } else {
            this.scoreMaths = scoreMaths;
        }
    }

    public int getScoreLiterature() {
        return scoreLiterature;
    }

    public void setScoreLiterature(int scoreLiterature) {
        if (scoreLiterature < 0 || scoreLiterature > 10) {
            System.out.println("Yêu cầu nhập lại");
        } else {

            this.scoreLiterature = scoreLiterature;
        }
    }

    public int getScoreEnglish() {
        return scoreEnglish;
    }

    public void setScoreEnglish(int scoreEnglish) {
        if (scoreEnglish < 0 || scoreEnglish > 10) {
            System.out.println("Yêu cầu nhập lại");
        } else {
            this.scoreEnglish = scoreEnglish;
        }
    }

    public int TotalScore() {

        return this.scoreMaths + this.scoreLiterature + this.scoreEnglish;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "codeCandidate=" + codeCandidate +
                ", nameCadidate='" + nameCadidate + '\'' +
                ", birthDay=" + birthDay +
                ", scoreMaths=" + scoreMaths +
                ", scoreLiterature=" + scoreLiterature +
                ", scoreEnglish=" + scoreEnglish +
                '}';
    }
}

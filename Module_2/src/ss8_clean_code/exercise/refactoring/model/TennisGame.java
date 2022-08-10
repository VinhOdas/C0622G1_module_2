package ss8_clean_code.exercise.refactoring.model;

public class TennisGame {

    public static String getScore(String playerOne, String playerTwo, int playerScoreOne, int playerScoreTwo) {
        String score = "";
        int tempScore=0;
        if (playerScoreOne==playerScoreTwo)
        {
            switch (playerScoreOne)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (playerScoreOne>=4 || playerScoreTwo>=4)
        {
            int minusResult = playerScoreOne-playerScoreTwo;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = playerScoreOne;
                else { score+="-"; tempScore = playerScoreTwo;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}

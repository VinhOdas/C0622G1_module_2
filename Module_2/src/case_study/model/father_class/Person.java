package case_study.model.father_class;

public abstract class Person {
    private String name;
    private String birthDay;
    private String gender;
    private String identityCard;
    private String phoneNumber;
    private String mail;

    public Person() {
    }

    public Person(String name, String birthDay, String gender, String identityCard, String phoneNumber, String mail) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return  String.format("%s,%s,%s,%s,%s,%s",getName(),getBirthDay()
                ,getGender(),getIdentityCard(),getPhoneNumber(),getMail());
//        return "name='" + name + '\'' +
//                ", birthDay='" + birthDay + '\'' +
//                ", gender='" + gender + '\'' +
//                ", identityCard=" + identityCard +
//                ", phoneNumber=" + phoneNumber +
//                ", mail='" + mail + '\'' +
//                '}';
    }
}

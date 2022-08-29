package case_study.model.sub_class.employee_manager;

import case_study.model.father_class.Person;

public class Employee extends Person {
    private String idEmployee;
    private String level;
    private String location;
    private double wage;

    public Employee() {
    }

    public Employee(String idEmployee, String level, String location, double wage) {
        this.idEmployee = idEmployee;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

//    public Employee(String idEmployee,String name, String birthDay, String gender, String identityCard, String phoneNumber,
//                    String mail, String level, String location, double wage) {
//        super(name, birthDay, gender, identityCard, phoneNumber, mail);
//        this.level = level;
//        this.location = location;
//        this.wage = wage;
//    }

    public Employee(String idEmployee, String name, String birthDay, String gender, String identityCard, String phoneNumber, String mail,  String level, String location, double wage) {
        super(name, birthDay, gender, identityCard, phoneNumber, mail);
        this.idEmployee = idEmployee;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s",
                getIdEmployee(),super.toString(),getLevel(),getLocation(),getWage());
//        return "idEmployee='" + idEmployee + '\'' +
//                super.toString()+
//                ", level='" + level + '\'' +
//                ", location='" + location + '\'' +
//                ", wage=" + wage +
//                '}';
    }
}

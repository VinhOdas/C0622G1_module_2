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

    public Employee(String idEmployee,String name, String birthDay, String gender, String identityCard, String phoneNumber,
                    String mail, String level, String location, double wage) {
        super(name, birthDay, gender, identityCard, phoneNumber, mail);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee='" + idEmployee + '\'' +
                super.toString()+
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage +
                '}';
    }
}

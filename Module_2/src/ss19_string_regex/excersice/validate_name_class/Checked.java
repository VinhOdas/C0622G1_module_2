package ss19_string_regex.excersice.validate_name_class;

public class Checked {
    private String nameClass;

    public Checked(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return "Checked{" +
                "nameClass='" + nameClass + '\'' +
                '}';
    }
}

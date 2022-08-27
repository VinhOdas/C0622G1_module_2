package case_study.model.sub_class.employee_manager;
//Mã khách hàng, Họ tên , Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Loại khách, Địa chỉ
// (resort sẽ phân loại Customer để áp dụng các chính sách phục vụ cho phù hợp).
//Loại Customer bao gồm: (Diamond, Platinium, Gold, Silver, Member).
import case_study.model.father_class.Person;

public class Customer extends Person {
    private String idCustomer;
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(String idCustomer, String typeOfGuest, String address) {
        this.idCustomer = idCustomer;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(String idCustomer,String name, String birthDay, String gender,
                    String identityCard, String phoneNumber,
                    String mail,  String typeOfGuest, String address) {
        super(name, birthDay, gender, identityCard, phoneNumber, mail);
        this.idCustomer = idCustomer;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "idCustomer='" + idCustomer + '\'' +
                super.toString()+
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

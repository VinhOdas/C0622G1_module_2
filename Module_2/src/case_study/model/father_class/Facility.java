package case_study.model.father_class;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private  double usableArea;
    private double rentalCosts;
    private int maxNumberOfPeople;
    private String rentStyle;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, double usableArea, double rentalCosts, int maxNumberOfPeople, String rentStyle) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.rentStyle = rentStyle;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getRentStyle() {
        return rentStyle;
    }

    public void setRentStyle(String rentStyle) {
        this.rentStyle = rentStyle;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s",getServiceCode(),getServiceName()
                ,getUsableArea(),getRentalCosts(),getMaxNumberOfPeople(),getRentStyle());
//        return "Furama{" +
//                "serviceCode='" + serviceCode + '\'' +
//                ", serviceName='" + serviceName + '\'' +
//                ", usableArea=" + usableArea +
//                ", rentalCosts=" + rentalCosts +
//                ", maxNumberOfPeople=" + maxNumberOfPeople +
//                ", rentStyle='" + rentStyle + '\'' +
//                '}';
    }
}

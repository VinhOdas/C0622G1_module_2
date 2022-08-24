package case_study.model.sub_class.service_manage;

import case_study.model.father_class.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceCode, String serviceName, double usableArea, double rentalCosts, int maxNumberOfPeople, String rentStyle, String freeService) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maxNumberOfPeople, rentStyle);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }
}

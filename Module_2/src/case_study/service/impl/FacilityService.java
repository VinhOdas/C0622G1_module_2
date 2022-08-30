package case_study.service.impl;

import case_study.model.father_class.Facility;
import case_study.service.IFacilityService;
import case_study.service.IHouseService;
import case_study.service.IRoomService;
import case_study.service.IVillaService;

import java.util.*;

public class FacilityService implements IFacilityService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IRoomService roomService = new RoomService();
    private static final IVillaService villaService = new VillaService();
    private static final IHouseService houseService = new HouseService();
    Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();


    @Override
    public void displayFacility() {


    }

    @Override
    public void addFacility() {
        Facility facility = this.infoFacility();
        int key = 0;
        facilityIntegerMap.put(facility, key);
        System.out.println("Thêm thành công");

    }




    @Override
    public void displayListFacilityMaintenance() {
        while (true) {
            try {
                boolean check = false;
                System.out.println("Vui lòng chọn một số lựa chọn sau" +
                        "\n 1. 1 sao" +
                        "\n 2. 2 sao" +
                        "\n 3. 3 sao" +
                        "\n 4. 4 sao" +
                        "\n 5. 5 sao" +
                        "\n 6.VIP" +
                        "\n 7. Quay lại");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                }
                if (check) {
                    break;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

    }
    public Facility findFacility(){

        return null;
    }
    public Facility infoFacility(){
        while (true) {
            try {
                System.out.println(
                        "1.Check bảo trì villa" +
                        "\n 2.Check bảo trì House" +
                        "\n 3.Check bảo trì Room" +
                        "\n 4. Return main menu");

            } catch (NumberFormatException e) {
                System.out.println("lựa chọn không hợp lệ");
            }
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    villaService.addVilla();
                    break;
                case 2:
                    houseService.addHouse();
                    break;
                case 3:
                    roomService.addRoom();
                    break;
                case 4:
                    break;
            }
            break;
        }
        return null;
    }







}

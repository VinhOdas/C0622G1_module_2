package case_study.service.impl;

import case_study.model.father_class.Facility;
import case_study.model.sub_class.service_manage.House;
import case_study.model.sub_class.service_manage.Room;
import case_study.model.sub_class.service_manage.Villa;
import case_study.service.IFacilityService;
import case_study.service.IHouseService;
import case_study.service.IRoomService;
import case_study.service.IVillaService;
import case_study.utils.read_file.ReadFile;

import java.util.*;

public class FacilityService implements IFacilityService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IRoomService roomService = new RoomService();
    private static final IVillaService villaService = new VillaService();
    private static final IHouseService houseService = new HouseService();
    Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static final String PATH_HOUSE = "src\\case_study\\data\\facility\\House.CSV";
    private static final String PATH_ROOM = "src\\case_study\\data\\facility\\Room.CSV";
    private static final String PATH_VILLA = "src\\case_study\\data\\facility\\Villa.CSV";
    List<House> houses = new ArrayList<>();
    List<Villa> villas = new ArrayList<>();
    List<Room> rooms = new ArrayList<>();
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
                System.out.println("Vui lòng chọn một số lựa chọn sau" +
                        "\n 1. kiểm tra bảo trì villa " +
                        "\n 2. kiểm tra bảo trì House " +
                        "\n 3. kiểm tra bào trì Room" +
                        "\n 4. Quay lại");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:


                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
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
                        "   1.Add Villa"+
                        "\n 2.Add House"+
                        "\n 3.Add Room" +
                        "\n 4.Return main menu");

            } catch (NumberFormatException e) {
                System.out.println("lựa chọn không hợp lệ");
            }

            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:

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

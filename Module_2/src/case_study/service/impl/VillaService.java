package case_study.service.impl;

import case_study.controller.FuramaController;
import case_study.model.father_class.Facility;
import case_study.model.sub_class.service_manage.House;
import case_study.model.sub_class.service_manage.Room;
import case_study.model.sub_class.service_manage.Villa;
import case_study.service.IFacilityService;
import case_study.service.IHouseService;
import case_study.service.IRoomService;
import case_study.service.IVillaService;
import case_study.service.exception.CheckedException;
import case_study.utils.read_file.ReadFile;
import homeWork.home_work_1.service.InfoException;
import homeWork.home_work_1.utils.read_write_file.WriteFile;

import java.util.*;

public class VillaService implements IVillaService {
    private static final IFacilityService facilityService = new FacilityService();
    private static final FuramaController furamaController = new FuramaController();
    private static final IRoomService roomService = new RoomService();
    private static final IVillaService villaService = new VillaService();
    private static final IHouseService houseService = new HouseService();
    private static Scanner scanner = new Scanner(System.in);
    Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    List<Villa> villaIntegerMap = new ArrayList<>();
    List<Room> roomIntegerMap = new ArrayList<>();
    List<House> houseIntegerMap = new ArrayList<>();
    private static final String PATH_VILLA = "src\\case_study\\data\\facility\\Villa.CSV";
    public Villa infoVilla(){
// public Villa(String serviceCode, String serviceName, double usableArea, double rentalCosts,
//        int maxNumberOfPeople, String rentStyle, String roomStandard, double swimmingPoolArea, int numberOfFloors)
        String serviceCode;
        while (true) {
            try {
                System.out.println("Enter id:(vd: EP01)");
                serviceCode = scanner.nextLine();
                if (!serviceCode.matches("[E][P]\\d{1,2}")) {
                    throw new CheckedException("Input invalid");
                }
                ReadFile.readVillaList(PATH_VILLA);
                for (Villa villa : villaIntegerMap) {
                    if (villa.getServiceCode().equals(serviceCode)) {
                        throw new InfoException("Id c???a b???n b??? tr??ng ");
                    }
                }
                break;


            } catch (CheckedException | InfoException e) {
                System.out.println(e.getMessage());

            }
        }
        String serviceNameVilla ;
        do {
            System.out.println("Nh???p t??n c???a d???ch v???");
            try {
                System.out.print("M???i b???n nh???p t??n: ");
                serviceNameVilla = (scanner.nextLine());
                String str;
                for (int i = 0; i < serviceNameVilla.length(); i++) {
                    str = "";
                    if ((str + serviceNameVilla.charAt(i)).matches("\\d+")) {
                        throw new CheckedException("T??n b???n nh???p ko h???p l???.");
                    }
                }

                break;
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        double usableArea;
        do {
            System.out.println("Nh???p v??o di???n t??ch.");
            try {
                usableArea = Double.parseDouble(scanner.nextLine());
                if (usableArea < 0 || usableArea > 1000000000) {
                    throw new CheckedException("Di???n t??ch ph???i > 0 & <10000000000000");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ph???i l?? s???");
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        double rentalCosts;
        do {
            System.out.println("Nh???p v??o gi?? thu??.");
            try {
                rentalCosts = Double.parseDouble(scanner.nextLine());
                if (rentalCosts < 0 || rentalCosts > 1000000000) {
                    throw new CheckedException("Gi?? ti???n ph???i > 0 & <10000000000000");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("ph???i l?? s???");
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        int maxNumberOfPeople;
        do {
            System.out.println("Nh???p v??o s??? l?????ng ng?????i.");
            try {
                maxNumberOfPeople = Integer.parseInt(scanner.nextLine());
                if (maxNumberOfPeople < 0 || maxNumberOfPeople > 15) {
                    throw new CheckedException("S??? l?????ng kh??ng ???????c v?????t qu?? 5.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("ph???i l?? s???");
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        String rentStyle = "";
        while (true) {
            try {
                System.out.println("Vui l??ng ch???n m???t s??? l???a ch???n sau" +
                        "\n 1. Thu?? theo gi???" +
                        "\n 2. Thu?? theo ng??y" +
                        "\n 3. Thu?? theo th??ng" +
                        "\n 4. Thu?? theo n??m" +
                        "\n 5. Quay l???i");
                boolean check = false;
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        rentStyle = "Thu?? theo gi???";
                        check = true;
                        break;
                    case 2:
                        rentStyle = "Thu?? theo ng??y";
                        check = true;
                        break;
                    case 3:
                        rentStyle = "Thu?? theo th??ng";
                        check = true;
                        break;
                    case 4:
                        rentStyle = "Thu?? theo n??m";
                        check = true;
                        break;
                    case 5:
                        infoVilla();
                        break;
                    default:
                        System.out.println("Ch???n ????ng v??o");
                        break;

                }
                if (check) {
                    break;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        String roomStandard = "";
        while (true) {
            try {
                boolean check = false;
                System.out.println("Vui l??ng ch???n m???t s??? l???a ch???n sau" +
                        "\n 1. 1 sao" +
                        "\n 2. 2 sao" +
                        "\n 3. 3 sao" +
                        "\n 4. 4 sao" +
                        "\n 5. 5 sao" +
                        "\n 6.VIP" +
                        "\n 7. Quay l???i");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        roomStandard = "1 sao";
                        check = true;
                        break;
                    case 2:
                        roomStandard = "2 sao";
                        check = true;
                        break;
                    case 3:
                        roomStandard = "3 sao";
                        check = true;
                        break;
                    case 4:
                        roomStandard = "4 sao";
                        check = true;
                        break;
                    case 5:
                        roomStandard = "5 sao";
                        check = true;
                        break;
                    case 6:
                        roomStandard = "VIP";
                        check = true;
                        break;
                    case 7:
                        infoVilla();
                        break;
                    default:
                        System.out.println("Ch???n ????ng v??o");
                        break;

                }
                if (check) {
                    break;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        double swimmingPoolArea;
        do {
            System.out.println("Nh???p ti???n l????ng");
            try {
                swimmingPoolArea = Double.parseDouble(scanner.nextLine());
                if (swimmingPoolArea < 0 || swimmingPoolArea > 1000000000) {
                    throw new CheckedException("Gi?? ti???n ph???i > 0 & <10000000000000");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(" ph???i l?? m???t s???");
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        int numberOfFloors ;
        do {
            System.out.println("Nh???p v??o s??? l?????ng ");
            try {
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                if (numberOfFloors < 0 || numberOfFloors > 5) {
                    throw new CheckedException("S??? l?????ng kh??ng ???????c v?????t qu?? 5.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("ph???i l?? s???");
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        WriteFile.writeFile(PATH_VILLA,convertEmployeeToString(villaIntegerMap));
        return new Villa(serviceCode, serviceNameVilla,usableArea,rentalCosts,maxNumberOfPeople,
                rentStyle,roomStandard,swimmingPoolArea,numberOfFloors);
    }
    public void  addVilla(){
        Villa villa = this.infoVilla();
        villaIntegerMap.add(villa);
        WriteFile.writeFile(PATH_VILLA,convertEmployeeToString(villaIntegerMap));
    }
    private String convertString(Villa villa){
        return villa.getServiceCode()+","+villa.getServiceName()+","+villa.getUsableArea()
                +","+villa.getRentalCosts()+","+villa.getMaxNumberOfPeople()+
                ","+villa.getRentStyle()+","+villa.getRoomStandard()+","+villa.getSwimmingPoolArea()+","+villa.getNumberOfFloors();
    }

    private List<String> convertEmployeeToString(List<Villa> villas) {
        List<String> stringList = new ArrayList<>();
        for (Villa villa : villas) {
            stringList.add(convertString(villa));
        }
        return stringList;
    }
}

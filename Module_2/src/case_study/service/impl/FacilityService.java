package case_study.service.impl;

import case_study.controller.FuramaController;
import case_study.model.father_class.Facility;
import case_study.model.sub_class.employee_manager.Employee;
import case_study.model.sub_class.service_manage.House;
import case_study.model.sub_class.service_manage.Room;
import case_study.model.sub_class.service_manage.Villa;
import case_study.service.IFacilityService;
import case_study.service.IHouseService;
import case_study.service.IRoomService;
import case_study.service.IVillaService;
import case_study.service.exception.CheckedException;
import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;
import homeWork.home_work_1.models.Student;
import homeWork.home_work_1.service.InfoException;

import java.util.*;

public class FacilityService implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static final IFacilityService facilityService = new FacilityService();
    private static final FuramaController furamaController = new FuramaController();
    private static final IRoomService roomService = new RoomService();
    private static final IVillaService villaService = new VillaService();
    private static final IHouseService houseService = new HouseService();
    Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    List<Villa> villaIntegerMap = new ArrayList<>();
    List<Room > roomIntegerMap = new ArrayList<>();
    List<House > houseIntegerMap = new ArrayList<>();

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


    }
    public Facility findFacility(){

        return null;
    }
    public Facility infoFacility(){
        while (true) {
            try {
                System.out.println("1.Add New Villa" +
                        "\n 2.Add New House" +
                        "\n 3.  Add New Room" +
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

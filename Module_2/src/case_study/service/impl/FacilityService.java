package case_study.service.impl;

import case_study.model.father_class.Facility;
import case_study.model.sub_class.service_manage.House;
import case_study.model.sub_class.service_manage.Room;
import case_study.model.sub_class.service_manage.Villa;
import case_study.service.IFacilityService;
import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
    Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
    Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();

    @Override
    public void displayFacility() {

    }

    @Override
    public void addFacility() {
        Facility facility = this.infoFacility();
        facilityIntegerMap.put(facility,1);
        System.out.println("Thêm thành công");

    }
    public void  addVilla(){
        Villa villa = this.infoVilla();
        villaIntegerMap.put(villa,1);
        System.out.println("Thêm thành công");
    }
    public void  addRoom(){
        Room room = this.infoRoom();
        roomIntegerMap.put(room,1);
        System.out.println("Thêm thành công");
    }
    public void  addHouse(){
        House house = this.infoHouse();
        houseIntegerMap.put(house,1);
        System.out.println("Thêm thành công");
    }



    @Override
    public void displayListFacilityMaintenance() {

    }
    public Facility findFacility(){

        return null;
    }
    public Facility infoFacility(){

        return null;
    }
    public Room infoRoom(){
        return null;
    }
    public Villa infoVilla(){
        return null;
    }
    public House infoHouse(){
        return null;
    }




}

package case_study.utils.read_file;

import case_study.model.father_class.Facility;
import case_study.model.sub_class.employee_manager.Customer;
import case_study.model.sub_class.employee_manager.Employee;
import case_study.model.sub_class.service_manage.House;
import case_study.model.sub_class.service_manage.Room;
import case_study.model.sub_class.service_manage.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReadFile {
    public static List<String> stringList(String path){
        FileReader fileReader;
        BufferedReader bufferedReader;
        List<String> strings = new ArrayList<>();
        String line;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!= null){
                strings.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }
    public static List<Employee> readEmployeeList (String pathEmployee){
        List<String> stringEmployees = stringList(pathEmployee);
        List<Employee> employees = new ArrayList<>();
        String[] info;
        for (String line: stringEmployees) {
            info = line.split(",");
            employees.add(new Employee(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8],Double.parseDouble(info[9])));
        }
        return employees;
    }
    public static List<Customer> readCustomerList (String pathCustomer){
        List<String> strings = stringList(pathCustomer);
        List<Customer> customers = new ArrayList<>();
        String[] info;
        for (String line: strings) {
            info = line.split(",");
            customers.add(new Customer(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8]));
        }
        return customers;
    }
    public static  List<Room> readRoomList (String pathRoom){
        List<String> strings = stringList(pathRoom);
        List<Room> rooms = new ArrayList<>();
        String[] info;
        for (String line: strings) {
            info = line.split(",");
            rooms.add(new Room(info[0],info[1],Double.parseDouble(info[2]),
                    Double.parseDouble(info[3]),Integer.parseInt(info[4]),info[5],info[6]));
//                public Room(String serviceCode, String serviceName, double usableArea, double rentalCosts,
////        int maxNumberOfPeople, String rentStyle, String freeService)
        }
        return rooms ;
    }
    public static  List<Villa> readVillaList (String pathVilla){
        List<String> strings = stringList(pathVilla);
        List<Villa> villas = new ArrayList<>();
        String[] info;
        for (String line: strings) {
            info = line.split(",");
            villas.add(new Villa(info[0],info[1],Double.parseDouble(info[2]),Double.parseDouble(info[3]),
                    Integer.parseInt(info[4]),info[5],info[6],Double.parseDouble(info[7]),Integer.parseInt(info[8])));
// public Villa(String serviceCode, String serviceName, double usableArea, double rentalCosts,
//        int maxNumberOfPeople, String rentStyle, String roomStandard, double swimmingPoolArea, int numberOfFloors)
        }
        return villas ;
    }
    public static  List<House> readHouseList (String pathHouse){
        List<String> strings = stringList(pathHouse);
        List<House> houses = new ArrayList<>();
        String[] info;
        for (String line: strings) {
            info = line.split(",");
            houses.add(new House(info[0],info[1],Double.parseDouble(info[2]),Double.parseDouble(info[3]),
                    Integer.parseInt(info[4]),info[5],info[6],Integer.parseInt(info[8])));
//public House(String serviceCode, String serviceName, double usableArea, double rentalCosts,
//        int maxNumberOfPeople, String rentStyle, String roomStandard, int numberOfFloors)
        }
        return houses ;
    }


}

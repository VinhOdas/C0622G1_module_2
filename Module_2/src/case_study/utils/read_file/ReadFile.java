package case_study.utils.read_file;

import case_study.model.sub_class.employee_manager.Customer;
import case_study.model.sub_class.employee_manager.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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


}

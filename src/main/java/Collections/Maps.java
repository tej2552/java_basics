package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class Maps{

    private final HashMap<String, Integer> empIds = new HashMap<>();

    public void addEmpIds(String emp, int id){
        empIds.put(emp, id);
    }

    public Integer getEmpId(String emp){
        return empIds.get(emp);
    }

    public void displayAllEmployeeIds(){
        System.out.println(empIds);
    }

    public boolean checkEmployeeExists(String emp){
        return empIds.containsKey(emp);
    }

    public boolean checkIfEmployeeIdExists(Integer id){
        return empIds.containsValue(id);
    }

    public void delete(String empName){
        empIds.remove(empName);
    }

    public static void main(String[] args) {

        Maps map = new Maps();

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("MENU");
            System.out.println("____________________");
            System.out.println("1. Insert");
            System.out.println("2. Check if entry exists");
            System.out.println("3. Display by employee name");
            System.out.println("4. Display");
            System.out.println("5. Delete");
            System.out.println("6. Exit");
            System.out.println("____________________");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Employee name");
                    String name = sc.next();
                    System.out.println("Insert the emp-id");
                    int id = sc.nextInt();
                    map.addEmpIds(name,id);
                    break;
                case 2:
                    System.out.println("What do you want to check -> Employee name / Id");
                    String decision = sc.next();
                    boolean exists;
                    if(decision.equalsIgnoreCase("name")){
                        System.out.println("Enter the name of the employee");
                        String empName = sc.next();
                        exists = map.checkEmployeeExists(empName);
                        if(exists){
                            System.out.println("Hurray he is present with the employee-id : "+map.getEmpId(empName));
                        }else {
                            System.out.println("No employee as such exists here");
                        }
                    }else if (decision.equalsIgnoreCase("id")){
                        System.out.println("Enter the Id of the employee");
                        int eId = sc.nextInt();
                        exists = map.checkIfEmployeeIdExists(eId);
                        if(exists){
                            System.out.println("Hurray there is an employee with that id");
                        }else {
                            System.out.println("No employee with that id exists here");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the employee name whose id you need");
                    String eName = sc.next();
                    Integer returnedId = map.getEmpId(eName);
                    if(returnedId != null){
                        System.out.println("Id of "+eName+" is : "+returnedId);
                    }else{
                        System.out.println("employee doesn't exist");
                    }
                    break;
                case 4:
                    map.displayAllEmployeeIds();
                    break;
                case 5:
                    System.out.println("Whom do you want to remove : ");
                    String employeeName = sc.next();
                    if(map.checkEmployeeExists(employeeName)){
                        map.delete(employeeName);
                    }else {
                        System.out.println("There is no such employee named : "+employeeName);
                    }
                    break;
                case 6:
                    System.out.println("Bye........");
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}

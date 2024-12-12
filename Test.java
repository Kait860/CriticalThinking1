//Tests the class
public class Test{
    public static void main(String args[]){
        Manager manager = new Manager();
        manager.setFirstName("Jonathan");
        manager.setlastName("Bailey");
        manager.setemployeeID(9876);
        manager.setDepartment("Finance");
        manager.employeeSummary();
    }
}
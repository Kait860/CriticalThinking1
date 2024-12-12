//creates employee class with getters and setters
public class Employee {
    //Initializes fields 
    String firstName;
    String lastName;
    int employeeID;
    double salary;
    
    //sets first Name
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    //gets first Name
    public String getFirstName(){
        return firstName;
    }
    //sets last name 
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    //gets last name
    public String getlastName(){
        return lastName;
    }
    //sets employeeID
    public void setemployeeID(int employeeID){
        this.employeeID = employeeID;
    }
    //gets employeeID
    public int getemployeeID(){
        return employeeID;
    }

    public void employeeSummary(){
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("EmployeeID: " + this.employeeID);
        System.out.println("Salary: $" + this.salary);
    }
}
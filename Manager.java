//creates manager class with employee attributes
public class Manager extends Employee{
    String department;

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return this.department;
    }
    
    public void employeeSummary(){
        super.employeeSummary();
        System.out.println("Department: " + this.department);
    }
}


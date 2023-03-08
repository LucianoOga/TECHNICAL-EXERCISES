package Documents.HumanResources;

import java.time.LocalDate;

public class Contract implements IContract{

    private int id;
    private String employee;
    private LocalDate startDate;
    private LocalDate renovationDate;
    private double salary;

    /**
     * Builder
     */
    public Contract (int id, String employee, LocalDate startDate, LocalDate renovationDate, double salary){
        this.id = id;
        this.employee = employee;
        this.startDate = startDate;
        this.renovationDate = renovationDate;
        this.salary = salary;
    }
    @Override
    public int getId(){
        return this.id;
    }
    @Override
    public void setId(int id){
        this.id = id;
    }
    @Override
    public String getEmployee(){
        return this.employee;
    }
    @Override
    public void setEmployee(String employee){
        this.employee = employee;
    }
    @Override
    public LocalDate getStartDateId(){
        return this.startDate;
    }
    @Override
    public void setStartDate(LocalDate startDate){
        this.startDate = startDate;
    }
    @Override
    public LocalDate getRenovationDate(){
        return this.renovationDate;
    }
    @Override
    public void setRenovationDate(LocalDate renovationDate){
        this.renovationDate = renovationDate;
    }
    @Override
    public double getSalary(){
    return this.salary;
    }
    @Override
    public void setSalary(double salary){
        this.salary = salary;
    }

    public String toString() {
        return "Contract --> id=" + id + 
        ", emloyee=" + employee + 
        ", startDate=" + startDate + 
        ", renovationDate=" + renovationDate + 
        ", salary=" + salary + "]";
    }

}

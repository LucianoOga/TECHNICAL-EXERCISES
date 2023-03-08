package Documents.HumanResources;
import java.time.LocalDate;

public interface IContract {

    int getId();

    void setId(int id);

    String getEmployee();

    void setEmployee(String employee);

    LocalDate getStartDateId();

    void setStartDate(LocalDate startDate);

    LocalDate getRenovationDate();

    void setRenovationDate(LocalDate renovationDate);

    double getSalary();
    
    void setSalary(double salary);
}

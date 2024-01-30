import java.util.ArrayList;

public class PayRollSystem {
    private ArrayList<Employee> employeeList;

    public PayRollSystem() {
        employeeList = new ArrayList<>();
    }
    void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    void remove(int id)
    {
        Employee employeeToRemove=null;
        for(Employee employee:employeeList)
        {
            if(employee.id == id)
            {
                employeeToRemove=employee;
            }
        }
        if(employeeToRemove != null)
            employeeList.remove(employeeToRemove);
    }
    void ShowAllEmp()
    {
        for(Employee employee:employeeList)
        {
            System.out.println(employee);
        }

    }

}

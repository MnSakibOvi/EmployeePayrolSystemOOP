public class FullTimeEmployee extends Employee{

    private Double monthlySalary;
    public FullTimeEmployee(int id,String name,double monthlySalary)
    {
        super(id,name);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double CalculateSalary() {
        return monthlySalary;
    }
}

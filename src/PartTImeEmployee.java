public class PartTImeEmployee extends Employee{

    private int hour;
    private double PerHsalary;
    public PartTImeEmployee(int id ,String name , int hour,double perHsalary){
        super(id, name);
        this.hour = hour;
        this.PerHsalary=perHsalary;
    }

    @Override
    public double CalculateSalary() {
        return hour * PerHsalary;
    }
}

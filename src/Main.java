
public class Main {
    public static void main(String[] args) {
        PayRollSystem payRollSystem= new PayRollSystem();
        FullTimeEmployee emp1= new FullTimeEmployee(1,"Jisan Bin Kashem",50000);
        FullTimeEmployee emp3= new FullTimeEmployee(3,"Bin Kashem",50000);
        PartTImeEmployee emp2=new PartTImeEmployee(2,"Shishir chandu",20,100);
        payRollSystem.addEmployee(emp2);
        payRollSystem.addEmployee(emp1);
        payRollSystem.addEmployee(emp3);
        payRollSystem.ShowAllEmp();
        payRollSystem.remove(3);
        payRollSystem.ShowAllEmp();

    }
}
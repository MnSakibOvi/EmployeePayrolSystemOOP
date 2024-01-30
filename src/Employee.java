abstract class Employee {
    protected int id;
    protected String name;

    public Employee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return  name;
    }
    public abstract double CalculateSalary();

    public String toString(){
        return "Name ="+name+" , id = "+id+" , salary = "+CalculateSalary()+"/n";
    }


}

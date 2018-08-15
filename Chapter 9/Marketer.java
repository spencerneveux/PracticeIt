public class Marketer extends Employee {
    public double getSalary() {
        return super.getSalary() + 10000.0;
    }
    
    public void advertise() {
        System.out.print("Act now, while supplies last!");
    }
}

package ross.goncharuk;

public class Employee {
    public double calcSalary(String name, double... salary){
        double total = 0;
        for(double x:salary){
            total+=x;
        }
        System.out.println(name+" "+total);
        return total;
    }
}
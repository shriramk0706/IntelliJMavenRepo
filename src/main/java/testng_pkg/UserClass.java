package testng_pkg;

public class UserClass {

    private String userName;
    private int userId;
    private double basicSalary;

    public UserClass(String name, int id, double sal) {
        this.userName = name;
        this.userId = id;
        this.basicSalary = sal;
    }

    public double getPf() {
        double pf = basicSalary/2;
        return pf;
    }

    public double getGrossSalary() {
        double grossSalary = getPf()+basicSalary;
        return grossSalary;
    }

    public double getMedical() {
        double medical = basicSalary/5;
        return medical;
    }
}

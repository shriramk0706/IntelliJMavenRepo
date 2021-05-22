package testng_pkg;//import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.*;

public class NGClass {

    @Test
    public void getSalary() {
        UserClass user = new UserClass("Jennifer", 1111, 20000);
        double totalSalary = user.getGrossSalary();
        Assert.assertEquals(30000, totalSalary);
    }

    @Test
    public void getProvidentFund() {
        UserClass user1 = new UserClass("Jennifer", 2222, 10000);
        double totalSalary = user1.getGrossSalary();
        Assert.assertEquals(15000, totalSalary);
    }

    @Test
    public void getMedicalBill() {
        UserClass user2 = new UserClass("Jennifer", 3333, 30000);
        double medicalBill = user2.getMedical();
        Assert.assertEquals(6000, medicalBill);
    }
}

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Courier {
    private String login;
    private String passWord;
    private String ssn;
    private String phoneNum;
    private String address;
    private String employeeName;
    private String driverLicense;
    private Connection con;

    public Courier(String login, String passWord, Connection con){
        this.login = login;
        this.passWord = passWord;
        this.con = con;
    }

    public void viewPackageOnHand(){

    }

    public void viewPrioritizedPackages(){

    }

    public void updatePackage(int orderId){
        //todo
        //track specific order with orderId
    }

    public int totalWeight(){
        return 0;
    }

    public void getReceiverInfo(int orderId){

    }
}

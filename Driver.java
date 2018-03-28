import java.sql.Connection;
import java.sql.PreparedStatement;

public class Driver {
    private String login;
    private String passWord;
    private String ssn;
    private String phoneNum;
    private String address;
    private String employeeName;
    private String driverLicense;
    private Connection con;

    public Driver(String login, String passWord, Connection con){
        this.login = login;
        this.passWord = passWord;
        this.con = con;
    }

    public void addPackage(String recieverAddress, String recieverPhoneNo, int Weight, String DeliverType){
        //place a new order

    }

    public void checkPackage(int orderId){
        //todo
        //track specific order with orderId
    }

    public void changePackageStatus(int orderId){
        //todo
    }

    public int totalWeight(int offNo){
        return 0;
    }


}

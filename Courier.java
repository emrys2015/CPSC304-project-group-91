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

    public void addPackage(String recieverAddress, String recieverPhoneNo, int Weight, String DeliverType){
        //todo
        //place a new order
    }

    public void checkPackage(int orderId){
        //todo
        //track specific order with orderId
    }

    public void deletePackage(int orderId){
        //todo
    }

    public int totalWeight(){
        return 0;
    }

    public boolean isExist(String login){
        //todo
        return false;
    }


    public void deleteAccount(String login){
        //todo
    }
}

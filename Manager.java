import java.sql.Connection;

public class Manager {
    private String login;
    private String passWord;
    private String ssn;
    private String phoneNum;
    private String address;
    private String employeeName;
    private String driverLicense;
    private Connection con;

    public Manager(String login, String passWord, Connection con){
        this.login = login;
        this.passWord = passWord;
        this.con = con;
    }

    public void addDriver(String login, String employeeName, String ssn){
        //todo

    }

    public void deleteDriver(String recieverAddress, String recieverPhoneNo, int Weight, String DeliverType){
        //todo

    }

    public void checkOrder(int orderId){
        //todo
        //track specific order with orderId
    }

    public void deleteOrder(int orderId){
        //todo
    }

    public void report(){

    }

    public void findHeaviestWorkLoad(){

    }
}

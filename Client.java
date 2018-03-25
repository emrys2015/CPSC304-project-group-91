import java.sql.Connection;
import java.sql.PreparedStatement;

public class Client {
    private String login;
    private String passWord;
    private String eMail;
    private String creditCardNum;
    private String cvv;
    private String phoneNum;
    private String address;
    private String clientName;
    private Connection con;

    public Client(String login, String passWord, Connection con){
        this.login = login;
        this.passWord = passWord;
        this.con = con;
    }

    public void placeOrder(String recieverAddress, String recieverPhoneNo, int Weight, String DeliverType){
        //todo
        //place a new order
    }

    public void trackOrder(int orderId){
        //todo
        //track specific order with orderId
    }

    public void viewOrders(){
        //todo
        //view all orders
    }

    public void deleteOrder(int orderId){
        //todo
    }

    public boolean isExist(String login){
        //todo
        return false;
    }

    public void addClient(String eMail, String address, String phoneNum, String passWord){
        //todo
        PreparedStatement ps;

    }

    public void addCreditCard(String CreditCardNum, String cvv){
        //todo
    }

    public void removeCreditCard(){

        //todo
    }

    public void deleteAccount(String login){
        //todo
    }

}

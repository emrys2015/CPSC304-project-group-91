import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {
    private int login;
    private String passWord;
    private String eMail;
    private String creditCardNum;
    private String cvv;
    private String phoneNum;
    private String address;
    private String clientName;
    private Connection con;
    private Statement statement;

    public Client(int login, String passWord, Connection con){
        this.login = login;
        this.passWord = passWord;
        this.con = con;
    }

    public void placeOrder(String recieverAddress, String recieverPhoneNo, int Weight, String DeliverType){
        //todo
        //place a new order
    }

    public void trackOrder(String orderId){
        Tracker tracker = new Tracker(con);
        tracker.track(orderId);
    }

    public void viewOrders(){
        //todo
        //view all orders
    }

    public void deleteOrder(int orderId){
        //todo
    }

    public boolean isExist(int login){
        //todo
        return false;
    }

    public void addClient(int login,String name, String creditCardNum, String cvv, String eMail, String address, String phoneNum, String passWord){
        //todo
        //wait for password
        try{
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO CLIENT VALUES (?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, login);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, creditCardNum);
            preparedStatement.setString(4, cvv);
            preparedStatement.setString(5, phoneNum);
            preparedStatement.setString(6,address);
            preparedStatement.setString(7,eMail);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch(SQLException ex)
        {
            System.out.println("Message: " + ex.getMessage());
            try
            {
                // undo the insert
                con.rollback();
            }
            catch (SQLException ex2)
            {
                System.out.println("Message: " + ex2.getMessage());
                System.exit(-1);
            }
        }

    }

    public void changeCreditCard(String CreditCardNum, String cvv){
        try{
            PreparedStatement ps = con.prepareStatement("UPDATE CLIENT SET C_CCARD = ?, CVV =? WHERE C_NO = ?");
            ps.setString(1,creditCardNum);
            ps.setString(2,cvv);
            ps.setInt(3,login);
            ps.executeUpdate();
            ps.close();
        }catch(SQLException e){
            System.out.println("Message: " + e.getMessage());
            try
            {
                con.rollback();
            }
            catch (SQLException ex2)
            {
                System.out.println("Message: " + ex2.getMessage());
                System.exit(-1);
            }
        }
    }

    public void removeCreditCard(){
        try{
            PreparedStatement ps = con.prepareStatement("UPDATE CLIENT SET C_CCARD = NULL , CVV =NULL WHERE C_NO = ?");
            ps.setInt(1,login);
            ps.executeUpdate();
            ps.close();
        }catch(SQLException e){
            System.out.println("Message: " + e.getMessage());
            try
            {
                con.rollback();
            }
            catch (SQLException ex2)
            {
                System.out.println("Message: " + ex2.getMessage());
                System.exit(-1);
            }
        }
    }

    public void deleteAccount(int login){
        try{
            PreparedStatement ps = con.prepareStatement("DELETE FROM CLIENT WHERE C_NO = ?");
            ps.setInt(1,login);
            ps.executeUpdate();
            ps.close();
        }catch(SQLException e){
            System.out.println("Message: " + e.getMessage());
            try
            {
                con.rollback();
            }
            catch (SQLException ex2)
            {
                System.out.println("Message: " + ex2.getMessage());
                System.exit(-1);
            }
        }
    }

}

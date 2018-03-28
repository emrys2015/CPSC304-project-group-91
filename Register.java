import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Register {
    //class for new client to regist
    private  Connection con;

    public Register(Connection con){
        this.con = con;
    }

    public boolean isExist(int login){
        //todo
        return false;
    }

    public String addClient(int login,String name, String creditCardNum, String cvv, String eMail, String address, String phoneNum, int passWord){
        if(isExist(login)){
            return "Login has been used";
        }
        try{
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO CLIENT_LOGIN VALUES (?,?)");
            preparedStatement.setInt(1, login);
            preparedStatement.setInt(2, passWord);
            preparedStatement.executeUpdate();
            preparedStatement = con.prepareStatement("INSERT INTO CLIENT VALUES (?,?,?,?,?,?,?)");
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
            return "OOps! Something went wrong";
        }
        return "Registration success!";
    }
}

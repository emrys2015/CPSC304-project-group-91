import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Tracker {
    //Class for reciever to track their parcel
    Connection con;
    public Tracker(Connection con){
        this.con = con;
    }

    public String track(String trackingNum){
        try{
            //todo
            //select parcel and get it status
            //if its arrived at delivery station also provide courier's contact info
            PreparedStatement ps = con.prepareStatement("SELECT ");

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
        return "invalid input";
    }

}

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Tracker {
    //Class for reciever to track their parcel
    Connection con;
    public Tracker(Connection con){
        this.con = con;
    }

    public String track(String trackingNum){
        int trackingInt = Integer.parseInt(trackingNum);
        String status = "invalid input";
        try{
            PreparedStatement ps = con.prepareStatement("SELECT STATUS FROM  PACKAGES WHERE TRACKING_NO = ?");
            ps.setInt(1,trackingInt);
            ResultSet resultSet = ps.executeQuery();
            while(resultSet.next()) {
                status = resultSet.getString(1);
            }
            ps.close();

        }catch(SQLException e){
            System.out.println("Message: " + e.getMessage());
            try
            {
                con.rollback();
                return "invalid input";
            }
            catch (SQLException ex2)
            {
                System.out.println("Message: " + ex2.getMessage());
                System.exit(-1);
            }
        }
        return status;
    }

}

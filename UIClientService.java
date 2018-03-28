import java.sql.Connection;

public class UIClientService {
    private  Connection con;

    public UIClientService(Connection con){
        this.con = con;
     }
}

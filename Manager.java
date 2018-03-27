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

    public void addEmployee( String E_pass, String E_SSN, String E_ADD, String E_Name, String E_PHNO, String E_POS){
        //todo
        try{
            
        PreparedStatement preparedStatement= con.prepareStatement (sql: "INSERT INTO EMPLOYEE VALUES (?,?,?,?,?,?)");
             preparedStatement.setInt(1, E_pass);
            preparedStatement.setInt(2, E_SSN);
            preparedStatement.setString(3, E_ADD);
            preparedStatement.setInt(4, E_Name);
            preparedStatement.setString(5, E_PHNO);
            preparedStatement.setString(6,E_POS);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
        }
        
        catch(SQLException ex)
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


//               try
//         {
//             ps = con.prepareStatement("INSERT INTO branch VALUES (?,?,?,?,?)");

//             System.out.print("\nBranch ID: ");
//             bid = Integer.parseInt(in.readLine());
//             ps.setInt(1, bid);

//             System.out.print("\nBranch Name: ");
//             bname = in.readLine();
//             ps.setString(2, bname);

//             System.out.print("\nBranch Address: ");
//             baddr = in.readLine();

//             if (baddr.length() == 0)
//             {
//                 ps.setString(3, null);
//             }
//             else
//             {
//                 ps.setString(3, baddr);
//             }

//             System.out.print("\nBranch City: ");
//             bcity = in.readLine();
//             ps.setString(4, bcity);

//             System.out.print("\nBranch Phone: ");
//             String phoneTemp = in.readLine();
//             if (phoneTemp.length() == 0)
//             {
//                 ps.setNull(5, java.sql.Types.INTEGER);
//             }
//             else
//             {
//                 bphone = Integer.parseInt(phoneTemp);
//                 ps.setInt(5, bphone);
//             }

//             ps.executeUpdate();

//             // commit work
//             con.commit();

//             ps.close();
//         }
//         catch (IOException e)
//         {
//             System.out.println("IOException!");
//         }
//         catch (SQLException ex)
//         {
//             System.out.println("Message: " + ex.getMessage());
//             try
//             {
//                 // undo the insert
//                 con.rollback();
//             }
//             catch (SQLException ex2)
//             {
//                 System.out.println("Message: " + ex2.getMessage());
//                 System.exit(-1);
//             }
//         }

    }

    public void addDriver(String DR_SSN, String DR_LicenceNo, String DR_OFF_NO){
        
        try{
            PreparedStatement preparedStatement= con.prepareStatement (sql: "INSERT INTO DRIVER VALUES (?,?,?)");
            preparedStatement.setInt(1, DR_SSN);
            preparedStatement.setInt(2, DR_LicenceNo);
            preparedStatement.setString(3, DR_OFF_NO);
   
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch(SQLException ex)
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
        
       public void addCourier(String CO_SSN, String CO_LicenceNo, String CO_OFF_NO){
        
        try{
            PreparedStatement preparedStatement= con.prepareStatement (sql: "INSERT INTO COURIER VALUES (?,?,?)");
            preparedStatement.setInt(1, CO_SSN);
            preparedStatement.setInt(2, CO_LicenceNo);
            preparedStatement.setString(3, CO_OFF_NO);
   
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch(SQLException ex)
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

    public void deleteDriver(String DR_SSN, String DR_DRLN){
        //todo
          try{
            PreparedStatement preparedStatement= con.prepareStatement (sql: "DELETE FROM DRIVER WHERE DRI_SSN = ?, DRI_DLNO = ?");
            preparedStatement.setInt(1, DR_SSN);
            preparedStatement.setInt(2, DR_LicenceNo);
            preparedStatement.setString(3, DR_OFF_NO);
   
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch(SQLException ex)
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

     public void deleteCourier(String CO_SSN, String CO_DRLN){
        //todo
          try{
            PreparedStatement preparedStatement= con.prepareStatement (sql: "DELETE FROM DRIVER WHERE CO_SSN = ?, CO_DLNO = ?");
            preparedStatement.setInt(1, DR_SSN);
            preparedStatement.setInt(2, DR_LicenceNo);
            preparedStatement.setString(3, DR_OFF_NO);
   
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch(SQLException ex)
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
    
    public void checkOrder(int orderId){
        //todo
        //track specific order with orderId
        
    }

    public void report(){

    }

    public boolean isExist(String login){
        //todo
        return false;
    }


    public void deleteAccount(){
        //todo
    }
}

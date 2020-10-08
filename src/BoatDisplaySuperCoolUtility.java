import java.sql.*;

public class BoatDisplaySuperCoolUtility {
    public static void main(String[] args) throws SQLException {
        displayBoatsToConsole();
    }

    private static void displayBoatsToConsole() throws SQLException {
        Connection conn = null;   //connection to the DB
        Statement statement = null;  //this will execute the sql
        ResultSet rs = null;        //this will hold the results returned from the db

        try{
            //1.  connect to the DB
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/camsChoice",
                            "student","student");

            //2.  create the sql statement object
            statement = conn.createStatement();

            //3.  create/execute the sql query
            rs = statement.executeQuery("SELECT * FROM boats");

            //4.  get the metadata to display column headers
            ResultSetMetaData metaData = rs.getMetaData();
            System.out.printf("%3s %-10s %-10s %-10s %-5s%n",
                    metaData.getColumnName(1), metaData.getColumnName(2),
                    metaData.getColumnName(3), metaData.getColumnName(4),
                    metaData.getColumnName(5));

            //5.  loop over the result set to get the results and display them
            while (rs.next())
            {
                System.out.printf("%3s %-10s %-10s %-10s %5s%n",rs.getInt("id"),
                        rs.getString("make"), rs.getString("model"),
                        rs.getString("style"), rs.getString("length"));

            }

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            if (conn != null)
                conn.close();
            if (statement != null)
                statement.close();
            if (rs != null)
                rs.close();
        }
    }
}

import java.sql.*;
import java.util.concurrent.atomic.AtomicInteger;
class InsertStatement{
    public static void main(String... x){
        try{
            Class.forName("org.postgresql.Driver");
//            https://jdbc.postgresql.org/documentation/84/connect.html
            final String url = "jdbc:postgresql://localhost/JDBCBookList";
            final String user = "postgres";
            final String pass = "root";
            AtomicInteger id = new AtomicInteger();
            id.incrementAndGet();
            System.out.println(id);
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();
            String insertQuery = "Insert into booklist "+
                                    "values ("+id+",'book1', '100.00', 'a samplebook')";
            int rs = statement.executeUpdate(insertQuery);
            System.out.println("inserted: "+rs);
            
        }catch(ClassNotFoundException ce){
            ce.printStackTrace();
            System.out.println(ce.getMessage());
        }catch(SQLException se){
            System.out.println(se.getMessage());
        }
    }
}
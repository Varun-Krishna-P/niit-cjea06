import java.sql.*;
class SelectStatement{
    public static void main(String... x){
        try{
            Class.forName("org.postgresql.Driver");
            final String url = "jdbc:postgresql://localhost/JDBCBookList";
            final String user = "postgres";
            final String pass = "root";
            Connection connection  = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();
            String selectQuery = "SELECT * FROM booklist";
            ResultSet rs = statement.executeQuery(selectQuery);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Float price = rs.getFloat("price");
                String description  = rs.getString("description");
                System.out.println("ID: "+id);
                System.out.println("Name: "+name);
                System.out.println("Price: "+price);
                System.out.println("Description: "+description);
            }
            
        }catch(ClassNotFoundException ce){
            ce.printStackTrace();
            System.out.println(ce.getMessage());
        }catch(SQLException se){
            System.out.println(se.getMessage());
        }
    }
}
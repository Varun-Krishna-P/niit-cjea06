import java.sql.*;
class CreateStatement{
    public static void main(String... x){
        try{        
            //https://jdbc.postgresql.org/documentation/84/load.html
            //https://jdbc.postgresql.org/documentation/93/use.html#import
            Class.forName("org.postgresql.Driver");
//            String url = "jdbc:postgresql://localhost/JDBCBooklist?user=postgres&password=root";
             String url = "jdbc:postgresql://localhost/JDBCBookList";
            String user = "postgres";
            String pass = "root";
            Connection connection = DriverManager.getConnection(url, user, pass);
//            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            String query = "CREATE TABLE booklist(ID INT PRIMARY KEY NOT NULL, name TEXT, price REAL, description TEXT);";
            ResultSet rs = statement.executeQuery(query);
            System.out.println(rs);
        }catch(ClassNotFoundException ce){
            ce.printStackTrace();
            System.out.println(ce.getMessage());
        }catch(SQLException se){
            System.out.println(se.getMessage());
        }
        
    }
}
/*
    javac fn.java
    java -cp .;postgresql.jar DBProcessor
    java -cp .;postgresql-9.3-1103.jdbc3.jar CreateStatement
    java -classpath .;postgresql-9.3-1103.jdbc3.jar CreateStatement
    
*/
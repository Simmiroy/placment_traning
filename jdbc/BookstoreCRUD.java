package jdbc;
import java.sql.*;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.SQLException;
        import java.util.Scanner;

public class BookstoreCRUD {
    private static final String URL= "jdbc:mysql://localhost:/ise_bookstore_db";
    private static final String USERNAME="root";
    private static final String PASSWORD="12345";

    public static void main(String[] args)throws Exception {
        //Try with resources [The classes are auto-close]
        try(Connection conn= DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Scanner sc=new Scanner(System.in)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Main CRUD appliction
            while (true) {
                System.out.println("\n1. Create Book | 2.Read Books | 3. Update Books | 4.Delete Books | 5.Exit");
                System.out.println("choice: ");
                int ch = sc.nextInt();
                //===============CREATE===============
                if (ch == 1) {
                    System.out.println("Title :");
                    String title = sc.nextLine();
                    System.out.println("Author: ");
                    String author = sc.nextLine();
                    System.out.println("Price: ");
                    double price = sc.nextDouble();
                    //Prepared Statement to prevent SQL Injection
                    String sql = "INSERT INTO books(title, author, price) VALUES (?,?,?)";
                    try (PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setString(1, title);
                        ps.setString(2, author);
                        ps.setDouble(3, price);
                        ps.executeUpdate();//Executes the INSERT Operation
                        System.out.println("Book: " + title + " added to DB");
                    }
                }
                //================READ================
                else if (ch == 2) {
                    String sql = "SELECT * FROM books";
                    try (Statement statement = conn.createStatement();
                         ResultSet rs = statement.executeQuery(sql)) {
                        System.out.println("ID | TITLE | AUTHOR | PRICE");
                        while (rs.next()) {
                            int id = rs.getInt("id");
                            String title = rs.getString("title");
                            String author = rs.getString("author");
                            double price = rs.getDouble("price");
                            System.out.println(id + "\t|\t" + title + "\t|\t" + author);

                        }
                    }
                }
                //========================UPDATE====================
                else if (ch == 3) {
                    System.out.println("Enter Book ID to Update: ");
                    int id = sc.nextInt();//Consume the leftover line
                    System.out.println("New Title: ");
                    String title = sc.nextLine();
                    System.out.println("New Author: ");
                    String author = sc.nextLine();
                    System.out.println("New Price: ");
                    double price = sc.nextDouble();
                    String sql = "UPDATE books SET title=?, author=?, price=?, WHERE id=?";
                    try (PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setString(1, title);
                        ps.setString(2, author);
                        ps.setDouble(3, price);
                        ps.setInt(4, id);
                        int rows = ps.executeUpdate();//Returns affected rows
                        if (rows > 0) System.out.println("Updated.");
                        else System.out.println("ID NOT FOUND");
                    }
                }
                //================EXIT===============
                else if (ch == 4) {
                    System.out.println("Enter Book ID to delete: ");
                    int id = sc.nextInt();
                    String sql = "DELETE FROM books WHERE id=?";
                    try (PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setInt(1, id);
                        int rows = ps.executeUpdate();
                        if (rows > 0) System.out.println("Deleted.");
                        else System.out.println("ID NOT FOUND.");
                    }
                }
                //=====================EXIT==================
                else if (ch == 5) {
                    System.out.println("Existing the system");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(". ");
                        Thread.sleep(1000);
                    }
                }
                //HANDLE THE INVALID MENU CASES
                else {
                    System.out.println("Invalid Choice, ");
                    System.out.println("CHOICES: [1,2,3,4,5]");
                }
            }
        }catch(ClassNotFoundException e){
            System.out.println("MYSQL JDBC Driver not found, ADD JAR to classpath");
        }catch(SQLException e){
            System.out.println("Database Error" + e.getMessage());
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
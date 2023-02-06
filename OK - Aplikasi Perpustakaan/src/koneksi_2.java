
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi_2 {
    Connection con;
    public Connection getConnection(){
        try {
              con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi GAGAL \n"+e);
        }
        return con;
    }
    
     public static void main(final String[] args) {
        try {
            String server = "jdbc:mysql://localhost/perpustakaan";
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(server, "root", "");
            System.out.println("Koneksi Berhasil");
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil", "Informasi", 
                    JOptionPane.INFORMATION_MESSAGE);
            con.close();

        } catch (SQLException | ClassNotFoundException se) {
            System.out.println(se);
        }
    }
}


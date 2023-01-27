package comabemdb;
import java.sql.*;

public class Conexao {
    public Conexao(){}
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/senaiuc010";

    public Connection getConexao() {
        try{
            Connection connection = DriverManager.getConnection(DATABASE_URL, "root", "Le@@2020");
            return connection;
        }catch (SQLException se){
            se.printStackTrace();
        }
        return null;
    }

}

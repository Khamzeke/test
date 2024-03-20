package Main;

import java.sql.*;

public class ConnectDB {
    static String getText(int id) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "root";
        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

        Statement st = connection.createStatement();
        /* В таблице 2 столбца: id, data*/
        ResultSet rs = st.executeQuery("select * from example where id="+id);
        rs.next();
        String text = rs.getString(2);
        connection.close();
        return text;
        // Возвращается текст: This is the text in database
    }

}

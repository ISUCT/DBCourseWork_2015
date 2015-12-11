/**
 * Created by h on 27.11.15.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testTestTest {

    public static void main(String []args){
        String user = "root";//Логин пользователя
        String password = "123";//Пароль пользователя
        String url = "jdbc:mysql://localhost:3306/forJava";//URL адрес

        Connection c = null;//Соединение с БД
        try{
            c = DriverManager.getConnection(url, user, password);//Установка соединения с БД
            Statement st = c.createStatement();//Готовим запрос
            st.executeUpdate("delete from books where id = '4'");

        } catch(Exception e){
            e.printStackTrace();
        }
        finally{
            //Обязательно необходимо закрыть соединение
            try {
                if(c != null)
                    c.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

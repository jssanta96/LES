package Dao;

import Logica.View;
import java.sql.*;

public class FachadaBD {
    
    String url, user, password;
    Connection conexion =null;
    Statement instruccion;
    ResultSet tabla;
    
    public FachadaBD(){
        url="jdbc:postgresql://localhost:5432/curso_bd";
        user="andres";
        password="fuckencio1234";
    }



    public Connection conectar(){
        try {

            Class.forName("org.postgresql.Driver");

        } catch( Exception e ) {
             View message = new View();
             message.errorConnection();
        }

        try{

            conexion = DriverManager.getConnection(url, user, password);
            return conexion;

        } catch( Exception e ) {
             View message = new View();
             message.errorConnection();
            return null;
        }

    }

    public Connection getConnetion(){
        if (conexion == null) {
            return this.conectar();
        }
        else{
            return conexion;
        }

    }

    public void closeConection(Connection c){
        try{
            if (conexion != null){
                c.close();
            }

        } catch( Exception e ) {
            System.out.println( "No se pudo cerrar." );
        }
    }
}

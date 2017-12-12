package Dao;

import Logica.View;
import java.sql.*;

public class FachadaBD {
    
    String url, user, password;
    Connection conexion =null;
    Statement instruccion;
    ResultSet tabla;
    
    public FachadaBD(){
        url="jdbc:postgresql://localhost:5432/postgres";
        user="diana";
        password="1625606";
    }



    public Connection conectar(){
        try {
            // Se carga el driver
            Class.forName("org.postgresql.Driver");
            //System.out.println( "Driver Cargado" );
        } catch( Exception e ) {
             View message = new View();
             message.errorConnection();
        }

        try{
            //Crear el objeto de conexion a la base de datos
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println( "Conexion Abierta" );
            return conexion;
            //Crear objeto Statement para realizar queries a la base de datos
        } catch( Exception e ) {
             View message = new View();
             message.errorConnection();
            return null;
        }

    }//end connectar

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

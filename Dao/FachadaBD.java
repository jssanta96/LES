package Dao;

import java.sql.*;

public class FachadaBD {
    
    String url, user, password;
    Connection conexion =null;
    Statement instruccion;
    ResultSet tabla;
    
    public FachadaBD(){
        url="jdbc:postgresql://pgsql2:5432/1625639";
        user="1625639";
        password="1625639";
    }



    public Connection conectar(){
        try {
            // Se carga el driver
            Class.forName("org.postgresql.Driver");
            //System.out.println( "Driver Cargado" );
        } catch( Exception e ) {
            System.out.println( "No se pudo cargar el driver." );
        }

        try{
            //Crear el objeto de conexion a la base de datos
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println( "Conexion Abierta" );
            return conexion;
            //Crear objeto Statement para realizar queries a la base de datos
        } catch( Exception e ) {
            System.out.println( "No se pudo abrir la bd." );
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Logica.View;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author invitado
 */
public class Querys {
    
public Querys(){
    
}



public void fillTables(JTable table , String query){
        
    FachadaBD fachada = new FachadaBD();
    
        try{
            
            Connection conn= fachada.getConnetion();
             
            PreparedStatement sentenceUsers = conn.prepareStatement(query);
                              
            ResultSet rsUsers = sentenceUsers.executeQuery();  

            ResultSetMetaData rsData =  rsUsers.getMetaData();

            ArrayList< Object[] > data = new ArrayList <>();
            
            while(rsUsers.next()){

              Object[] rows = new Object[rsData.getColumnCount()];

              for(int i = 0;  i < rows.length; i++){
                rows[i] = rsUsers.getObject(i+1);
            }
               data.add(rows);
            }
               DefaultTableModel tableUser = (DefaultTableModel)table.getModel();
               for(int i =0; i < data.size(); i++){

                   tableUser.addRow(data.get(i));

               }
        }
        catch(SQLException e){
           View message = new View();
           message.errorConnection();
        }
    }
public void updateComboBoxs(JComboBox comboBox , String query , String dateOne , String dateTwo){//Funcion que consulta en sql.

      FachadaBD fachada = new FachadaBD();
      comboBox.removeAllItems();
         
         try{
            Connection conn= fachada.getConnetion();
            Statement sentenceProjects = conn.createStatement();
            ResultSet rs = sentenceProjects.executeQuery(query);    
            
            while(rs.next()){
          
                comboBox.addItem(rs.getString(dateOne)+ " " + rs.getString(dateTwo)); 
                 
            }
            
        }catch(SQLException e){
        View message = new View();
        message.errorConnection();    
        }

    } 
public void addStateProjectr(JComboBox comboBox , String query , String type ){
      
      FachadaBD fachada = new FachadaBD();
      
      comboBox.removeAllItems();
         
         try{
            Connection conn= fachada.getConnetion();
            Statement sentenceProjects = conn.createStatement();
            ResultSet rs = sentenceProjects.executeQuery(query);    
            
            while(rs.next()){
                
                String typeUser = rs.getString(type);
                switch(typeUser){
                    
                case "Director":
                    
                      comboBox.addItem("Activo");
                      comboBox.addItem("Inactivo");
                      comboBox.addItem("Terminado");
                      
                      break;
                      
                case "Administrador" : 
                 
                      comboBox.addItem("Activo");
                      comboBox.addItem("Inactivo");
                      comboBox.addItem("Terminado");
                      
                      break;
                     
            case "Lider de proyecto":
                
                      comboBox.addItem("Activo");
                      comboBox.addItem("Inactivo");
                      comboBox.addItem("Terminado");

                      break;
                }
                
           
            }
            
        }catch(SQLException e){
           View message = new View();
           message.errorConnection();        
        }
                 
    }
public void addStateEquipment(JComboBox comboBox , String query , String state ){
      
      FachadaBD fachada = new FachadaBD();
      comboBox.removeAllItems();
         
         try{
            Connection conn= fachada.getConnetion();
            Statement sentenceProjects = conn.createStatement();
            ResultSet rs = sentenceProjects.executeQuery(query);    
            
            while(rs.next()){
                
                String stateUser = rs.getString(state);
                switch(stateUser){
                    
                case "Director":
                 
                    comboBox.addItem("Disponible");
                    comboBox.addItem("Ocupado");
             
                      break;
                      
                case "Cordinador de equipos" : 
                 
                    comboBox.addItem("Disponible");
                    comboBox.addItem("Ocupado");
             
                     break;
                     
                }
               
            }
            
        }catch(SQLException e){
           View message = new View();
           message.errorConnection();
        }
                 
    }
public void addStateUser(JComboBox comboBox , String query , String type ){
      
      FachadaBD fachada = new FachadaBD();    
      comboBox.removeAllItems();
         
         try{
            Connection conn= fachada.getConnetion();
            Statement sentenceProjects = conn.createStatement();
            ResultSet rs = sentenceProjects.executeQuery(query);    
            
            while(rs.next()){
                
                String stateUser = rs.getString(type);
                switch(stateUser){
                    
                case "Director":
                 
                    comboBox.addItem("Activo");
                    comboBox.addItem("Inactivo");
             
                      break;
                      
                case "Administrador" : 
                    
                      comboBox.addItem("Activo");
                      comboBox.addItem("Inactivo"); 
             
                     break;
                     
                }
               
            }
            
        }catch(SQLException e){
           View message = new View();
           message.errorConnection();
        }
                 
    }
public String typeUser(String query , String type){
     
         FachadaBD fachada = new FachadaBD();       
         try{
            Connection conn= fachada.getConnetion();

            Statement sentenceProjects = conn.createStatement();
           
            ResultSet rs = sentenceProjects.executeQuery(query);    
            while(rs.next()){
                String typeUser = rs.getString(type);
                     return typeUser;
            }
         }catch(SQLException e){
           View message = new View();
           message.errorConnection();
         }
        return null;

    }
public void setTotal(JTextField jtexfield, String query){
    
        FachadaBD fachada = new FachadaBD();   
        try{
            Connection conn= fachada.getConnetion();

            Statement sentenceProjects = conn.createStatement();

            ResultSet rs = sentenceProjects.executeQuery(query);
         
             while(rs.next()){
                 jtexfield.setText(rs.getString(1));
             }
            
             }catch(SQLException e){
           View message = new View();
           message.errorConnection();
             }
    
}
public void addTypeUser(JComboBox comboBox , String query , String type ){
            
    FachadaBD fachada = new FachadaBD();  
    comboBox.removeAllItems();

         try{
            Connection conn= fachada.getConnetion();

            Statement sentenceProjects = conn.createStatement();

            ResultSet rs = sentenceProjects.executeQuery(query);

            
            while(rs.next()){
                
            String typeUser = rs.getString(type);
             switch(typeUser){
      
                         
                case "Director":
                    
                      comboBox.addItem("Lider de proyecto");
                      comboBox.addItem("Administrador");
                      comboBox.addItem("Cordinador de equipos");
                      comboBox.addItem("Miembro");
                      break;
                      
                case "Administrador":           
                    
                      comboBox.addItem("Lider de proyecto");
                      comboBox.addItem("Cordinador de equipos");
                      comboBox.addItem("Miembro");
                              
                      break;
                      
                case "Lider de proyecto":
                      
                      comboBox.addItem("Miembro");
                      break;
                       }
                 
                }   
            }catch(SQLException e){
           View message = new View();
           message.errorConnection();
            }
    }

}
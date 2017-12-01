/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author invitado
 */
public class Querys {
    
    FachadaBD fachada;
    
public Querys(){
    
}



public void fillTables(JTable table , String query){
        
    fachada = new FachadaBD();
    
        try{
            
            Connection conn= fachada.getConnetion();
                        System.out.println("error");

             
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
            System.out.println("error2");
        }
    }
public void updateComboBoxs(JComboBox comboBox , String query , String dateOne , String dateTwo){//Funcion que consulta en sql.

      fachada = new FachadaBD();

      comboBox.removeAllItems();
         
         try{
            Connection conn= fachada.getConnetion();
            Statement sentenceProjects = conn.createStatement();
            ResultSet rs = sentenceProjects.executeQuery(query);    
            
            while(rs.next()){
          
                comboBox.addItem(rs.getString(dateOne)+ " " + rs.getString(dateTwo)); 
                 
            }
            
        }catch(SQLException e){
            System.out.println("error");
        }

    } 
public void addStateProjectr(JComboBox comboBox , String query , String type ){
      
      fachada = new FachadaBD();

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
            System.out.println("error");
        }
                 
    }
public void addStateEquipment(JComboBox comboBox , String query , String state ){
      
      fachada = new FachadaBD();

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
            System.out.println("error");
        }
                 
    }
public void addStateUser(JComboBox comboBox , String query , String type ){
      
      fachada = new FachadaBD();

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
            System.out.println("error");
        }
                 
    }
public String typeUser(String query , String type){
     
      fachada = new FachadaBD();
       
         try{
            Connection conn= fachada.getConnetion();
                        System.out.println("1");

            Statement sentenceProjects = conn.createStatement();
                        System.out.println("2");
           
            ResultSet rs = sentenceProjects.executeQuery(query);    
                        System.out.println("3");
                System.out.println(query);
            while(rs.next()){
                            
                
                String typeUser = rs.getString(type);
                System.out.println(typeUser);
                
                     return typeUser;
                 

        
            }
         }catch(SQLException e){
            System.out.println("error");
        }
        return null;

    }
public void addTypeUser(JComboBox comboBox , String query , String type ){
            
       comboBox.removeAllItems();
       fachada = new FachadaBD(); 
       
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
            System.out.println("error");
        }
    }




}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public final class View {
     JFrame window;
     ImageIcon LesImage;
     JButton button = new JButton();
     Object [] objButton = {button};
    
    public View(){
        
       window = new JFrame();
       configureWindows();

    }
    
    public void configureWindows(){
        LesImage = new ImageIcon("src/Imagenes/LESlogo.png");
        Dimension windowDimension = new Dimension();
                       
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setIconImage(LesImage.getImage());
        window.setLocation((int) ((windowDimension.getWidth()/2)+500), 300);
        window.setSize(350, 200);
        window.setVisible(false);
       
    }
    
    public void errorConnection (){
        
        JOptionPane.showMessageDialog(window, "Se ha presentado un error en la Conexion de la base de datos.", "Notificacion", 0, LesImage);
    }    
    
    public void errorLogin(){
    
        JOptionPane.showMessageDialog(window, "Tu cuenta o contraseña son incorrectos.", "Notificacion", 0, LesImage);
    }
    
    public void errorPassword(){
    
        JOptionPane.showMessageDialog(window, "La contraseña digitada es incorrecta, intentelo de nuevo o dirigase a la opcion de restablecer contraseña.", "Notificacion", 0, LesImage);
    }
    
    public void errorComparePassword(){
    
        JOptionPane.showMessageDialog(window, "Los campos de la contraseña nueva no coinciden, intentelo de nuevo", "Notificacion", 0, LesImage);
    }
    
    public void errorEmptyPassword(){
    
        JOptionPane.showMessageDialog(window, "Los campos de la contraseña nueva estan vacios", "Notificacion", 0, LesImage);
    }
    
    public void sucessfulLogin(){
        
        JOptionPane.showMessageDialog(window, "Bienvenido a LES", "Notificacion", 0, LesImage);
    }
    
    public void errorCreateTypeElement(){
        
        JOptionPane.showMessageDialog(window, "Este dato se encuentra registrado en la base de datos" +"EL DATO QUE GENERO EL ERROR", "Notificacion", 0, LesImage);// poner el campo que esta generando el error.
    }
    
    public void sucessfulOperationTypeElement(String type , String operation){
        JOptionPane.showMessageDialog(window, type + " se ha "+ operation +" de forma exitosa", "Notificacion", 0, LesImage);//añadir el elemento que se ha creado.
        
    }
    
    public String valitadionAnswer(String question){
        
       String answer = (String) JOptionPane.showInputDialog(window, question, "Respuesta secreta" , 0, LesImage, null , null);
       return  answer;     
    }
}

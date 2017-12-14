package Logica;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Validate {
     public Validate(){}
    
    public boolean numericFieldValidation(JTextField field, JLabel label){
        if(!field.getText().matches("[0-9]*")) {
            String errorMessage = "Solo se permite numeros en " + label.getText();
            View message = new View(); 
            message.fieldValidation(errorMessage);
            return false;
        }
        return true;
    }
    
    public boolean stringFieldValidation(JTextField field, JLabel label ){
        if(!field.getText().matches("[[a-z]*"+" "+"[A-Z]*]*")){
            String errorMessage = "Solo se permite letras en " + label.getText();
            View message = new View(); 
            message.fieldValidation(errorMessage);
            return false;

        }
        return true;
    }
    public boolean voidFieldValidation(JTextField field, JLabel label){
        if(field.equals(" ")){
            String errorMessage = "No se permite campos vacios en "+ label.getText();
            View message = new View(); 
            message.voidFields(errorMessage);
            return false;

        }
        return true;
    }
    
    public boolean numericAndCharFieldValidation(JTextField field, JLabel label){
        if(!field.getText().matches("[[0-9]*"+"-"+"]*")) {
            String errorMessage = "Solo se permite numeros y el guion(-) en " + label.getText();
            View message = new View(); 
            message.fieldValidation(errorMessage);
            return false;
        }
            return true;
    }


}

package Logica;

import javax.swing.JTextField;

public class Validate {
     public Validate(){}
    
    public void numericFieldValidation(JTextField field){
        if(!field.getText().matches("[0-9]*")) {
            String errorMessage = "Solo se permite numeros";
            View message = new View(); 
            message.fieldValidation(errorMessage);
        }
    }
    
    public void stringFieldValidation(JTextField field){
        if(!field.getText().matches("[[a-z]*"+"[A-Z]*]*")){
            String errorMessage = "Solo se permite letras";
            View message = new View(); 
            message.fieldValidation(errorMessage);
        }
    }
    public void voidFieldValidation(JTextField field){
        if(field.equals(" ")){
            String errorMessage = "No se permite campos vacios";
            View message = new View(); 
            message.voidFields(errorMessage);
        }
    }
    
    public void numericAndCharFieldValidation(JTextField field){
        if(!field.getText().matches("[[0-9]*"+"-"+"]*")) {
            String errorMessage = "Solo se permite numeros y el guion(-)";
            View message = new View(); 
            message.fieldValidation(errorMessage);
        }
    }


}

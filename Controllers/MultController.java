package Controllers;

import Dao.MultDao;
import Logica.Mult;
import Logica.View;

public class MultController {

    public MultController(){
    }

    public int addMult(int id_request, double value){
        
        Mult mult= new Mult();
        mult.setId_request(id_request);
        mult.setValue(value);
        MultDao multDao= new MultDao();
        int result=multDao.saveMult(mult);
        if (result == 1){
                View message = new View();
                message.sucessfulOperationTypeElement("Una multa" , "creado");
                return result;
        }else{
            View message = new View();
            message.errorCreateTypeElement();
        }
        return 0;

    }

    public Mult viewMult(int id_request){

        Mult mult = new Mult();
        MultDao multDao= new MultDao();
        mult = multDao.viewMult(id_request);

        return mult;

    }

    public void updateMult(int id_request, double value){
        
        MultDao multDao= new MultDao();
        boolean  cheek = multDao.updateMult(id_request,value);
        if (cheek == true){
                View message = new View();
                message.sucessfulOperationTypeElement("Un usuario", "actualizar");

        }
        System.out.println("error");

        
    }
     public void deleteMult(String id_request){
         
        MultDao multDao= new MultDao();
        multDao.deleteMult(id_request);
        
    }

}

package Controllers;

import Dao.MultDao;
import Logica.Mult;

public class MultController {
    MultDao multDao;

    public MultController(){
        multDao= new MultDao();
    }

    public int addMult(int id_user,int id_request, double value){
        Mult mult= new Mult();

        mult.setId_user(id_user);
        mult.setId_request(id_request);
        mult.setValue(value);


        System.out.println("Se va a insertar una multa");

        int result=multDao.saveMult(mult);

        System.out.println("Se inserto una nueva multa");

        return result;

    }

    public Mult viewMult(int id_user, int id_request){

        Mult mult = new Mult();

        System.out.println("Se va a consultar una Multa");

        mult = multDao.viewMult(id_user,id_request);

        return mult;

    }

    public void updateRequest(int id_user, int id_request, double value){
        multDao.updateMult(id_user,id_request,value);
    }

    public void deleteRequest(int id_user, int id_request){
        multDao.deleteMult(id_user,id_request);
    }
}

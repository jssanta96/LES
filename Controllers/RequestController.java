package Controllers;

import Dao.RequestDao;
import Logica.Request;

public class RequestController {
    RequestDao requestDao;

    public RequestController(){
        requestDao= new RequestDao();
    }

    public int addRequest(String state, int user_id, int equipment_id, String start_date, String end_date){
        Request request= new Request();

        request.setState(state);
        request.setUser_id(user_id);
        request.setEquipment_id(equipment_id);
        request.setStart_date(start_date);
        request.setEnd_date(end_date);

        System.out.println("Se va a insertar un Prestamo");

        int result=requestDao.saveRequest(request);

        System.out.println("Se inserto un nueva Prestamo");

        return result;

    }
    

    
    public void setStateRequest(int id_request,String state){
        
        boolean cheek =requestDao.changeStateRequest(id_request,state);
        
        if (cheek == true){
                        System.out.println("Se actualizo el estado de un equipo ");

        }
    }
    
    public void renovateRequest(int id_request,String end_date){
        
        boolean cheek =requestDao.renovateRequest(id_request,end_date);
        
        if (cheek == true){
                        System.out.println("Se renovo el prestamo de un equipo ");

        }
    }
    

    public Request viewRequest(String request_id){

        Request request = new Request();

        System.out.println("Se va a consultar un Prestamo");

        request = requestDao.viewRequest(request_id);

        return request;

    }

    public void updateRequest(String request_id, String state, String user_id, String serial, String start_date, String end_date){
        requestDao.updateRequest(request_id,state,user_id,serial,start_date,end_date);
    }

    public void deleteRequest(String request_id){
        requestDao.deleteRequest(request_id);
    }
}

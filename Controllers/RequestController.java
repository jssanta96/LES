package Controllers;

import Dao.RequestDao;
import Logica.Request;
import Logica.View;

public class RequestController {
   

    public RequestController(){
    }

    public int addRequest(String state, int user_id, int equipment_id, String start_date, String end_date){
        
        Request request= new Request();
        RequestDao requestDao= new RequestDao();

        
        request.setState(state);
        request.setUser_id(user_id);
        request.setEquipment_id(equipment_id);
        request.setStart_date(start_date);
        request.setEnd_date(end_date);


        int result=requestDao.saveRequest(request);
        return result;

    }
    

    
    public void setStateRequest(int id_request,String state){
        RequestDao requestDao= new RequestDao();
        boolean cheek =requestDao.changeStateRequest(id_request,state);
        
        if (cheek == true){


        }
    }
    
    public void renovateRequest(int id_request,String end_date){
        RequestDao requestDao= new RequestDao();
        boolean cheek =requestDao.renovateRequest(id_request,end_date);
        
        if (cheek == true){


        }
    }
    

    public Request viewRequest(String request_id){

        Request request = new Request();
        RequestDao requestDao= new RequestDao();
        request = requestDao.viewRequest(request_id);

        return request;

    }

    public void updateRequest(String request_id, String state, String user_id, String serial, String start_date, String end_date){
        RequestDao requestDao= new RequestDao();
        requestDao.updateRequest(request_id,state,user_id,serial,start_date,end_date);
    }

 
}

package Controllers;
import Dao.UserDao;
import Logica.User;
import Logica.View;


public class UserController {

    public UserController(){
    }

    public int addUser(String identification, String project_id, String password, String user_name, String type, String state, String email , String answer , String question){
        
        User user= new User();
        user.setIdentification(identification);
        user.setProjectId(project_id);
        user.setPassword(password);
        user.setUserName(user_name);
        user.setType(type);
        user.setState(state);
        user.setEmail(email);
        
        UserDao userDao= new UserDao();
        int result=userDao.saveUser(user);
        
        if (result == 1){
                View message = new View();
                message.sucessfulOperationTypeElement("Un usuario" , "creado");
                return result;
        }else{
            View message = new View();
            message.errorCreateTypeElement();
        }
        return 0;
        
        
    }

    public User viewUser(String identification){

        User user = new User();
        UserDao userDao= new UserDao();
        user = userDao.viewUser(identification);
        
        return user;

    }

    public void updateUser(String identification, String project_id, String password,  String user_name, String type, String state, String email){
       
        UserDao userDao= new UserDao();
        boolean cheek =userDao.updateUser(identification, project_id, password, user_name, type, state,email);
        if (cheek == true){
                View message = new View();
                message.sucessfulOperationTypeElement("Un usuario", "actualizar");

        }
        System.out.println("error");

    }

}

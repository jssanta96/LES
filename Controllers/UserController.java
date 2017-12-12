package Controllers;
import Dao.UserDao;
import Logica.User;
import Logica.View;


public class UserController {

    public UserController(){
    }

    public int addUser(String identification, String project_id, String password, String user_name, String type, String state, String email , String answer , String question , String photo){
        
        UserDao userDao= new UserDao();
        User user= new User();
        user.setIdentification(identification);
        user.setProjectId(project_id);
        user.setPassword(password);
        user.setUserName(user_name);
        user.setType(type);
        user.setState(state);
        user.setEmail(email);
        user.setAnswer(answer);
        user.setQuestion(question);
        user.setPhoto(photo);
        
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

    public void updateUser(String identification, String project_id, String user_name, String type, String state, String email,String answer , String question){
       
        UserDao userDao= new UserDao();
        boolean cheek =userDao.updateUser(identification, project_id, user_name, type, state,email, answer, question);
        if (cheek == true){
                View message = new View();
                message.sucessfulOperationTypeElement("Un usuario", "actualizado");

        }
        System.out.println("error");

    }

}

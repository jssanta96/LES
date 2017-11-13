package Controllers;
import Dao.UserDao;
import Logica.User;


public class UserController {
    UserDao userDao;

    public UserController(){
        userDao= new UserDao();
    }

    public int addUser(String identification, String project_id, String password, String nickName, String user_name, String type, String state, String email){
        User user= new User();

        user.setIdentification(identification);
        user.setProjectId(project_id);
        user.setPassword(password);
        user.setNickName(nickName);
        user.setUserName(user_name);
        user.setType(type);
        user.setState(state);
        user.setEmail(email);


        System.out.println("Se va a insertar un Usuario");

        int result=userDao.saveUser(user);

        System.out.println("Se inserto un nuevo paciente");

        return result;

    }

    public User viewUser(String identification){

        User user = new User();

        System.out.println("Se va a consultar un paciente");

        user = userDao.viewUser(identification);

        return user;

    }

    public void updateUser(String identification, String project_id, String password, String nickName, String user_name, String type, String state, String email){
        userDao.updateUser(identification, project_id, password, nickName, user_name, type, state,email);
    }

    public void daleteUser(String identification){
        userDao.deleteUser(identification);
    }
}

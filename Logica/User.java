

package Logica;

import java.lang.*;

public class User {

    private String user_name;
    private String project_id;
    private String password;
    private String type;
    private String identification;
    private String state;
    private String email;
    private String question;
    private String answer;

    public User() {
    };



    public  String getUserName() {
        return user_name;
    }

    public String getProjectId(){
        return project_id;
    }

    public  String getPassword() {
        return password;
    }

    public  String getType() {
        return type;
    }

    public  String getIdentification() {
        return identification;
    }

    public  String getState() {
        return state;
    }

    public  String getEmail() {
        return email;
    }
     public  String getQuestion() {
        return question;
    }

    public  String getAnswer() {
        return answer;
    }

    public  void setIdentification(String identification) {
        this.identification = identification;
    }

    public void setProjectId(String project_id){
        this.project_id=project_id;
    }

    public  void setPassword(String password) {
        this.password = password;
    }
    public  void setUserName(String user_name) {
        this.user_name = user_name;
    }

    public  void setType(String type) {
        this.type = type;
    }

    public  void setState(String state) {
        this.state = state;
    }

    public  void setEmail(String email){
        this.email = email;
    }
    
    public  void setQuestion(String question) {
        this.question = question;
    }

    public  void setAnswer(String answer){
        this.answer = answer;
    }
    
    


}
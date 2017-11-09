package Logica;

public class Participation_project {

    private String user_id;
    private String project_id;

    Participation_project(){};

    public String getUser_id(){
        return user_id;
    }

    public String getProject_id(){
        return project_id;
    }

    public void setUser_id(String user_id){
        this.user_id=user_id;
    }

    public void setProject_id(String project_id){
        this.project_id=project_id;
    }
}

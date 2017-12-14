package Controllers;

import Logica.Project;
import Dao.ProjectDao;
import Logica.View;

public class ProjectController {

    public ProjectController(){
    }

    public int addProject(String code, String name, String description, String state){
        
        Project project= new Project();
        ProjectDao projectDao= new ProjectDao();

        project.setCode(code);
        project.setName(name);
        project.setDescription(description);
        project.setState(state);

        int result=projectDao.saveProject(project);
        
        if (result == 1){
                View message = new View();
                message.sucessfulOperationTypeElement("Un proyecto" , "creado");
                return result;
            }else{
               View message = new View();
               message.errorCreateTypeElement();
            }

        return 0;

    }

    public Project viewProject(String code){

        Project project = new Project();
        ProjectDao projectDao= new ProjectDao();

        project = projectDao.viewProject(code);

        return project;

    }

    public void updateProject(String code, String name, String description, String state){
        ProjectDao projectDao= new ProjectDao();
        boolean cheek = projectDao.updateProject(code,name,description,state);
        if (cheek == true){
                View message = new View();
                message.sucessfulOperationTypeElement("Un proyecto", "actualizo");

        }  
    }

}

public class Projects {
    private String code;
    private String name;
    private String description;
    private String state;

    Projects(){};

    public String getCode(){
        return code;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String getState(){
        return state;
    }

    public void setCode(String code){
        this.code=code;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public void setState(String state){
        this.state=state;
    }
}

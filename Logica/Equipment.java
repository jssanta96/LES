package Logica;

public class Equipment {

    private String serial;
    private String name;
    private String description;
    private String state;

    Equipment(){};

    public String getSerial(){
        return serial;
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

    public void setSerial(String serial){
        this.serial=serial;
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

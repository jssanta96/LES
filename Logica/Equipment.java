package Logica;

public class Equipment {

    private String serial;
    private String name;
    private String type;
    private String model;
    private String description;
    private String state;

    Equipment(){};

    public String getSerial(){
        return serial;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public String getModel(){
        return model;
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

    public void setType(String type){
        this.type=type;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public void setState(String state){
        this.state=state;
    }
}

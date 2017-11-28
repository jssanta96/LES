package Logica;

public class Request {

    private String user_id;
    private String equipment_id;
    private String start_date;
    private String end_date;
    private String state;

    public Request() {
    }

    ;


    public String getState(){
        return state;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getEquipment_id() {
        return equipment_id;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setEquipment_id(String equipment_id) {
        this.equipment_id = equipment_id;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }


    public void setState(String state){
        this.state=state;
    }


}

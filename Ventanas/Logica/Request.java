package Logica;

public class Request {

    private int user_id;
    private int equipment_id;
    private String start_date;
    private String end_date;
    private String state;

    public Request() {
    }

    ;


    public String getState(){
        return state;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getEquipment_id() {
        return equipment_id;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setEquipment_id(int equipment_id) {
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

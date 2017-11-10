package Logica;

public class Request {

    private String request_id;
    private String user_id;
    private String serial;
    private String start_date;
    private String end_date;
    private String state;

    public Request() {
    }

    ;

    public String getRequest_id() {
        return request_id;
    }

    public String getState(){
        return state;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getSerial() {
        return serial;
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

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public void setState(String state){
        this.state=state;
    }


}
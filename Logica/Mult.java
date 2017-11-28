package Logica;

public class Mult {

    private int id_user;
    private int id_request;
    private double value;

    public Mult(){};

    public int getId_user(){
        return id_user;
    }

    public int getId_request(){
        return id_request;
    }

    public double getValue(){
        return value;
    }

    public void setId_user(int id_user){
        this.id_user=id_user;
    }

    public void setId_request(int id_request){
        this.id_request=id_request;
    }

    public void setValue(double value){
        this.value=value;
    }

}

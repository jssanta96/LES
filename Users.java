
public class Usuarios {

    private String user_name;
    private String nickName;
    private Sitrng password;
    private String type;
    private String identification;
    private String state;
    private String email;

    Usuarios() {
    }

    ;

    public static String getUserName() {
        return user_name;
    }

    public static String getNickName() {
        return nickName;
    }

    public static String getPassword() {
        return password;
    }

    public static String getType() {
        return type;
    }

    public static String getIdentification() {
        return identification;
    }

    public static String getState() {
        return state;
    }

    public static String getEmail() {
        return email;
    }

    public static void setIdentification(String identification) {
        this.identification = identification;
    }

    public static void setPassword(String password) {
        this.password = password;
    }

    public static void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public static void setUserName(String user_name) {
        this.user_name = user_name;
    }

    public static void setType(String type) {
        this.type = type;
    }

    public static void setState(String state) {
        this.state = state;
    }

    public static void setEmail(String email){
        this.email = email;
    }

}
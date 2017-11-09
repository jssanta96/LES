package Logica;

public class Usuarios {

        private String user_name;
        private String nickName;
        private String password;
        private String type;
        private String identification;
        private String state;
        private String email;

        Usuarios() {
        }

        ;

        public  String getUserName() {
            return user_name;
        }

        public  String getNickName() {
            return nickName;
        }

        public  String getPassword() {
            return password;
        }

        public  String getType() {
            return type;
        }

        public  String getIdentification() {
            return identification;
        }

        public  String getState() {
            return state;
        }

        public  String getEmail() {
            return email;
        }

        public  void setIdentification(String identification) {
            this.identification = identification;
        }

        public  void setPassword(String password) {
            this.password = password;
        }

        public  void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public  void setUserName(String user_name) {
            this.user_name = user_name;
        }

        public  void setType(String type) {
            this.type = type;
        }

        public  void setState(String state) {
            this.state = state;
        }

        public  void setEmail(String email){
            this.email = email;
        }


}
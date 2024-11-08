package LogIn;

public class User {
    private String userName, password;

    public User(String userName, String password){
        this.userName=userName;
        this.password=password;
    }

    public String getUser() {
        return userName;
    }

    public String getPassWord() {
        return password;
    }

    public String rename(String newName) {
        if (newName.length()<4) {
            System.out.println("username length should be bigger than 4");
            return userName;
        }else {
            userName=newName;
            return userName;
        }
    }

    public String updatePassword(String newPassword) {
        if (newPassword.length() >= 7 && newPassword.length() <= 20) {
            password = newPassword;
            return password;
        } else {
            System.out.println("password length should between 7 and 20");
            return password;
        }
    }
}

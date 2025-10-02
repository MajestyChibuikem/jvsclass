package assignments.login;

public class Main {
    public static void main(String[] args) {
        User newUser  = new User("majesty", "1492");
        
        Admin admin = new Admin("majesty", "1222", "majestychibuikem@gmail.com");

        
        System.out.println(newUser.getName()); //return name
        System.out.println(admin.getName()); //return email

        System.out.println(admin.getPassword());
    }
}
class User{
    private String name;
    private String password;

    User(String name, String password){
        this.name = name;
        this.password = password;
    }
    //getName
    public String getName(){
        return name;
    }
    //getPassword
    public String getPassword(){
        return password;
    }
    //setName
    public void setName(String name){
        this.name = name;
    }
    //setPassword
    public void setPassword(String password){
        this.password = password;
    }

    public boolean login(String name, String password){
        if (this.name.equals(name) && this.password.equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
}
class Admin extends User{
    private String email;
    Admin(String name, String password, String email){
        super(name, password);
        this.email = email;
    }
    public void display(){
        System.out.println("this is the admin class");
    }
    public String getName(){
        return email;
    }

}
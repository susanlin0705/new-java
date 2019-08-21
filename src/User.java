import practiceForinterface.Person;

public class User extends Person {
    protected boolean isAdmin;

    public User(String firstName, String lastName, boolean isAdmin) throws IllegalArgumentException {
        super(firstName, lastName);
        this.isAdmin = isAdmin;
    }

//    public boolean isAdmin(){
//        if(isAdmin==true){
//            return true;
//        }else{
//            return false;
//        }
//    }
    public boolean isAdmin(){
        return this.isAdmin;
    }



}

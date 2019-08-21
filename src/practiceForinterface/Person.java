package practiceForinterface;

import practiceForinterface.Greeter;

public class Person implements Greeter {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) throws IllegalArgumentException{
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String sayHello() {
        return "Hello from "+ firstName +" "+ lastName;
    }
}

package HomeWork_life_3;

public class Person {

    private String firstName;
    private String lastName;
    private final String SSN;

    Person (String firstName, String lastName, String SSN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    String getFirstName(){
        return this.firstName;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    String getLastName(){
        return this.lastName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    String getSSN(){
        return this.SSN;
    }

    void printPersonInfo(){
        System.out.println("Имя: " + firstName + ", Фамилия: " + lastName + ", SSN: " + SSN);
    }


}

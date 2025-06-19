package HomeWork_3;

public class Person {

    private String firstName;
    private String lastName;
    private final String ssn;

    Person (String someFirstName, String someLastName, String someSNN){
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.ssn = someSNN;
    }

    String getFirstName(){
        return this.firstName;
    }

    String getLastName(){
        return this.lastName;
    }

    String getSsn(){
        return this.ssn;
    }

    void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    void  setLastName(String newLastName){
        this.lastName = newLastName;
    }

    void printPersonInfo(){
        System.out.println("Имя: " + firstName + ", Фамилия: " + lastName + ", SSN: " + ssn);
    }



}

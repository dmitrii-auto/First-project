package HomeWork_11.Task_6;

public class IsValidEmail {

    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }

}

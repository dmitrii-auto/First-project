package HomeWork_7_demo.exceptions;

public class Task4 {
    public static void main(String[] args) {
        checkEmail("email.ru");

        try {
            checkEmail("qwe");
        } catch (InvalidEmailException e) {
              System.out.print(e.getMessage());
        }

    }

    public static void checkEmail(String email){
        if (email == "email.ru"){
            System.out.println("Верный email");
        } else  {
            throw new InvalidEmailException("Неверный email");
        }
    }
}

package HomeWork_7.exceptions;

public class Task4 {
    public static void main(String[] args) {
        checkEmail("email.ru");

        try {
            checkEmail("qwe");
        } catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkEmail(String email) throws InvalidEmailException{
        if (email.equals("email.ru")){
            System.out.println("Верный email");
        } else {
            throw new InvalidEmailException("Неверный email");
        }
    }
}

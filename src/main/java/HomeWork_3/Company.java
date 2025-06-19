package HomeWork_3;

public class Company {

    static String companyName = "ООО ИП";
    final int EMPLOYEE_ID;
    String employeeName;

    Company(int employeeID, String employeeName){
        this.EMPLOYEE_ID = employeeID;
        this.employeeName = employeeName;
    }

    String getEmployeeName(){
        return this.employeeName;
    }

    void setEmployeeName(String newEmployeeName){
        this.employeeName = newEmployeeName;
    }

    static void printCompanyName(){
        System.out.println("Наша компания называется: " + companyName);
    }

    void printEmployeeInfo(){
        System.out.println("Имя сотрудника : " + employeeName + ". ID сотрудника: "  + EMPLOYEE_ID + ". Компания: " + companyName);
    }



}


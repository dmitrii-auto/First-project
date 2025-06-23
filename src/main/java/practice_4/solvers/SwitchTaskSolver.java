package practice_4.solvers;

import practice_4.Season;

public class SwitchTaskSolver {

    public static void main(String[] args) {
        // проверка по проверке дня недели
        System.out.println(dayOfWeek(2));
        System.out.println(dayOfWeek(15));

        // проверка метода описания сезона
        System.out.println(describeSeason(Season.WINTER));
        System.out.println(describeSeason(Season.AUTUMN));
    }


    public static String dayOfWeek(int day){
        String dayOfWeek = "";

        switch (day){
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case  4:
                dayOfWeek = "Четверг";
                break;
            case  5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = "Несуществующий день недели";
        }
        return dayOfWeek;
    }

    public static String describeSeason(Season season){
        String description = "";

        switch (season) {
            case WINTER -> description = "Зима - холодно и снежно";
            case SUMMER -> description = "Лето - жарко";
            case SPRING -> description = "Весна - хорошо";
            case AUTUMN -> description = "Осень - день рождения";
        }
        return description;
    }


}

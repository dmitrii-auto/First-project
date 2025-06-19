package HomeWork_3;

public class GameSettings {

    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String someGameName, int someCurrentPlayers){
        this.gameName = someGameName;
        this.currentPlayers = someCurrentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers){
        maxPlayers = newMaxPlayers;
    }

    void addPlayer(){
        if (currentPlayers < maxPlayers){
            currentPlayers++;
        } else {
            throw new IllegalArgumentException("Достигнуто максимальное количество игроков");
        }
    }

    void printGameStatus(){
        System.out.println("Назвыние игры : " + gameName + ". Текущее количество игроков: " + currentPlayers + ". Максимальное количество игроков: " + maxPlayers);
    }




}

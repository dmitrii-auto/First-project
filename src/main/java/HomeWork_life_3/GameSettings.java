package HomeWork_life_3;

public class GameSettings {

    static private int maxPlayers = 5;
    final private String GAME_NAME;
    private int currentPlayers;

    GameSettings(String someGameName, int someCurrentPlayers){
        this.GAME_NAME = someGameName;
        this.currentPlayers = someCurrentPlayers;
    }

    static int getMaxPlayers(){
        return maxPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers){
        maxPlayers = newMaxPlayers;
    }

    String getGameName(){
        return this.GAME_NAME;
    }

    int getCurrentPlayers(){
        return this.currentPlayers;
    }

    void setCurrentPlayers(int newCurrentPlayers){
        this.currentPlayers = newCurrentPlayers;
    }

    void addPlayer(){
        if (currentPlayers < maxPlayers){
            currentPlayers++;
        } else {
            throw new IllegalArgumentException("Достигнуто максимальное количество игроков");
        }
    }

    void printGameStatus(){
        System.out.println("Название команды: " + GAME_NAME + ". Текущее количество игроков: " + currentPlayers + ". Максимальное количестов игроков: " + maxPlayers);
    }


}

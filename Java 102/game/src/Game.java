import java.util.Scanner;

public class Game {
    private Scanner inp = new Scanner(System.in);
    void start(){
        String playerName;
        System.out.println("Oyuna Hoşgeldiniz");
        System.out.println("İsminizi girin:");
        playerName = inp.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + "Hoşgeldiniz");
    }

}

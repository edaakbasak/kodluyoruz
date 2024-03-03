import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    private Scanner inp = new Scanner(System.in);
    void start(){
        String playerName;
        System.out.println("Oyuna Hoşgeldiniz");
        System.out.println("İsminizi girin:");
        playerName = inp.nextLine();
        Player player = new Player("eyyo");
        System.out.println("Sayın " + player.getName() + " Hoşgeldiniz");
        System.out.println("Lütfen karakterinizi seçiniz");
        player.selectChar();
    }
}

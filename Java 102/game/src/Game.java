import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    private Scanner inp = new Scanner(System.in);
    void start(){
        String playerName;
        System.out.println("Oyuna Hoşgeldiniz");
        System.out.println("İsminizi girin:");
        //String playerName = inp.nextLine();
        Player player = new Player("eyyo");
        System.out.println("Sayın " + player.getName() + " Hoşgeldiniz");
        System.out.println("Lütfen karakterinizi seçiniz");
        player.selectChar();

        Location location = null;

        while (true) {
            player.printInfo();
            System.out.println("Bölgeler");
            System.out.println("1- Güvenli Ev");
            System.out.println("2- Mağaza");
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz:");
            int selectloc = inp.nextInt();
            switch (selectloc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);

            }
            if (location.onLocation() == false){
                System.out.println("Game Over!");
                break;
            }
        }
    }
}

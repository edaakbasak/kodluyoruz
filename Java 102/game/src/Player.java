import java.util.Scanner;

public class Player {
    Inventory inventory;
    private int damage;
    private int healthy;
    private int money;
    private String name;
    private String charName;
    Scanner inp = new Scanner(System.in);
    private Inventory inv;

    public Player(String name){
        this.name = name;
        this.inv = new Inventory();
    }

    void selectChar(){
        Samurai samurai = new Samurai();
        Knight knight = new Knight();
        Archer archer = new Archer();

        GameChar[] charList ={new Samurai(), new Archer() ,new Knight()};

        System.out.println("Karakterler");
        System.out.println("----------------------------");
        for (GameChar gameChar : charList){
            System.out.println("ID : " + gameChar.getId() +
                    "\t\t Karakter : " + gameChar.getName() +
                    "\t\t Hasar : " + gameChar.getDamage() +
                    "\t\t Sağlık : " + gameChar.getHealthy() +
                    "\t\t Para : " + gameChar.getMoney());
        }
        System.out.println("----------------------------");
        System.out.println("Lütfen bir karakter giriniz!");
        int selectChar = inp.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        /*System.out.println("Karakter : " + this.getCharName()
                + ", Hasar : " + this.getDamage()
                + ", Sağlık : " + this.getHealthy()
                + ", Para : " + this.getMoney());*/
    }

    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealthy(gameChar.getHealthy());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }
    public void printInfo(){
        System.out.println("Silahınız :" + this.getInventory().getWeapon().getName()
                + ", Hasar : " + this.getDamage()
                + ", Sağlık : " + this.getHealthy()
                + ", Para : " + this.getMoney());
    }
    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}

public class Player {
    Inventory inventory;
    private int damage;
    private int healthy;
    private int money;
    private String name;
    private String charName;

    public Player(String name){
        this.name = name;
    }

    void selectChar(){
        System.out.println("Karakter : Samuray \t Hasar : 5 \t Sağlık : 21 \t Para : 15");
        System.out.println("Karakter : Okçu \t Hasar : 7 \t Sağlık : 18 \t Para : 20");
        System.out.println("Karakter : Şövalye \t Hasar : 8 \t Sağlık : 24 \t Para : 5");
    }
    public int getDamage() {
        return damage;
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
}

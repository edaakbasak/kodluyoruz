public class GameChar {

    private int damage;
    private int healthy;
    private int money;

    public GameChar(int damage, int healthy, int money) {
        this.damage = damage;
        this.healthy = healthy;
        this.money = money;
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
}

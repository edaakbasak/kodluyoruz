public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    boolean onLocation(){
        System.out.println("Güvenli Evdesiniz!");
        System.out.println("Canınız Yenilendi!");
        return true;
    }
}

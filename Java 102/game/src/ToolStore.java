public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    boolean onLocation() {
        System.out.println("Mağazaya Hoşgeldiniz!");
        System.out.println("1- Sialhlar");
        System.out.println("2- Zırhlar");
        System.out.println("3- Çıkış Yap");
        System.out.println("Seçiminiz: ");
        int selectCase = Location.inp.nextInt();
        while (selectCase<1 || selectCase > 3){
            System.out.println("Geçersiz değer, tekrar girin: ");
            selectCase = inp.nextInt();
        }
        return true;
    }
}

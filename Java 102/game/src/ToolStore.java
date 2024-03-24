public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    boolean onLocation() {
        System.out.println("Mağazaya Hoşgeldiniz!");
        System.out.println("1- Silahlar");
        System.out.println("2- Zırhlar");
        System.out.println("3- Çıkış Yap");
        System.out.println("Seçiminiz: ");
        int selectCase = Location.inp.nextInt();
        while (selectCase<1 || selectCase > 3){
            System.out.println("Geçersiz değer, tekrar girin: ");
            selectCase = inp.nextInt();
        }
        switch (selectCase){
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("Bir daha bekleriz!");
                return true;
        }
        return true;
    }

    public void printWeapon(){
        System.out.println("----- Silahlar -----");
        System.out.println();
        for (Weapon w : Weapon.weapons()){
            System.out.println(w.getId()+"-"+ w.getName() +"<Para : "+ w.getPrice() + ", Hasar : "+ w.getDamage() +">");
        }
    }
    public void buyWeapon(){

        System.out.println("Bir Silah Seçiniz: ");
        int selectWeapon = inp.nextInt();

        while (selectWeapon<1 || selectWeapon > Weapon.weapons().length){
            System.out.println("Geçersiz değer, tekrar girin: ");
            selectWeapon = inp.nextInt();
        }

        Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeapon);

        if (selectedWeapon != null){
            if(selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                System.out.println("Yetersiz Bakiye");
            }else{
                System.out.println(selectedWeapon.getName() + "silahını aldınız");
                int balance  = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                System.out.println("Önceki silahınız"+this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Şimdiki silahınız"+this.getPlayer().getInventory().getWeapon().getName());
            }
        }
    }
    public void printArmor(){
        System.out.println("Zırhlar");
    }

}

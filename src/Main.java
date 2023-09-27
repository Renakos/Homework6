// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Weapon weapon = new Weapon();
        weapon.setGun("AK-47");
        weapon.setType("gun");
        boss.setHealth(700);
        boss.setWeapon(weapon);
        boss.setDamage(50);
        System.out.println("Boss damage:" + " " + boss.getDamage() + " " + "Boss health:" + " " + boss.getHealth() + " " + "Boss weapon:" + " " + boss.getWeapon().getGun() + " " + boss.getWeapon().getType());
    }
}
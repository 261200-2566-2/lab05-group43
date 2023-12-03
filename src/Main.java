// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Character Genji = new Character("Genji naja");
        System.out.println("Speed: "+Genji.get_Speed());
        System.out.println("HP: "+Genji.get_HP());

        System.out.println("Equip Omni Arms!!!");
        Equipment.omniarms OA = new Equipment.omniarms("OA");
        Genji.equip_OmniArms(OA);
        Genji.equip_OmniArms(OA);
        System.out.println("Speed: "+Genji.get_Speed());
        System.out.println("HP: "+Genji.get_HP());

        System.out.println("Genji is the Thief!!!");
        Genji.theThief(Genji);
        Genji.theThief(Genji);
        System.out.println("Speed "+Genji.get_Speed());
        System.out.println("HP "+Genji.get_HP());
        System.out.println("Damage "+Genji.get_Damage());
        System.out.println("Def "+Genji.get_Defend());
        System.out.println("Mana "+Genji.get_Mana());
    }
}
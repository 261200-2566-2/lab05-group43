// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        test_interact();
    }

    public static void test_interact(){
        Character Genji = new Character("Genji");
        Character Sigma = new Character("Sigma");

        System.out.println("Genji attack Sigma!!!");
        Genji.attack(Sigma);
        stackOf(Genji);
        stackOf(Sigma);

        System.out.println("Genji equip Muramasa!!!");
        Equipment.muramasa mu = new Equipment.muramasa("Muramasa!!!");
        Genji.equip_Muramasa(mu);
        stackOf(Genji);

        System.out.println("Genji attack Sigma!!!");
        Genji.attack(Sigma);
        stackOf(Genji);
        stackOf(Sigma);

        System.out.println("Genji unequipped Muramasa!!!");
        Genji.un_EquipMS(mu);
        stackOf(Genji);

        //------------------------------------------------------------
        System.out.println("Sigma equip Omni Arm!!!");
        Equipment.omniarms oa = new Equipment.omniarms("Omni Arms");
        Sigma.equip_OmniArms(oa);
        stackOf(Sigma);

        System.out.println("Sigma attack Genji!!!");
        Sigma.attack(Genji);
        stackOf(Genji);
        stackOf(Sigma);

        System.out.println("Sigma still attack!!!");
        Sigma.attack(Genji);
        Sigma.attack(Genji);
        Sigma.attack(Genji);
        Sigma.attack(Genji);
        stackOf(Genji);

        System.out.println("Genji equip muramasa and attack Sigma!!!");
        Genji.equip_Muramasa(mu);
        Genji.attack(Sigma);
        Genji.attack(Sigma);
        Genji.attack(Sigma);
        Genji.attack(Sigma);
        stackOf(Sigma);
    }

    public static void test01(){
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

    public static void stackOf(Character ch){
        System.out.println("Name: "+ch.name);
        System.out.println("HP: "+ch.now_HP+"/"+ch.get_HP());
        System.out.println("Mana: "+ch.now_Mana+"/"+ch.get_Mana());
        System.out.println("Shield: "+ch.now_Defend+"/"+ch.get_Defend());
        System.out.println("Damage: "+ch.damage);
        System.out.println("------------");
    }
}
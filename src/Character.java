public class Character implements Job,Accessorie {
    private int max_HP=100 ,max_Mana=50 ,max_Defend=100;

    private static final int base_Damage = 2;
    private static final int base_Run = 5;

    private static int level = 1;
    String name;
    double max_Speed;
    int damage;
    int now_HP,now_Mana,now_Defend;
    boolean eq_Sword ,eq_Shield;
    boolean eq_Muramasa ,eq_OmniArms;
    boolean thief,shieldguy;
    boolean magicAb;
    boolean physicalAb;

    public Character(String name){
        this.name = name;
        calculate();
        now_HP = max_HP;
        now_Mana = max_Mana;
        now_Defend = max_Defend;
    }
    private void calculate(){ //setter
        max_HP += 10*(level-1);
        max_Mana += 2*(level-1);
        max_Defend += 10*(level-1);

        now_HP += 10*(level-1);
        now_Mana += 2*(level-1);
        now_Defend += 10*(level-1);
        max_Speed = base_Run+base_Run*(0.1+0.03*(level-1));
        damage = base_Damage+base_Damage+(1+2*(level-1));
    }
    public int get_HP(){ //getter
        return max_HP;
    }
    public int get_Mana(){ //getter
        return max_Mana;
    }
    public int get_Defend(){ //getter
        return max_Defend;
    }
    public int get_Damage(){ return  damage;}
    public double get_Speed(){return max_Speed;}

    public void level_UP(){
        level++;
        calculate();
        Equipment.sword.lv_up();
        Equipment.shield.lv_up();
    }

    public void attack(Character b){
        b.now_HP -= damage;
        b.now_Defend -= (damage/2);
        if(b.eq_Shield && b.now_Defend > 0){
            b.now_HP += (damage-5);
        }
        if(b.now_Defend<=0){
            b.now_Defend = 0;
        }
        if(b.now_HP<=0){
            b.now_HP = 0;
            System.out.println("You killed "+b.name+" !!!");
        }
    }
    public void equip_SW(Equipment.sword x){
        if(eq_Sword){
            System.out.println("YOU EQUIPPED A SWORD.!!!");
        }
        else {
            eq_Sword = true;
            x.speed_SW = base_Run * (0.1 + 0.04 * level);
            max_Speed = max_Speed - x.speed_SW;
            damage += Equipment.sword.sword_Dmg;
        }
    }
    public void un_EquipSW(Equipment.sword x){
        if(!eq_Sword){
            System.out.println("YOU DON'T EQUIP A SWORD.!!!");
        }
        else {
            eq_Sword = false;

            max_Speed = max_Speed + x.speed_SW;
            damage -= Equipment.sword.sword_Dmg;
        }
    }
    public void equip_SH(Equipment.shield x){
        if(eq_Shield){
            System.out.println("YOU EQUIPPED A SHIELD.!!!");
        }
        else {
            eq_Shield = true;

            x.speed_SH = base_Run * (0.1 + 0.08 * level);
            max_Speed = max_Speed - x.speed_SH;
            max_Defend += Equipment.shield.shield_Def;
            now_Defend += Equipment.shield.shield_Def;
        }
    }
    public void un_EquipSH(Equipment.shield x){
        if(!eq_Shield){
            System.out.println("YOU DON'T EQUIP A SHIELD.!!!");
        }
        else {
            eq_Shield = false;

            max_Speed = max_Speed + x.speed_SH;
            max_Defend -= Equipment.shield.shield_Def;
            now_Defend -= Equipment.shield.shield_Def;
        }
    }
    public void equip_Muramasa(Equipment.muramasa x){
        if(eq_Muramasa){
            System.out.println("YOU EQUIPED A MURAMASA.!!!");
        }
        else {
            eq_Muramasa = true;
            damage += 20;
            now_HP += 10;
        }
    }
    public void un_EquipMS(Equipment.muramasa x){
        if(!eq_Muramasa){
            System.out.println("YOU DON'T EQUIP A MURAMASA.!!!");
        }
        else {
            eq_Muramasa = false;
            damage -= 20;
            max_HP -= 10;
        }
    }
    public void equip_OmniArms(Equipment.omniarms x){
        if(eq_OmniArms){
            System.out.println("YOU EQUIPED A OMNIARMS.!!!");
        }
        else {
            eq_OmniArms = true;
            max_Speed += 8;
            max_HP += 20;
        }
    }
    public void un_EquipOA(Equipment.omniarms x){
        if(!eq_OmniArms){
            System.out.println("YOU DON'T EQUIP A OMNIARMS.!!!");
        }
        else {
            eq_OmniArms = false;
            max_Speed -= 20;
            now_HP -= 20;
        }
    }
    public void theThief(Character x){
        if(thief) { System.out.println("You are the Thief NOW !!!"); }
        else {
            magicAb = true;
            physicalAb = false;
            thief = true;

            max_Defend -= 15;
            max_Speed += 10;
            max_HP -= 50;
            damage += 30;
        }
    }
    public void shieldGuy(Character x){
        if(shieldguy){ System.out.println("You are Shield Guy NOW!!!"); }
        else {
            physicalAb = true;
            magicAb = false;
            shieldguy = true;

            max_Defend += 20;
            max_Speed -= 5;
            max_HP += 100;
            damage -= 20;
        }
    }
}

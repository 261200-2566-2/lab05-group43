public class Equipment {
    public static class sword {
        double speed_SW = 0;
        static int baseDamage ,sword_Dmg ,lv = 1;

        public sword(int baseDamage_SW){
            baseDamage = baseDamage_SW;
            sword_Dmg = baseDamage_SW*(1+lv+1);
        }

        public static void lv_up(){
            lv++;
            sword_Dmg = baseDamage*(1+lv+1);
        }

    }
    public static class shield {
        double speed_SH = 0;
        static int baseDefense ,shield_Def ,lv = 1;

        public shield(int baseDefense_SH){
            baseDefense = baseDefense_SH;
            shield_Def = baseDefense*(1+lv);
        }

        public static void lv_up(){
            lv++;
            shield_Def = baseDefense*(1+lv);
        }

    }
    public static class muramasa {
        String name = "";
        public muramasa(String name){
            this.name = name;
        }

    }
    public static class omniarms {
        String name = "";
        public omniarms(String name){
            this.name = name;
        }

    }
}

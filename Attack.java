// package Unit3.gvt;

public class Attack {

    public enum DamageType {
        PHYSICAL,
        MAGICAL,
        POISON,
        HOLY,
        ELEMENTAL
    }
    
    String attackName;
    int[] numberOhits;
    DamageType damagetype;

    public String getAttackName() {
        return attackName;
    }

    public int[] getNumberOhits() {
        return numberOhits;
    }

    public DamageType getDamageType() {
        return damagetype;
    }

    public Attack(String attackName, int[] numberOhits, DamageType damagetype) {
        this.attackName=attackName;
        this.numberOhits=numberOhits;
        this.damagetype=damagetype;
    }

    @Override
    public String toString() {
        return ("The figher's attack name is: "+attackName+"\n"+"The number of hits are: "+numberOhits+"\n"
        +"The fighter's damage type is: "+damagetype);
    }

   /*  public void takeDamage (Attack attack) {
        
    } */

    public static void main(String[] args) {
        int[] GBattack= {69,69,69,69,69};
        Attack GBHolmes= new Attack("FINISH NE", GBattack, Attack.DamageType.PHYSICAL);
        for (int attacks: GBHolmes.getNumberOhits()){
            System.out.println("Hits: "+attacks);
        }
        System.out.println(GBHolmes.getDamageType());

    }
}
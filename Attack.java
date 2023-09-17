
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
}
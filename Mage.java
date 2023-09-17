
public class Mage extends Goat {

    public Mage(String name) {   
        super(name);
        super.currentHP= 125;
        super.maximumHP= 125;
    } 

    public void takeDamage (Attack attack) {
        int amountODamage=0;
        for(int x=0; attack.getNumberOhits().length>x; x++) {
            amountODamage= amountODamage+attack.getNumberOhits()[x];
        }
        if(currentHP-amountODamage*1.25<0 || currentHP-amountODamage*0.75<0) {
            currentHP= 0;
        } else {
            if(attack.getDamageType().equals(Attack.DamageType.MAGICAL)) {
                currentHP-= amountODamage*0.75;
            } else {
                currentHP-= amountODamage*1.25;
            }
        }
    }

    public void attackMage(Mage target) {
        Attack attack= new Attack ("Magic Missiles", new int[] {9,9,9,9}, Attack.DamageType.MAGICAL);
        target.takeDamage(attack);
    }
    
    public void attackFighter(Fighter target) {
        Attack attack= new Attack ("Cleave", new int[] {25}, Attack.DamageType.PHYSICAL);
        target.takeDamage(attack);
    }

    @Override
    public String toString() {
        return ("The character is named: "+name+"\n"+"Their current HP is: "+currentHP+"\n"+"Their max HP is: "
        +maximumHP);
    }
}

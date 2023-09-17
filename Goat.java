/* This is the parent class where the child classes: Mage and Fighter; share the same attributes here.
 * @Author: Ahmed Adel Almari
 */

public class Goat {
    protected String name;
    protected int maximumHP;
    protected int currentHP;

    public String getName() {
        return name;
    }

    public int getMaximumHP() {
        return maximumHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public Goat(String name) {   
        // super(name);
        this.name= name;
    } 

    public void heal(int amount) {
        
        if(currentHP+amount>maximumHP) {
            currentHP= maximumHP;
        } else {
            currentHP= currentHP+amount;
        }
    }

    public boolean isConscious() {
        if(currentHP>0) {
            return true; }
            else { 
                return false;
            }
        }
} 
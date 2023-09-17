

public class GoatArena {
    public static void MagevsFighter(Fighter fighter, Mage mage) {
        
        while(fighter.isConscious()==true && fighter.isConscious()==true && 
        fighter.getCurrentHP()>0 && mage.getCurrentHP()>0) 
        {
            fighter.attackMage(mage);
            mage.attackFighter(fighter);

            System.out.println(mage.toString());
            System.out.println(" ");
            System.out.println(fighter.toString());
            System.out.println("");
        }

        if (fighter.getCurrentHP()==0) {
                System.out.println(mage.getName()+" has won the colliseum battle!!");
            } else if (mage.getCurrentHP()==0){
                System.out.println(fighter.getName()+" has won the colliseum battle!!");
            } else { //this should not activate unless program logic is wrong.
                System.out.println("The fight ended in a draw!");
            }
    }

    public static void battleMages(Mage mage1, Mage mage2) {
        
        while(mage1.isConscious()==true && mage2.isConscious()==true && 
        mage1.getCurrentHP()>0 && mage2.getCurrentHP()>0) 
        {
            mage1.attackMage(mage2);
            mage2.attackMage(mage1);

            System.out.println(mage1.toString());
            System.out.println(" ");
            System.out.println(mage2.toString());
            System.out.println("");
        }

        if (mage1.getCurrentHP()==0) {
                System.out.println(mage2.getName()+" has won the colliseum battle!!");
            } else if (mage2.getCurrentHP()==0){
                System.out.println(mage1.getName()+" has won the colliseum battle!");
            } else { //this should not activate unless program logic is wrong.
                System.out.println("The fight ended in a draw!");
            }
    }

    public static void battleFighters(Fighter fighter1, Fighter fighter2) {
        
        while(fighter1.isConscious()==true && fighter2.isConscious()==true && 
        fighter1.getCurrentHP()>0 && fighter2.getCurrentHP()>0) 
        {
            fighter1.attackFighter(fighter2);
            fighter2.attackFighter(fighter1);

            System.out.println(fighter1.toString());
            System.out.println(" ");
            System.out.println(fighter2.toString());
            System.out.println("");
        }

        if (fighter1.getCurrentHP()==0) {
                System.out.println(fighter2.getName()+" has won the colliseum battle!!");
            } else if (fighter2.getCurrentHP()==0){
                System.out.println(fighter1.getName()+" has won the colliseum battle!");
            } else { //this should not activate unless program logic is wrong.
                System.out.println("The fight ended in a draw!");
            }
    }

    public static void main(String[] args) {
        Fighter GaryBusterHolmes= new Fighter("Gary Buster Holmes");
        Fighter KazumaKiryu= new Fighter("Kazuma Kiryu");
        Mage Gandalf= new Mage("Gandalf");
        Mage Ranni= new Mage("Ranni");
        Mage HarryPotter= new Mage("Harry Potter");
        Mage Tendo= new Mage("Tendo");
        
        MagevsFighter(GaryBusterHolmes, Gandalf);
        battleMages(HarryPotter, Tendo);
        battleFighters(GaryBusterHolmes, KazumaKiryu);
        battleMages(Ranni, Tendo);
    }
}
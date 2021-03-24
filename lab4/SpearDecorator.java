/**
 * ENSE375 Lab4
 * Li Pan 200371281
 * Concrete SpearDecorator Class 
 */

public class SpearDecorator extends WeaponDecorator{

    protected AbstractKnight abstractKnight;

    SpearDecorator(AbstractKnight abstractKnight){
        this.abstractKnight = abstractKnight;
    }
    
    public void getAttackDescription(){
        this.abstractKnight.getAttackDescription();
        System.out.print("Spear. ");
    }

    public int getAttackDamage(){
        return 8 + abstractKnight.getAttackDamage();
    }
    
}

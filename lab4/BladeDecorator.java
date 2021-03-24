/**
 * ENSE375 Lab4
 * Li Pan 200371281
 * Concrete BladeDecorator Class 
 */

public class BladeDecorator extends WeaponDecorator{
    protected AbstractKnight abstractKnight;

    BladeDecorator(AbstractKnight abstractKnight){
        this.abstractKnight = abstractKnight;
    }
    
    public void getAttackDescription(){
        this.abstractKnight.getAttackDescription();
        System.out.print("Blade. ");
    }

    public int getAttackDamage(){
        return 8 + abstractKnight.getAttackDamage();
    }
    
}

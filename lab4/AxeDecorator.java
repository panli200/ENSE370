/**
 * ENSE375 Lab4
 * Li Pan 200371281
 * Concrete AxeDecorator Class 
 */

public class AxeDecorator extends WeaponDecorator {

    protected AbstractKnight abstractKnight;

    AxeDecorator(AbstractKnight abstractKnight){
        this.abstractKnight = abstractKnight;
    }
    
    public void getAttackDescription(){
        this.abstractKnight.getAttackDescription();
        System.out.print("Axe. ");
    }

    public int getAttackDamage(){
        return 10 + abstractKnight.getAttackDamage();
    }
    

}

/**
 * ENSE375 Lab4
 * Li Pan 200371281
 * Concrete DaggerDecorator Class 
 */
public class DaggerDecorator extends WeaponDecorator {

    protected AbstractKnight abstractKnight;

    DaggerDecorator(AbstractKnight abstractKnight){
        this.abstractKnight = abstractKnight;
    }

    public void getAttackDescription(){
        this.abstractKnight.getAttackDescription();
        System.out.print("Dagger. ");
    }

    public int getAttackDamage(){
        return 7 + abstractKnight.getAttackDamage();
    }
    
}

/**
 * ENSE375 Lab4
 * Li Pan 200371281
 * Concrete SwordDecorator Class 
 */
public class SwordDecorator extends WeaponDecorator {

    protected AbstractKnight abstractKnight;
    
    public SwordDecorator(AbstractKnight abstractKnight) {
        this.abstractKnight = abstractKnight;
    }

    public void getAttackDescription() {
        this.abstractKnight.getAttackDescription();
        System.out.print("Sword. ");
    }

    public int getAttackDamage() {
        return 10 + this.abstractKnight.getAttackDamage();
    }
}

/**
 * ENSE375 Lab4
 * Li Pan 200371281
 * Concrete BowDecorator Class 
 */
public class BowDecorator extends WeaponDecorator {
    
    protected AbstractKnight abstractKnight;

    public BowDecorator(AbstractKnight abstractKnight) {
        this.abstractKnight = abstractKnight;
    }

    public void getAttackDescription() {
        this.abstractKnight.getAttackDescription();
        System.out.print("Bow. ");
    }

    public int getAttackDamage() {
        return 5 + this.abstractKnight.getAttackDamage();
    }
}

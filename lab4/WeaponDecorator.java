/**
 * ENSE375 Lab4
 * Li Pan 200371281
 * Abstract WeaponDecorator Class 
 */
public abstract class WeaponDecorator implements AbstractKnight {

    protected AbstractKnight abstractKnight;

    public int getAttackDamage() {
        return abstractKnight.getAttackDamage();
    }

    public void getAttackDescription() {
        abstractKnight.getAttackDescription();
    }
    

}

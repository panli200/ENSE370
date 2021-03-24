/**
 * ENSE370 Lab4 Li Pan 200371281 
 * Game class 
 * Reference: The lab template
 */

public class Game {

    public static void main(String[] args) {

        int damage;
        AbstractKnight firstKnight = new BowDecorator(new SwordDecorator(new Knight()));

        firstKnight.getAttackDescription();
        damage = firstKnight.getAttackDamage();
        System.out.println(" The attack does " + damage + " damage.");

    }
}
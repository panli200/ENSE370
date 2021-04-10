import java.util.Scanner;

public class Player extends Character implements ObserverPlayer {

    private String nextAction;
    private Boss boss;
    private int bossHealth;
    final static int MAXPLAYERHEALTH = 50;
    final static int PLAYERDAMAGEMEAN = 10;
    final static int PLAYERDAMAGEVARIANCE = 2;
    final static int PLAYERHEALMEAN = 30;
    final static int PLAYERHEALVARIANCE = 3;

    public Player() {
        super(MAXPLAYERHEALTH);
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    /*
     * public void getBossHealth(){ this.bossHealth = this.boss.getHealth(); }
     */
    /** Adding a new funtion */
    public void updateBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public void printGameState() {
        System.out.println("The player currently has: " + this.currentHealth + " health");
        System.out.println("The boss currently has: " + this.bossHealth + " health");
    }

    /*
     * long funtion public String getStringMeaning(String string) { if
     * (string.contains("A")){ return "Attack"; } else if (string.contains("a")){
     * return "Attack"; } else if (string.contains("H")){ return "Heal"; } else if
     * (string.contains("h")){ return "Heal"; } return "Illegal"; }
     */

    /* Decompose Funtion */
    public String getStringMeaning(String string) {
        if (string.equals("A") || string.equals("a")) {
            return "Attack";
        } else if (string.equals("H") || string.equals("h")) {
            return "Heal";
        }
        return "Illegal";
    }

    public void chooseAction() {
        System.out.println("Enter A to attack or H to heal");
        Scanner scanner = new Scanner(System.in);
        String inputString = "Illegal";
        while (inputString.equals("Illegal")) {
            String inputEntry = scanner.nextLine();
            inputString = getStringMeaning(inputEntry);
        }
        this.nextAction = inputString;
    }

    // extract funtions - player attach; player heal
    /*
     * public void takeAction() { if (this.nextAction.equals("Attack")) { int damage
     * = getRandomWithVariance (10, 2); System.out.println
     * ("The player attacks for " + damage + " damage"); boss.takeDamage(damage);
     * 
     * } else if (this.nextAction.equals("Heal")) { int healAmount =
     * getRandomWithVariance (30, 3); System.out.println ("The player heals for " +
     * healAmount + " health"); this.currentHealth += healAmount;
     * this.clampHealth(); } }
     */
    public void takeAction() {
        if (this.nextAction.equals("Attack")) {
            playerAttach();

        } else if (this.nextAction.equals("Heal")) {
            playerHeal();
        }
    }

    public void playerAttach() {
        int damage = getRandomWithVariance(PLAYERDAMAGEMEAN, PLAYERDAMAGEVARIANCE);
        System.out.println("The player attacks for " + damage + " damage");
        boss.takeDamage(damage);
    }

    public void playerHeal() {
        int healAmount = getRandomWithVariance(PLAYERHEALMEAN, PLAYERHEALVARIANCE);
        System.out.println("The player heals for " + healAmount + " health");
        this.currentHealth += healAmount;
        this.clampHealth();
    }

}

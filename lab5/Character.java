import java.util.Random;

public abstract class Character {

    protected int currentHealth;
    protected int maxHealth;
    private Random randomNum;


    public Character (int maxHealth) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.randomNum = new Random();
    }

    public int getHealth () {
        return this.currentHealth;
    }

    public int getRandom (int max) {
        return this.randomNum.nextInt(max);
    }

    public int getRandomWithVariance (int mean, int variance) {
        return mean - variance + this.randomNum.nextInt(variance*2);
    }
    
    public void clampHealth () {
        if (this.currentHealth < 0) {
            this.currentHealth = 0;
        }
        if (this.currentHealth > this.maxHealth) {
            this.currentHealth = this.maxHealth;
        }
    }
    
    public void takeDamage (int damage) {
        this.currentHealth -= damage;
        this.clampHealth();
    }

    public boolean isAlive () {
        return this.currentHealth > 0;
    }

    public abstract void takeAction();
}


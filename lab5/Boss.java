import java.util.ArrayList;

public class Boss extends Character implements SubjectBoss {

    private ArrayList<Player> players;
    final static int MAXBOSSHEALTH = 400;
    final static int BOSSDAMAGEMEAN = 15;
    final static int BOSSDAMAGEVARIANCE = 5;

    public Boss() {
        super(MAXBOSSHEALTH);
        this.players = new ArrayList<Player>();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void takeAction() {
        int randomPlayerIndex = super.getRandom(this.players.size());

        while (!this.players.get(randomPlayerIndex).isAlive()) {
            randomPlayerIndex = super.getRandom(this.players.size());
        }

        int damage = super.getRandomWithVariance(BOSSDAMAGEMEAN, BOSSDAMAGEVARIANCE);
        System.out.println("The boss attacks player " + randomPlayerIndex + " for " + damage + " damage");
        this.players.get(randomPlayerIndex).takeDamage(damage);

        if (!this.players.get(randomPlayerIndex).isAlive()) {
            System.out.println("Player " + randomPlayerIndex + " is down");
        }

    }

    @Override
    public void notifyAllPlayers() {
        for (Player player : players) {
            if (player.isAlive()) {
                player.updateBossHealth(super.getHealth());
            }
        }
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        notifyAllPlayers();
    }

}

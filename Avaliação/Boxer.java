package Avaliação;

import java.util.Random;




public class Boxer extends Fighter {
    private int range;

    
    public Boxer(String name, int wins, int loss, int life, String type) throws Exception {
        super(life, name, wins, loss, type);
        Random random = new Random();
        this.range = random.nextInt(10) + 1;
    }

    @Override
    public void attack(Fighter opp) {
        Random random = new Random();
        int dist = random.nextInt(10) + 1;
        do {
        if (dist <= range) {
            int damage = random.nextInt(100) + 1;
            opp.life -= damage;
            System.out.println(getName() + " lands a strike in " + opp.name + " and makes " + damage + " of damage.");

            }
        } else {
            System.out.println(getName() + " tries to attack " + opp.name + ", but is out of range");
        } while(isAlive(opp.life);)}
    }

    public int getRange() {
        return this.range;
    }

    public void setRange(int range) {
        this.range = range;
    }

}






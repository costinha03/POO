package Avaliação;

import java.util.Random;



public class Wrestler extends Fighter {
    private int speed;

    
    public Wrestler(String name, int wins, int loss, int life, String type) throws Exception {
        super(life, name, wins, loss, type);
        Random random = new Random();
        this.speed = random.nextInt(10) + 1;
    }

    @Override
    public void attack(Fighter opp) {
        Random random = new Random();
        int dist = random.nextInt(10) + 1;
        do {
        if (dist <= speed) {
            int damage = random.nextInt(100) + 1;
            opp.life -= damage;
            System.out.println(getName() + " lands a strike in " + opp.name + " and makes " + damage + " of damage.");
        } else {
            System.out.println(getName() + " tries to attack " + opp.name + ", but is out of range");
        }}while(Fighter.isAlive(opp.life));
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}

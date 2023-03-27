package Avaliação;

import java.util.Objects;

public abstract class Fighter {
    protected int life = 100;
    protected String name;
    int wins = 0;
    int loss = 0;
    private String type;


    public Fighter(int life, String name, int wins, int loss, String type) throws Exception {
        if (type == "Boxer" || type == "Wrestler")
        {this.life = life;
        this.name = name;
        this.wins = wins;
        this.loss = loss;
        this.type = type;}
        else{throw new Exception("Insert a valid type") ;}
    }
    public boolean isAlive(int life){
        return life > 0;
    }
    public abstract void attack(Fighter opp);


    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return this.wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoss() {
        return this.loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Fighter)) {
            return false;
        }
        Fighter fighter = (Fighter) o;
        return life == fighter.life && Objects.equals(name, fighter.name) && wins == fighter.wins && loss == fighter.loss && Objects.equals(type, fighter.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(life, name, wins, loss, type);
    }





    @Override
    public String toString() {
        return 
            " life: " + getLife() + "\n" +
            ", name: " + getName() + "\n" +
            ", wins: " + getWins() + "\n" +
            ", loss='" + getLoss() + "\n" +
            ", type='" + getType() + "\n"
            ;
    }
}
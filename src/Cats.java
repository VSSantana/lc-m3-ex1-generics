﻿public class Cats {

    private String race;

    public Cats(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Cats [race=" + race + "]";
    }

}

package model;

public class Cow implements Animal {
    private String Sound;

    public Cow(String Sound) {
        this. Sound = Sound;
    }

    @Override
    public String makesound() {
        return Sound ;
    }
}
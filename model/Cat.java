package model;

public class Cat implements Animal {
    private String sounds;

    public Cat(String sounds) {
        this.sounds = sounds;
    }

    @Override
    public String makesound() {
        return sounds ;
    }
}

package model;

public class Dog implements Animal {
    private String sound;

    public Dog(String sound) {
        this.sound = sound;
    }

    @Override
    public String makesound() {
        return sound ;
    }

}

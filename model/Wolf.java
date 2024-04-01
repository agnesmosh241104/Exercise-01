package model;

public class Wolf implements Animal {
    private String SoundLike;

    public Wolf(String SoundLike) {
        this.SoundLike = SoundLike;
    }

    @Override
    public String makesound() {
        return SoundLike;
    }
    
}

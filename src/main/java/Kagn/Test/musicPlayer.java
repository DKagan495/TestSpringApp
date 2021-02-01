package Kagn.Test;

public class musicPlayer {
    private Music music;
    public musicPlayer(Music music)
    {
        this.music = music;
    }
    public void whatPlay()
    {
        System.out.println("Plays: " + music.play());
    }
}

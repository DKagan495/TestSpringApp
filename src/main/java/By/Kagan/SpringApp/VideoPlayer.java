package By.Kagan.SpringApp;

public class VideoPlayer {
    private Video video;
    public VideoPlayer(Video video)
    {
        this.video = video;
    }

    public void playVideo() {
        System.out.println("Playing: " + video.getVideo());
    }
}

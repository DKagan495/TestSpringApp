package By.Kagan.SpringApp;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringMainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Video video = applicationContext.getBean("myVideoBean", Video.class);
        VideoPlayer videoPlayer = new VideoPlayer(video);
        videoPlayer.playVideo();
    }
}

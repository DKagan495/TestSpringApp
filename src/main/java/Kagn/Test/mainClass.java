package Kagn.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class mainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");
        Music muzicka = applicationContext.getBean("musicBean", Music.class);
        Music muse = applicationContext.getBean("musicBean1", Music.class);
        musicPlayer player = new musicPlayer(muzicka);
        musicPlayer musicPlayer = applicationContext.getBean("playerBean", musicPlayer.class);
        player.whatPlay();
        musicPlayer.whatPlay();
    }

}

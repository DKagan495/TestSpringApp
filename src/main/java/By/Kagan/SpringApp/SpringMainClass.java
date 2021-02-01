package By.Kagan.SpringApp;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringMainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Function function = applicationContext.getBean("testPhoneBean", Function.class);
        Function function1 = applicationContext.getBean("theFirstPhoneBean", Function.class);
        Function function2 = applicationContext.getBean("theSecondPhoneBean", Function.class);
        Function function3 = applicationContext.getBean("theFifthPhoneBean", Function.class);
        Function function4 = applicationContext.getBean("theFourthPhoneBean", Function.class);
        Function function5 = applicationContext.getBean("theSixthPhoneBean", Function.class);
        Function function6 = applicationContext.getBean("theThirdPhoneBean", Function.class);
        Phone phone = applicationContext.getBean("mobilePhone", Phone.class);
        phone.whatDoes();

    }
}

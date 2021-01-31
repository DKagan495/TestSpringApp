package By.Kagan.SpringApp;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringMainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       MyFrstBean myFrstBean =  applicationContext.getBean("MyBean", MyFrstBean.class);
        System.out.println(myFrstBean.getName());
        System.out.println(myFrstBean.getSurname());
        System.out.println(myFrstBean.getYearsOld());
    }
}

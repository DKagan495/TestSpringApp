package By.Kagan.SpringApp;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringMainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyFrstBean myFrstBean = applicationContext.getBean("MyBean", MyFrstBean.class);
        MyFrstBean myFrstBean1 = applicationContext.getBean("MyBean1", MyFrstBean.class);
        MyFrstBean myFrstBean2 = applicationContext.getBean("MyBean2", MyFrstBean.class);
        System.out.println(myFrstBean.getName() + " " +  myFrstBean.getSurname() + " " + myFrstBean.getYearsOld() + " years old");
        System.out.println(myFrstBean1.getName() + " " +  myFrstBean1.getSurname() + " " + myFrstBean1.getYearsOld() + " years old");
        System.out.println(myFrstBean2.getName() + " " +  myFrstBean2.getSurname() + " " + myFrstBean2.getYearsOld() + " years old");
        myFrstBean1.setName("Саня");
        myFrstBean1.setSurname("Кузнецов");
        System.out.println(myFrstBean1.getName() + " " +  myFrstBean1.getSurname() + " " + myFrstBean1.getYearsOld() + " years old");
    }
}

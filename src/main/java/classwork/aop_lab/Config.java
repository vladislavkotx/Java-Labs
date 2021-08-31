package classwork.aop_lab;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:mails.properties")
@ComponentScan(basePackages = "classwork.aop_lab")
@EnableAspectJAutoProxy
public class Config {


    public static void main(String[] args) throws DBException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyController myController = (MyController) context.getBean("myController");
        try {
            myController.askService();
        } catch (DBException e) {
            System.out.println("it went through");
        }

        context.close();
    }
}

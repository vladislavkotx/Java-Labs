package classwork.real_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Object terminatorQuoter = context.getBean("terminatorQuoter");
        Arrays.stream(terminatorQuoter.getClass().getDeclaredFields()).forEach(System.out::println);
        context.close();
    }
}
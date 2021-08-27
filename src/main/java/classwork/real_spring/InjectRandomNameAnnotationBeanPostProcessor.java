package classwork.real_spring;

import classwork.design_patterns.reflections.annotations.InjectRandomInt;
import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

public class InjectRandomNameAnnotationBeanPostProcessor implements BeanPostProcessor {

    @Override
    @SneakyThrows
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        for (Field field : bean.getClass().getDeclaredFields()) {
            InjectRandomName annotation = field.getAnnotation(InjectRandomName.class);
            if (annotation != null) {
                field.setAccessible(true);
                field.set(bean, new Faker().gameOfThrones().character());
            }
        }
        return bean;
    }
}

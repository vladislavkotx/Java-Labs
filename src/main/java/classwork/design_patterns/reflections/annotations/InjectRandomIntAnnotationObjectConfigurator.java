package classwork.design_patterns.reflections.annotations;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.Random;

public class InjectRandomIntAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        for (Field field : type.getDeclaredFields()) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if(annotation!=null){
                int max = annotation.max();
                int min = annotation.min();
                field.setAccessible(true);
                field.set(t, new Random().nextInt(max - min + 1) + min);
            }
        }
    }
}
package classwork.design_patterns.reflections.annotations;

import classwork.design_patterns.reflections.ObjectFactory;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeAnnotationObjectConfigure implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        for (Field field : type.getDeclaredFields()) {
            InjectByType annotation = field.getAnnotation(InjectByType.class);
            if(annotation!=null){
                field.setAccessible(true);
                field.set(t, ObjectFactory.getInstance().createObject(field.getType()));
                field.setAccessible(false);
            }
        }
    }
}

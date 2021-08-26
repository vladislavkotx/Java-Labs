package classwork.design_patterns.reflections;

public interface Config {
    <T> Class<T> getImplClass(Class<T> type);
}
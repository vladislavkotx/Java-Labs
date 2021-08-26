package classwork.design_patterns.reflections.models;

public class ConsoleSpeaker implements Speaker {
    private int volume;
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
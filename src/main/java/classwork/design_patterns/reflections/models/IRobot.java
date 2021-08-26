package classwork.design_patterns.reflections.models;

import classwork.design_patterns.reflections.annotations.InjectByType;

public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    public void init () {
        System.out.println("init done");
    }

    public void cleanRoom(){
        speaker.speak("Я начал работать");
        cleaner.clean();
        speaker.speak("Я закончил работать");
    }
}
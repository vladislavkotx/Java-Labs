package classwork.design_patterns.reflections.models;

import classwork.design_patterns.reflections.annotations.Benchmark;
import classwork.design_patterns.reflections.annotations.InjectByType;

import javax.annotation.PostConstruct;


public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    @PostConstruct
    public void init () {
        System.out.println("init done");
    }

    public void cleanRoom(){
        speaker.speak("Я начал работать");
        cleaner.clean();
        speaker.speak("Я закончил работать");
    }
}
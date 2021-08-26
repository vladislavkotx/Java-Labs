package classwork.design_patterns.reflections;


import classwork.design_patterns.reflections.models.IRobot;

public class Main {
    public static void main(String[] args) {
        ObjectFactory objectFactory = ObjectFactory.getInstance();
        IRobot iRobot = objectFactory.createObject(IRobot.class);
        iRobot.cleanRoom();
    }
}
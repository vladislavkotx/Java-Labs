package homework.lab3;

import lombok.Getter;

public interface Hero {

    String kick(Hero hero);
    String getName();
    String getClassName();
    int getPower();
    int getHp();
    boolean isAlive();
    void setName(String name);
    void setClassName(String className);
    void setPower(int power);
    void setHp(int hp);
    void setAlive(boolean isAlive);

}

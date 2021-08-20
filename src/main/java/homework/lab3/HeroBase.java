package homework.lab3;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
abstract public class HeroBase implements Hero {
    String name;
    String className;
    int hp;
    int power;
    boolean Alive;

    String createRandomName() {
        String[] str = {"Legolas", "Arthur", "Rodomir", "Frodo", "Gandalf", "Aragorn"};
        return str[new Random().nextInt(str.length)];
    }

    public String kick(Hero hero) {
        return "";
    }
}

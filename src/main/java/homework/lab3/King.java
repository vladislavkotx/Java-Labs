package homework.lab3;

import lombok.Getter;

import java.util.Random;

public class King extends Swordsman implements Hero{
    public King () {
        int[] rands = super.getRands();
        name = createRandomName();
        className = "King";
        hp = rands[0] + 5;
        power = rands[1] + 5;
        Alive = true;
    }
}

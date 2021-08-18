package homework.lab3;

public class Knight extends Swordsman implements Hero {
    public Knight () {
        int[] rands = super.getRands();
        name = createRandomName();
        className = "Knight";
        hp = rands[0] + 2;
        power = rands[1] + 2;
        Alive = true;
    }
}
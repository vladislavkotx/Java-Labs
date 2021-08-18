package homework.lab3;

public class Hobbit extends HeroBase implements Hero {

    public Hobbit () {
        name = createRandomName();
        className = "Hobbit";
        hp = 3;
        power = 0;
        Alive = true;
    }

    @Override
    public String kick(Hero hero) {
        return this.getClassName() + ' ' + this.getName() + " tried to run but he is too slow";
    }


}

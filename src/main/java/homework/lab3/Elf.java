package homework.lab3;

import lombok.Getter;
import lombok.Setter;

public class Elf extends HeroBase implements Hero {

    public Elf () {
        name = createRandomName();
        className = "Elf";
        hp = 10;
        power = 10;
        Alive = true;
    }

    @Override
    public String kick(Hero hero) {
        if (hero.getPower() < this.power) {
            hero.setAlive(false);
            return this.getClassName() + ' ' + this.getName() + " has crushed " + hero.getClassName() + ' ' + hero.getName();
        } else {
            hero.setPower(hero.getPower() - 1);
            return this.getClassName() + ' ' + this.getName() + " lowered " + hero.getClassName() + ' ' + hero.getName() + " power by 1";
        }
    }
}

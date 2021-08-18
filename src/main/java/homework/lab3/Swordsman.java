package homework.lab3;

import lombok.Getter;

import java.util.Random;

abstract class Swordsman extends HeroBase {
    public int[] getRands() {
        final int CAP = 10;
        Random rand = new Random();
        int randHP = rand.nextInt(CAP);
        int randPower = rand.nextInt(CAP);
        return new int[]{randHP, randPower};
    }

    @Override
    public String kick(Hero hero) {
        Random rand = new Random();
        int intRand = rand.nextInt(this.power);
        hero.setHp(hero.getHp() - intRand);
        if (hero.getHp() <= 0) {
            hero.setAlive(false);
        }
        return this.getClassName() + ' ' + this.getName() + " hit " + hero.getClassName() + ' ' + hero.getName() + " for " + intRand + "dmg";
    }
}

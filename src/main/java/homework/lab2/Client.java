package homework.lab2;

import lombok.Data;
import lombok.ToString;

/**
 * @author Evgeny Borisov
 */

@ToString
public class Client {
    private final int debt;
    private final int bonus;
    private final String name;
    private final int salary;

    public Client(int debt, int bonus, String name, int salary) {
        this.debt = debt;
        this.bonus = bonus;
        this.name = name;
        this.salary = salary;
    }

    public static ClientBuilder builder() {
        return new ClientBuilder();
    }

    public static class ClientBuilder {
        private int debt;
        private int bonus;
        private String name;
        private int salary;

        public ClientBuilder debt(int debt) {
            this.debt = debt;
            return this;
        }

        public ClientBuilder bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        public ClientBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ClientBuilder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Client build() {
            return new Client(this.debt, this.bonus, this.name, this.salary);
        }
    }
}
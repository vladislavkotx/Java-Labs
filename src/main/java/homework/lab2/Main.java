package homework.lab2;

public class Main {
    public static void main(String[] args) {
        Client client = Client.builder()
                .name("Vlad")
                .bonus(100)
                .debt(1000)
                .salary(5000)
                .build();
        System.out.println(client);
    }
}
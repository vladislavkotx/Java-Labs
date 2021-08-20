package classwork.design_patterns.never_use_switch;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;

import java.util.Random;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();
        Faker faker = new Faker();
        while (true) {
            MailInfo mailInfo = MailInfo.builder()
                    .context(faker.chuckNorris().fact())
                    .mailType(new Random().nextInt(2) + 1)
                    .build();

            mailSender.send(mailInfo);
            Thread.sleep(2000);
        }
    }
}
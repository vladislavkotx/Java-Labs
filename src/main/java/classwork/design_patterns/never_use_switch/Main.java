package classwork.design_patterns.never_use_switch;

import classwork.design_patterns.never_use_switch.mail_sender_service.HappyBDayMailSenderService;
import classwork.design_patterns.never_use_switch.mail_sender_service.MailSenderService;
import classwork.design_patterns.never_use_switch.mail_sender_service.WelcomeMailSenderSevice;
import com.github.javafaker.Faker;
import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();
//        mailSender.fillMap();
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

//    private final Map<Integer, MailSenderService> mailMap = new HashMap<>();

//    public void fillMap () {
//        mailMap.put(1, new WelcomeMailSenderSevice());
//        mailMap.put(2, new HappyBDayMailSenderService());
//    }
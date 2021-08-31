package classwork.design_patterns.never_use_switch;

import classwork.design_patterns.never_use_switch.mail_sender_service.HappyBDayMailSenderService;
import classwork.design_patterns.never_use_switch.mail_sender_service.MailSenderService;
import classwork.design_patterns.never_use_switch.mail_sender_service.WelcomeMailSenderSevice;
import classwork.enums.HttpCode;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class MailSender {

    private final static Map<Integer, MailSenderService> mailMap = new HashMap<>();

    static {
        mailMap.put(1, new WelcomeMailSenderSevice());
        mailMap.put(2, new HappyBDayMailSenderService());
    }

    public void send(MailInfo mailInfo) {
        MailSenderService mailSenderService = mailMap.get(mailInfo.getMailType());
        mailSenderService.sendMessage(mailInfo);
    }
}
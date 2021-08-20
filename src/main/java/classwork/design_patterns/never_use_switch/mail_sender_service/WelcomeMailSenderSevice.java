package classwork.design_patterns.never_use_switch.mail_sender_service;

import classwork.design_patterns.never_use_switch.MailInfo;

public class WelcomeMailSenderSevice implements MailSenderService {

    @Override
    public void sendMessage(MailInfo mailInfo) {
        System.out.println("Welcome message was sent " + mailInfo.getContext());
    }
}

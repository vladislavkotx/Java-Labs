package classwork.design_patterns.never_use_switch.mail_sender_service;

import classwork.design_patterns.never_use_switch.MailInfo;

public class HappyBDayMailSenderService implements MailSenderService{
    @Override
    public void sendMessage(MailInfo mailInfo) {
        System.out.println("Happy Birthday message was send " + mailInfo.getContext());
    }
}

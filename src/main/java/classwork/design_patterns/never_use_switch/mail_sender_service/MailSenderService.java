package classwork.design_patterns.never_use_switch.mail_sender_service;

import classwork.design_patterns.never_use_switch.MailInfo;

public interface MailSenderService {
    void sendMessage(MailInfo mailInfo);
}

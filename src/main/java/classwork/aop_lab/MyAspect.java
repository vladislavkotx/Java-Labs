package classwork.aop_lab;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@Aspect
@Component
public class MyAspect {

    private List<String> mails;

    @Value("${mails}")
    public void setMessages(String[] messages) {
        this.mails = new ArrayList<>(asList(messages));
    }

    @Around("execution(* classwork.aop_lab..*.*(..))")
    @SneakyThrows
    public Object handleMethods(ProceedingJoinPoint jp) {
        Object retVal = null;
        try {
            retVal = jp.proceed();
        } catch (DBException e) {
            if (e.getCause() != null) {
                if (!e.getCause().getClass().equals(DBException.class)) {
                    sendMails();
                }
            } else  {
                sendMails();
            }
            throw new DBException(e.getMessage(), e);
        }
        return retVal;
    }

    private void sendMails() {
        System.out.println("Exception, mails sent to ");
        mails.forEach(System.out::println);
    }
    //todo write an aspect which handle DBException, without breaking original exception handling if exists
    // send a mail with exception message to all addressees located in mails.properties
    //


}

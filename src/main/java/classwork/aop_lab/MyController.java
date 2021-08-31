package classwork.aop_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyController {

    @Autowired
    MyService myService;

    public void askService() throws DBException {
        System.out.println("Controller in");
        myService.sendDataToDao();
        System.out.println("Controller out");
    }
}

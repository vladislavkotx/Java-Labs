package classwork.aop_lab;


import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MyService {

    @Autowired
    MyDao myDao;

    public void sendDataToDao() throws DBException {
        System.out.println("Service in");
        myDao.updateData();
        System.out.println("Service out");
    }
}

package classwork.aop_lab;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class MyDao {
    public void updateData() throws DBException {
        System.out.println("Dao in");
        if (true) {
            throw new DBException();
        }
        System.out.println("Dao out");
    }
}

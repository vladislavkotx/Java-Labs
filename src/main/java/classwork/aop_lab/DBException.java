package classwork.aop_lab;

import lombok.Data;
import lombok.Setter;

@Data
public class DBException extends Exception{
    public DBException() {
    }

    public DBException(String message) {
        super(message);
    }

    public DBException(String message, Throwable cause) {
        super(message, cause);
    }
}

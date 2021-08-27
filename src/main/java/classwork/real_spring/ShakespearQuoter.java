package classwork.real_spring;

import classwork.design_patterns.reflections.annotations.InjectRandomInt;
import lombok.Setter;

public class ShakespearQuoter implements Quoter {
    @Setter
    private String message;

    @InjectRandomInt(min = 3, max = 5)
    private int repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
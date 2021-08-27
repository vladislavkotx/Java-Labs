package classwork.real_spring;

import lombok.Setter;

import java.util.List;

public class TerminatorQuoter implements Quoter {

    @Setter
    private List<String> messages;

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    public void terminate(){
        System.out.println("you are terminated...");
    }

}
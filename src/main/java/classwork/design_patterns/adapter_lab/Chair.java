package classwork.design_patterns.adapter_lab;

public class Chair implements Costable {
    @Override
    public int cost() {
        return 5;
    }
}
package classwork.design_patterns.adapter_lab;

public class Table implements Costable {
    @Override
    public int cost() {
        return 10;
    }
}
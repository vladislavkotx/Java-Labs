package classwork.design_patterns.adapter_lab;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Adapter implements Pricable{

    private final Costable costable;

    @Override
    public int getPrice() {
        return costable.cost();
    }
}

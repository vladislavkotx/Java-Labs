package classwork.design_patterns.adapter_lab;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class ProductRepo {

    private List<Supplier<? extends Costable>> products = List.of(Chair::new,Table::new);

    public Costable getProduct() {
        return products.get(new Random().nextInt(products.size())).get();
    }
}

package classwork.design_patterns.adapter_lab;

public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        ProductHandler productHandler = new ProductHandler();

        Costable product = productRepo.getProduct();
        Adapter adapter = new Adapter(product);
        productHandler.handle(adapter);
    }
}
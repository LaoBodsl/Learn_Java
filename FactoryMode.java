interface IProduct{
    public void ProductMethod();
}
interface IFactroy{
    public IProduct createProduct();
}
class Factroy implements IFactroy{
    public IProduct createProduct(){
        return new Product();
    }
}
class Product implements IProduct{
    public void ProductMethod(){
        System.out.println("success.....");
    }
}
public class FactoryMode{
    public static void main(String[] args) {
        IFactroy factory = new Factroy();
        IProduct product = factory.createProduct();
        product.ProductMethod();
    }
}
public class ProductManager {

    private BaseProductDao baseProductDao;

    public ProductManager(BaseProductDao baseProductDao) {
        this.baseProductDao = baseProductDao;
    }

    public void add(Product product){

        baseProductDao.add(product);
        System.out.println("Ürün iþ katmaný iþlemleri");
        System.out.println("Ürün ismi: " + product.getName());
    }
}

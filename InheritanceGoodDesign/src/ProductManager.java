public class ProductManager {

    private BaseProductDao baseProductDao;

    public ProductManager(BaseProductDao baseProductDao) {
        this.baseProductDao = baseProductDao;
    }

    public void add(Product product){

        baseProductDao.add(product);
        System.out.println("�r�n i� katman� i�lemleri");
        System.out.println("�r�n ismi: " + product.getName());
    }
}

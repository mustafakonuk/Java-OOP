public class Main {
    public static void main(String[] args){

        //Tek bir de�i�iklik ile sistemimizi Oracledan MySQL'e ge�i� yapt�rd�k.
        ProductManager productManager = new ProductManager(new MySqlProductDao("MySQL String"));
        productManager.add(new Product(2,"Su", 100));

        /*BaseProductDao baseProductDao = new OracleProductDao("Oracle String");
        baseProductDao.add(new Product(1,"Su",2));*/
    }
}

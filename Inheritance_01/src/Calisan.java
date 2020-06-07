//SuperClass veya Base Class denir.
public class Calisan {

    private String isim;
    private int maas;
    private String departman;

    public Calisan(String isim, int maas, String departman) {
        this.setIsim(isim);
        this.setMaas(maas);
        this.setDepartman(departman);
    }
    public void calis(){
        System.out.println("Çalýþan çalýþýyor.");
    }
    public void bilgileriGoster(){
        System.out.println("Ýsim: " + getIsim());
        System.out.println("Maas: " + getMaas());
        System.out.println("Departman: " + getDepartman());
    }

    public void departmanDegistir(String yeniDepartman){
        System.out.println("Departman deðiþtiriliyor...");
        this.setDepartman(yeniDepartman);
        System.out.println("Yeni departman: " + this.getDepartman());
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
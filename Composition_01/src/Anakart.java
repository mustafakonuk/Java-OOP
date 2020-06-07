public class Anakart {
    private String model;
    private String uretici;
    private String isletim_sistemi;
    private int yuva_sayisi;

    public Anakart(String model, String uretici, String isletim_sistemi, int yuva_sayisi) {
        this.setModel(model);
        this.setUretici(uretici);
        this.setIsletim_sistemi(isletim_sistemi);
        this.setYuva_sayisi(yuva_sayisi);
    }

    public void isletim_sistemi_yukle(String isletim_sistemi){
        this.isletim_sistemi = isletim_sistemi;
        System.out.println("Ýþletim sistemi yüklendi: " + isletim_sistemi);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }

    public int getYuva_sayisi() {
        return yuva_sayisi;
    }

    public void setYuva_sayisi(int yuva_sayisi) {
        this.yuva_sayisi = yuva_sayisi;
    }
}
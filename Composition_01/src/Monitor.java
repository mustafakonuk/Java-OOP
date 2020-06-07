public class Monitor {

    private String model;
    private String uretici;
    private String boyut;
    private Resolution resolution; //Monit�r s�n�f�n�n i�erisine Resolution s�n�f�ndan bir nesne olu�turduk.

    public Monitor(String model, String uretici, String boyut, Resolution resolution) {
        this.setModel(model);
        this.setUretici(uretici);
        this.setBoyut(boyut);
        this.setResolution(resolution);
    }

    public void monitoru_kapat(){
        System.out.println("Monit�r kapat�l�yor...");
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

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}

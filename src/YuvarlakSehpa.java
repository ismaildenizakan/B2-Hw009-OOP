public class YuvarlakSehpa extends Mobilya implements Daire{
    private  double yaricap;


    public YuvarlakSehpa() {
    }

    public YuvarlakSehpa(String aciklama, double yukseklik, boolean kapaliMi, double yaricap) {
        super(aciklama, yukseklik, kapaliMi);
        this.yaricap = yaricap;
    }

    @Override
    public void setYaricap(double yaricap) {
        this.yaricap=yaricap;
    }

    @Override
    public double getYaricap() {
        return yaricap;
    }

    @Override
    public double alanHesapla() {
        return isKapaliMi()?2*Math.PI*Math.pow(yaricap,2)+2*Math.PI*yaricap*getYukseklik():
                Math.PI * Math.pow(yaricap, 2);
    }
    @Override
    public double hacimHesapla() {
        return Math.PI*Math.pow(yaricap,2)*getYukseklik();

    }

    @Override
    public String toString() {
        return String.format("%s [%5.2f x %5.2f]",super.toString(),yaricap,getYukseklik());
    }
}

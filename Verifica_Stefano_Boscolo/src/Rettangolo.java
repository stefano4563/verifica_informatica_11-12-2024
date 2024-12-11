public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double calcolaArea() {
        return base * altezza;
    }

    public double calcolaPerimetro(){
        double perimetro = (base + altezza)*2;
        return perimetro;
    }

    public int compareTo(Quadrato altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    public String getInformazioni() {
        return toString();
    }

    @Override
    public String toString() {
        System.out.println("RETTANGOLO= valore base: "+getBase()+" valore altezza:"+getAltezza()+" valore area: "+calcolaArea()+" valore perimetro: "+calcolaPerimetro());
        return "";
    }



}
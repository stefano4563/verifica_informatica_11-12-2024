public class Poligono {
    int numeroLati;
    double lunghezza;

    public int getNumeroLati() {
        return numeroLati;
    }

    public void setNumeroLati(int numeroLati) {
        this.numeroLati = numeroLati;
    }

    public double getLunghezza(double lunghezzaLato) {
        return lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public double perimetro(){
        double perimetro = numeroLati * lunghezza;
        return perimetro;
    }

    @Override
    public String toString() {
        System.out.println("valore del perimetro: "+perimetro());
        return "";
    }
}

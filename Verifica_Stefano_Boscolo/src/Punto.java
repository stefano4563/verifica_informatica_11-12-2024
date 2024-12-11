public class Punto {
    //dichiaro gli attributi
    double x;
    double y;

    double X;
    double Y;
    //creo i metodoi get e set per la x e la y del primo punto
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //creo i metodi get e set per la x e la y del secondo punto
    public double getX2(){
        return X;
    }

    public void setX2(double X){
        this.X = X;
    }

    public double getY2() {
        return Y;
    }

    public void setY2(double Y){
        this.Y = Y;
    }
    //la distanza tra 2 punti è data dalla sottrazione al quadrato delle x e delle y dei 2 punti, tutto in radice quadrata
    public double distanza(Punto altro){
        //valore delle x
        double valore1 = (altro.getX() - altro.getX2()) * (altro.getX() - altro.getX2());
        //valore delle y
        double valore2 = (altro.getY() - altro.getY2()) * (altro.getY() - altro.getY2());
        //valore della distanza
        return Math.sqrt(valore1 + valore2);
    }


}

import java.util.Scanner;

public class Main_dei_punti {
    public static void main (String [] args){
        Scanner tastiera = new Scanner(System.in);
        Punto punto1 = new Punto();
        Punto punto2 = new Punto();
        Punto valoreDistanza = new Punto();
        double valoreX, valoreY, valoreX2, valoreY2;

        //inserisco le coordinate del primo punto
        System.out.println("inserisci la coordinata x del punto");
        valoreX = tastiera.nextInt();
        punto1.setX(valoreX);

        System.out.println("inserisci la coordinata y del punto");
        valoreY = tastiera.nextInt();
        punto1.setY(valoreY);

        //inserisco le coordinate del secondo punto
        System.out.println("inserisci la coordinata x del secondo punto");
        valoreX2 = tastiera.nextInt();
        punto2.setX2(valoreX2);

        System.out.println("inserisci la coordinata y del secondo punto");
        valoreY2 = tastiera.nextInt();
        punto2.setY2(valoreY2);

        //stampo il valore della distanza
        System.out.println("la distanza tra i 2 punti vale: "+valoreDistanza.distanza(punto1));


    }
}

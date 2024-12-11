import java.util.Scanner;

public class Main_del_poligono {
    public static void main(String [] args){
        Scanner tastiera = new Scanner(System.in);
        Poligono poligono = new Poligono();
        int nLati;
        double lunghezzaLato;

        //inserisco il numero di lati del poligono
        System.out.println("scrivi il numero di lati");
        nLati = tastiera.nextInt();
        poligono.setNumeroLati(nLati);

        System.out.println("scrivi lunghezza dei lati");
        lunghezzaLato = tastiera.nextInt();
        poligono.setLunghezza(lunghezzaLato);

        System.out.println(poligono.toString());

    }
}

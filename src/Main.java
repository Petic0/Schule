public class Main {
    public static void main(String[] args) {
        double start = 6, roomtemp = 25;

        for (int i=1;i<100;i++){
            start += (roomtemp-start)*0.12;
            System.out.println("Nach "+ i + " Minuten liegt die Temperatur bei: "+ start +"°C" );
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        Scanner sc = new Scanner(System.in);
        System.out.println("Televisão está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo estado da televisão: " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("Volume: " + smartTv.volume);

        System.out.println("Para qual canal deseja mudar? ");
        int canal = sc.nextInt();

        smartTv.mudarCanal(canal);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Próximo canal: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal antecessor " + smartTv.canal);
        
        sc.close();
    }
}

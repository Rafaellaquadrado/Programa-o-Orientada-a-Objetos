import java.util.Scanner;

public class ConversaoSegundos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite a quantidade de segundos: ");
        long segundosTotais = scanner.nextLong();

        scanner.close();


        long segundosPorDia = 86400; // 24 * 60 * 60
        long segundosPorHora = 3600; // 60 * 60
        long segundosPorMinuto = 60;

        long dias = segundosTotais / segundosPorDia;
        long horas = (segundosTotais % segundosPorDia) / segundosPorHora;
        long minutos = (segundosTotais % segundosPorHora) / segundosPorMinuto;
        long segundos = segundosTotais % segundosPorMinuto;

        System.out.printf("%d segundos correspondem a %d dias, %d horas, %d minutos e %d segundos.%n", 
                          segundosTotais, dias, horas, minutos, segundos);
    }
}

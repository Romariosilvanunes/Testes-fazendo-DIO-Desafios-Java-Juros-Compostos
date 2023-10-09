import java.text.DecimalFormat;
import java.util.Scanner;

public class bancoAppum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
       
        double valorInicial = scanner.nextDouble();
       scanner. nextLine();

        String numeroComVirgula = scanner.nextLine();
        numeroComVirgula = numeroComVirgula.replace(',', '.');
        double taxaJuros = Double.parseDouble(numeroComVirgula) ; 

        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;
        
        for (int i = 0; i < periodo; i++) {
                        valorFinal *= 1 + taxaJuros;
        }
       
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}

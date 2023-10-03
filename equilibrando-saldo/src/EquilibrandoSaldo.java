import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        saldoAtual =  calcularSaldo(saldoAtual, valorDeposito, valorRetirada);

        System.out.println("Saldo atualizado na conta: "+saldoAtual);

		// não incluido na entrega
        String saldoFinal= String.format("%.2f", saldoAtual);
        System.out.println("Saldo atualizado na conta: "+saldoFinal);
        //

		scanner.close();
    }
    static double calcularSaldo(double saldoAtual, double valorDeposito, double valorRetirada){
      saldoAtual = saldoAtual + valorDeposito - valorRetirada;
      return saldoAtual;
    }
}

/*
    Aluno: Luiz Fernando Vidal Gusmão
 
    Matricula: 201902224558
 */
import java.util.Scanner;

public class ContaBancariaTest
{
	public static void main(String[] args)
	{
		/// cria um objeto ContaBancaria e o atribui a myContaBancaria
		 ContaBancaria myContaBancaria1 = new ContaBancaria("Conta de Campanha", 50.00);
		 ContaBancaria myContaBancaria2 = new ContaBancaria("Conta de Caixa 2", -7.53);

		 // exibe o saldo inicial da conta
		 mostraConta(myContaBancaria1);
         mostraConta(myContaBancaria2);

		 Scanner input = new Scanner(System.in);

		 System.out.print("Entre o valor a depositar pra conta1: ");
		 double valorDeposito = input.nextDouble();
		 System.out.printf("%n Adicionando o valor R$ %.2f no saldo da conta1 %n%n", valorDeposito);
		 myContaBancaria1.deposito(valorDeposito);

		 //exibe o sando após o primeiro depósito
         mostraConta(myContaBancaria1);
         mostraConta(myContaBancaria2);

		 System.out.print("Entre o valor a depositar pra conta2: ");
		 valorDeposito = input.nextDouble();
		 System.out.printf("%n Adicionando o valor R$ %.2f no saldo da conta2 %n%n", valorDeposito);
		 myContaBancaria2.deposito(valorDeposito);

		 //exibe o saldo inicial da conta
		 mostraConta(myContaBancaria1);
         mostraConta(myContaBancaria2);
		

        input.close();
	 }

	 public static void mostraConta(ContaBancaria conta)
	{
        System.out.printf("Saldo da conta %s : R$ %.2f %n", conta.getName(), conta.getSaldo());
	}


 } // fim da classe ContaBancariaTest

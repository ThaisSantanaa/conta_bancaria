package conta_bancaria;
import java.util.Scanner;
import conta_bancaria.controller.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {
	    
	   private static final Scanner leia = new Scanner(System.in);
	   private static final ContaController contaController = new ContaController();
	   
       public static void main(String[] args) {
				
		criarContasTeste();
		
		int opcao;

		while (true) {
				
				
    System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_PURPLE_BACKGROUND);
				
	System.out.println("|*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*>|");
    System.out.println("|                        DEV MONEY                          |");
    System.out.println("|                   BEM-VINDO AO SEU BANCO!                 |");
	System.out.println("|               seu futuro financeiro começa AQUI           |");
    System.out.println("|*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*>|");
	System.out.println("|  1  |  CRIAR CONTA                                        |");
    System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  2  |  LISTAR TODAS AS CONTAS                             |");
	System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  3  |  BUSCAR CONTA POR NÚMERO                            |");
	System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  4  |  ATUALIZAR DADOS                                    |");
    System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  5  |  APAGAR CONTA                                       |");
	System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  6  |  SACAR                                              |");
	System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  7  |  DEPOSITAR                                          |");
	System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  8  |  TRANSFERIR                                         |");
	System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  0  |  SAIR                                               |");
	System.out.println("|===========================================================|");
	System.out.println("|        DIGITE UMA OPÇÃO E PRESSIONE ENTER:                |");
	System.out.println(" ===========================================================|");
				
				
	opcao = leia.nextInt();
				
				
	if (opcao == 0) {
		System.out.println("\nDEV MONEY - Seu futuro financeiro começa AQUI !");
		sobre();
         leia.close();
		System.exit(0);
	}
	switch (opcao) {
	case 1:
		System.out.println("Criar Conta\n\n");

		break;
	case 2:
		System.out.println("Listar todas as Contas\n\n");
		 listarContas();
		 
		break;	
	case 3:
		System.out.println("Buscar conta por número\n\n");

		break;
	case 4:
		System.out.println("Atualizar dados da Conta\n\n");

		break;
	case 5:
		System.out.println("Apagar a Conta\n\n");

		break;
	case 6:
		System.out.println("Sacar\n\n");

		break;
	case 7:
		System.out.println("Depositar\n\n");

		break;
	case 8:
		System.out.println("Transferência entre Contas\n\n");

		break;
	default:
		System.out.println("\nOpção Inválida!\n");
		break;
    }
  }
}
       
       public static void sobre() {
   		System.out.println("\n*********************************************************");
   		System.out.println("Projeto Desenvolvido por: Thais de lima santana ");
   		System.out.println("Generation Brasil - thaislimasantana9@gmail.com");
   		System.out.println("github.com/conteudoGeneration");
   		System.out.println("**********************************************************");
  
       }
       
		public static void criarContasTeste() {
			contaController.cadastrar(new ContaCorrente(contaController.gerarNumero(), 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
            contaController.cadastrar(new ContaPoupanca(contaController.gerarNumero(), 456, 2, "Marcia Condarco", 1000000.00f, 10));
            
		}
	 
		public static void listarContas() {
			contaController.ListarTodas();

			}
		}
			

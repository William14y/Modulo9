import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.Scanner;
import java.util.OptionalDouble;
public class MainMod9 {


	public static void main(String[] args) {

	 
	 Cliente cli1 = new Cliente("Cláudio", "senhaA", "Banco Alfa", 5);
	 Cliente cli2 = new Cliente("Leandro", "senhaB", "Banco Beta", 10);
	 Cliente cli3 = new Cliente("Jorge", "senhaC", "BancoMentorama", 15);
	 Cliente cli4 = new Cliente("Beto", "senhaD", "Banco Alfa", 20);
	 Cliente cli5 = new Cliente("Roberto", "senhaE", "Banco Java", 25);
	 Cliente cli6 = new Cliente("Fernanda", "senhaF", "Banco Beta", 30);
	 Cliente cli7 = new Cliente("Rafael", "senhaG", "Banco Mentorama", 35);
	 Cliente cli8 = new Cliente("Henrique", "senhaH", "Banco Java", 40);
	 Cliente cli9 = new Cliente("Fillipe", "senhaI", "Banco Java", 45);
	 Cliente cli10 = new Cliente("André", "senhaJ", "Banco Alfa", 50);
	 
	 List<Cliente> clientes = Arrays.asList(cli1, cli2, cli3, cli4, cli5);
	 List<Cliente> clientes1 = Arrays.asList(cli6, cli7, cli8, cli9, cli10);
	 List<Cliente> clientes2 = Arrays.asList(cli1, cli2, cli3, cli4, cli5, cli6, cli7, cli8, cli9, cli10 );
	 //RunClient run = new RunClient();
	 //clientes.forEach(cli -> System.out.println(cli.getCompras()));
	 //cli1.autenticator("senhaA");
	 //cli2.autenticator("senhaC");
	 
	 System.out.println(" |  Selecione o que se deseja  |" + "\n"
	 		+ "[1] Ver clientes com menos compras" + "\n" 
	 		+ "[2] Ver clientes com mais compras" + "\n"
	 		+ "[3] Ver média de compras (todos os clientes)");
	 
	 Scanner valorDecisao = new Scanner(System.in);
	 Integer VD = valorDecisao.nextInt();
	 
	 switch(VD) {
	 
	 case 1: System.out.println("Os Clientes com MENOS compras foram:"
	 		+ "\n");
	 clientes.forEach(cli -> System.out.println(cli.getNome()));
	 
	 System.out.println("\n"
	 		+ "Eles fizeram a seguinte quantidade de compras:"
	 		+ "\n");
	 
	 Stream<Cliente> stream = clientes.stream().filter(cliente -> cliente.getCompras() < 30 );
	 
	 List<Cliente> selecionados = stream.collect(Collectors.toList());
	 selecionados.forEach(c -> System.out.println(c.getCompras()));
	 break;
	 
	 case 2: 
		 
		 System.out.println("\n"
		 		+ "Os Clientes com MAIS compras foram:"
		 		+ "\n");
		 
		 clientes1.forEach(cli -> System.out.println(cli.getNome()));
		 
		 System.out.println("\n"
		 		+ "Eles fizeram a seguinte quantidade de compras:"
		 		+ "\n");
		 
		 Stream<Cliente> stream1 = clientes1.stream().filter(cliente -> cliente.getCompras() >= 30);
		 
		 List<Cliente> selecionados1 = stream1.collect(Collectors.toList());
		 selecionados1.forEach(c1 -> System.out.println(c1.getCompras()));
		 break;
		 
	 case 3:
		 
		 System.out.println("A média de compras de todos os clientes foi:"
		 		+ "\n");
		 
		 OptionalDouble media = clientes2.stream().mapToInt(Cliente::getCompras).average();
		 
		 System.out.println(media);
	 }
	 
	 
	 
	 
	 
	 
	}

}
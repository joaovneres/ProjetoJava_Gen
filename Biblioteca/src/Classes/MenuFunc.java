package Classes;

import java.util.Scanner;

public class MenuFunc {
	public static void main(String args[]) {
		
		int x=0;
		int numero;
		String nome;

		Scanner leia = new Scanner(System.in);
		System.out.println("\n****Menu do Funcion�rio****");
		System.out.println("\nEscolha uma op��o de cadastramento entre 1 � 4.\n"
				+ "1-Cadastro do Alune.\n"
				+ "2-Cadastro do Doador.\n"
				+ "3-Cadastro do Funcion�rio.\n"
				+ "4-Cadastro do Livro.\n");
		x = leia.nextInt();
		

		if(x==1)
		{
			System.out.println("\nCadastrar Alune");
			switch (x)
			{
			case 1:
				System.out.println("\nNome do Alune: \n");
				nome= leia.next();
				break;
			case 2: 
				System.out.println("\nIdade do Alune: ");
	            numero= leia.nextInt();
				break;
			case 3:
				System.out.println("\nCPF do Alune: ");
				break;
			case 4:
				System.out.println("\nTelefone do Alune: ");
				break;
			}
		}
		else if (x==2)
		{
			System.out.println("\nCadastrar Doador");
			switch (x)
			{
			case 1:
				System.out.println("\nNome do Doador:");
				break;
			case 2:
				System.out.println("\nIdade do Doador: ");
				break;
			case 3:
				System.out.println("\nCPF do Doador: ");
				break;
			case 4:
				System.out.println("\nTelefone do Doador: ");
				break;			
			}
		}
		else if (x==3) 
		{
			System.out.println("\nCadastrar Funcion�rio");
			switch (x)
			{
			case 1:
				System.out.println("\nNome do Funcion�rio:");
				break;
			case 2:
				System.out.println("\nIdade do Funcion�rio: ");
				break;
			case 3:
				System.out.println("\nCPF do Funcion�rio: ");
				break;
			case 4:
				System.out.println("\nTelefone do Funcion�rio: ");
				break;
			}
		}
		else if(x==4)
		{
			System.out.println("\nCadastrar Livro");
			switch(x)
			{
			case 1:
				System.out.println("\nNome do Livro:");
				break;
			case 2:
				System.out.println("\nAno de publica��o: ");
				break;
			case 3:
				System.out.println("\nEditora: ");
				break;
			case 4:
				System.out.println("\nAutor: ");
				break;
			}
		}
		else 
		{
			System.out.println("\nErro no programa!!!");
		}
	}

	
	
}
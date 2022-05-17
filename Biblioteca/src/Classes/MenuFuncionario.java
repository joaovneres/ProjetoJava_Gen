package Classes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MenuFuncionario {
	public static void main(String args[]) {
		List<Aluno> listaA = new ArrayList<Aluno>();
		List<Doador> listaD = new ArrayList<Doador>();
		List<Funcionario> listaF = new ArrayList<Funcionario>();
		List<Livro> listaL = new ArrayList<Livro>();
		Decidir oDecisao = new Decidir();
		int y;
		while (true) {
			System.out.println("\n************Menu do Funcionário************");
			System.out.println(
					"\n(1)Cadastrar.\n(2)Listar.\n(3)Consultar.\n(4)Alterar.\n(5)Excluir\n(0)Para sair do sistema.\nEscolha uma opção: ");
			try {
				Scanner scan = new Scanner(System.in);
				y = scan.nextInt();
			} catch (InputMismatchException ex) {
				System.err.println("Caractere não válido, digite um número.");
				continue;
			}
			if (y == 0) {
				System.out.println("Programa finalizado!");
				break;
			} else {
				switch (y) {
				case 1:
					oDecisao.dCadastrar(listaA, listaD, listaF, listaL);
					break;
				case 2:
					oDecisao.dLista(listaA, listaD, listaF, listaL);
					break;
				case 3:
					oDecisao.dConsultar(listaA, listaD, listaF, listaL);
					break;
				case 4:
					oDecisao.dAlterar(listaA, listaD, listaF, listaL);
					break;
				case 5:
					oDecisao.dExcluir(listaA, listaD, listaF, listaL);
					break;
				default:
					if (y != 0)
						System.out.println("Opção inválida!");
				}
			}
		}
	}
}
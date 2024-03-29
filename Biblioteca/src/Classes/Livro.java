package Classes;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Livro {
	private int idLivro;
	private String nome;
	private int anoPublicacao;
	private String editora;
	private String autor;
	private String doador;
	private String alunoResponsavel;

	public Livro(int idLivro, String nome, int anoPublicacao, String editora, String autor, String doador,
			String alunoResponsavel) {
		this.idLivro = idLivro;
		this.nome = nome;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.autor = autor;
		this.doador = doador;
		this.alunoResponsavel = alunoResponsavel;
	}

	public Livro() {
		this.idLivro = 0;
		this.nome = null;
		this.anoPublicacao = 0;
		this.editora = null;
		this.autor = null;
		this.doador = null;
		this.alunoResponsavel = null;
	}

	public void cadastrar(List<Livro> listaL) {
		while (true) {
			try {
				Livro objeto = new Livro();
				Scanner scan = new Scanner(System.in);
				System.out.println("\nDigite o id do livro: ");
				objeto.setIdLivro(scan.nextInt());
				System.out.println("\nNome do livro: ");
				objeto.setNome(scan.next());
				System.out.println("\nAno publica��o do livro: ");
				objeto.setAnoPublicacao(scan.nextInt());
				System.out.println("\nEditora: ");
				objeto.setEditora(scan.nextLine());
				System.out.println("\nAutore: ");
				objeto.setAutor(scan.nextLine());
				System.out.println("\nDoadore: ");
				objeto.setDoador(scan.nextLine());
				System.out.println("\nAlune respons�vel: ");
				objeto.setAlunoResponsavel(scan.nextLine());
				listaL.add(objeto);
				System.out.println("Cadastrado com sucesso");
				break;
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
		}
	}

	public void consultar(List<Livro> listaL) {
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				int index;
				System.out.println("\nQual posi��o voc� deseja consultar?");
				index = scan.nextInt();
				System.out.println("-----------------------------------------");
				System.out.println("\nId do livro: " + listaL.get(index).getIdLivro() + "\nNome do livro: "
						+ listaL.get(index).getNome() + "\nAno publica��o: " + listaL.get(index).getAnoPublicacao()
						+ "\nEditora: " + listaL.get(index).getEditora() + "\nAutore: " + listaL.get(index).getAutor()
						+ "\nDoadore: " + listaL.get(index).getDoador() + "\nAlune respons�vel: "
						+ listaL.get(index).getAlunoResponsavel());
				System.out.println("-----------------------------------------");
				break;
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
		}
	}

	public void listar(List<Livro> listaL) {
		int contador = 0;
		for (Livro in : listaL) {
			System.out.println("-----------------------------------------");
			System.out.println("Posi��o: " + contador);
			System.out.println("Id: " + in.getIdLivro());
			System.out.println("Nome: " + in.getNome());
			System.out.println("Autor: " + in.getAutor());
			System.out.println("Editora: " + in.getEditora());
			System.out.println("-----------------------------------------");
			contador++;
		}
	}

	public void excluir(List<Livro> listaL) {
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				int index, i;
				System.out.println("\nQual posi��o voc� deseja remover?");
				index = scan.nextInt();
				System.out.println("-----------------------------------------");
				System.out.println("\nId do livro: " + listaL.get(index).getIdLivro() + "\nNome do livro: "
						+ listaL.get(index).getNome() + "\nAno publica��o: " + listaL.get(index).getAnoPublicacao()
						+ "\nEditora: " + listaL.get(index).getEditora() + "\nAutore: " + listaL.get(index).getAutor()
						+ "\nDoadore: " + listaL.get(index).getDoador() + "\nAlune respons�vel: "
						+ listaL.get(index).getAlunoResponsavel());
				System.out.println("-----------------------------------------");
				System.out.println("\nDeseja remover este mesmo?");
				System.out.println("\n(1)Sim");
				System.out.println("\n(2)N�o");
				i = scan.nextInt();
				if (i == 1) {
					listaL.remove(index);
					System.out.println("Exclu�do com sucesso");
					break;
				} else if (i != 1 && i != 2) {
					System.out.println("\nOp��o inv�lida.");
				}
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
		}

	}

	public void alterar(List<Livro> listaL) {
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				int index, i;
				System.out.println("\nQual posi��o voc� deseja alterar?");
				index = scan.nextInt();
				System.out.println("\nQual posi��o voc� deseja alterar?");
				index = scan.nextInt();
				System.out.println("-----------------------------------------");
				System.out.println("\nId do livro: " + listaL.get(index).getIdLivro() + "\nNome do livro: "
						+ listaL.get(index).getNome() + "\nAno publica��o: " + listaL.get(index).getAnoPublicacao()
						+ "\nEditora: " + listaL.get(index).getEditora() + "\nAutore: " + listaL.get(index).getAutor()
						+ "\nDoadore: " + listaL.get(index).getDoador() + "\nAlune respons�vel: "
						+ listaL.get(index).getAlunoResponsavel());
				System.out.println("-----------------------------------------");
				System.out.println("\nDeseja alterar este mesmo?");
				System.out.println("\n(1)Sim");
				System.out.println("\n(2)N�o");
				i = scan.nextInt();
				if (i == 1) {
					Livro objeto = new Livro();
					System.out.println("\nDigite o id do livro: ");
					objeto.setIdLivro(scan.nextInt());
					System.out.println("\nNome do livro: ");
					objeto.setNome(scan.next());
					System.out.println("\nAno publica��o do livro: ");
					objeto.setAnoPublicacao(scan.nextInt());
					System.out.println("\nEditora: ");
					objeto.setEditora(scan.nextLine());
					System.out.println("\nAutore: ");
					objeto.setAutor(scan.nextLine());
					System.out.println("\nDoadore: ");
					objeto.setDoador(scan.nextLine());
					System.out.println("\nAlune respons�vel: ");
					objeto.setAlunoResponsavel(scan.nextLine());
					System.out.println("Cadastrado com sucesso");
					listaL.add(objeto);
					listaL.remove(index);
					listaL.add(objeto);
					System.out.println("Alterado com sucesso");
					break;
				} else if (i != 1 && i != 2) {
					System.out.println("\nOp��o inv�lida.");
				}
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
		}

	}

	public int getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDoador() {
		return doador;
	}

	public void setDoador(String doador) {
		this.doador = doador;
	}

	public String getAlunoResponsavel() {
		return alunoResponsavel;
	}

	public void setAlunoResponsavel(String alunoResponsavel) {
		this.alunoResponsavel = alunoResponsavel;
	}

}

package Classes;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		Aluno oAluno = new Aluno();
		List<Object> listaA = new ArrayList<>();
		oAluno.cadastrar(oAluno, listaA);
		oAluno.listar(listaA);
	}
}

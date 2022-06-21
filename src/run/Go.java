package run;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import infobook.Book;
import infobook.Work;

public class Go {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// List<Aluno> alunos = new ArrayList<Aluno>();

		Work work = new Work();

		List<Book> books = new ArrayList<Book>();

		boolean continuar = true;

		while (continuar == true) {
			/*
			 * String nome =
			 * JOptionPane.showInputDialog("Insira o nome do aluno: "+qtd+" º");
			 */

			Book nova = new Book();

			String title = JOptionPane.showInputDialog("Insira o nome do livro");
			nova.setTitle(title);

			/*
			 * String autor = JOptionPane.showInputDialog("Insira o nome do autor");
			 * nova.setAuthor(autor);
			 */

			/*
			 * String editora = JOptionPane.showInputDialog("Insira a editora do livo");
			 * nova.setPublishHouse(editora);
			 * 
			 * 
			 * String anoS = JOptionPane.showInputDialog("Insira o ano do livro"); int ano =
			 * Integer.parseInt(anoS); nova.setYear(ano);
			 * 
			 * String ediS = JOptionPane.showInputDialog("Insira o número da edição"); int
			 * edicao = Integer.parseInt(ediS); nova.setEdition(edicao);
			 * 
			 * 
			 * String unitS =
			 * JOptionPane.showInputDialog("Insira a quantidade de unidades deste livro");
			 * int qtd = Integer.parseInt(unitS); nova.setAmount(qtd);
			 */

			books.add(nova);

			int wish = JOptionPane.showConfirmDialog(null, "Deseja adicionar outro livro?");

			if (wish == 0) {
				continuar = true;
			} else {
				continuar = false;

			}

		}

		String nomePesq = JOptionPane.showInputDialog("Insira o nome do livro a ser pesquisado: ");

		List<Book> result = new ArrayList<Book>();
		result = work.searching(nomePesq, books);

		if (result.size() != 0) {
			System.out.printf("Livros encontrados:");
			for (Book book : result) {
				System.out.println(book.getTitle());
				System.out.println("/n");
				
			}
		} else {
			System.out.println("Este livro não existe na biblioteca\n");
		}

		String nomeApag = JOptionPane.showInputDialog("Insira o nome do livro que deseja excluir");
		Boolean response = work.deleting(nomeApag, books);

		if (response == true) {
			System.out.println("Livro excluido com sucesso\n");
		} else {
			System.out.println("Livro não encontrado na lista\n");
		}

	}
}

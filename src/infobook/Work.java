package infobook;

import java.util.ArrayList;
import java.util.List;

public class Work {

	public List<Book> searching(String lost, List<Book> lista) {

		List<Book> safe = new ArrayList<Book>();

		for (Book book : lista) {
			if (book.getTitle().contains(lost) == true) {
				safe.add(book);
			}
		}
		return safe;
	}

	public Boolean deleting(String lost, List<Book>lista) {
		Boolean resposta = null;
		List<Book> trico = new ArrayList<Book>();
		trico = this.searching(lost, lista);
		for (Book book2 : trico) {
			if (book2.getTitle().equalsIgnoreCase(lost) == true){
				trico.remove(book2);
				resposta = true;
				break;
			}else {
			resposta = false;
			}
	}
		return resposta;
}
}
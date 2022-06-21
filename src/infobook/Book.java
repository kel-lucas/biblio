package infobook;

import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private int year;
	private String publishHouse;
	private int edition;
	private int amount;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getPublishHouse() {
		return publishHouse;
	}
	public void setPublishHouse(String publishHouse) {
		this.publishHouse = publishHouse;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(author, edition, publishHouse, title, year);
	}
	@Override
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && edition == other.edition
				&& Objects.equals(publishHouse, other.publishHouse) && Objects.equals(title, other.title)
				&& year == other.year;
	}
	
	@Override
	public String toString() {
		return "book [title=" + title + ", author=" + author + ", year=" + year + ", publishHouse=" + publishHouse
				+ ", edition=" + edition + ", amount =" +amount+ "]";
	}
	
	
	
}

package Ejemplo6;

public class Book {
		
	private String name;
	private double price;
	private int qty;
	private Author author;
	public Book(String name, double price,int qty, Author author) {
	       this.name = name;
	       this.price=price;
	       this.qty=qty;
	       this.author = author;
	   }

	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Author getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book name=" + name + ", price=" + price + ", qty=" + qty + ", Author=" + author;
	}

	
	
	 
	 
	 
}

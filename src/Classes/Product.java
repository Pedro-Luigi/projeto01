package Classes;

public class Product {
	String name;
	Double price;
	
	public Product() {
		}

	public Product(String nome, Double price) {
		this.name = nome;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	}

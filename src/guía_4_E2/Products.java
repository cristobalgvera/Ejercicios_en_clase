package guía_4_E2;

public class Products {
	private String name;
	private int price;
	private int code;

	Products() {}
	
	Products(String name, int price, int code) {
		this.name = name;
		this.price = price;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public String toString() {
		String format = "***********************************";
		String productDetail = name + "\t\t" + price + "\t\t" + code + "\n" + format;
		return productDetail;
	}
}

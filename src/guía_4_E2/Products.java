package guía_4_E2;

public class Products {
	static String name;
	static int price, code;

	Products() {}
	
	Products(String name, int price, int code) {
		Products.name = name;
		Products.price = price;
		Products.code = code;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Products.name = name;
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Products.price = price;
	}

	public static int getCode() {
		return code;
	}

	public static void setCode(int code) {
		Products.code = code;
	}
	
	public String toString() {
		String format = "***\t***\t***\t***";
		String productDetail = format + "\n" + name + " \t " + price + " \t " + code + "\n" + format;
		return productDetail;
	}
}

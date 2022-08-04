package J14_Builder;

public class ProductMain {

	public static void main(String[] args) {
		System.out.println();
		
		Product product = Product.builder()
				.productCode(20220802)
				.productCategory("텀블러")
				.build();
		
		System.out.println(product);

	}

}

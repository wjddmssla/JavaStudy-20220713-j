package J16_제네릭;

J14_lombok.Car;

public class GenericMain {

	public static void main(String[] args) {
		GenericTest<Int, String> genericTest = new GenericTest<Int, String>();
		GenericTest<String, Car> genericTest2 = new GenericTest<String, Car>();
		
		genericTest.setKey(100);
		genericTest.setValue("원");
		
		System.out.println(genericTest.getKey() + genericTest.getValue());
		
		
		

	}

}

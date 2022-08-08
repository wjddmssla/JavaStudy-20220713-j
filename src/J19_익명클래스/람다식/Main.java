package J19_익명클래스.람다식;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		
		//100.5 + 200.5 = 301
		
		Math<Integer, Integer> plusMath = new Math<Integer, Integer>() {
			
			@Override
			public double calc(Integer value1, Integer value2) {
				System.out.println("value1: " + value1);
				System.out.println("value2: " + value2);
				return value1 + value2;
			}
		};
		
		System.out.println(plusMath.calc(10, 20)); //10+20
		
		Math<Double, Double> plusMath2 = new Math<Double, Double>() {
			
			@Override
			public double calc(Double value1, Double value2) {
				return value1 +value2;
			}
		};
		
		System.out.println(plusMath2.calc(100.5, 200.5));
		
		Math<Double, Double> plusMath3 = (v1, v2) -> {
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
			return v1+ v2; 
		}; //익명클래스
		
		System.out.println(plusMath3.calc(50.5, 10.4)); 
		
		Math<Double, Double> glusMath4 = (v1, v2) -> v1+v2; //익명클래스

		System.out.println(plusMath3.calc(50.5, 10.4));

		
	

	}

}

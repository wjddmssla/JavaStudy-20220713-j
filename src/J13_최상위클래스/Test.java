package J13_최상위클래스;

public class Test extends Object { // 자바측성상 모든 클래스들은  모든 Object를 상속받는다
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	 @Override
	public int hashCode() {
		return super.hashCode();
	}
	 
	 @Override
	public String toString() {
		return super.toString();
	}
	
	 public void testMethod() {
		 System.out.println("테스트 메소드");
	 }

} 
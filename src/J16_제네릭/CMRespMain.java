package J16_제네릭;
import J14_lombok.Car;

public class CMRespMain {

	public static void main(String[] args) {
		
		// 자동차를 한대 생성해줘 (요청)
		Car car = Car.builder()
				.company("현대")
				.model("쏘나타")
				.color("white")
				.build();
		
		CMRespDto<Car> cmRespDto1 = new CMRespDto<Car>(1, "차량생성완료", car);
		System.out.println("응답결과: "+cmRespDto1);
		
		//해당 차량이 현대자동차인지 확인해줘
		CMRespDto<Boolean> cmRespDto2 = null;
		
		if(car.getModel().equals("현대")) {
			cmRespDto2 = new CMRespDto<Boolean>(1, "현대자동차 맞음", true);
		}else {
			cmRespDto2 = new CMRespDto<Boolean>(-1, "현대자동차 아님", false);
		}
		
		System.out.println("응답결과: " + cmRespDto2);

	}

}

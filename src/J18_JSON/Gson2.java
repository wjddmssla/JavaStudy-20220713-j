package J18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {
		User user = UserService.createUser();
		Gson gson = new GsonBuilder()
				//.excludeFieldsWithModifiers(null)
				.serializeNulls()
				.setPrettyPrinting()
				.create(); 
		//Json은 null을 입력하면 아예 출력되지 않는다. null을 출력하고 싶다면 serializeNulls를 써라.
		
		
		//객체를 JSON으로 변환
		String userJson = gson.toJson(user);
		
		System.out.println(userJson);
		System.out.println();
		
		
		//JSON을 객체로 변환 -> fromJson(json문자열, 변환할 객체 클래스)
		User userObj = gson.fromJson(userJson, User.class);
		
		System.out.println(userObj);
		System.out.println(userObj.getAddress());

	}

}

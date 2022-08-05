package J17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSON_Object {

	public static void main(String[] args) {
		Map<String, Object> datamap = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> resultMap1 = new HashMap<String, Object>();
		resultMap1.put("name", "bulbascan");
		resultMap1.put("url", "https://pokemon.co/ap1/v2/pokemon/1/");
		
		Map<String, Object> resultMap2 = new HashMap<String, Object>();
		resultMap2.put("name", "iyysaur");
		resultMap2.put("url", "httpsL://pokemon.co/apl/v2/pokemon/2/");
		
		list.add(resultMap1);
		list.add(resultMap2);
		
		datamap.put("count", "title");
		datamap.put("next", "https://pokept1.co/ap1/v2/pokemon/?offset=>$limit=3");
		datamap.put("previous", null);
		datamap.put("results", list);
		
		System.out.println(datamap);
		
		
	}

}

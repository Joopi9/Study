package com.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

class Test{
	
}
public class DataType extends Test{

	public static void main(String[] args) {
		List<Map<String,String>> list = new ArrayList<>();
		Map<String,String> map = new HashMap<>();
		list.add(map);
		map.put("name", "park");
		map.put("age","33");
		System.out.println(list);
		Gson g = new Gson();
		String json = g.toJson(list);
		System.out.println(json);
		List<Map<String,String>> list2 = g.fromJson(json, List.class); 
		System.out.println(list2.get(0).get("name"));
	}
}

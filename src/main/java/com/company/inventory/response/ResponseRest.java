package com.company.inventory.response;

import java.util.ArrayList;
import java.util.HashMap;

//clase que dara respuesta a cada accion del sistema
public class ResponseRest {
	
	//array de tipo Hashmap que contemplara 2 string la respuesta de metadata y un json de la  dta que estamos manipulando
	private ArrayList<HashMap<String,String>> metadata = new ArrayList<>();

	public ArrayList<HashMap<String, String>> getMetadata() {
		return metadata;
	}
	
	//el cuerpo de cada tipo de respuesta metadata
	public void setMetadata(String type, String code, String date) {

		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("type", type);
		map.put("code", code);
		map.put("date", date);
		
		metadata.add(map);
	}
	
	

}

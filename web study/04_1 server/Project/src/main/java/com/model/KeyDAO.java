package com.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonObject;

public class KeyDAO {
	private String filePath;

	public KeyDAO(String filePath) {
		this.filePath = filePath;
	}

	public String getKeyValue(String key) {
		try {
			String content = new String(Files.readAllBytes(Paths.get(this.filePath)));
		    JsonObject jsonObject = JsonParser.parseString(content).getAsJsonObject();
		    JsonArray jsonArray = jsonObject.get("keys").getAsJsonArray();
		    
		    for (JsonElement jsonElement : jsonArray) {
		    	if (jsonElement.isJsonObject()) {
		    		JsonObject indexObject = jsonElement.getAsJsonObject();
		    		if (indexObject.has(key)) {
		    			return indexObject.get(key).getAsString();
		    		}
		    	}
		    }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
}
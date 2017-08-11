package com.realdolmen.ood020.proxy;

import java.util.HashMap;

public class MapProxy implements AbstractMap {

	private String fileName;
	private HashMap<String, String> hashtable = new HashMap<String, String>();

	public MapProxy(String fileName) {

	}

	public String find(String key) throws Exception {
		// TODO implement method
		return null;
	}

	public void add(String key, String value) throws Exception {

	}

	private String get(String key) {
		return (String) hashtable.get(key);
	}

	private void put(String key, String value) {
		hashtable.put(key, value);
	}
}

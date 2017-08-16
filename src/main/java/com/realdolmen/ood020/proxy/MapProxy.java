package com.realdolmen.ood020.proxy;

import java.util.HashMap;

public class MapProxy implements AbstractMap {

	private String fileName;
	private HashMap<String, String> cache = new HashMap<String, String>();  // dit is de cache
	private Map map;

	public MapProxy(String fileName) {
		this.fileName = fileName;

	}
	private Map getMap () {
		if (map == null)
			map = new Map(fileName);
		return map;
	}
	public String find(String key) throws Exception {
		// TODO implement method
		if (cache.containsKey(key))  // zoek in de cache of de key aanwezig is
			return cache.get(key);
		else {
			String value = getMap().find(key);  // als de key niet in de cache is zoek in de Map file

			cache.put(key, value);  // zet de key in de cache
			return value;
		}
	}

	public void add(String key, String value) throws Exception {
		cache.put(key, value);  // zet de key in de cache
		getMap().add(key, value);  // zet de key in de Map file
	}

	private String get(String key) {
		return (String) cache.get(key);
	}

	private void put(String key, String value) {
		cache.put(key, value);
	}
}

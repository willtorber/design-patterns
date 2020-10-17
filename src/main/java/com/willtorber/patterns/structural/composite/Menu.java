package com.willtorber.patterns.structural.composite;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class Menu implements IMenu{
	
	private ArrayList<IMenu> menus;
	
	public Menu() {
		this.menus = new ArrayList<IMenu>();
	}
	
	public boolean open() {
		log.info("Open!");
		return true;
	}
	
	public boolean close() {
		log.info("Close!");
		return true;
	}
	
	public void addMenu(IMenu menu) {
		this.menus.add(menu);
	}
	
	public IMenu getMenu(int pos) {
		return this.menus.get(pos);
	}
	
}

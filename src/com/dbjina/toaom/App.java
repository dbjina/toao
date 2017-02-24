package com.dbjina.toaom;

import java.awt.MouseInfo;
import java.awt.Point;

public class App {
	
	public static void main(String[] args) {
		int sleepTime = 10;	// seconds
		Point currntMousePosition = new Point(MouseInfo.getPointerInfo().getLocation().x, MouseInfo.getPointerInfo().getLocation().y);
		
		User32 user32 = User32.INSTANCE;
		
		MouseMover mouseMover = new MouseMover();
		mouseMover.setMousePosition(currntMousePosition);
		
		AppManager manager = new AppManager();
		manager.setUser32(user32);
		manager.setSleepTime(sleepTime);
		manager.setMouseController(mouseMover);
		
		manager.exec();
	}
}

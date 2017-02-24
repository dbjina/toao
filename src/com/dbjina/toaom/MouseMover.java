package com.dbjina.toaom;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;

public class MouseMover implements MouseController{
	private Point mousePosition;
	
	public Point getMousePosition() {
		return mousePosition;
	}

	public void setMousePosition(Point mousePosition) {
		this.mousePosition = mousePosition;
	}

	@Override
	public void moveMouse() {
		try {
			Robot robot = new Robot();
			robot.mouseMove(this.mousePosition.getLocation().x, this.mousePosition.getLocation().x);
			} catch (AWTException e) {
			e.printStackTrace();
		}
	}


}

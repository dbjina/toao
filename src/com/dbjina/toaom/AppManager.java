package com.dbjina.toaom;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.LRESULT;
import com.sun.jna.platform.win32.WinDef.WPARAM;
import com.sun.jna.platform.win32.WinUser;

public class AppManager {
	private User32 user32;
	private MouseController mouseController;
	private int sleepTime;	// second
	
	public User32 getUser32() {
		return user32;
	}

	public void setUser32(User32 user32) {
		this.user32 = user32;
	}

	public MouseController getMouseController() {
		return mouseController;
	}

	public void setMouseController(MouseController mouseController) {
		this.mouseController = mouseController;
	}

	public int getSleepTime() {
		return sleepTime;
	}

	public void setSleepTime(int sleepTime) {
		this.sleepTime = sleepTime;
	}
	
	public void exec() {
		// 화면 끄기
		user32.SendMessageA(WinUser.HWND_BROADCAST, WinUser.WM_SYSCOMMAND, User32.SC_MONITORPOWER, new LPARAM(User32.SC_MONITOR_OFF));
		// 딜레이
		try {
			Thread.sleep(this.getSleepTime() * 1000);
		} catch (InterruptedException e) {
		}
		
		// 화면 키기
		mouseController.moveMouse();
	}
	
}

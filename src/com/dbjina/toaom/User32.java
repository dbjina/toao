package com.dbjina.toaom;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.LRESULT;
//import com.sun.jna.platform.win32.WinDef.WPARAM;
import com.sun.jna.win32.StdCallLibrary;

public interface User32 extends StdCallLibrary {
	User32 INSTANCE = (User32) Native.loadLibrary("user32", User32.class);
	int SC_MONITORPOWER = 0xF170;
	int SC_MONITOR_OFF = 2;
	int SC_MONITOR_ON = -1;

//	LRESULT SendMessageA(HWND paramHWND, int paramInt, WPARAM paramWPARAM, LPARAM paramLPARAM);

	LRESULT SendMessageA(HWND paramHWND, int paramInt, int paramInt2, LPARAM paramLPARAM);
}

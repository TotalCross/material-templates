package com.totalcross.easytiful.material_templates;

import com.totalcross.easytiful.ui.Inicial;
import com.totalcross.easytiful.ui.SplashWindow;

import totalcross.io.IOException;
import totalcross.sys.Settings;
import totalcross.ui.MainWindow;
import totalcross.ui.image.ImageException;

public class MaterialTemplates extends MainWindow {

	public MaterialTemplates() {
		setUIStyle(Settings.MATERIAL_UI);
	}

	static {
		Settings.applicationId = "TCMT";
		Settings.appVersion = "1.0.0";
		Settings.iosCFBundleIdentifier = "com.totalcross.easytiful";
	}

	public void initUI() {
		SplashWindow sp;
		Inicial inicial = new Inicial();
		try {
			sp = new SplashWindow();
			sp.popupNonBlocking();
			swap(inicial);
		} catch (IOException | ImageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.totalcross.easytiful.ui;

import com.totalcross.easytiful.util.Colors;
import com.totalcross.easytiful.util.Images;

import totalcross.io.IOException;
import totalcross.ui.ImageControl;
import totalcross.ui.Window;
import totalcross.ui.anim.ControlAnimation;
import totalcross.ui.anim.FadeAnimation;
import totalcross.ui.image.ImageException;

public class SplashWindow extends Window{
	
	public SplashWindow() throws IOException, ImageException {
		this.setBackColor(Colors.PRIMARY);
	}
	
	protected void onPopup() {
		Images.loadImage(fmH);
		ImageControl logo;
		logo = new ImageControl(Images.logo);
		logo.scaleToFit = true;
		logo.centerImage = true;
		logo.transparentBackground = true;
		add(logo, CENTER, CENTER, PARENTSIZE + 50, PARENTSIZE + 50);

		FadeAnimation.create(logo, true, null, 2000)
				.then(FadeAnimation.create(logo, false, this::onAnimationFinished, 2000)).start();

	}
	
	public void onAnimationFinished(ControlAnimation anim) {
		this.unpop();
	}

}

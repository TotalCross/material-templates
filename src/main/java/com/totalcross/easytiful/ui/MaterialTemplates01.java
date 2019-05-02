package com.totalcross.easytiful.ui;

import com.totalcross.easytiful.util.Colors;
import com.totalcross.easytiful.util.Fonts;
import com.totalcross.easytiful.util.Images;

import totalcross.sys.Settings;
import totalcross.ui.Bar;
import totalcross.ui.Container;
import totalcross.ui.FloatingButton;
import totalcross.ui.MainWindow;
import totalcross.ui.Slider;
import totalcross.util.UnitsConverter;

public class MaterialTemplates01 extends Container {
	private Bar bar;
	private Container minibar, top_container, bottom_container;

	public void initUI() {

		bar = new Bar("   Text");
		bar.setFont(Fonts.latoBoldPlus10);
		bar.setBackForeColors(Colors.PRIMARY, Colors.TEXT_ON_P);

		minibar = new Container();
		minibar.setBackColor(Colors.P_DARK);

		top_container = new Container();
		top_container.setBackColor(Colors.SOFT_PEACH);

		bottom_container = new Container();
		bottom_container.setBackColor(Colors.BACKGROUND_GRAY_01);

		Images.loadImage(fmH);
		FloatingButton floatbutton = new FloatingButton(Images.float_button_back_on_s);
		floatbutton.setBackColor(Colors.SECONDARY);
		floatbutton.setIconSize(20);
		floatbutton.setIcon(Images.float_button_back_on_s);

		Slider slider = new Slider();
		slider.setBackColor(Colors.GRAY);
		slider.sliderColor = Colors.SECONDARY;
		slider.setValue(50);

		add(minibar, LEFT, TOP, FILL, SCREENSIZE + 3);
		add(bar, LEFT, AFTER, FILL, PREFERRED); // use 0 instead of TOP to
												// overwrite the default menu
												// area

		add(bottom_container, LEFT, BOTTOM, SCREENSIZE + 100, SCREENSIZE + 50);
		add(top_container, LEFT, AFTER, FILL, FIT, bar);
		add(floatbutton, getScreenWidth() * 80 / 100, bottom_container.getY() - floatbutton.getPreferredHeight() / 2);
		bottom_container.add(slider, RIGHT - UnitsConverter.toPixels(DP + 50), TOP + UnitsConverter.toPixels(DP + 330),
				SCREENSIZE + 40, PREFERRED);
		floatbutton.addPressListener((e) -> {
			Inicial inicial = new Inicial();
			MainWindow.getMainWindow().swap(inicial);
		});

	}

	public int getScreenWidth() {
		return Settings.screenWidth;
	}

}

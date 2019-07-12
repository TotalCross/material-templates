package com.totalcross.easytiful.ui;

import com.totalcross.easytiful.util.Colors;
import com.totalcross.easytiful.util.Fonts;
import com.totalcross.easytiful.util.Images;
import com.totalcross.easytiful.util.MaterialConstants;

import totalcross.sys.Settings;
import totalcross.ui.Bar;
import totalcross.ui.Container;
import totalcross.ui.FloatingActionButton;
import totalcross.ui.MainWindow;
import totalcross.ui.Slider;

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

		Images.loadImage();
		FloatingActionButton floatbutton = new FloatingActionButton(Images.float_button_back_on_s);
		floatbutton.setBackColor(Colors.SECONDARY);
		floatbutton.setIconSize(20);
		floatbutton.setIcon(Images.float_button_back_on_s);

		Slider slider = new Slider();
		slider.setBackColor(Colors.GRAY);
		slider.sliderColor = Colors.SECONDARY;
		slider.setValue(50);

		add(minibar, LEFT, TOP, FILL, SCREENSIZE + 3);
		add(bar, LEFT, AFTER, FILL, PREFERRED); // use 0 instead of TOP to
												// overwrite the default menu area
		add(bottom_container, LEFT, BOTTOM, SCREENSIZE + 100, SCREENSIZE + 50);
		add(top_container, LEFT, AFTER, FILL, FIT, bar);
		add(floatbutton, RIGHT - MaterialConstants.COMPONENT_SPACING, CENTER);
		bottom_container.add(slider, RIGHT - MaterialConstants.FIFTY_DP, BOTTOM + MaterialConstants.FIFTY_DP,
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

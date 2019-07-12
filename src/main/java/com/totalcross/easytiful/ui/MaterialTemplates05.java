package com.totalcross.easytiful.ui;

import com.totalcross.easytiful.util.Colors;
import com.totalcross.easytiful.util.Images;
import com.totalcross.easytiful.util.MaterialConstants;

import totalcross.ui.Bar;
import totalcross.ui.Container;
import totalcross.ui.FloatingActionButton;
import totalcross.ui.MainWindow;
import totalcross.ui.ScrollContainer;

public class MaterialTemplates05 extends Container {
	public void initUI() {

		Bar bar = new Bar("  ");
		bar.setBackForeColors(Colors.P_DARK, Colors.TEXT_ON_P_DARK);
		add(bar, LEFT, TOP, FILL, SCREENSIZE + 5); // use 0 instead of TOP to
													// overwrite the default menu area

		Container MainContainer = new Container();
		MainContainer.setBackColor(Colors.PRIMARY);
		add(MainContainer, LEFT, AFTER, SCREENSIZE + 100, SCREENSIZE + 80);

		Container bottomBar = new Container();
		bottomBar.setBackColor(Colors.P_LIGHT);
		add(bottomBar, LEFT, AFTER, FILL, SCREENSIZE + 20);

		Images.loadImage();
		FloatingActionButton floatbutton = new FloatingActionButton(Images.float_button_back_on_s);
		floatbutton.setBackColor(Colors.S_DARK);
		floatbutton.setIconSize(20);
		floatbutton.setIcon(Images.float_button_back_on_s);

		add(floatbutton, RIGHT - (MaterialConstants.BORDER_SPACING * 2), BOTTOM - MaterialConstants.FIFTYSIX_DP);
		floatbutton.addPressListener((e) -> {
			Inicial inicial = new Inicial();
			MainWindow.getMainWindow().swap(inicial);
		});

		ScrollContainer sc = new ScrollContainer(true, false) {
		};
		sc.setBackColor(Colors.PRIMARY);
		MainContainer.add(sc, CENTER, CENTER, SCREENSIZE, SCREENSIZE + 70);

		// Card
		Card_Material05 cm1 = new Card_Material05(Images.sample_image, "Text",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		sc.add(cm1, LEFT + MaterialConstants.BORDER_SPACING, TOP + MaterialConstants.BORDER_SPACING, SCREENSIZE + 70,
				FILL - MaterialConstants.BORDER_SPACING);

		Card_Material05 cm2 = new Card_Material05(Images.sample_image, "Text",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		sc.add(cm2, AFTER + MaterialConstants.BORDER_SPACING, TOP + MaterialConstants.BORDER_SPACING, SCREENSIZE + 70,
				FILL - MaterialConstants.BORDER_SPACING);

		Card_Material05 cm3 = new Card_Material05(Images.sample_image, "Text",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		sc.add(cm3, AFTER + MaterialConstants.BORDER_SPACING, TOP + MaterialConstants.BORDER_SPACING, SCREENSIZE + 70,
				FILL - MaterialConstants.BORDER_SPACING);
		
	}
}

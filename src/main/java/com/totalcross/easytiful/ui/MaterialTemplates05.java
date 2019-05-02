package com.totalcross.easytiful.ui;

import com.totalcross.easytiful.util.Colors;
import com.totalcross.easytiful.util.Images;

import totalcross.sys.Settings;
import totalcross.ui.Bar;
import totalcross.ui.Container;
import totalcross.ui.FloatingButton;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.MainWindow;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.util.UnitsConverter;

public class MaterialTemplates05 extends Container {
	public void initUI() {

		Bar bar = new Bar("  ");
		bar.setBackForeColors(Colors.P_DARK, Colors.TEXT_ON_P_DARK);

		Container c1 = new Container();
		c1.setBackColor(Colors.PRIMARY);

		Container c2 = new Container();
		c2.setBackColor(Colors.P_LIGHT);

		Images.loadImage(fmH);

		FloatingButton floatbutton = new FloatingButton(Images.float_button_back_on_s);
		floatbutton.setBackColor(Colors.S_DARK);
		floatbutton.setIconSize(20);
		floatbutton.setIcon(Images.float_button_back_on_s);

		add(bar, LEFT, TOP, FILL, SCREENSIZE + 5); // use 0 instead of TOP to
													// overwrite the default
													// menu area
		add(c1, LEFT, AFTER, SCREENSIZE + 100, SCREENSIZE + 80);
		add(c2, LEFT, AFTER, FILL, SCREENSIZE + 20);
		add(floatbutton, getScreenWidth() * 80 / 100, c2.getY() - floatbutton.getPreferredHeight() / 2);
		floatbutton.addPressListener((e) -> {
			Inicial inicial = new Inicial();
			MainWindow.getMainWindow().swap(inicial);
		});

		ScrollContainer sc = new ScrollContainer(true, false);
		sc.setBackColor(Colors.PRIMARY);

		c1.add(sc, CENTER, CENTER, SCREENSIZE, SCREENSIZE + 70);

		ImageControl image1 = new ImageControl(Images.sample_image);
		ImageControl image2 = new ImageControl(Images.sample_image);
		ImageControl image3 = new ImageControl(Images.sample_image);

		Container containerCard1 = new Container();
		Container card1 = new Container();
		Container minibar1 = new Container();
		minibar1.setBackColor(Colors.S_DARK);
		Font f = Font.getFont(true, Font.NORMAL_SIZE + 2);
		Label label1 = new Label("Text");
		label1.setFont(f);
		label1.setForeColor(Colors.TEXT_ON_S_DARK);
		Container cardspace1 = new Container();
		cardspace1.setBackColor(Color.WHITE);
		Label text1 = new Label("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		text1.autoSplit = true;
		text1.setForeColor(Colors.TEXT_ON_P);
		text1.setFont(font.adjustedBy(-4));

		Container containerCard2 = new Container();
		Container card2 = new Container();
		Container minibar2 = new Container();
		minibar2.setBackColor(Colors.S_DARK);
		Label label2 = new Label("Text");
		label2.setFont(f);
		label2.setForeColor(Colors.TEXT_ON_S_DARK);
		Container cardspace2 = new Container();
		cardspace2.setBackColor(Color.WHITE);
		Label text2 = new Label("Lorem ipsum dolor sit amet, \nconsectetur adipiscing elit.");
		text2.autoSplit = true;
		text2.setForeColor(Colors.TEXT_ON_P);
		text2.setFont(font.adjustedBy(-4));

		Container containerCard3 = new Container();
		Container card3 = new Container();
		Container minibar3 = new Container();
		minibar3.setBackColor(Colors.S_DARK);
		Label label3 = new Label("Text");
		label3.setFont(f);
		label3.setForeColor(Colors.TEXT_ON_S_DARK);
		Container cardspace3 = new Container();
		cardspace3.setBackColor(Color.WHITE);
		Label text3 = new Label("Lorem ipsum dolor sit amet, \nconsectetur adipiscing elit.");
		text3.autoSplit = true;
		text3.setForeColor(Color.WHITE);
		text3.setFont(font.adjustedBy(-4));

		sc.add(containerCard1, LEFT + 200, TOP + 150, SCREENSIZE + 70, SCREENSIZE + 60);
		containerCard1.add(card1, LEFT, TOP, SCREENSIZE + 70, SCREENSIZE + 50);
		card1.add(minibar1, LEFT, TOP, FILL, SCREENSIZE + 7);
		minibar1.add(label1, LEFT + UnitsConverter.toPixels(DP + 40), TOP + UnitsConverter.toPixels(DP + 20),
				SCREENSIZE + 70, PREFERRED);
		card1.add(cardspace1, LEFT, AFTER, SCREENSIZE + 70, SCREENSIZE + 45);
		cardspace1.add(image1, CENTER, CENTER, PREFERRED, PREFERRED);
		containerCard1.add(text1, LEFT + UnitsConverter.toPixels(DP + 40), AFTER + UnitsConverter.toPixels(DP + 15),
				SCREENSIZE + 70, SCREENSIZE + 10);

		sc.add(containerCard2, AFTER + 150, TOP + 150, SCREENSIZE + 70, SCREENSIZE + 60);
		containerCard2.add(card2, LEFT, TOP, SCREENSIZE + 70, SCREENSIZE + 50);
		card2.add(minibar2, LEFT, TOP, FILL, SCREENSIZE + 7);
		minibar2.add(label2, LEFT + UnitsConverter.toPixels(DP + 40), TOP + UnitsConverter.toPixels(DP + 20));
		card2.add(cardspace2, LEFT, AFTER, SCREENSIZE + 70, SCREENSIZE + 45);
		cardspace2.add(image2, CENTER, CENTER, PREFERRED, PREFERRED);
		containerCard2.add(text2, LEFT + UnitsConverter.toPixels(DP + 40), AFTER + UnitsConverter.toPixels(DP + 15),
				SCREENSIZE + 70, SCREENSIZE + 10);

		sc.add(containerCard3, AFTER + 150, TOP + 150, SCREENSIZE + 70, SCREENSIZE + 60);
		containerCard3.add(card3, LEFT, TOP, SCREENSIZE + 70, SCREENSIZE + 50);
		card3.add(minibar3, LEFT, TOP, FILL, SCREENSIZE + 7);
		minibar3.add(label3, LEFT + UnitsConverter.toPixels(DP + 40), TOP + UnitsConverter.toPixels(DP + 20));
		card3.add(cardspace3, LEFT, AFTER, SCREENSIZE + 70, SCREENSIZE + 45);
		cardspace3.add(image3, CENTER, CENTER, PREFERRED, PREFERRED);
		containerCard3.add(text3, LEFT + UnitsConverter.toPixels(DP + 40), AFTER + UnitsConverter.toPixels(DP + 15),
				SCREENSIZE + 70, SCREENSIZE + 10);
		sc.add(new Container(), AFTER, TOP + 150, SCREENSIZE + 20, 1);
	}

	public int getScreenWidth() {
		return Settings.screenWidth;
	}

}

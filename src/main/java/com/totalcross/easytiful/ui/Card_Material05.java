package com.totalcross.easytiful.ui;

import com.totalcross.easytiful.util.Colors;
import com.totalcross.easytiful.util.Fonts;
import com.totalcross.easytiful.util.MaterialConstants;

import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.image.Image;

public class Card_Material05 extends Container {
	private Image img;
	private String title;
	private String text;

	public Card_Material05(Image img, String title, String text) {
		this.img = img;
		this.title = title;
		this.text = text;
	}

	public void initUI() {
		Container containerCard1 = new Container();
		containerCard1.setBackColor(Colors.PRIMARY);
		add(containerCard1, LEFT, TOP, FILL, FILL);

		Container card1 = new Container();
		card1.setBackColor(Colors.PRIMARY);
		containerCard1.add(card1, LEFT, TOP, SCREENSIZE + 70, SCREENSIZE + 50);

		Container minibar1 = new Container();
		minibar1.setBackColor(Colors.S_DARK);
		card1.add(minibar1, LEFT, TOP, FILL, SCREENSIZE + 7);

		Label label1 = new Label(title);
		label1.setFont(Fonts.latoBoldPlus4);
		label1.setForeColor(Colors.TEXT_ON_S_DARK);
		minibar1.add(label1, LEFT + MaterialConstants.BORDER_SPACING, CENTER, FILL - MaterialConstants.BORDER_SPACING,
				PREFERRED);

		Container cardspace1 = new Container();
		cardspace1.setBackColor(Colors.BACKGROUND_WHITE);
		card1.add(cardspace1, LEFT, AFTER, SCREENSIZE + 70, SCREENSIZE + 45);

		ImageControl image1 = new ImageControl(img);
		cardspace1.add(image1, CENTER, CENTER, PREFERRED, PREFERRED);

		Label text1 = new Label(text);
		text1.autoSplit = true;
		text1.setForeColor(Colors.TEXT_ON_P);
		text1.setFont(Fonts.latoMediumPlus2);
		containerCard1.add(text1, LEFT + MaterialConstants.COMPONENT_SPACING, AFTER + MaterialConstants.BORDER_SPACING,
				FILL, FILL - MaterialConstants.BORDER_SPACING);
	}
}

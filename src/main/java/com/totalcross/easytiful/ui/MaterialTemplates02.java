package com.totalcross.easytiful.ui;

import com.totalcross.easytiful.util.Colors;
import com.totalcross.easytiful.util.Fonts;
import com.totalcross.easytiful.util.Images;

import totalcross.sys.Settings;
import totalcross.ui.Bar;
import totalcross.ui.Container;
import totalcross.ui.FloatingButton;
import totalcross.ui.Label;
import totalcross.ui.MainWindow;
import totalcross.ui.TabbedContainer;
import totalcross.ui.event.DragEvent;
import totalcross.ui.event.PenEvent;
import totalcross.ui.event.PenListener;
import totalcross.ui.gfx.Color;
import totalcross.util.UnitsConverter;

public class MaterialTemplates02 extends Container {
	private String[] tits = { "", "", "" };

	public void initUI() {

		Bar bar = new Bar("   Text");
		bar.setFont(Fonts.latoBoldPlus10);
		bar.setBackForeColors(Colors.P_DARK, Colors.TEXT_ON_P);

		Container bgcontainer = new Container();
		bgcontainer.setBackColor(Colors.PRIMARY);

		TabbedContainer tc = new TabbedContainer(tits);
		tc.transparentBackground = true;

		Container tcc0 = new Container();
		tcc0.setBackColor(Colors.BACKGROUND_GRAY_01);
		Container tcc1 = new Container();
		tcc1.setBackColor(Colors.BACKGROUND_GRAY_02);
		Container tcc2 = new Container();
		tcc2.setBackColor(Colors.BACKGROUND_GRAY_03);

		Container itemsContainer = new Container();
		itemsContainer.setBackColor(Colors.P_LIGHT);
		Container item1 = new Container();
		item1.setBackColor(Colors.P_LIGHT);
		Label litem1;
		Container item2 = new Container();
		item2.setBackColor(Colors.P_LIGHT);
		Label litem2;
		Container item3 = new Container();
		item3.setBackColor(Colors.P_LIGHT);
		Label litem3;

		Container subitemcontainer1 = new Container();
		Container subitemcontainer2 = new Container();
		Container subitemcontainer3 = new Container();
		subitemcontainer1.setBackColor(Colors.S_LIGHT);
		subitemcontainer2.setBackColor(Colors.P_LIGHT);
		subitemcontainer3.setBackColor(Colors.P_LIGHT);

		item1.addPenListener(new PenListener() {
			public void penUp(PenEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("item1");
				tc.setActiveTab(0);
				subitemcontainer1.setBackColor(Colors.S_LIGHT);
				subitemcontainer2.setBackColor(Colors.P_LIGHT);
				subitemcontainer3.setBackColor(Colors.P_LIGHT);
			}

			public void penDragStart(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDragEnd(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDrag(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDown(PenEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

		item2.addPenListener(new PenListener() {
			public void penUp(PenEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("item2");
				tc.setActiveTab(1);
				subitemcontainer1.setBackColor(Colors.P_LIGHT);
				subitemcontainer2.setBackColor(Colors.S_LIGHT);
				subitemcontainer3.setBackColor(Colors.P_LIGHT);
			}

			public void penDragStart(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDragEnd(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDrag(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDown(PenEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

		item3.addPenListener(new PenListener() {
			public void penUp(PenEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("item3");
				tc.setActiveTab(2);
				subitemcontainer1.setBackColor(Colors.P_LIGHT);
				subitemcontainer2.setBackColor(Colors.P_LIGHT);
				subitemcontainer3.setBackColor(Colors.S_LIGHT);
			}

			public void penDragStart(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDragEnd(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDrag(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDown(PenEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

		tc.setContainer(0, tcc0);
		tc.setContainer(1, tcc1);
		tc.setContainer(2, tcc2);

		Images.loadImage(fmH);
		FloatingButton floatbutton = new FloatingButton(Images.float_button_back_on_s);
		floatbutton.setBackColor(Colors.SECONDARY);
		floatbutton.setIconSize(20);
		floatbutton.setIcon(Images.float_button_back_on_s);

		add(bar, LEFT, TOP, FILL, SCREENSIZE + 13);
		add(tc, LEFT, BOTTOM, FILL, SCREENSIZE + 55);
		add(bgcontainer, LEFT, AFTER, FILL, FIT, bar);
		add(itemsContainer, LEFT, BEFORE + UnitsConverter.toPixels(DP + 130), FILL, SCREENSIZE + 10, tc);

		itemsContainer.add(item1, LEFT + UnitsConverter.toPixels(DP + 10), AFTER, SCREENSIZE + 33, SCREENSIZE + 10);
		itemsContainer.add(item2, AFTER, SAME, SCREENSIZE + 33, SCREENSIZE + 10);
		itemsContainer.add(item3, AFTER, SAME, SCREENSIZE + 33, SCREENSIZE + 10);

		add(subitemcontainer1, LEFT, AFTER, SCREENSIZE + 34, SCREENSIZE + 1);
		add(subitemcontainer2, AFTER, SAME, SCREENSIZE + 33, SCREENSIZE + 1);
		add(subitemcontainer3, AFTER, SAME, SCREENSIZE + 34, SCREENSIZE + 1);

		add(floatbutton, RIGHT - UnitsConverter.toPixels(DP + 50), BOTTOM - UnitsConverter.toPixels(DP + 250));
		floatbutton.addPressListener((e) -> {
			Inicial inicial = new Inicial();
			MainWindow.getMainWindow().swap(inicial);
		});

		item1.add(litem1 = new Label("ITEM 1"), CENTER, CENTER);
		item2.add(litem2 = new Label("ITEM 2"), CENTER, CENTER);
		item3.add(litem3 = new Label("ITEM 3"), CENTER, CENTER);

		litem1.setForeColor(Color.WHITE);
		litem2.setForeColor(Color.WHITE);
		litem3.setForeColor(Color.WHITE);

		litem1.addPenListener(new PenListener() {
			public void penUp(PenEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("item1");
				tc.setActiveTab(0);
				subitemcontainer1.setBackColor(Colors.S_LIGHT);
				subitemcontainer2.setBackColor(Colors.P_LIGHT);
				subitemcontainer3.setBackColor(Colors.P_LIGHT);
			}

			public void penDragStart(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDragEnd(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDrag(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDown(PenEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

		litem2.addPenListener(new PenListener() {
			public void penUp(PenEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("item2");
				tc.setActiveTab(1);
				subitemcontainer1.setBackColor(Colors.P_LIGHT);
				subitemcontainer2.setBackColor(Colors.S_LIGHT);
				subitemcontainer3.setBackColor(Colors.P_LIGHT);
			}

			public void penDragStart(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDragEnd(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDrag(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDown(PenEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

		litem3.addPenListener(new PenListener() {
			public void penUp(PenEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("item3");
				tc.setActiveTab(2);
				subitemcontainer1.setBackColor(Colors.P_LIGHT);
				subitemcontainer2.setBackColor(Colors.P_LIGHT);
				subitemcontainer3.setBackColor(Colors.S_LIGHT);
			}

			public void penDragStart(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDragEnd(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDrag(DragEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void penDown(PenEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

	}

	public int getScreenWidth() {
		return Settings.screenWidth;
	}

}

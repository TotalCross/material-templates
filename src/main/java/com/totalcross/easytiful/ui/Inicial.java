package com.totalcross.easytiful.ui;

import com.totalcross.easytiful.util.Colors;
import com.totalcross.easytiful.util.Fonts;
import com.totalcross.easytiful.util.Images;
import com.totalcross.easytiful.util.MaterialConstants;

import totalcross.sys.Vm;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Control;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.MainWindow;
import totalcross.ui.gfx.Color;
import totalcross.util.UnitsConverter;

public class Inicial extends Container {
	public Inicial() {
		this.setBackColor(Colors.PRIMARY);
	}

	public void initUI() {
		Images.loadImage();

		ImageControl background = new ImageControl(Images.background);
		background.scaleToFit = true;
		background.centerImage = true;
		background.hwScale = true;
		background.strechImage = true;
		add(background, LEFT, TOP, FILL, FILL);

		ImageControl logo = new ImageControl(Images.logo_nome_borda);
		logo.scaleToFit = true;
		logo.transparentBackground = true;
		add(logo, CENTER, TOP +  UnitsConverter.toPixels(16 + Control.DP), PARENTSIZE + 70, PARENTSIZE + 20);

		Container cont = new Container();
		cont.transparentBackground = true;
		add(cont, LEFT +  MaterialConstants.BORDER_SPACING, BOTTOM, FILL -  MaterialConstants.BORDER_SPACING, PARENTSIZE + 65);

		Label lbl = new Label("Your Java dev\nquickly building all\nyour company apps");
		lbl.setFont(Fonts.latoBoldPlus10);
		lbl.transparentBackground = true;
		lbl.setForeColor(Colors.TEXT_ON_P);
		cont.add(lbl, LEFT, TOP + 15);

		Button mt01 = new Button("Material Template 01", Button.BORDER_OUTLINED);
		mt01.setForeColor(Colors.PRIMARY);
		cont.add(mt01, LEFT, AFTER + (MaterialConstants.COMPONENT_SPACING)*2, FILL, PREFERRED);
		mt01.addPressListener((e) -> {
			MaterialTemplates01 mt1 = new MaterialTemplates01();
			MainWindow.getMainWindow().swap(mt1);
		});

		Button mt02 = new Button("Material Template 02", Button.BORDER_OUTLINED);
		mt02.setForeColor(Colors.PRIMARY);
		cont.add(mt02, LEFT, AFTER + MaterialConstants.COMPONENT_SPACING, FILL, PREFERRED);
		mt02.addPressListener((e) -> {
			MaterialTemplates02 mt2 = new MaterialTemplates02();
			MainWindow.getMainWindow().swap(mt2);

		});

		Button mt05 = new Button("Material Template 05", Button.BORDER_OUTLINED);
		mt05.setForeColor(Colors.PRIMARY);
		cont.add(mt05, LEFT, AFTER + MaterialConstants.COMPONENT_SPACING, FILL, PREFERRED);
		mt05.addPressListener((e) -> {
			MaterialTemplates05 mt5 = new MaterialTemplates05();
			MainWindow.getMainWindow().swap(mt5);
		});

		Button readMore = new Button("Read more about Material Templates", Button.BORDER_NONE);
		readMore.transparentBackground = true;
		readMore.setFont(Fonts.latoRegularDefaultSize);
		readMore.setForeColor(Color.WHITE);
		cont.add(readMore, LEFT, AFTER + MaterialConstants.COMPONENT_SPACING, FILL, PREFERRED);
		readMore.addPressListener((e) -> {
			Vm.exec("url", "https://github.com/TotalCross/Material_Templates", 0, true);
		});

	}
}

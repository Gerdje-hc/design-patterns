package com.realdolmen.ood020.flyweight;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class FolderIcon extends AbstractIcon {

	private final int H = 48;
	private ImageIcon iconSel;
	private ImageIcon iconUnsel;

	FolderIcon() {
		// TODO COMPLETE
	}

	public void draw(Graphics g, int tx, int ty, String name, boolean sel) {
		if (sel) {
			iconSel.paintIcon(null, g, tx, ty);
		} else {
			iconUnsel.paintIcon(null, g, tx, ty);
		}
		g.drawString(name, tx, ty + H + 15); // title
	}
}

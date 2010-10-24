/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rubikgui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author gbudiman
 */
public class axis extends Canvas {
    public static void main(String args[]) {
    }

    public axis() {
    }

    @Override
    public void paint(Graphics graphicsX) {
        Graphics2D graphics = (Graphics2D) graphicsX;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setColor(Color.BLACK);
        graphics.drawLine(48, 48, 48, 0);
        graphics.drawLine(48, 48, 98, 48);
        graphics.drawLine(48, 48, 12, 72);
        graphics.drawString("X", 88, 64);
        graphics.drawString("Y", 56, 10);
        graphics.drawString("Z", 6, 64);
    }
}

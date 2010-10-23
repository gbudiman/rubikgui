/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rubikgui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author gbudiman
 */
public class canvas2D extends Canvas {
    public static void main(String args[]) {
    }

    public canvas2D() {
    }
    public String state = null;

    @Override
    public void paint(Graphics graphics) {
        for (int i = 0; i < 9; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawRect(100 + i%3 * 30, i/3 * 30, 30, 30);
            graphics.setColor(getColor(state.substring(i, i+1)));
            graphics.fillRect(100 + i%3 * 30 + 1, i/3 * 30 + 1, 30-1, 30-1);
        }
        for (int i = 9; i < 18; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawRect(10 + (i-9)%3 * 30, i/3 * 30, 30, 30);
            graphics.setColor(getColor(state.substring(i, i+1)));
            graphics.fillRect(10 + (i-9)%3 * 30 + 1, i/3 * 30 + 1, 30-1, 30-1);
        }
        for (int i = 18; i < 27; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawRect(100 + (i-18)%3 * 30, (i-9)/3 * 30, 30, 30);
            graphics.setColor(getColor(state.substring(i, i+1)));
            graphics.fillRect(100 + (i-18)%3 * 30 + 1, (i-9)/3 * 30 + 1, 30-1, 30-1);
        }
        for (int i = 27; i < 36; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawRect(190 + (i-27)%3 * 30, (i-18)/3 * 30, 30, 30);
            graphics.setColor(getColor(state.substring(i, i+1)));
            graphics.fillRect(190 + (i-27)%3 * 30 + 1, (i-18)/3 * 30 + 1, 30-1, 30-1);
        }
        for (int i = 36; i < 45; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawRect(280 + (i-36)%3 * 30, (i-27)/3 * 30, 30, 30);
            graphics.setColor(getColor(state.substring(i, i+1)));
            graphics.fillRect(280 + (i-36)%3 * 30 + 1, (i-27)/3 * 30 + 1, 30-1, 30-1);
        }
        for (int i = 45; i < 54; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawRect(100 + (i-45)%3 * 30, (i-27)/3 * 30, 30, 30);
            graphics.setColor(getColor(state.substring(i, i+1)));
            graphics.fillRect(100 + (i-45)%3 * 30 + 1, (i-27)/3 * 30 + 1, 30-1, 30-1);
        }
    }

    public void passState(String cubeState) {
       state = cubeState;
       repaint();
    }

    public Color getColor(String s) {
        if (s.equals("R")) {
            return Color.RED;
        }
        else if (s.equals("Y")) {
            return Color.YELLOW;
        }
        else if (s.equals("B")) {
            return Color.BLUE;
        }
        else if (s.equals("O")) {
            return Color.ORANGE;
        }
        else if (s.equals("G")) {
            return Color.GREEN;
        }
        else {
            return Color.WHITE;
        }
    }
}

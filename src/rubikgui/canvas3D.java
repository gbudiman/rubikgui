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
import java.awt.geom.AffineTransform;

/**
 *
 * @author gbudiman
 */
public class canvas3D extends Canvas {
    public static void main(String args[]) {
    }

    public canvas3D() {
    }

    rubik drawCube;
    
    @Override
    public void paint(Graphics graphicsG) {
        Graphics2D graphics = (Graphics2D) graphicsG;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.translate(0, 20);
        
        graphics.shear(-1.75, 0);
        for (int i = 0; i < 9; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawRect(100 + i%3 * 30, i/3 * 12, 30, 12);
            //graphics.setColor(getColor(state.substring(i, i+1)));
            graphics.setColor(getFaceCell("top", i));
            graphics.fillRect(100 + i%3 * 30 + 1, i/3 * 12 + 1, 30-1, 12-1);
        }
        graphics.shear(1.75, 0);
        for (int i = 0; i < 9; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawRect(37 + i%3 * 30, 37 + i/3 * 30, 30, 30);
            //graphics.setColor(getColor(state.substring(i+9, i+10)));
            graphics.setColor(getFaceCell("front", i));
            graphics.fillRect(37 + i%3 * 30 + 1, 37 + i/3 * 30 + 1, 30-1, 30-1);
        }
        graphics.shear(0, -0.58);
        graphics.translate(128, 53);
        for (int i = 0; i < 9; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawRect(i%3 * 21, 58 + i/3 * 30, 21, 30);
            //graphics.setColor(getColor(state.substring(i+18, i+19)));
            graphics.setColor(getFaceCell("right", i));
            graphics.fillRect(i%3 * 21 + 1, 58 + i/3 * 30 + 1, 21-1, 30-1);
        }
    }

    public void passState(rubik cube) {
       drawCube = cube;
       repaint();
    }

    public int reMapCell(int request, int face) {
        String combination = null;
        String cellState;
        switch (drawCube.top) {
            case 0:
                switch (drawCube.front) {
                    case 1: combination = "BAA"; break;
                    case 2: combination = "AAA"; break;
                    case 3: combination = "DAA"; break;
                    case 4: combination = "CAA"; break;
                } break;
            case 1:
                switch (drawCube.front) {
                    case 2: combination = "DDD"; break;
                    case 0: combination = "CDB"; break;
                    case 4: combination = "BBD"; break;
                    case 5: combination = "ADD"; break;
                } break;
            case 2:
                switch (drawCube.front) {
                    case 0: combination = "CCB"; break;
                    case 1: combination = "BBA"; break;
                    case 5: combination = "AAD"; break;
                    case 3: combination = "DDC"; break;
                } break;
            case 3:
                switch (drawCube.front) {
                    case 0: combination = "CBB"; break;
                    case 2: combination = "BBB"; break;
                    case 5: combination = "ABD"; break;
                    case 4: combination = "DDB"; break;
                } break;
            case 4:
                switch (drawCube.front) {
                    case 1: combination = "DDA"; break;
                    case 0: combination = "CAB"; break;
                    case 3: combination = "BBC"; break;
                    case 5: combination = "ACD"; break;
                } break;
            case 5:
                switch (drawCube.front) {
                    case 1: combination = "BCC"; break;
                    case 2: combination = "ACC"; break;
                    case 3: combination = "DCC"; break;
                    case 4: combination = "CCC"; break;
                } break;
        }

        cellState = combination.substring(face, face + 1);
        if (cellState.equals("A")) {
            return request;
        }
        else if (cellState.equals("B")) {
            switch (request) {
                case 0: return 2;
                case 1: return 5;
                case 2: return 8;
                case 3: return 1;
                case 4: return 4;
                case 5: return 7;
                case 6: return 0;
                case 7: return 3;
                case 8: return 6;
            }
        }
        else if (cellState.equals("C")) {
            switch (request) {
                case 0: return 8;
                case 1: return 7;
                case 2: return 6;
                case 3: return 5;
                case 4: return 4;
                case 5: return 3;
                case 6: return 2;
                case 7: return 1;
                case 8: return 0;
            }
        }
        else {
            switch (request) {
                case 0: return 6;
                case 1: return 3;
                case 2: return 0;
                case 3: return 7;
                case 4: return 4;
                case 5: return 1;
                case 6: return 8;
                case 7: return 5;
                case 8: return 2;
            }
        }
        return -1;
    }

    public Color getFaceCell(String face, int i) {
        /*
         * face can only take values of "front", "top", or "left"
         */
        int remapped;
        if (face.equals("top")) {
            remapped = reMapCell(i, 0);
            return getColor(drawCube.cube[drawCube.top][remapped]);
        }
        else if (face.equals("front")) {
            remapped = reMapCell(i, 1);
            return getColor(drawCube.cube[drawCube.front][remapped]);
        }
        else {
            // "right"
            remapped = reMapCell(i, 2);
            return getColor(drawCube.cube[drawCube.right][remapped]);
        }
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

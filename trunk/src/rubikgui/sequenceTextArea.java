/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rubikgui;

/**
 *
 * @author gbudiman
 */
public class sequenceTextArea extends javax.swing.JTextArea {
    public void myAppend(String text) {
        if (this.getText().length() == 0) {
            this.append(text);
        }
        else {
            this.append(", " + text);
        }
    }
}

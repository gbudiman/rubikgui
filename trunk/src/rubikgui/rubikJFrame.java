/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * rubikJFrame.java
 *
 * Created on Oct 22, 2010, 8:11:00 AM
 */

package rubikgui;

/**
 *
 * @author gbudiman
 */
public class rubikJFrame extends javax.swing.JFrame {

    public rubik cube = new rubik();
    /** Creates new form rubikJFrame */
    public rubikJFrame() {
        initComponents();
        state.setText(cube.getState());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        rotateX = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rotateXInv = new javax.swing.JButton();
        rotateYInv = new javax.swing.JButton();
        rotateY = new javax.swing.JButton();
        rotateZInv = new javax.swing.JButton();
        rotateZ = new javax.swing.JButton();
        turnU = new javax.swing.JButton();
        turnD = new javax.swing.JButton();
        turnR = new javax.swing.JButton();
        turnL = new javax.swing.JButton();
        turnF = new javax.swing.JButton();
        turnB = new javax.swing.JButton();
        turnLInv = new javax.swing.JButton();
        turnDInv = new javax.swing.JButton();
        turnRInv = new javax.swing.JButton();
        turnUInv = new javax.swing.JButton();
        turnBInv = new javax.swing.JButton();
        turnFInv = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        state = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        sequence = new sequenceTextArea();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotateX.setText("X");
        rotateX.setDefaultCapable(false);
        rotateX.setMaximumSize(new java.awt.Dimension(40, 40));
        rotateX.setMinimumSize(new java.awt.Dimension(40, 40));
        rotateX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rotateXMouseClicked(evt);
            }
        });

        jLabel1.setText("Rotate");

        rotateXInv.setText("X'");
        rotateXInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rotateXInvMouseClicked(evt);
            }
        });

        rotateYInv.setText("Y'");
        rotateYInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rotateYInvMouseClicked(evt);
            }
        });

        rotateY.setText("Y");
        rotateY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rotateYMouseClicked(evt);
            }
        });

        rotateZInv.setText("Z'");
        rotateZInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rotateZInvMouseClicked(evt);
            }
        });

        rotateZ.setText("Z");
        rotateZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rotateZMouseClicked(evt);
            }
        });

        turnU.setText("U");
        turnU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turnUMouseClicked(evt);
            }
        });

        turnD.setText("D");
        turnD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turnDMouseClicked(evt);
            }
        });

        turnR.setText("R");
        turnR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turnRMouseClicked(evt);
            }
        });

        turnL.setText("L");
        turnL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turnLMouseClicked(evt);
            }
        });

        turnF.setText("F");
        turnF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turnFMouseClicked(evt);
            }
        });

        turnB.setText("B");
        turnB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turnBMouseClicked(evt);
            }
        });

        turnLInv.setText("L'");
        turnLInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turnLInvMouseClicked(evt);
            }
        });

        turnDInv.setText("D'");
        turnDInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turnDInvMouseClicked(evt);
            }
        });

        turnRInv.setText("R'");
        turnRInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turnRInvMouseClicked(evt);
            }
        });

        turnUInv.setText("U'");
        turnUInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turnUInvMouseClicked(evt);
            }
        });

        turnBInv.setText("B'");
        turnBInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turnBInvMouseClicked(evt);
            }
        });

        turnFInv.setText("F'");
        turnFInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turnFInvMouseClicked(evt);
            }
        });

        reset.setText("RESET");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        jLabel2.setText("Sequence");

        jLabel3.setText("State");

        state.setColumns(20);
        state.setLineWrap(true);
        state.setRows(5);
        jScrollPane3.setViewportView(state);

        sequence.setColumns(20);
        sequence.setLineWrap(true);
        sequence.setRows(5);
        jScrollPane4.setViewportView(sequence);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rotateX, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rotateXInv, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rotateY, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rotateYInv, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rotateZ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rotateZInv, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(turnUInv, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turnDInv, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turnRInv, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turnLInv, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turnFInv, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turnBInv, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(turnU, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turnD, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turnR, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turnL, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turnF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turnB, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rotateX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotateXInv)
                    .addComponent(rotateY)
                    .addComponent(rotateYInv)
                    .addComponent(rotateZ)
                    .addComponent(rotateZInv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turnU)
                    .addComponent(turnD)
                    .addComponent(turnR)
                    .addComponent(turnL)
                    .addComponent(turnF)
                    .addComponent(turnB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turnUInv)
                    .addComponent(turnDInv)
                    .addComponent(turnRInv)
                    .addComponent(turnLInv)
                    .addComponent(turnFInv)
                    .addComponent(turnBInv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rotateXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rotateXMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("X");
        cube.process("X");
        state.setText(cube.getState());
    }//GEN-LAST:event_rotateXMouseClicked

    private void rotateXInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rotateXInvMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("X'");
        cube.process("X'");
        state.setText(cube.getState());
    }//GEN-LAST:event_rotateXInvMouseClicked

    private void rotateYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rotateYMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("Y");
        cube.process("Y");
        state.setText(cube.getState());
    }//GEN-LAST:event_rotateYMouseClicked

    private void rotateYInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rotateYInvMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("Y'");
        cube.process("Y'");
        state.setText(cube.getState());
    }//GEN-LAST:event_rotateYInvMouseClicked

    private void rotateZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rotateZMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("Z");
        cube.process("Z");
        state.setText(cube.getState());
    }//GEN-LAST:event_rotateZMouseClicked

    private void rotateZInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rotateZInvMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("Z'");
        cube.process("Z'");
        state.setText(cube.getState());
    }//GEN-LAST:event_rotateZInvMouseClicked

    private void turnUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turnUMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("U");
        cube.process("U");
        state.setText(cube.getState());
    }//GEN-LAST:event_turnUMouseClicked

    private void turnDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turnDMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("D");
        cube.process("D");
        state.setText(cube.getState());
    }//GEN-LAST:event_turnDMouseClicked

    private void turnRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turnRMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("R");
        cube.process("R");
        state.setText(cube.getState());
    }//GEN-LAST:event_turnRMouseClicked

    private void turnLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turnLMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("L");
        cube.process("L");
        state.setText(cube.getState());
    }//GEN-LAST:event_turnLMouseClicked

    private void turnFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turnFMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("F");
        cube.process("F");
        state.setText(cube.getState());
    }//GEN-LAST:event_turnFMouseClicked

    private void turnBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turnBMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("B");
        cube.process("B");
        state.setText(cube.getState());
    }//GEN-LAST:event_turnBMouseClicked

    private void turnUInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turnUInvMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("U'");
        cube.process("U'");
        state.setText(cube.getState());
    }//GEN-LAST:event_turnUInvMouseClicked

    private void turnDInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turnDInvMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("D'");
        cube.process("D'");
        state.setText(cube.getState());
    }//GEN-LAST:event_turnDInvMouseClicked

    private void turnRInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turnRInvMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("R'");
        cube.process("R'");
        state.setText(cube.getState());
    }//GEN-LAST:event_turnRInvMouseClicked

    private void turnLInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turnLInvMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("L'");
        cube.process("L'");
        state.setText(cube.getState());
    }//GEN-LAST:event_turnLInvMouseClicked

    private void turnFInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turnFInvMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("F'");
        cube.process("F'");
        state.setText(cube.getState());
    }//GEN-LAST:event_turnFInvMouseClicked

    private void turnBInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turnBInvMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("B'");
        cube.process("B'");
        state.setText(cube.getState());
    }//GEN-LAST:event_turnBInvMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        // TODO add your handling code here:
        ((sequenceTextArea) sequence).myAppend("RESET");
        cube.process("RESET");
        state.setText(cube.getState());
    }//GEN-LAST:event_resetMouseClicked
    
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rubikJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton reset;
    private javax.swing.JButton rotateX;
    private javax.swing.JButton rotateXInv;
    private javax.swing.JButton rotateY;
    private javax.swing.JButton rotateYInv;
    private javax.swing.JButton rotateZ;
    private javax.swing.JButton rotateZInv;
    private javax.swing.JTextArea sequence;
    private javax.swing.JTextArea state;
    private javax.swing.JButton turnB;
    private javax.swing.JButton turnBInv;
    private javax.swing.JButton turnD;
    private javax.swing.JButton turnDInv;
    private javax.swing.JButton turnF;
    private javax.swing.JButton turnFInv;
    private javax.swing.JButton turnL;
    private javax.swing.JButton turnLInv;
    private javax.swing.JButton turnR;
    private javax.swing.JButton turnRInv;
    private javax.swing.JButton turnU;
    private javax.swing.JButton turnUInv;
    // End of variables declaration//GEN-END:variables

}

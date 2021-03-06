/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.image;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author pkann
 */
public class PicturePane_256 extends javax.swing.JPanel {

    private Image image;

    public PicturePane_256() {
        initComponents();
    }

    @Override
    public void paint(Graphics g) {
        g.clearRect(0, 0, this.getWidth(), this.getHeight());
        if (image != null) {
            g.drawImage(image, 0, 0, null);
        } else {
            g.setColor(new Color(51,51,51));
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
    }

    public void setPicture(Image img) {
        if (img != null) {
            image = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        } else {
            image = null;
        }
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(java.awt.Color.lightGray);
        setMaximumSize(new java.awt.Dimension(150, 150));
        setMinimumSize(new java.awt.Dimension(150, 150));
        setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

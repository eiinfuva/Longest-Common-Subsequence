/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

/**
 *
 * @author garciparedes
 */
public class View extends javax.swing.JFrame {

    private Controller controller;
    /**
     * Creates new form View
     */
    public View() {
        controller = new Controller(this);
        initComponents();
        myInitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar = new javax.swing.JToolBar();
        jButtonLoadFile1 = new javax.swing.JButton();
        jButtonLoadFile2 = new javax.swing.JButton();
        jLayeredPanelGrid = new javax.swing.JLayeredPane();
        jScrollPaneLeft = new javax.swing.JScrollPane();
        jTextAreaLeft = new javax.swing.JTextArea();
        jScrollPaneRight = new javax.swing.JScrollPane();
        jTextAreaRight = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 480));

        jToolBar.setFloatable(false);
        jToolBar.setRollover(true);

        jButtonLoadFile1.setText("Load File1");
        jButtonLoadFile1.setFocusable(false);
        jButtonLoadFile1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonLoadFile1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonLoadFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadFile1ActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonLoadFile1);

        jButtonLoadFile2.setText("Load File2");
        jButtonLoadFile2.setFocusable(false);
        jButtonLoadFile2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonLoadFile2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonLoadFile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadFile2ActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonLoadFile2);

        jLayeredPanelGrid.setLayout(new java.awt.GridLayout(1, 2));

        jTextAreaLeft.setEditable(false);
        jTextAreaLeft.setColumns(20);
        jTextAreaLeft.setRows(5);
        jScrollPaneLeft.setViewportView(jTextAreaLeft);

        jLayeredPanelGrid.add(jScrollPaneLeft);

        jTextAreaRight.setEditable(false);
        jTextAreaRight.setColumns(20);
        jTextAreaRight.setRows(5);
        jScrollPaneRight.setViewportView(jTextAreaRight);

        jLayeredPanelGrid.add(jScrollPaneRight);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPanelGrid, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPanelGrid)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoadFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadFile1ActionPerformed
        controller.loadFileLeft();
    }//GEN-LAST:event_jButtonLoadFile1ActionPerformed

    private void jButtonLoadFile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadFile2ActionPerformed
        controller.loadFileRight();
    }//GEN-LAST:event_jButtonLoadFile2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLoadFile1;
    private javax.swing.JButton jButtonLoadFile2;
    private javax.swing.JLayeredPane jLayeredPanelGrid;
    private javax.swing.JScrollPane jScrollPaneLeft;
    private javax.swing.JScrollPane jScrollPaneRight;
    private javax.swing.JTextArea jTextAreaLeft;
    private javax.swing.JTextArea jTextAreaRight;
    private javax.swing.JToolBar jToolBar;
    // End of variables declaration//GEN-END:variables
    
    private TextLineNumber textLineNumberLeft;
    private TextLineNumber textLineNumberRight;
    

    private final Highlighter.HighlightPainter redPainter = new DefaultHighlighter.DefaultHighlightPainter(new Color(240, 101, 55));
    private final Highlighter.HighlightPainter greenHighLight = new DefaultHighlighter.DefaultHighlightPainter(new Color(192, 216, 144));

    private void myInitComponents() {        
        setLocationRelativeTo(null);
        textLineNumberLeft = new TextLineNumber(jTextAreaLeft);
        textLineNumberRight = new TextLineNumber(jTextAreaRight);
        jScrollPaneLeft.setRowHeaderView( textLineNumberLeft );
        jScrollPaneRight.setRowHeaderView( textLineNumberRight );
        jTextAreaLeft.setLineWrap(true);
        jTextAreaRight.setLineWrap(true);
    }
    
    public void setJTextAreaLeftText(String text){
        jTextAreaLeft.setText(text);
    }

    public void setJTextAreaRightText(String text) {
        jTextAreaRight.setText(text);
    }

    public void colorJTextAreaLeftText(int[] lcs) {
        jTextAreaLeft.getHighlighter().removeAllHighlights();
        for(int i = 0; i < lcs.length; i++){
            try {
                int a = jTextAreaLeft.getLineStartOffset(lcs[i]);
                int b = jTextAreaLeft.getLineEndOffset(lcs[i]);
                jTextAreaLeft.getHighlighter().addHighlight(a, b, greenHighLight);
            } catch (BadLocationException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void colorJTextAreaRightText(int[] lcs) {
        jTextAreaRight.getHighlighter().removeAllHighlights();
        for(int i = 0; i < lcs.length; i++){
            try {
                int a = jTextAreaRight.getLineStartOffset(lcs[i]);
                int b = jTextAreaRight.getLineEndOffset(lcs[i]);
                jTextAreaRight.getHighlighter().addHighlight(a, b, greenHighLight);
            } catch (BadLocationException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

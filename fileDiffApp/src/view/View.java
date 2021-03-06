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
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;


/**
 * View Class.
 * 
 * It represents the graphic interface in the system.
 * 
 * @author garciparedes
 */
public class View extends javax.swing.JFrame {
    
    private static final HighlightPainter redHighLight = new DefaultHighlightPainter(new Color(240, 101, 55));
    private static final HighlightPainter greenHighLight = new DefaultHighlightPainter(new Color(192, 216, 144));
     
    
    private TextLineNumber textLineNumberLeft;
    private TextLineNumber textLineNumberRight;
    
    private final Controller controller;
    
    
    
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
        jLabelLCS = new javax.swing.JLabel();

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

        jLayeredPanelGrid.setLayout(new java.awt.GridLayout(1, 0));

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

        jLabelLCS.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabelLCS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPanelGrid, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jToolBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelLCS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLCS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPanelGrid, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    /**
     * jButtonLoadFile1ActionPerformed method.
     * Is called when jButtonLoadFile1 is pressed.
     * @param evt 
     */
    private void jButtonLoadFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadFile1ActionPerformed
        controller.loadFileLeft();
    }//GEN-LAST:event_jButtonLoadFile1ActionPerformed

    
    
    /**
     * jButtonLoadFile2ActionPerformed method.
     * Is called when jButtonLoadFile2 is pressed.
     * @param evt 
     */
    private void jButtonLoadFile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadFile2ActionPerformed
        controller.loadFileRight();
    }//GEN-LAST:event_jButtonLoadFile2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLoadFile1;
    private javax.swing.JButton jButtonLoadFile2;
    private javax.swing.JLabel jLabelLCS;
    private javax.swing.JLayeredPane jLayeredPanelGrid;
    private javax.swing.JScrollPane jScrollPaneLeft;
    private javax.swing.JScrollPane jScrollPaneRight;
    private javax.swing.JTextArea jTextAreaLeft;
    private javax.swing.JTextArea jTextAreaRight;
    private javax.swing.JToolBar jToolBar;
    // End of variables declaration//GEN-END:variables

    

    /**
     * myInitComponents method.
     * 
     * It initializes custom attributes.
     */
    private void myInitComponents() {        
        setLocationRelativeTo(null);
        textLineNumberLeft = new TextLineNumber(jTextAreaLeft);
        textLineNumberRight = new TextLineNumber(jTextAreaRight);
        jScrollPaneLeft.setRowHeaderView( textLineNumberLeft );
        jScrollPaneRight.setRowHeaderView( textLineNumberRight );
        jTextAreaLeft.setLineWrap(true);
        jTextAreaRight.setLineWrap(true);
    }
    
    
    
    /**
     * Setter of JTextAreaLeft.
     * 
     * @param text text to introduce.
     */
    public void setJTextAreaLeftText(String text){
        jTextAreaLeft.setText(text);
    }

    
    
    /**
     * Setter of JTextAreaRight.
     * 
     * @param text text to introduce.
     */
    public void setJTextAreaRightText(String text) {
        jTextAreaRight.setText(text);
    }
    
    
    
    /**
     * Setter of JLabelLCS.
     * 
     * @param text text to introduce.
     */
    public void setJLabelLCS(String text) {
        jLabelLCS.setText(text);
    }
    
    
    /**
     * colorJTextAreaLeftText method.
     * 
     * It method HighLights the text of <code>JTextAreaLeft</code>
     * to green and red by lines.
     * 
     * @param greenLines Lines to HighLight to green.
     * @param redLines Lines to HighLight to red.
     */
    public void colorJTextAreaLeftText(int[] greenLines, int[] redLines) {
        colorJTextAreatText(jTextAreaLeft, greenLines, redLines);
    }
    
    
    /**
     * colorJTextAreaRightText method.
     * 
     * It method HighLights the text of <code>JTextAreaRight</code>
     * to green and red by lines.
     * 
     * @param greenLines Lines to HighLight to green.
     * @param redLines Lines to HighLight to red.
     */
    public void colorJTextAreaRightText(int[] greenLines, int[] redLines) {
        colorJTextAreatText(jTextAreaRight, greenLines, redLines);
    }
    
    /**
     * colorJTextAreaRightText method.
     * 
     * It method HighLights the text of input jTextArea
     * to green and red by lines.
     * 
     * @param jTextArea TextAre to apply the HighLight.
     * @param greenLines Lines to HighLight to green.
     * @param redLines Lines to HighLight to red.
     */
    public static void colorJTextAreatText(JTextArea jTextArea
            , int[] greenLines, int[] redLines){
        int a,b;
        try {
            jTextArea.getHighlighter().removeAllHighlights();
            
            for(int i = 0; i < greenLines.length; i++){
                a = jTextArea.getLineStartOffset(greenLines[i]);
                b = jTextArea.getLineEndOffset(greenLines[i]);
                jTextArea.getHighlighter().addHighlight(a, b, greenHighLight);
            }
            
            for(int i = 0; i < redLines.length; i++){
                a = jTextArea.getLineStartOffset(redLines[i]);
                b = jTextArea.getLineEndOffset(redLines[i]);
                jTextArea.getHighlighter().addHighlight(a, b, redHighLight);
            }
           
        } catch (BadLocationException ex) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

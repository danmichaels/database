/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.awt.Toolkit;

/**
 *
 * @author Danya
 */
public class F_Equity extends javax.swing.JFrame {

    
     private F_Menu parent = null;
     
    /**
     * Creates new form F_Equity
     */
    public F_Equity(F_Menu parent) {
        this.parent = parent;
        initComponents();
        additionalinit();

    }
    
    private void showWindow(){
        float balance = 0;
        balance = DataBase.getInstance().getBalance();
        L_equity.setText("На счету: "+balance +" руб.");
    }
    
    @Override
    public void setVisible(boolean b){
        super.setVisible(b);
        showWindow();
    }
    
    private void additionalinit(){
        //центрирование окна
        this.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width-this.getWidth())/2, (Toolkit.getDefaultToolkit().getScreenSize().height-this.getHeight())/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_amount = new javax.swing.JPanel();
        L_equity = new javax.swing.JLabel();
        B_back = new javax.swing.JButton();
        L_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Баланс");
        setName("f_equity"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        P_amount.setBackground(new java.awt.Color(215, 214, 214));
        P_amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        L_equity.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        L_equity.setText("На счету: 0 руб.");

        B_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_backActionPerformed(evt);
            }
        });

        L_back.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        L_back.setText("Назад");

        javax.swing.GroupLayout P_amountLayout = new javax.swing.GroupLayout(P_amount);
        P_amount.setLayout(P_amountLayout);
        P_amountLayout.setHorizontalGroup(
            P_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_amountLayout.createSequentialGroup()
                .addGroup(P_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_amountLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(B_back, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(L_back))
                    .addGroup(P_amountLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(L_equity)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        P_amountLayout.setVerticalGroup(
            P_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_amountLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(L_equity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(P_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_back))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_backActionPerformed
        this.setVisible(false);
        parent.setVisible(true);
    }//GEN-LAST:event_B_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_back;
    private javax.swing.JLabel L_back;
    private javax.swing.JLabel L_equity;
    private javax.swing.JPanel P_amount;
    // End of variables declaration//GEN-END:variables
}
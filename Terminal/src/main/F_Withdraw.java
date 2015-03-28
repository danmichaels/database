/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Danya
 */
public class F_Withdraw extends javax.swing.JFrame {

    private F_Menu parent = null;
    private int amount = 0;
    final int limit = 30000;
    /**
     * Creates new form F_Withraw
     */
    public F_Withdraw(F_Menu parent) {
        this.parent = parent;
        initComponents();
        additionalinit();
    }
    
    private void additionalinit(){
        //центрирование окна
        this.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width-this.getWidth())/2, (Toolkit.getDefaultToolkit().getScreenSize().height-this.getHeight())/2);
    }

    public void clear(){
        amount = 0;
        showAmount();
    }
    
    public void showAmount(){
        L_amount.setText("К снятию: "+amount+" руб.");
    }
    
    public void addAmount(int howmuch){
        if (amount+howmuch>limit) {
            JOptionPane.showMessageDialog(this, "Не более 30000 р. за один раз!");
            return;
        }
        amount+=howmuch;
        showAmount();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_withdraw = new javax.swing.JPanel();
        L_r2000 = new javax.swing.JLabel();
        L_back = new javax.swing.JLabel();
        B_accept = new javax.swing.JButton();
        L_accept = new javax.swing.JLabel();
        B_r5000 = new javax.swing.JButton();
        L_amount = new javax.swing.JLabel();
        L_r100 = new javax.swing.JLabel();
        B_back = new javax.swing.JButton();
        L_r5000 = new javax.swing.JLabel();
        B_r500 = new javax.swing.JButton();
        L_r500 = new javax.swing.JLabel();
        B_r2000 = new javax.swing.JButton();
        B_r100 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Снятие наличных");
        setName("F_withdraw"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        P_withdraw.setBackground(new java.awt.Color(215, 214, 214));
        P_withdraw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        L_r2000.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        L_r2000.setText("2000 руб");
        L_r2000.setToolTipText("");

        L_back.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        L_back.setText("Отмена");

        B_accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_acceptActionPerformed(evt);
            }
        });

        L_accept.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        L_accept.setText("Подтвердить");

        B_r5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_r5000ActionPerformed(evt);
            }
        });

        L_amount.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        L_amount.setText("К снятию: "+this.amount+" руб.");

        L_r100.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        L_r100.setText("100 руб");

        B_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_backActionPerformed(evt);
            }
        });

        L_r5000.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        L_r5000.setText("5000 руб");

        B_r500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_r500ActionPerformed(evt);
            }
        });

        L_r500.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        L_r500.setText("500 руб");

        B_r2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_r2000ActionPerformed(evt);
            }
        });

        B_r100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_r100ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_withdrawLayout = new javax.swing.GroupLayout(P_withdraw);
        P_withdraw.setLayout(P_withdrawLayout);
        P_withdrawLayout.setHorizontalGroup(
            P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_withdrawLayout.createSequentialGroup()
                .addGroup(P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_withdrawLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_back, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_accept, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(L_accept)
                            .addComponent(L_back))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_withdrawLayout.createSequentialGroup()
                        .addContainerGap(57, Short.MAX_VALUE)
                        .addComponent(L_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addGroup(P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_r100)
                    .addComponent(L_r500)
                    .addComponent(L_r2000)
                    .addComponent(L_r5000))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(B_r5000, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B_r2000, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(B_r500, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B_r100, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        P_withdrawLayout.setVerticalGroup(
            P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_withdrawLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_r100, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_r100)
                        .addComponent(L_amount)))
                .addGap(40, 40, 40)
                .addGroup(P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_r500, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_r500))
                .addGap(40, 40, 40)
                .addGroup(P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_r2000)
                        .addComponent(L_accept))
                    .addGroup(P_withdrawLayout.createSequentialGroup()
                        .addGroup(P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B_r2000, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_accept, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_r5000, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(P_withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(L_r5000)
                                .addComponent(L_back)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_withdraw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_withdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_backActionPerformed
        this.setVisible(false);
        parent.setVisible(true);
    }//GEN-LAST:event_B_backActionPerformed

    private void B_r100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_r100ActionPerformed
        addAmount(100);
    }//GEN-LAST:event_B_r100ActionPerformed

    private void B_r500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_r500ActionPerformed
        addAmount(500);
    }//GEN-LAST:event_B_r500ActionPerformed

    private void B_r2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_r2000ActionPerformed
        addAmount(2000);
    }//GEN-LAST:event_B_r2000ActionPerformed

    private void B_r5000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_r5000ActionPerformed
        addAmount(5000);
    }//GEN-LAST:event_B_r5000ActionPerformed

    private void B_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_acceptActionPerformed
        if (amount==0) {
            JOptionPane.showMessageDialog(this, "Укажите необходимую сумму!");
            return;
        }
        B_backActionPerformed(evt);
        float commision = DataBase.getInstance().withdraw(amount);
        if (commision>0)
            JOptionPane.showMessageDialog(this, "Пожалуйста, возьмите деньги! Комиссия составила: "+commision+" руб.");
        else JOptionPane.showMessageDialog(this, "Недостаточно средств для совершения операции!");
    }//GEN-LAST:event_B_acceptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_accept;
    private javax.swing.JButton B_back;
    private javax.swing.JButton B_r100;
    private javax.swing.JButton B_r2000;
    private javax.swing.JButton B_r500;
    private javax.swing.JButton B_r5000;
    private javax.swing.JLabel L_accept;
    private javax.swing.JLabel L_amount;
    private javax.swing.JLabel L_back;
    private javax.swing.JLabel L_r100;
    private javax.swing.JLabel L_r2000;
    private javax.swing.JLabel L_r500;
    private javax.swing.JLabel L_r5000;
    private javax.swing.JPanel P_withdraw;
    // End of variables declaration//GEN-END:variables
}

package com.mycompany.swingtictactoe;

import java.awt.Color;
import javax.swing.JButton;

public class Main extends javax.swing.JFrame {
    
    public TicTacToe ticTac;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName());

    public Main() {
        initComponents();
        this.setTitle("Tic-Tac-Toe");
        historic.setEditable(false);
        JButton[] buttons = new JButton[]{casa1, casa2, casa3, casa4, casa5, casa6, casa7, casa8, casa9};
        ticTac = new TicTacToe(this,buttons);
        ticTac.inputNames();
	this.enableNames();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        casa3 = new javax.swing.JButton();
        casa6 = new javax.swing.JButton();
        casa9 = new javax.swing.JButton();
        casa1 = new javax.swing.JButton();
        casa4 = new javax.swing.JButton();
        casa7 = new javax.swing.JButton();
        casa2 = new javax.swing.JButton();
        casa5 = new javax.swing.JButton();
        casa8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblO = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        historic = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        casa3.setFont(new java.awt.Font("monospaced", 0, 36)); // NOI18N
        casa3.addActionListener(this::casa3ActionPerformed);

        casa6.setFont(new java.awt.Font("monospaced", 0, 36)); // NOI18N
        casa6.setBorder(null);
        casa6.addActionListener(this::casa6ActionPerformed);

        casa9.setFont(new java.awt.Font("monospaced", 0, 36)); // NOI18N
        casa9.addActionListener(this::casa9ActionPerformed);

        casa1.setFont(new java.awt.Font("monospaced", 0, 36)); // NOI18N
        casa1.addActionListener(this::casa1ActionPerformed);

        casa4.setFont(new java.awt.Font("monospaced", 0, 36)); // NOI18N
        casa4.addActionListener(this::casa4ActionPerformed);

        casa7.setFont(new java.awt.Font("monospaced", 0, 36)); // NOI18N
        casa7.addActionListener(this::casa7ActionPerformed);

        casa2.setFont(new java.awt.Font("monospaced", 0, 36)); // NOI18N
        casa2.addActionListener(this::casa2ActionPerformed);

        casa5.setFont(new java.awt.Font("monospaced", 0, 36)); // NOI18N
        casa5.addActionListener(this::casa5ActionPerformed);

        casa8.setFont(new java.awt.Font("monospaced", 0, 36)); // NOI18N
        casa8.addActionListener(this::casa8ActionPerformed);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        lblX.setFont(new java.awt.Font("monospaced", 0, 14)); // NOI18N
        lblX.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblX.setText("Jogador 1");
        lblX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("monospaced", 0, 18)); // NOI18N
        jLabel4.setText("X:");

        lblO.setFont(new java.awt.Font("monospaced", 0, 14)); // NOI18N
        lblO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblO.setText("Jogador 2");
        lblO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("monospaced", 0, 18)); // NOI18N
        jLabel5.setText(":O");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(historic)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblX)
                    .addComponent(lblO)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(historic, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casa4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casa7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casa2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casa5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casa8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casa3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casa6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casa9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(casa2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(casa5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(casa8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(casa3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(casa6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(casa9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casa1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(casa4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(casa7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa1ActionPerformed
        if (casa1.getText().isEmpty()) {
            if (ticTac.playerTurn() % 2 == 0) {
                casa1.setForeground(Color.RED);
                casa1.setText("X");
            } else {
                casa1.setForeground(Color.BLUE);
                casa1.setText("O");
            }
            ticTac.showMessage(historic,1, casa1);
            ticTac.play();
        }
    }//GEN-LAST:event_casa1ActionPerformed

    private void casa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa2ActionPerformed
        if (casa2.getText().isEmpty()) {
            if (ticTac.playerTurn() % 2 == 0) {
                casa2.setForeground(Color.RED);
                casa2.setText("X");
            } else {
                casa2.setForeground(Color.BLUE);
                casa2.setText("O");
            }
            ticTac.showMessage(historic,2, casa2);
            ticTac.play();
        }
    }//GEN-LAST:event_casa2ActionPerformed

    private void casa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa3ActionPerformed
        if (casa3.getText().isEmpty()) {
            if (ticTac.playerTurn() % 2 == 0) {
                casa3.setForeground(Color.RED);
                casa3.setText("X");
            } else {
                casa3.setForeground(Color.BLUE);
                casa3.setText("O");
            }
            ticTac.showMessage(historic,3, casa3);
            ticTac.play();     
        }
    }//GEN-LAST:event_casa3ActionPerformed

    private void casa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa4ActionPerformed
       if (casa4.getText().isEmpty()) {
            if (ticTac.playerTurn() % 2 == 0) {
                casa4.setForeground(Color.RED);
                casa4.setText("X");
            } else {
                casa4.setForeground(Color.BLUE);
                casa4.setText("O");
            }
            ticTac.showMessage(historic,4, casa4);
            ticTac.play();
        }
    }//GEN-LAST:event_casa4ActionPerformed

    private void casa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa5ActionPerformed
        if (casa5.getText().isEmpty()) {
            if (ticTac.playerTurn() % 2 == 0) {
                casa5.setForeground(Color.RED);
                casa5.setText("X");
            } else {
                casa5.setForeground(Color.BLUE);
                casa5.setText("O");
            }
            ticTac.showMessage(historic,5, casa5);
            ticTac.play();
        }
    }//GEN-LAST:event_casa5ActionPerformed

    private void casa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa6ActionPerformed
        if (casa6.getText().isEmpty()) {
            if (ticTac.playerTurn() % 2 == 0) {
                casa6.setForeground(Color.RED);
                casa6.setText("X");
            } else {
                casa6.setForeground(Color.BLUE);
                casa6.setText("O");
            }
            ticTac.showMessage(historic,6, casa6);
            ticTac.play();
        }
    }//GEN-LAST:event_casa6ActionPerformed

    private void casa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa7ActionPerformed
       if (casa7.getText().isEmpty()) {
            if (ticTac.playerTurn() % 2 == 0) {
                casa7.setForeground(Color.RED);
                casa7.setText("X");
            } else {
                casa7.setForeground(Color.BLUE);
                casa7.setText("O");
            }
            ticTac.showMessage(historic,7, casa7);
            ticTac.play();
        }
    }//GEN-LAST:event_casa7ActionPerformed

    private void casa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa8ActionPerformed
        if (casa8.getText().isEmpty()) {
            if (ticTac.playerTurn() % 2 == 0) {
                casa8.setForeground(Color.RED);
                casa8.setText("X");
            } else {
                casa8.setForeground(Color.BLUE);
                casa8.setText("O");
            }
            ticTac.showMessage(historic,8, casa8);
            ticTac.play();
        }
    }//GEN-LAST:event_casa8ActionPerformed

    private void casa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa9ActionPerformed
        if (casa9.getText().isEmpty()) {
            if (ticTac.playerTurn() % 2 == 0) {
                casa9.setForeground(Color.RED);
                casa9.setText("X");
            } else {
                casa9.setForeground(Color.BLUE);
                casa9.setText("O");
            }
            ticTac.showMessage(historic,9, casa9);
            ticTac.play();
        }
    }//GEN-LAST:event_casa9ActionPerformed

   public void enableNames() {
       if (!(ticTac.getPlayerX().isEmpty()) && !(this.ticTac.getPlayerO().isEmpty())) {
	    lblX.setText(ticTac.getPlayerX());
	    lblO.setText(ticTac.getPlayerO());
	}
   }
   
   public void clear() {
       casa1.setText("");
       casa2.setText("");
       casa3.setText("");
       casa4.setText("");
       casa5.setText("");
       casa6.setText("");
       casa7.setText("");
       casa8.setText("");
       casa9.setText("");
       lblX.setText("");
       lblO.setText("");
   }
   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton casa1;
    private javax.swing.JButton casa2;
    private javax.swing.JButton casa3;
    private javax.swing.JButton casa4;
    private javax.swing.JButton casa5;
    private javax.swing.JButton casa6;
    private javax.swing.JButton casa7;
    private javax.swing.JButton casa8;
    private javax.swing.JButton casa9;
    private javax.swing.JTextField historic;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblO;
    private javax.swing.JLabel lblX;
    // End of variables declaration//GEN-END:variables
}

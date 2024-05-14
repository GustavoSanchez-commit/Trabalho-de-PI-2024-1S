
package Main.Telas;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import Main.VerificadorLogin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

public class Libertadores extends javax.swing.JFrame {
    public Libertadores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnjg1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnjg2 = new javax.swing.JButton();
        btnjg3 = new javax.swing.JButton();
        btnjg4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1093, 480));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Campeonato da Libertadores");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/ingreso penxcam.png"))); // NOI18N

        btnjg1.setBackground(new java.awt.Color(102, 255, 102));
        btnjg1.setForeground(new java.awt.Color(0, 0, 0));
        btnjg1.setText("Comprar");
        btnjg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjg1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/ingreso SPxBSC.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/ingreso RIVERxDellValle.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/ingreso BOLIVARxFlamengo.png"))); // NOI18N

        btnjg2.setBackground(new java.awt.Color(102, 255, 102));
        btnjg2.setForeground(new java.awt.Color(0, 0, 0));
        btnjg2.setText("Comprar");
        btnjg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjg2ActionPerformed(evt);
            }
        });

        btnjg3.setBackground(new java.awt.Color(102, 255, 102));
        btnjg3.setForeground(new java.awt.Color(0, 0, 0));
        btnjg3.setText("Comprar");
        btnjg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjg3ActionPerformed(evt);
            }
        });

        btnjg4.setBackground(new java.awt.Color(102, 255, 102));
        btnjg4.setForeground(new java.awt.Color(0, 0, 0));
        btnjg4.setText("Comprar");
        btnjg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjg4ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Seus Ingressos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnjg3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnjg2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(972, 972, 972)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnjg1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnjg4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnjg1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnjg4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnjg3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnjg2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1079, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnjg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjg1ActionPerformed
        String[] opcoes = {"Pix", "Cartão", "Boleto"};
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$70,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 5, 14);
            LocalTime horario = LocalTime.of(19, 0);
            Jogos jogo7 = new Jogos(data, horario, "Libertadores", "R$70", "Estadio Campeón del Siglo", "Penãrol", "Atlético Mineiro");
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();
            try {
                if (ConexaoBD.inserirJogo(jogo7, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído com " + opcaoSelecionada + ". Verifique seu ingresso em 'Seus ingressos'");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Brasileirao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }//GEN-LAST:event_btnjg1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
        new TelaEscolherCampeonato().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnjg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjg2ActionPerformed
        String[] opcoes = {"Pix", "Cartão", "Boleto"};
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$65,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 4, 17);
            LocalTime horario = LocalTime.of(19, 30);
            Jogos jogo10 = new Jogos(data, horario, "Libertadores", "R$65", "Hernando Siles Stadium", "Bolivar", "Flamengo");
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();
            try {
                if (ConexaoBD.inserirJogo(jogo10, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído com " + opcaoSelecionada + ". Verifique seu ingresso em 'Seus ingressos'");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Brasileirao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_btnjg2ActionPerformed

    private void btnjg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjg3ActionPerformed
        String[] opcoes = {"Pix", "Cartão", "Boleto"};
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$90,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 5, 29);
            LocalTime horario = LocalTime.of(21, 30);
            Jogos jogo9 = new Jogos(data, horario, "Libertadores", "R$90", "MorumBIS", "São Paulo", "Barcelona S.C");
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();
            try {
                if (ConexaoBD.inserirJogo(jogo9, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído com " + opcaoSelecionada + ". Verifique seu ingresso em 'Seus ingressos'");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Brasileirao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_btnjg3ActionPerformed

    private void btnjg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjg4ActionPerformed
        String[] opcoes = {"Pix", "Cartão", "Boleto"};
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$40,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 5, 29);
            LocalTime horario = LocalTime.of(21, 30);
            Jogos jogo8 = new Jogos(data, horario, "Libertadores", "R$40", "Monumental de Núñez", "River Plate", "Dell Valle");
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();
            try {
                if (ConexaoBD.inserirJogo(jogo8, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído com " + opcaoSelecionada + ". Verifique seu ingresso em 'Seus ingressos'");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Brasileirao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_btnjg4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new TelaSeusIngressos().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Libertadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Libertadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Libertadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Libertadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Libertadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnjg1;
    private javax.swing.JButton btnjg2;
    private javax.swing.JButton btnjg3;
    private javax.swing.JButton btnjg4;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}

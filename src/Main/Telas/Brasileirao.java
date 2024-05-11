package Main.Telas;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import Main.VerificadorLogin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

public class Brasileirao extends javax.swing.JFrame {

    public Brasileirao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnjg1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnjg2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnjg3 = new javax.swing.JButton();
        btnjg4 = new javax.swing.JButton();
        btnjg5 = new javax.swing.JButton();
        btnjg6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        btnjg1.setBackground(new java.awt.Color(102, 255, 102));
        btnjg1.setForeground(new java.awt.Color(0, 0, 0));
        btnjg1.setText("Comprar");
        btnjg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjg1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/Ingresso_palxcor.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/ingreso_frxcor.png"))); // NOI18N

        btnjg2.setBackground(new java.awt.Color(102, 255, 102));
        btnjg2.setForeground(new java.awt.Color(0, 0, 0));
        btnjg2.setText("Comprar");
        btnjg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjg2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Campeonato do Brasileirão");

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

        btnjg5.setBackground(new java.awt.Color(102, 255, 102));
        btnjg5.setForeground(new java.awt.Color(0, 0, 0));
        btnjg5.setText("Comprar");
        btnjg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjg5ActionPerformed(evt);
            }
        });

        btnjg6.setBackground(new java.awt.Color(102, 255, 102));
        btnjg6.setForeground(new java.awt.Color(0, 0, 0));
        btnjg6.setText("Comprar");
        btnjg6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjg6ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/ingreso spxfla.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/ingreso grexcha.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/ingreso braxsp.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/ingreso CAMXCAP.png"))); // NOI18N

        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(btnjg1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(btnjg4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(btnjg5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btnjg2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btnjg3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btnjg6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel9)))
                        .addGap(51, 51, 51))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addGap(75, 75, 75)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnjg1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnjg2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnjg3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnjg4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(74, 74, 74)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnjg5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnjg6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
        new TelaEscolherCampeonato().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnjg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjg1ActionPerformed
        String[] opcoes = {"Pix", "Cartão", "Boleto"};
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$180,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 6, 22);
            LocalTime horario = LocalTime.of(18, 0);
            Jogos jogo1 = new Jogos(data, horario, "Brasileirão", "R$180", "Allianz Parque", "Palmeiras", "Corinthians");

            // Obtém o ID do usuário logado
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();
            

            try {
                if (ConexaoBD.inserirJogo(jogo1, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído com " + opcaoSelecionada + ". Verifique seu ingresso em 'Seus ingressos'");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Brasileirao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnjg1ActionPerformed

    private void btnjg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjg2ActionPerformed
        String[] opcoes = {"Pix", "Cartão", "Boleto"};
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$120,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 6, 5);
            LocalTime horario = LocalTime.of(16, 0);
            Jogos jogo2 = new Jogos(data, horario, "Brasileirão", "R$120", "Neo Química Arena", "Corinthians", "Fortaleza");
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();

            try {
                if (ConexaoBD.inserirJogo(jogo2, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído. Verifique seu ingresso em 'Seus ingressos'");
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
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$80,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 6, 28);
            LocalTime horario = LocalTime.of(18, 30);
            Jogos jogo3 = new Jogos(data, horario, "Brasileirão", "R$80", "Arena do Grêmio", "Grêmio", "Chapecoense");
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();

            try {
                if (ConexaoBD.inserirJogo(jogo3, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído. Verifique seu ingresso em 'Seus ingressos'");
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
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$140,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 7, 2);
            LocalTime horario = LocalTime.of(16, 30);
            Jogos jogo4 = new Jogos(data, horario, "Brasileirão", "R$140", "Morumbis", "São Paulo", "Flamengo");
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();

            try {
                if (ConexaoBD.inserirJogo(jogo4, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído. Verifique seu ingresso em 'Seus ingressos'");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Brasileirao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnjg4ActionPerformed

    private void btnjg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjg5ActionPerformed
        String[] opcoes = {"Pix", "Cartão", "Boleto"};
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$100,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 6, 28);
            LocalTime horario = LocalTime.of(18, 30);
            Jogos jogo5 = new Jogos(data, horario, "Brasileirão", "R$100", "Morumbis", "São Paulo", "Bragantino");
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();

            try {
                if (ConexaoBD.inserirJogo(jogo5, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído. Verifique seu ingresso em 'Seus ingressos'");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Brasileirao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnjg5ActionPerformed

    private void btnjg6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjg6ActionPerformed
        String[] opcoes = {"Pix", "Cartão", "Boleto"};
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$90,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 7, 15);
            LocalTime horario = LocalTime.of(20, 00);
            Jogos jogo6 = new Jogos(data, horario, "Brasileirão", "R$90", "Arena MRV", "Atlético Mineiro", "Athletico Paranaense");
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();

            try {
                if (ConexaoBD.inserirJogo(jogo6, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído. Verifique seu ingresso em 'Seus ingressos'");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Brasileirao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnjg6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Brasileirao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Brasileirao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Brasileirao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Brasileirao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Brasileirao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnjg1;
    private javax.swing.JButton btnjg2;
    private javax.swing.JButton btnjg3;
    private javax.swing.JButton btnjg4;
    private javax.swing.JButton btnjg5;
    private javax.swing.JButton btnjg6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}

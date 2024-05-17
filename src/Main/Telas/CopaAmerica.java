package Main.Telas;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import Main.VerificadorLogin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

public class CopaAmerica extends javax.swing.JFrame {

    public CopaAmerica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnjg1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnjg2 = new javax.swing.JButton();
        btnjg3 = new javax.swing.JButton();
        btnjg4 = new javax.swing.JButton();
        btnjg5 = new javax.swing.JButton();
        btnjg6 = new javax.swing.JButton();

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

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Copa América");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/ingreso BrasilxCostaRica.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Seus Ingressos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/ingreso Argentina x Canada.png"))); // NOI18N

        btnjg1.setBackground(new java.awt.Color(102, 255, 102));
        btnjg1.setForeground(new java.awt.Color(0, 0, 0));
        btnjg1.setText("Comprar");
        btnjg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjg1ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/ingreso PeruXChile.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/ingreso ColombiaxParaguay.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/ingreso EstadosUnidosxMexico.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingressos/ingreso UruguaixBolivia.png"))); // NOI18N

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

        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnjg6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(315, 315, 315)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(29, 29, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btnjg5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnjg6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btnjg1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnjg2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btnjg3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnjg4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(32, 32, 32))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnjg1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnjg2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnjg3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnjg4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnjg5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnjg6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addGap(26, 26, 26))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new TelaSeusIngressos().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnjg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjg1ActionPerformed
        String[] opcoes = {"Pix", "Cartão", "Boleto"};
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$200,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 6, 24);
            LocalTime horario = LocalTime.of(22, 0);
            Jogos jogo11 = new Jogos(data, horario, "Copa América", "R$200", "SoFi Stadium", "Brasil", "Costa Rica");

            // Obtém o ID do usuário logado
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();

            try {
                if (ConexaoBD.inserirJogo(jogo11, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído com " + opcaoSelecionada + ". Verifique seu ingresso em 'Seus ingressos'");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CopaAmerica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnjg1ActionPerformed

    private void btnjg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjg2ActionPerformed
        String[] opcoes = {"Pix", "Cartão", "Boleto"};
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$110,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 6, 24);
            LocalTime horario = LocalTime.of(19, 0);
            Jogos jogo12 = new Jogos(data, horario, "Copa América", "R$110", "NRG Stadium", "Colômbia", "Paraguai");

            // Obtém o ID do usuário logado
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();

            try {
                if (ConexaoBD.inserirJogo(jogo12, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído com " + opcaoSelecionada + ". Verifique seu ingresso em 'Seus ingressos'");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CopaAmerica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnjg2ActionPerformed

    private void btnjg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjg3ActionPerformed
        String[] opcoes = {"Pix", "Cartão", "Boleto"};
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$126,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 6, 21);
            LocalTime horario = LocalTime.of(21, 0);
            Jogos jogo13 = new Jogos(data, horario, "Copa América", "R$126", "AT&T Stadium", "Peru", "Chile");

            // Obtém o ID do usuário logado
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();

            try {
                if (ConexaoBD.inserirJogo(jogo13, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído com " + opcaoSelecionada + ". Verifique seu ingresso em 'Seus ingressos'");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CopaAmerica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnjg3ActionPerformed

    private void btnjg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjg4ActionPerformed
        String[] opcoes = {"Pix", "Cartão", "Boleto"};
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$189,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 6, 20);
            LocalTime horario = LocalTime.of(19, 0);
            Jogos jogo14 = new Jogos(data, horario, "Copa América", "R$189", "Mercedes-Benz Stadium", "Argentina", "Canadá");

            // Obtém o ID do usuário logado
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();

            try {
                if (ConexaoBD.inserirJogo(jogo14, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído com " + opcaoSelecionada + ". Verifique seu ingresso em 'Seus ingressos'");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CopaAmerica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnjg4ActionPerformed

    private void btnjg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjg5ActionPerformed
        String[] opcoes = {"Pix", "Cartão", "Boleto"};
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$180,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 6, 23);
            LocalTime horario = LocalTime.of(19, 0);
            Jogos jogo15 = new Jogos(data, horario, "Copa América", "R$180", "Mercedes-Benz Stadium", "Estados Unidos", "México");

            // Obtém o ID do usuário logado
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();

            try {
                if (ConexaoBD.inserirJogo(jogo15, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído com " + opcaoSelecionada + ". Verifique seu ingresso em 'Seus ingressos'");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CopaAmerica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnjg5ActionPerformed

    private void btnjg6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjg6ActionPerformed
        String[] opcoes = {"Pix", "Cartão", "Boleto"};
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Valor R$156,00 \n Selecione o método de pagamento:", "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (opcaoSelecionada != null) {
            LocalDate data = LocalDate.of(2024, 6, 27);
            LocalTime horario = LocalTime.of(18, 0);
            Jogos jogo16 = new Jogos(data, horario, "Copa América", "R$159", "Mercedes-Benz Stadium", "Uruguai", "Bolívia");

            // Obtém o ID do usuário logado
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();

            try {
                if (ConexaoBD.inserirJogo(jogo16, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Pagamento Concluído com " + opcaoSelecionada + ". Verifique seu ingresso em 'Seus ingressos'");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CopaAmerica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnjg6ActionPerformed
    
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
            java.util.logging.Logger.getLogger(CopaAmerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CopaAmerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CopaAmerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CopaAmerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CopaAmerica().setVisible(true);
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
    private javax.swing.JButton jButton2;
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

package View;

import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTelaLogin = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        btCadastrarUsuario = new javax.swing.JButton();
        btEntrar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        btAjudaSenha = new javax.swing.JButton();
        btAjudaLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIBLIOTECH - VERSÃO 1.0");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frLogin"); // NOI18N
        setPreferredSize(new java.awt.Dimension(636, 405));
        setResizable(false);
        getContentPane().setLayout(null);

        lblTelaLogin.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
        lblTelaLogin.setForeground(new java.awt.Color(64, 121, 160));
        lblTelaLogin.setText("Tela de Login");
        getContentPane().add(lblTelaLogin);
        lblTelaLogin.setBounds(20, 20, 280, 62);

        lblLogin.setBackground(new java.awt.Color(255, 255, 255));
        lblLogin.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(64, 121, 160));
        lblLogin.setText("Login:");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(40, 150, 80, 30);

        lblSenha.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(64, 121, 160));
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(40, 210, 70, 30);
        getContentPane().add(tfLogin);
        tfLogin.setBounds(120, 150, 182, 30);
        getContentPane().add(tfSenha);
        tfSenha.setBounds(120, 210, 182, 30);

        btCadastrarUsuario.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btCadastrarUsuario.setForeground(new java.awt.Color(64, 121, 160));
        btCadastrarUsuario.setText("Esqueceu a senha");
        btCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrarUsuario);
        btCadastrarUsuario.setBounds(220, 300, 310, 40);

        btEntrar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(64, 121, 160));
        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btEntrar);
        btEntrar.setBounds(20, 300, 190, 40);

        btSair.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btSair.setForeground(new java.awt.Color(64, 121, 160));
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair);
        btSair.setBounds(540, 300, 70, 40);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo_menor.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(480, 20, 120, 146);

        btAjudaSenha.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btAjudaSenha.setForeground(new java.awt.Color(64, 121, 160));
        btAjudaSenha.setText("?");
        btAjudaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAjudaSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btAjudaSenha);
        btAjudaSenha.setBounds(310, 210, 41, 30);

        btAjudaLogin.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btAjudaLogin.setForeground(new java.awt.Color(64, 121, 160));
        btAjudaLogin.setText("?");
        btAjudaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAjudaLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btAjudaLogin);
        btAjudaLogin.setBounds(310, 150, 41, 30);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btAjudaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAjudaLoginActionPerformed
        JOptionPane.showMessageDialog(null, "Informe o CPF cadastrado para realizar o login! (apenas números).");
    }//GEN-LAST:event_btAjudaLoginActionPerformed

    private void btAjudaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAjudaSenhaActionPerformed
        JOptionPane.showMessageDialog(null, "Informe a senha cadastrada para realizar o login (apenas números).");
    }//GEN-LAST:event_btAjudaSenhaActionPerformed

    private void btCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarUsuarioActionPerformed
       JOptionPane.showMessageDialog(null, "Para alteração de senha um e-mail deve ser enviado para suporte_bibliotech@gmail.com\nEm até 48h sua senha será alterada e enviada por e-mail.\nMas que tal uma dica?\nAnote suas senhas!");
    }//GEN-LAST:event_btCadastrarUsuarioActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        dispose();
        new TelaMenuPrincipalAdm().setVisible(true);
        //new TelaMenuPrincipalUser().setVisible(true);
    }//GEN-LAST:event_btEntrarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAjudaLogin;
    private javax.swing.JButton btAjudaSenha;
    private javax.swing.JButton btCadastrarUsuario;
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTelaLogin;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables
}

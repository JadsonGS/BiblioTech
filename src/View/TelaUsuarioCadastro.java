package View;

import Model.Usuario;
import Controller.Conexao;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaUsuarioCadastro extends javax.swing.JFrame {
    
    public TelaUsuarioCadastro() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfSenha = new javax.swing.JPasswordField();
        tfNome = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        lblCadastroUsuario = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        lblSenha = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btDeletar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        lblTelefone = new javax.swing.JLabel();
        tfCPF = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        btAlterar = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Usuários");
        setPreferredSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(tfSenha);
        tfSenha.setBounds(210, 170, 250, 20);
        getContentPane().add(tfNome);
        tfNome.setBounds(210, 210, 250, 20);
        getContentPane().add(tfEmail);
        tfEmail.setBounds(210, 250, 250, 20);
        getContentPane().add(tfTelefone);
        tfTelefone.setBounds(210, 290, 100, 20);

        lblCadastroUsuario.setBackground(new java.awt.Color(64, 121, 160));
        lblCadastroUsuario.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
        lblCadastroUsuario.setForeground(new java.awt.Color(64, 121, 160));
        lblCadastroUsuario.setText("Cadastro de Usuários");
        getContentPane().add(lblCadastroUsuario);
        lblCadastroUsuario.setBounds(30, 30, 407, 62);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo_menor.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(750, 30, 115, 146);

        lblCPF.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(64, 121, 160));
        lblCPF.setText("CPF:");
        getContentPane().add(lblCPF);
        lblCPF.setBounds(70, 120, 49, 32);

        btCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btCadastrar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(64, 121, 160));
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrar);
        btCadastrar.setBounds(60, 410, 120, 40);

        lblSenha.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(64, 121, 160));
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(70, 170, 70, 17);

        lblNome.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblNome.setForeground(new java.awt.Color(64, 121, 160));
        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(70, 210, 70, 17);

        lblEmail.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(64, 121, 160));
        lblEmail.setText("E-mail:");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(70, 240, 80, 32);

        btDeletar.setBackground(new java.awt.Color(255, 255, 255));
        btDeletar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btDeletar.setForeground(new java.awt.Color(64, 121, 160));
        btDeletar.setText("Deletar");
        btDeletar.setMaximumSize(new java.awt.Dimension(200, 500));
        btDeletar.setPreferredSize(new java.awt.Dimension(90, 40));
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btDeletar);
        btDeletar.setBounds(320, 410, 120, 40);

        btSair.setBackground(new java.awt.Color(255, 255, 255));
        btSair.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btSair.setForeground(new java.awt.Color(64, 121, 160));
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair);
        btSair.setBounds(710, 410, 120, 40);

        btVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btVoltar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(64, 121, 160));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar);
        btVoltar.setBounds(580, 410, 120, 40);

        btLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btLimpar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(64, 121, 160));
        btLimpar.setText("Limpar");
        btLimpar.setPreferredSize(new java.awt.Dimension(90, 40));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(190, 410, 120, 40);

        lblTelefone.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(64, 121, 160));
        lblTelefone.setText("Telefone:");
        getContentPane().add(lblTelefone);
        lblTelefone.setBounds(70, 280, 100, 32);
        getContentPane().add(tfCPF);
        tfCPF.setBounds(210, 130, 250, 20);

        lblTipo.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(64, 121, 160));
        lblTipo.setText("Tipo: ");
        getContentPane().add(lblTipo);
        lblTipo.setBounds(70, 330, 60, 30);

        btAlterar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btAlterar.setForeground(new java.awt.Color(64, 121, 160));
        btAlterar.setText("Alterar");
        getContentPane().add(btAlterar);
        btAlterar.setBounds(450, 410, 120, 40);

        cbTipo.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        cbTipo.setForeground(new java.awt.Color(64, 121, 160));
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Usuário", "Caixa" }));
        getContentPane().add(cbTipo);
        cbTipo.setBounds(210, 330, 250, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfCPF.setText("");
        tfSenha.setText("");
        tfNome.setText("");
        tfEmail.setText("");
        tfTelefone.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
       
       dispose();
       new TelaMenuPrincipalAdm().setVisible(true);
        
       /*int tipoUser = cbTipo.getSelectedIndex();
       dispose();
       if (tipoUser == 1) {
           new TelaMenuPrincipalAdm().setVisible(true);
       } else if (tipoUser == 2) {
           new TelaMenuPrincipalUser().setVisible(true);
       } else {
           JOptionPane.showMessageDialog(null, "Tipo de usuário inválido - Entre em contato com o Administrador do Sistema.");
       }*/
       
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");
    }//GEN-LAST:event_btDeletarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadastroUsuario;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}

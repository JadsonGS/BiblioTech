package View;

import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaCadastroLivro extends javax.swing.JFrame {
    
    public TelaCadastroLivro() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfAutor = new javax.swing.JPasswordField();
        tfGenero = new javax.swing.JTextField();
        tfExemplares = new javax.swing.JTextField();
        tfNumPaginas = new javax.swing.JTextField();
        lblCadastroLivro = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        lblAutor = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblExemplares = new javax.swing.JLabel();
        btDeletar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        lblNumPaginas = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Livros");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(tfAutor);
        tfAutor.setBounds(220, 200, 250, 20);
        getContentPane().add(tfGenero);
        tfGenero.setBounds(220, 240, 250, 20);
        getContentPane().add(tfExemplares);
        tfExemplares.setBounds(220, 280, 60, 20);
        getContentPane().add(tfNumPaginas);
        tfNumPaginas.setBounds(220, 320, 60, 20);

        lblCadastroLivro.setBackground(new java.awt.Color(64, 121, 160));
        lblCadastroLivro.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
        lblCadastroLivro.setForeground(new java.awt.Color(64, 121, 160));
        lblCadastroLivro.setText("Cadastro de Livros");
        getContentPane().add(lblCadastroLivro);
        lblCadastroLivro.setBounds(24, 36, 360, 62);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo_menor.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(770, 30, 115, 146);

        lblTitulo.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(64, 121, 160));
        lblTitulo.setText("Título:");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(70, 150, 70, 32);

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
        btCadastrar.setBounds(70, 410, 120, 40);

        lblAutor.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(64, 121, 160));
        lblAutor.setText("Autor:");
        getContentPane().add(lblAutor);
        lblAutor.setBounds(70, 200, 70, 17);

        lblGenero.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(64, 121, 160));
        lblGenero.setText("Gênero:");
        getContentPane().add(lblGenero);
        lblGenero.setBounds(70, 240, 80, 17);

        lblExemplares.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblExemplares.setForeground(new java.awt.Color(64, 121, 160));
        lblExemplares.setText("Exemplares:");
        getContentPane().add(lblExemplares);
        lblExemplares.setBounds(70, 270, 130, 32);

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
        btDeletar.setBounds(330, 410, 120, 40);

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
        btSair.setBounds(720, 410, 120, 40);

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
        btVoltar.setBounds(590, 410, 120, 40);

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
        btLimpar.setBounds(200, 410, 120, 40);

        lblNumPaginas.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblNumPaginas.setForeground(new java.awt.Color(64, 121, 160));
        lblNumPaginas.setText("Nº de Páginas: ");
        getContentPane().add(lblNumPaginas);
        lblNumPaginas.setBounds(70, 310, 160, 32);
        getContentPane().add(tfTitulo);
        tfTitulo.setBounds(220, 160, 250, 20);

        btAlterar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btAlterar.setForeground(new java.awt.Color(64, 121, 160));
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btAlterar);
        btAlterar.setBounds(460, 410, 120, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        
        int userTipo = 0;
        dispose();
        if (userTipo == 1) {
            new TelaMenuPrincipalAdm().setVisible(true);
        } else if (userTipo == 2) {
            new TelaMenuPrincipalAdm().setVisible(true);
        } else if (userTipo == 3) {
            new TelaMenuPrincipalCaixa().setVisible(true);
        }
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfTitulo.setText("");
        tfAutor.setText("");
        tfGenero.setText("");
        tfExemplares.setText("");
        tfNumPaginas.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        JOptionPane.showMessageDialog(null, "Livro deletado com sucesso!");
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        JOptionPane.showMessageDialog(null, "Livro alterado com sucesso!");
    }//GEN-LAST:event_btAlterarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCadastroLivro;
    private javax.swing.JLabel lblExemplares;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNumPaginas;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField tfAutor;
    private javax.swing.JTextField tfExemplares;
    private javax.swing.JTextField tfGenero;
    private javax.swing.JTextField tfNumPaginas;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}

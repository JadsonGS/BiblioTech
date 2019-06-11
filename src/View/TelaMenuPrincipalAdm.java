package View;

import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaMenuPrincipalAdm extends javax.swing.JFrame {

    public TelaMenuPrincipalAdm() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ifrInformacoes = new javax.swing.JInternalFrame();
        btVoltarInf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaGuia = new javax.swing.JTextArea();
        btGuia = new javax.swing.JButton();
        lblDescricao = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        btConsultarEmprestimos = new javax.swing.JButton();
        btCadastrarUsuario = new javax.swing.JButton();
        btCadastrarLivro = new javax.swing.JButton();
        btLogoff = new javax.swing.JButton();
        btInformacoes = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setName("frMenu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(950, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        ifrInformacoes.setBackground(new java.awt.Color(255, 255, 255));
        ifrInformacoes.setTitle("Informações do Sistema");
        ifrInformacoes.setPreferredSize(new java.awt.Dimension(600, 650));
        ifrInformacoes.setVisible(false);
        ifrInformacoes.getContentPane().setLayout(null);

        btVoltarInf.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btVoltarInf.setForeground(new java.awt.Color(64, 121, 160));
        btVoltarInf.setText("Voltar");
        btVoltarInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarInfActionPerformed(evt);
            }
        });
        ifrInformacoes.getContentPane().add(btVoltarInf);
        btVoltarInf.setBounds(380, 340, 140, 40);

        txaGuia.setColumns(20);
        txaGuia.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txaGuia.setForeground(new java.awt.Color(64, 121, 160));
        txaGuia.setRows(5);
        txaGuia.setText("Olá! \nBem vindo ao Guia de Uso do Sistema de Gerenciamento de Bibliotecas, ou como gostamos de chama-lo: BiblioTech. \n\nFunções do Sistema:\n\n1 - Cadastrar Usuário: Cadastrar usuários, salvando dados específicos e gerando acesso ao sistema. A tela\nainda permite alterar e deletar dados.\n2 - Cadastrar Livros: Cadastrar livros, salvando dados específicos sobre cada obra/exemplar. A tela ainda \npermite alterar e deletar dados.\n3 - Consultar/Editar Empréstimos: Verificar status de empréstimos, atualizar situações, aplicar multas. Além\nde permitir alteração dos dados.\n4 - Guia do Usuário: Tela com instruções ao usuário.\n5 - Informações do Sistema: Resumo de informações sobre o desenvolvimento do sistema.");
        jScrollPane1.setViewportView(txaGuia);

        ifrInformacoes.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 10, 900, 330);

        getContentPane().add(ifrInformacoes);
        ifrInformacoes.setBounds(0, 90, 910, 410);

        btGuia.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btGuia.setForeground(new java.awt.Color(64, 121, 160));
        btGuia.setText("Guia do Usuário");
        btGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuiaActionPerformed(evt);
            }
        });
        getContentPane().add(btGuia);
        btGuia.setBounds(480, 320, 320, 70);

        lblDescricao.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(64, 121, 160));
        lblDescricao.setText("Bem vindo! Escolha a opção desejada abaixo:");
        getContentPane().add(lblDescricao);
        lblDescricao.setBounds(20, 90, 720, 32);

        lblMenu.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(64, 121, 160));
        lblMenu.setText("Menu Principal");
        getContentPane().add(lblMenu);
        lblMenu.setBounds(10, 30, 291, 62);

        btConsultarEmprestimos.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btConsultarEmprestimos.setForeground(new java.awt.Color(64, 121, 160));
        btConsultarEmprestimos.setText("Consultar/Editar Empréstimos");
        btConsultarEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarEmprestimosActionPerformed(evt);
            }
        });
        getContentPane().add(btConsultarEmprestimos);
        btConsultarEmprestimos.setBounds(90, 320, 320, 70);

        btCadastrarUsuario.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btCadastrarUsuario.setForeground(new java.awt.Color(64, 121, 160));
        btCadastrarUsuario.setText("Cadastrar Usuário");
        btCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrarUsuario);
        btCadastrarUsuario.setBounds(90, 200, 320, 70);

        btCadastrarLivro.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btCadastrarLivro.setForeground(new java.awt.Color(64, 121, 160));
        btCadastrarLivro.setText("Cadastrar Livro");
        btCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarLivroActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrarLivro);
        btCadastrarLivro.setBounds(480, 200, 320, 70);

        btLogoff.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btLogoff.setForeground(new java.awt.Color(64, 121, 160));
        btLogoff.setText("Logoff");
        btLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoffActionPerformed(evt);
            }
        });
        getContentPane().add(btLogoff);
        btLogoff.setBounds(700, 550, 100, 40);

        btInformacoes.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btInformacoes.setForeground(new java.awt.Color(64, 121, 160));
        btInformacoes.setText("Informações do Sistema");
        btInformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInformacoesActionPerformed(evt);
            }
        });
        getContentPane().add(btInformacoes);
        btInformacoes.setBounds(290, 440, 320, 70);

        btSair.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btSair.setForeground(new java.awt.Color(64, 121, 160));
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair);
        btSair.setBounds(810, 550, 80, 40);

        lblLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo_menor.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(760, 10, 120, 160);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoffActionPerformed
       dispose();
       new TelaLogin().setVisible(true);
    }//GEN-LAST:event_btLogoffActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInformacoesActionPerformed
        JOptionPane.showMessageDialog(null,"Equipe de Desenvolvimento: Guilherme Macedo do Amaral e Jadson Gabriel\nOrientador do Projeto: Giuliano Bertoti\nProjeto da disciplina de Engenharia de Software III realizado no primeiro semestre do ano de 2019\n\nVersão 1.0 - BiblioTech");
    }//GEN-LAST:event_btInformacoesActionPerformed

    private void btVoltarInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarInfActionPerformed
        ifrInformacoes.setVisible(false);
        btCadastrarLivro.setVisible(true);
        btCadastrarUsuario.setVisible(true);
        btConsultarEmprestimos.setVisible(true);
        btInformacoes.setVisible(true);
        btGuia.setVisible(true);
    }//GEN-LAST:event_btVoltarInfActionPerformed

    private void btCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarUsuarioActionPerformed
        dispose();
        new TelaUsuarioCadastro().setVisible(true);
    }//GEN-LAST:event_btCadastrarUsuarioActionPerformed

    private void btCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarLivroActionPerformed
        dispose();
        new TelaCadastroLivro().setVisible(true);
    }//GEN-LAST:event_btCadastrarLivroActionPerformed

    private void btGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuiaActionPerformed
        ifrInformacoes.setVisible(true);
        btCadastrarLivro.setVisible(false);
        btCadastrarUsuario.setVisible(false);
        btConsultarEmprestimos.setVisible(false);
        btInformacoes.setVisible(false);
        btGuia.setVisible(false);
    }//GEN-LAST:event_btGuiaActionPerformed

    private void btConsultarEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarEmprestimosActionPerformed
        dispose();
        new TelaEmprestimo().setVisible(true);
    }//GEN-LAST:event_btConsultarEmprestimosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarLivro;
    private javax.swing.JButton btCadastrarUsuario;
    private javax.swing.JButton btConsultarEmprestimos;
    private javax.swing.JButton btGuia;
    private javax.swing.JButton btInformacoes;
    private javax.swing.JButton btLogoff;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVoltarInf;
    private javax.swing.JInternalFrame ifrInformacoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JTextArea txaGuia;
    // End of variables declaration//GEN-END:variables
}

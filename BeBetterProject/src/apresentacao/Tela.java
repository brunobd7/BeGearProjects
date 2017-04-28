/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTela = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCadastroAlunos = new javax.swing.JMenuItem();
        mnuCadastroProfessores = new javax.swing.JMenuItem();
        mnuCadastroTreinos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuListarAlunos = new javax.swing.JMenuItem();
        mnuListarProfessores = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SysTrabson Training");

        javax.swing.GroupLayout pnlTelaLayout = new javax.swing.GroupLayout(pnlTela);
        pnlTela.setLayout(pnlTelaLayout);
        pnlTelaLayout.setHorizontalGroup(
            pnlTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnlTelaLayout.setVerticalGroup(
            pnlTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        mnuCadastroAlunos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuCadastroAlunos.setText("Alunos");
        mnuCadastroAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroAlunosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCadastroAlunos);

        mnuCadastroProfessores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mnuCadastroProfessores.setText("Professores");
        mnuCadastroProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroProfessoresActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCadastroProfessores);

        mnuCadastroTreinos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        mnuCadastroTreinos.setText("Treinos");
        mnuCadastroTreinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroTreinosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCadastroTreinos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatorios");

        mnuListarAlunos.setText("Lista de Alunos");
        mnuListarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListarAlunosActionPerformed(evt);
            }
        });
        jMenu2.add(mnuListarAlunos);

        mnuListarProfessores.setText("Lista de Professores");
        jMenu2.add(mnuListarProfessores);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sair");

        mnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        jMenu3.add(mnuSair);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTela)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTela)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        // TODO add your handling code here:
        
        sair();
    }//GEN-LAST:event_mnuSairActionPerformed

    private void mnuCadastroAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroAlunosActionPerformed
        // TODO add your handling code here:
        
        try {
            
            CadastroAlunos janela = new CadastroAlunos();
            
            this.pnlTela.add(janela);
            janela.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_mnuCadastroAlunosActionPerformed

    private void mnuCadastroProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroProfessoresActionPerformed
        // TODO add your handling code here:
        
        try {
            
            //INSTACIANDO OBJETO JANELA DO TIPO CADASTROPRFESSOR
            //PERMITINDO ABRINDO A JANELA 
            CadastroProfessor janela = new CadastroProfessor();
            
            this.pnlTela.add(janela);
            janela.setVisible(true);
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_mnuCadastroProfessoresActionPerformed

    private void mnuListarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListarAlunosActionPerformed
        // TODO add your handling code here:
        try {
            
            PesquisaAlunos janela = new PesquisaAlunos();
            this.pnlTela.add(janela);
            janela.setVisible(true);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_mnuListarAlunosActionPerformed

    private void mnuCadastroTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroTreinosActionPerformed
        // TODO add your handling code here:
        
        try {
            CadastroTreino janela = new CadastroTreino();
            this.pnlTela.add(janela);
            janela.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_mnuCadastroTreinosActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuCadastroAlunos;
    private javax.swing.JMenuItem mnuCadastroProfessores;
    private javax.swing.JMenuItem mnuCadastroTreinos;
    private javax.swing.JMenuItem mnuListarAlunos;
    private javax.swing.JMenuItem mnuListarProfessores;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JDesktopPane pnlTela;
    // End of variables declaration//GEN-END:variables

    private void sair() {
        int resposta = JOptionPane.showConfirmDialog(null,
            "Tem certeza que deseja a saída do Sistema", "SysTrabson", 
            JOptionPane.YES_NO_OPTION);
        
        if(resposta == JOptionPane.YES_OPTION){
            System.exit(0);
        }
            
    }
}

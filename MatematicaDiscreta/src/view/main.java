/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.Conjunto;
import model.Elemento;

/**
 *
 * @author Aluno
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblArquivo = new javax.swing.JLabel();
        jbArquivo = new javax.swing.JButton();
        jtfArquivo = new javax.swing.JTextField();
        jbConjuntos = new javax.swing.JButton();
        jbElementos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jbContidoOuIgual = new javax.swing.JButton();
        lbNaoContidoOuIgual = new javax.swing.JButton();
        lbContidoPropriamente = new javax.swing.JButton();
        lbNaoContidoPropriamente = new javax.swing.JButton();
        jbUniao = new javax.swing.JButton();
        jbIntersecao = new javax.swing.JButton();
        lbProdutoCartesiano = new javax.swing.JButton();
        lblOperacoes = new javax.swing.JLabel();
        jbPertence = new javax.swing.JButton();
        jbNaoPertence = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jlblArquivo.setText("Arquivo:");

        jbArquivo.setText("Pesquisar...");
        jbArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArquivoActionPerformed(evt);
            }
        });

        jtfArquivo.setEnabled(false);
        jtfArquivo.setName(""); // NOI18N
        jtfArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfArquivoActionPerformed(evt);
            }
        });

        jbConjuntos.setText("Conjuntos");

        jbElementos.setText("Elementos");

        jbContidoOuIgual.setText("⊆");

        lbNaoContidoOuIgual.setText("!⊆");

        lbContidoPropriamente.setText("⊂");

        lbNaoContidoPropriamente.setText("!⊂");

        jbUniao.setText("∪");

        jbIntersecao.setText("∩");

        lbProdutoCartesiano.setText("×");

        lblOperacoes.setText("Operações:");

        jbPertence.setText("∈");

        jbNaoPertence.setText("!∈");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbContidoOuIgual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNaoContidoOuIgual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbIntersecao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbContidoPropriamente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNaoContidoPropriamente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbProdutoCartesiano))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbPertence)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOperacoes)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbNaoPertence)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbUniao)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOperacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPertence)
                    .addComponent(jbNaoPertence)
                    .addComponent(jbUniao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbContidoOuIgual)
                    .addComponent(lbNaoContidoOuIgual)
                    .addComponent(jbIntersecao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbContidoPropriamente)
                    .addComponent(lbNaoContidoPropriamente)
                    .addComponent(lbProdutoCartesiano)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblArquivo)
                        .addGap(18, 18, 18)
                        .addComponent(jbArquivo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbElementos)
                            .addComponent(jbConjuntos))
                        .addGap(46, 46, 46)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblArquivo)
                    .addComponent(jbArquivo)
                    .addComponent(jtfArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbConjuntos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbElementos)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArquivoActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Filtro .txt", "txt"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.showOpenDialog(this);

        File txtFileLer = new File(fileChooser.getSelectedFile().getAbsolutePath());
        jtfArquivo.setText(txtFileLer.getName());

        ArrayList<Conjunto> conjuntos = new ArrayList<>();
        ArrayList<Elemento> elementos = new ArrayList<>();

        try {
            FileReader arq = new FileReader(txtFileLer);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();

            Pattern acharConjunto = Pattern.compile("[A-Z]");
            Pattern acharElemento = Pattern.compile("([a-z])");
            Pattern numero = Pattern.compile("\\d");

            while (linha != null) {
                Matcher acharConjuntoMatcher = acharConjunto.matcher(linha);
                Matcher acharElementoMatcher = acharElemento.matcher(linha);
                Matcher numeroMatcher = numero.matcher(linha);

                System.out.print("\n");
                if (acharConjuntoMatcher.find()) {
                    System.out.print("conjunto -> ");
                    //lnha de conjunto
                    while (numeroMatcher.find()) {
                        String value = numeroMatcher.group();
                        System.out.print(value);
                    }
                }

                if (acharElementoMatcher.find()) {
                    System.out.print("elemento -> ");
                    //linha de elemento
                    while (numeroMatcher.find()) {
                        String value = numeroMatcher.group();
                        System.out.print(value);
                    }
                }

                linha = lerArq.readLine(); // lê da segunda até a última linha
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        System.out.println();
    }//GEN-LAST:event_jbArquivoActionPerformed

    private void jtfArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfArquivoActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbArquivo;
    private javax.swing.JButton jbConjuntos;
    private javax.swing.JButton jbContidoOuIgual;
    private javax.swing.JButton jbElementos;
    private javax.swing.JButton jbIntersecao;
    private javax.swing.JButton jbNaoPertence;
    private javax.swing.JButton jbPertence;
    private javax.swing.JButton jbUniao;
    private javax.swing.JLabel jlblArquivo;
    private javax.swing.JTextField jtfArquivo;
    private javax.swing.JButton lbContidoPropriamente;
    private javax.swing.JButton lbNaoContidoOuIgual;
    private javax.swing.JButton lbNaoContidoPropriamente;
    private javax.swing.JButton lbProdutoCartesiano;
    private javax.swing.JLabel lblOperacoes;
    // End of variables declaration//GEN-END:variables
}
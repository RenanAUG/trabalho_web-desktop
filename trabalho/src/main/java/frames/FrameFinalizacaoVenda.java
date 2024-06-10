/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import dao.ProdutoDAO;
import java.util.ArrayList;
import javax.swing.SpinnerListModel;
import model.Produto;

/**
 *
 * @author elde rigue
 */
public class FrameFinalizacaoVenda extends javax.swing.JFrame {
    
    public ProdutoDAO produtoDAO = new ProdutoDAO();
    
    public FrameFinalizacaoVenda() {
        initComponents();
        ArrayList<Produto> listaProduto =  produtoDAO.retornaLista("SELECT * FROM produto");
        SpinnerListModel spinnerModel = new SpinnerListModel(listaProduto);
        spSelecionarProduto.setModel(spinnerModel);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        spSelecionarCliente = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        spSelecionarProduto = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spInformarQuantidade = new javax.swing.JSpinner();
        btContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("SELECIONE UM CLIENTE");

        spSelecionarCliente.setModel(new javax.swing.SpinnerListModel(new String[] {"Item 0", "Item 1", "Item 2", "Item 3"}));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("SELECIONE UM PRODUTO");

        spSelecionarProduto.setModel(new javax.swing.SpinnerListModel(new String[] {"Item 0", "Item 1", "Item 2", "Item 3"}));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("INFORME A QUANTIDADE");

        spInformarQuantidade.setModel(new javax.swing.SpinnerNumberModel());

        btContinuar.setText("CONTINUAR");
        btContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                        .addGap(130, 130, 130))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btContinuar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spSelecionarCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spSelecionarProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spInformarQuantidade, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(spSelecionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(spInformarQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btContinuar)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContinuarActionPerformed
        FrameGeracaoRelatorios frameGeracaoRelatorios = new FrameGeracaoRelatorios();
        frameGeracaoRelatorios.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btContinuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btContinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner spInformarQuantidade;
    private javax.swing.JSpinner spSelecionarCliente;
    private javax.swing.JSpinner spSelecionarProduto;
    // End of variables declaration//GEN-END:variables
}

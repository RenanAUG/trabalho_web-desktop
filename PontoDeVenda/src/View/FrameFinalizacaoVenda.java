/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author aluno
 */
public class FrameFinalizacaoVenda extends javax.swing.JFrame {
    

    private final double precoBateria = 250;
    private final double precoJuntasMotor = 120; 
    private final double precoBombaAgua = 200; 
    private final double precoTermostato = 80;
    private final double precoFluidoTransmissao = 100; 
    
    public FrameFinalizacaoVenda() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spSelecionarProduto = new javax.swing.JSpinner();
        spSelecionarCliente = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spInformarQuantidade = new javax.swing.JSpinner();
        btContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spSelecionarProduto.setModel(new javax.swing.SpinnerListModel(new String[] {"Item 0", "Item 1", "Item 2", "Item 3"}));

        spSelecionarCliente.setModel(new javax.swing.SpinnerListModel(new String[] {"Item 0", "Item 1", "Item 2", "Item 3"}));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("SELECIONE UM CLIENTE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("SELECIONE UM PRODUTO");

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
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(spSelecionarCliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                    .addComponent(spSelecionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spInformarQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btContinuar))
                .addGap(0, 344, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spSelecionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spInformarQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btContinuar)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContinuarActionPerformed
       FrameGeracaoRelatorios frameGeracaoRelatorios = new FrameGeracaoRelatorios();
       frameGeracaoRelatorios.setVisible(true);
       
       this.dispose();
    }//GEN-LAST:event_btContinuarActionPerformed

    /**
     * @param args the command line arguments
     */
    
     private void adicionarItem(java.awt.event.ActionEvent evt) {
        String produtoSelecionado = spSelecionarProduto.getValue().toString();
        int quantidade = (int) spInformarQuantidade.getValue();
        double preco = 0;

        switch (produtoSelecionado) {
            case "Bateria":
                preco = precoBateria;
                break;
            case "Juntas do Motor":
                preco = precoJuntasMotor;
                break;
            case "Bomba de Água":
                preco = precoBombaAgua;
                break;
            case "Termostato":
                preco = precoTermostato;
                break;
            case "Fluido de Transmissão":
                preco = precoFluidoTransmissao;
                break;
        }
//         double valorItem = preco * quantidade;
//        itensVenda.add(new ItemVenda(produtoSelecionado, quantidade, valorItem));
//        atualizarItensVenda();
//        valorTotalVenda += valorItem;
//        lblValorTotal.setText(String.format("Valor Total: R$ %.2f", valorTotalVenda));
    }

//    private void atualizarItensVenda() {
//        StringBuilder itens = new StringBuilder();
//        for (ItemVenda item : itensVenda) {
//            itens.append(item.toString()).append("\n");
//        }
//        taItensVenda.setText(itens.toString());
//    }
//
//    private void finalizarVenda(java.awt.event.ActionEvent evt) {
//        
//        String cliente = spSelecionarCliente.getValue().toString();
//        String observacoes = txtObservacoes.getText();
//        Venda venda = new Venda(cliente, itensVenda, valorTotalVenda, observacoes);
//
//        
//        salvarVendaLocal(venda);
//
//        
//        enviarVendaParaAPI(venda);
//
//        JOptionPane.showMessageDialog(this, "Venda finalizada com sucesso!");
//        limparFormulario();
//    }
//
//    private void salvarVendaLocal(Venda venda) {
//        
//    }
//
//    private void enviarVendaParaAPI(Venda venda) {
//        
//    }
//
//    private void limparFormulario() {
//        spSelecionarCliente.setValue("Cliente 1");
//        spSelecionarProduto.set
//     };

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

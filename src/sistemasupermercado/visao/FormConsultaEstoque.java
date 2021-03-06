/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasupermercado.visao;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import sistemasupermercado.dominio.Estoque;
import sistemasupermercado.dominio.Unidade;
import sistemasupermercado.servicos.EstoqueServico;
import sistemasupermercado.visao.tabulacao.IndexedFocusTraversalPolicy;


public class FormConsultaEstoque extends javax.swing.JDialog {

    Estoque estoque;
    
    EstoqueServico estoqueServico;
    
    Unidade unidade;
    
    AtalhoAction acaoF2 = new AtalhoAction("F2");
    /**
     * Creates new form FormConsultaEstoque
     */
    private FormConsultaEstoque(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public FormConsultaEstoque(java.awt.Frame parent, boolean modal, Unidade unidade) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.unidade = unidade;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbPesquisarPor = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta de Estoque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 153, 255))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel1.setText("Pesquisar por:");

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(cmbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tblEstoque.setAutoCreateRowSorter(true);
        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblEstoqueKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblEstoque);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        // TODO add your handling code here:
        preencherTabela(cmbPesquisarPor.getSelectedItem().toString(), txtPesquisa.getText());
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void tblEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEstoqueKeyPressed
        // TODO add your handling code here:
        switch(evt.getKeyCode()) {
            case (KeyEvent.VK_TAB):
                cmbPesquisarPor.requestFocus();
                break;
            case (KeyEvent.VK_F2):
                capturarItemSelecionado();
        }
    }//GEN-LAST:event_tblEstoqueKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        preencherCmbPesquisarPor();
        definirModeloDeTabela();
        preencherTabela("", "");
        registrarAcoesDosAtalhos();
        definirOrdemDeTabulacao();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FormConsultaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConsultaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConsultaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConsultaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormConsultaEstoque dialog = new FormConsultaEstoque(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbPesquisarPor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEstoque;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela(String pesquisarPor, String texto) {
        estoqueServico = new EstoqueServico();
        DefaultTableModel dtm = (DefaultTableModel) tblEstoque.getModel();
        limparTabela();
        try {
            List<Estoque> estoques = estoqueServico.listar(pesquisarPor, texto, unidade.getIdUnidade());
            for (int i = 0; i < estoques.size(); i++) {
                dtm.addRow(new Object[]{""});
                tblEstoque.setValueAt(estoques.get(i).getProduto().getIdProduto().toString(), i, 0);
                tblEstoque.setValueAt(estoques.get(i).getProduto().getDescricao(), i, 1);
                tblEstoque.setValueAt(estoques.get(i).getProduto().getDescricaoReduzida(), i, 2);
                tblEstoque.setValueAt(estoques.get(i).getProduto().getCodigoDeBarras(), i, 3);
                tblEstoque.setValueAt(estoques.get(i).getProduto().getCategoria().toString(), i, 4);
                tblEstoque.setValueAt(estoques.get(i).getQuantidade().toString().replaceAll("\\.", ","), i, 5);
                tblEstoque.setValueAt(estoques.get(i).getValorTotal().toString().replaceAll("\\.", ","), i, 6);
            }
        } catch(RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(), 
                        "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void capturarItemSelecionado() {
        if (tblEstoque.getSelectedRowCount() == 0) return;
        
        estoque = new Estoque();
        estoqueServico = new EstoqueServico();
        estoque.setProduto(Integer.parseInt(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 0).toString()));
        estoque.setUnidade(unidade);
        
        try {
            estoque = estoqueServico.pesquisar(estoque);
            
        } catch(RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(), 
                        "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void preencherCmbPesquisarPor() {
        cmbPesquisarPor.addItem("ID Produto");
        cmbPesquisarPor.addItem("Descrição");
        cmbPesquisarPor.addItem("Descrição reduzida");
        cmbPesquisarPor.addItem("Código de barras");
        cmbPesquisarPor.addItem("Categoria");
    }

    private void definirModeloDeTabela() {
        tblEstoque.setModel(  
            new DefaultTableModel(  
               new Object[] []{ },  
               new String[]{"ID", "Descrição", "Descrição reduzida", "Código de barras", "Categoria", 
                   "Quantidade (UN / KG)", "Valor total (R$)"}
            ) {  

            @Override
            public boolean isCellEditable(int row, int col) {  
                    return false;  
            }  

            }  
         ); 
        
        tblEstoque.getColumnModel().getColumn(0).setPreferredWidth(60);
        tblEstoque.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblEstoque.getColumnModel().getColumn(2).setPreferredWidth(90);
        tblEstoque.getColumnModel().getColumn(3).setPreferredWidth(80);
        tblEstoque.getColumnModel().getColumn(4).setPreferredWidth(70);
        tblEstoque.getColumnModel().getColumn(5).setPreferredWidth(70);
        tblEstoque.getColumnModel().getColumn(6).setPreferredWidth(70);
        tblEstoque.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    private void limparTabela() {
        DefaultTableModel dtm =(DefaultTableModel) tblEstoque.getModel();
        dtm.setRowCount(0);
    }

    private void registrarAcoesDosAtalhos() {
        ActionMap actionMapForm = this.rootPane.getActionMap();
        actionMapForm.put("acaof2", acaoF2);
        rootPane.setActionMap(actionMapForm);
        
        InputMap imapForm = this.rootPane.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
        imapForm.put(KeyStroke.getKeyStroke("F2"), "acaof2");
    }

    private void definirOrdemDeTabulacao() {
        IndexedFocusTraversalPolicy policy = new IndexedFocusTraversalPolicy();
        policy.addIndexedComponent(cmbPesquisarPor);
        policy.addIndexedComponent(txtPesquisa);
        policy.addIndexedComponent(tblEstoque);
        setFocusTraversalPolicy(policy);
    }
    
    /**
     * Classe usada para criar as ações dos atalhos do teclado
     */
    private class AtalhoAction extends AbstractAction {
	private String atalho;

	public AtalhoAction(String atalho)
	{
		super(atalho);
		this.atalho = atalho;
	}
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            capturarItemSelecionado();
        }
    }
}

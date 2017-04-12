/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasupermercado.visao;

import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import sistemasupermercado.dominio.Produto;
import sistemasupermercado.servicos.ProdutoServico;

/**
 *
 * @author Monique
 */
public class FormListaProdutos extends javax.swing.JDialog {

    Produto produto;
    ProdutoServico produtoServico;
    
    AtalhoAction acaoF2 = new AtalhoAction("F2");
    /**
     * Creates new form FormListaProdutos
     */
    public FormListaProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        cmbPesquisarPor = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblF2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 153, 255))); // NOI18N

        jLabel1.setText("Pesquisar por:");

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblProdutosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblF2.setForeground(new java.awt.Color(51, 51, 51));
        lblF2.setText("F2 - Seleciona item");
        jPanel2.add(lblF2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        // TODO add your handling code here:
        preencherTabela(cmbPesquisarPor.getSelectedItem().toString(), txtPesquisa.getText());
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void tblProdutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProdutosKeyPressed
        // TODO add your handling code here:
        if (KeyStroke.getKeyStrokeForEvent(evt) == KeyStroke.getKeyStroke("F2")) {
            setObjetoSelecionado();
            dispose();
        } else if (KeyStroke.getKeyStrokeForEvent(evt) == KeyStroke.getKeyStroke("TAB")) {
            cmbPesquisarPor.requestFocus();
        }
    }//GEN-LAST:event_tblProdutosKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        registrarAcoesDosAtalhos();
        definirModeloDaTabela();
        preencherCmbPesquisaPor();
        preencherTabela("", "");
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormListaProdutos dialog = new FormListaProdutos(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lblF2;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    /**
     * Método que retorna o objeto selecionado na tabela para o formulário de cadastro de produtos.
     * @return 
     */
    public Produto getObjetoSelecionado() {
        return this.produto;
    }
    
    private void setObjetoSelecionado() {
        if (tblProdutos.getSelectedRowCount() == 0) return;
        produto = new Produto();
        int idProduto = Integer.parseInt(tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 0).toString());
        produto.setIdProduto(idProduto);
    }
    
    private void limparTabela() {
        DefaultTableModel dtm = (DefaultTableModel) tblProdutos.getModel();
        dtm.setRowCount(0);
    }
    
    private void registrarAcoesDosAtalhos() {
        ActionMap actionMapForm = this.rootPane.getActionMap();
        actionMapForm.put("acaof2", acaoF2);
        rootPane.setActionMap(actionMapForm);
        
        InputMap imapForm = this.rootPane.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
        imapForm.put(KeyStroke.getKeyStroke("F2"), "acaof2");
    }

    private void preencherTabela(String pesquisarPor, String texto) {
        produtoServico = new ProdutoServico();
        DefaultTableModel dtm = (DefaultTableModel) tblProdutos.getModel();
        limparTabela();
        try {
            List<Produto> produtos = produtoServico.listar(pesquisarPor, texto);
            for (int i = 0; i < produtos.size(); i++) {
                dtm.addRow(new Object[]{""});
                tblProdutos.setValueAt(produtos.get(i).getIdProduto().toString(), i, 0);
                tblProdutos.setValueAt(produtos.get(i).getCodigoDeBarras(), i, 1);
                tblProdutos.setValueAt(produtos.get(i).getDescricao(), i, 2);
                tblProdutos.setValueAt(produtos.get(i).getDescricaoReduzida(), i, 3);
                tblProdutos.setValueAt(produtos.get(i).getCategoria().getDescricao(), i, 4);
                
                String vendaFracionada;
                if (produtos.get(i).isVendaFracionada()) vendaFracionada = "Sim";
                else vendaFracionada = "Não";
                tblProdutos.setValueAt(vendaFracionada, i, 5);
                
                String estocavel;
                if (produtos.get(i).isEstocavel()) estocavel = "Sim";
                else estocavel = "Não";
                tblProdutos.setValueAt(estocavel, i, 6);
            }
        } catch(RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(), 
                        "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void definirModeloDaTabela() {
        tblProdutos.setModel(  
            new DefaultTableModel(
                    new Object[] []{ },
                    new String[]{"ID", "Código de barras", "Descrição", "Descrição reduzida", "Categoria", "Fracionado",
                    "Estocável"}
            ) {
                @Override
                public boolean isCellEditable(int row, int col) {  
                        return false;  
                }
            }
        ); 
        
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(60);
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(200);
        tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(150);
        tblProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(5).setPreferredWidth(50);
        tblProdutos.getColumnModel().getColumn(6).setPreferredWidth(50);
        tblProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private void preencherCmbPesquisaPor() {
        cmbPesquisarPor.addItem("ID");
        cmbPesquisarPor.addItem("Código de barras");
        cmbPesquisarPor.addItem("Descrição");
        cmbPesquisarPor.addItem("Descrição reduzida");
        cmbPesquisarPor.addItem("Categoria");
    }
    
    /**
     * Classe usada para criar as ações dos atalhos do teclado (F1, F2 e F3)
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
            setObjetoSelecionado();
            dispose();
        }
    }
}

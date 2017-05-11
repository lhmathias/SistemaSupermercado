/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasupermercado.visao;

import javax.swing.JOptionPane;
import sistemasupermercado.dominio.Sessao;
import sistemasupermercado.dominio.SessaoCaixa;
import sistemasupermercado.servicos.SessaoCaixaServico;
import sistemasupermercado.servicos.SessaoServico;
/**
 *
 * @author Monique
 */
public class FormMenuPrincipal extends javax.swing.JFrame {

    Sessao sessao; 
    
    SessaoCaixa sessaoCaixa;
    /**
     * Creates new form FormMenuPrincipal
     */
    private FormMenuPrincipal() {
        initComponents();
    }
    
    public FormMenuPrincipal(Sessao sessao) {
        this.sessao = sessao;
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuVenda = new javax.swing.JMenu();
        jMenuItemIniciarCaixa = new javax.swing.JMenuItem();
        jMenuItemRealizarVenda = new javax.swing.JMenuItem();
        jMenuItemFinalizarCaixa = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItemCadastroDeCaixas = new javax.swing.JMenuItem();
        jMenuEstoque = new javax.swing.JMenu();
        jMenuItemRegistrarEntradaProdutos = new javax.swing.JMenuItem();
        jMenuItemRegistrarSaídaProdutos = new javax.swing.JMenuItem();
        jMenuItemConsultaEstoque = new javax.swing.JMenuItem();
        jMenuItemConsultaDeEntradasDeProdutos = new javax.swing.JMenuItem();
        jMenuItemConsultaDeProdutosRetirados = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadastroProdutos = new javax.swing.JMenuItem();
        jMenuItemCadastroPrecos = new javax.swing.JMenuItem();
        jMenuItemCadastroFornecedores = new javax.swing.JMenuItem();
        jMenuItemCadastroCategorias = new javax.swing.JMenuItem();
        jMenuItemCadastroMotivos = new javax.swing.JMenuItem();
        jMenuItemCadastroUsuarios = new javax.swing.JMenuItem();
        jMenuItemCadastroFuncoes = new javax.swing.JMenuItem();
        jMenuConsulta = new javax.swing.JMenu();
        jMenuItemConsultaUsuarios = new javax.swing.JMenuItem();
        jMenuItemConsultaFornecedores = new javax.swing.JMenuItem();
        jMenuItemConsultaProdutos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemEncerrarSessao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marketsoft");
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jMenuVenda.setText("Venda");

        jMenuItemIniciarCaixa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemIniciarCaixa.setText("Abrir Caixa");
        jMenuItemIniciarCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIniciarCaixaActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMenuItemIniciarCaixa);

        jMenuItemRealizarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemRealizarVenda.setText("Realizar Venda");
        jMenuItemRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRealizarVendaActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMenuItemRealizarVenda);

        jMenuItemFinalizarCaixa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemFinalizarCaixa.setText("Fechar Caixa");
        jMenuItemFinalizarCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFinalizarCaixaActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMenuItemFinalizarCaixa);

        jMenuBar1.add(jMenuVenda);

        jMenu1.setText("Caixas");

        jMenuItem4.setText("Observar Caixas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItemCadastroDeCaixas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCadastroDeCaixas.setText("Adicionar Caixas");
        jMenuItemCadastroDeCaixas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroDeCaixasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCadastroDeCaixas);

        jMenuBar1.add(jMenu1);

        jMenuEstoque.setText("Estoque");

        jMenuItemRegistrarEntradaProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemRegistrarEntradaProdutos.setText("Registrar Entrada de Produtos");
        jMenuItemRegistrarEntradaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrarEntradaProdutosActionPerformed(evt);
            }
        });
        jMenuEstoque.add(jMenuItemRegistrarEntradaProdutos);

        jMenuItemRegistrarSaídaProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemRegistrarSaídaProdutos.setText("Registrar Saída de Produtos");
        jMenuItemRegistrarSaídaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrarSaídaProdutosActionPerformed(evt);
            }
        });
        jMenuEstoque.add(jMenuItemRegistrarSaídaProdutos);

        jMenuItemConsultaEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConsultaEstoque.setText("Consulta de Estoque");
        jMenuItemConsultaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaEstoqueActionPerformed(evt);
            }
        });
        jMenuEstoque.add(jMenuItemConsultaEstoque);

        jMenuItemConsultaDeEntradasDeProdutos.setText("Consulta de Entradas de Produtos");
        jMenuItemConsultaDeEntradasDeProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaDeEntradasDeProdutosActionPerformed(evt);
            }
        });
        jMenuEstoque.add(jMenuItemConsultaDeEntradasDeProdutos);

        jMenuItemConsultaDeProdutosRetirados.setText("Consulta de Produtos Retirados de Estoque");
        jMenuItemConsultaDeProdutosRetirados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaDeProdutosRetiradosActionPerformed(evt);
            }
        });
        jMenuEstoque.add(jMenuItemConsultaDeProdutosRetirados);

        jMenuBar1.add(jMenuEstoque);

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadastroProdutos.setText("Cadastro de Produtos");
        jMenuItemCadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroProdutosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroProdutos);

        jMenuItemCadastroPrecos.setText("Cadastro de Preços");
        jMenuItemCadastroPrecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroPrecosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroPrecos);

        jMenuItemCadastroFornecedores.setText("Cadastro de Fornecedores");
        jMenuItemCadastroFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFornecedoresActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroFornecedores);

        jMenuItemCadastroCategorias.setText("Cadastro de Categorias de Produtos");
        jMenuItemCadastroCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroCategoriasActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroCategorias);

        jMenuItemCadastroMotivos.setText("Cadastro de Motivos Retirada de Produtos");
        jMenuItemCadastroMotivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroMotivosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroMotivos);

        jMenuItemCadastroUsuarios.setText("Cadastro de Usuários");
        jMenuItemCadastroUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroUsuariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroUsuarios);

        jMenuItemCadastroFuncoes.setText("Cadastro de Funções");
        jMenuItemCadastroFuncoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFuncoesActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroFuncoes);

        jMenuBar1.add(jMenuCadastro);

        jMenuConsulta.setText("Consulta");

        jMenuItemConsultaUsuarios.setText("Consulta de Usuários");
        jMenuItemConsultaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaUsuariosActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConsultaUsuarios);

        jMenuItemConsultaFornecedores.setText("Consulta de Fornecedores");
        jMenuItemConsultaFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaFornecedoresActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConsultaFornecedores);

        jMenuItemConsultaProdutos.setText("Consulta de Produtos");
        jMenuItemConsultaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaProdutosActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConsultaProdutos);

        jMenuBar1.add(jMenuConsulta);

        jMenu4.setText("Relatórios");

        jMenuItem16.setText("Gerar Relatório de Lucro/Receita");
        jMenu4.add(jMenuItem16);

        jMenuItem17.setText("Gerar Relatório de Saída de Produtos");
        jMenu4.add(jMenuItem17);

        jMenuItem18.setText("Gerar Relatório de Estoque");
        jMenu4.add(jMenuItem18);

        jMenuBar1.add(jMenu4);

        jMenuSair.setText("Sair");

        jMenuItemEncerrarSessao.setText("Encerrar Sessão");
        jMenuItemEncerrarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEncerrarSessaoActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemEncerrarSessao);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRealizarVendaActionPerformed
        // TODO add your handling code here:
        if (sessaoCaixa == null) {
            JOptionPane.showMessageDialog(this, "É necessário abrir o caixa para realizar vendas!", "Caixa aberto", 
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            FormVenda formVenda = new FormVenda(sessaoCaixa);
            formVenda.setVisible(true);
        }
        
    }//GEN-LAST:event_jMenuItemRealizarVendaActionPerformed

    private void jMenuItemRegistrarSaídaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrarSaídaProdutosActionPerformed
        // TODO add your handling code here:
        FormRegistroProdutoRetirado formRegistroProdutoRetirado = new FormRegistroProdutoRetirado(this, true, sessao);
        formRegistroProdutoRetirado.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistrarSaídaProdutosActionPerformed

    private void jMenuItemRegistrarEntradaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrarEntradaProdutosActionPerformed
        // TODO add your handling code here:
        FormRegistroEntradaProduto formRegistroEntradaProduto = new FormRegistroEntradaProduto(this, true, sessao);
        formRegistroEntradaProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistrarEntradaProdutosActionPerformed

    private void jMenuItemCadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroProdutosActionPerformed
        // TODO add your handling code here:
        FormCadastroProduto formCadastroProduto = new FormCadastroProduto(this, true);
        formCadastroProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroProdutosActionPerformed

    private void jMenuItemCadastroPrecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroPrecosActionPerformed
        // TODO add your handling code here:
        //Provisório
        
        FormCadastroPrecoProduto formCadastroPrecoProduto = new FormCadastroPrecoProduto(this, true, sessao.getUsuario().getUnidade());
        
        formCadastroPrecoProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroPrecosActionPerformed

    private void jMenuItemCadastroFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFornecedoresActionPerformed
        // TODO add your handling code here:
        FormCadastroFornecedor formCadastroFornecedor = new FormCadastroFornecedor(this, true);
        formCadastroFornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroFornecedoresActionPerformed

    private void jMenuItemCadastroCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroCategoriasActionPerformed
        // TODO add your handling code here:
        FormCadastroCategoriaProduto formCadastroCategoriaProduto = new FormCadastroCategoriaProduto(this, rootPaneCheckingEnabled);
        formCadastroCategoriaProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroCategoriasActionPerformed

    private void jMenuItemCadastroMotivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroMotivosActionPerformed
        // TODO add your handling code here:
        FormCadastroMotivoProdutoRetirado formCadastroMotivoProdutoRetirado = new FormCadastroMotivoProdutoRetirado(this, true);
        formCadastroMotivoProdutoRetirado.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroMotivosActionPerformed

    private void jMenuItemCadastroUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroUsuariosActionPerformed
        // TODO add your handling code here:
        FormCadastroUsuario formCadastroUsuario = new FormCadastroUsuario(this, true, sessao.getUsuario().getUnidade());
        formCadastroUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroUsuariosActionPerformed

    private void jMenuItemCadastroFuncoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFuncoesActionPerformed
        // TODO add your handling code here:
        FormCadastroFuncao formCadastroFuncao = new FormCadastroFuncao(this, true);
        formCadastroFuncao.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroFuncoesActionPerformed

    private void jMenuItemConsultaFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaFornecedoresActionPerformed
        // TODO add your handling code here:
        FormConsultaFornecedor formConsultaFornecedor = new FormConsultaFornecedor(this, true);
        formConsultaFornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultaFornecedoresActionPerformed

    private void jMenuItemConsultaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaUsuariosActionPerformed
        // TODO add your handling code here:
        FormConsultaUsuario formConsultaUsuario = new FormConsultaUsuario(this, true, sessao.getUsuario().getUnidade());
        formConsultaUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultaUsuariosActionPerformed

    private void jMenuItemConsultaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaProdutosActionPerformed
        // TODO add your handling code here:
        FormConsultaProdutos formConsultaProdutos = new FormConsultaProdutos(this, true, sessao.getUsuario().getUnidade());
        formConsultaProdutos.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultaProdutosActionPerformed

    private void jMenuItemCadastroDeCaixasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroDeCaixasActionPerformed
        // TODO add your handling code here:
        FormCadastroCaixa formCadastroCaixa = new FormCadastroCaixa(this, rootPaneCheckingEnabled, 
                sessao.getUsuario().getUnidade());
        formCadastroCaixa.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroDeCaixasActionPerformed

    private void jMenuItemConsultaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaEstoqueActionPerformed
        // TODO add your handling code here:
        FormConsultaEstoque formConsultaEstoque = new FormConsultaEstoque(this, true, sessao.getUsuario().getUnidade());
        formConsultaEstoque.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultaEstoqueActionPerformed

    private void jMenuItemConsultaDeEntradasDeProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaDeEntradasDeProdutosActionPerformed
        // TODO add your handling code here:
        FormConsultaEntradaDeProdutos form = new FormConsultaEntradaDeProdutos(this, true, sessao);
        form.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemConsultaDeEntradasDeProdutosActionPerformed

    private void jMenuItemConsultaDeProdutosRetiradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaDeProdutosRetiradosActionPerformed
        // TODO add your handling code here:
        FormConsultaProdutosRetirados form = new FormConsultaProdutosRetirados(this, true, sessao);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultaDeProdutosRetiradosActionPerformed

    private void jMenuItemIniciarCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIniciarCaixaActionPerformed
        // TODO add your handling code here:
        if (sessaoCaixa != null)
            JOptionPane.showMessageDialog(this, "O caixa já está aberto!", "Caixa aberto", JOptionPane.INFORMATION_MESSAGE);
        else {
            FormAberturaDeCaixa form = new FormAberturaDeCaixa(this, true, sessao);
            form.setVisible(true);
            sessaoCaixa = form.getSessaoCaixa();
        }
    }//GEN-LAST:event_jMenuItemIniciarCaixaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        SessaoCaixaServico sessaoCaixaServico = new SessaoCaixaServico();
        try {
            sessaoCaixa = sessaoCaixaServico.verificarCaixaAberto(sessao);
            if (sessaoCaixa != null) sessaoCaixa.setSessao(sessao);
        } catch(RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(),
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItemEncerrarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEncerrarSessaoActionPerformed
        // TODO add your handling code here:
        if (sessaoCaixa != null)
            JOptionPane.showMessageDialog(this, "É necessário realizar o fechamento do caixa antes de encerrar a sessão!",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        else {
            SessaoServico sessaoServico = new SessaoServico();
            try {
                sessaoServico.encerrarSessao(sessao);
            System.exit(0);
            } catch(RuntimeException ex) {
                JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(),
                        "Atenção", JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_jMenuItemEncerrarSessaoActionPerformed

    private void jMenuItemFinalizarCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFinalizarCaixaActionPerformed
        // TODO add your handling code here:
        
        if (sessaoCaixa == null){
            JOptionPane.showMessageDialog(this, "O caixa não foi aberto.\n",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }else {
            FormFechamentoDeCaixa formFechamentoDeCaixa = new FormFechamentoDeCaixa(this, true, sessaoCaixa);
            formFechamentoDeCaixa.setVisible(true);
            
        }
        
    }//GEN-LAST:event_jMenuItemFinalizarCaixaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        FormObservarCaixas formObservarCaixas = new FormObservarCaixas(this, true, sessao);
        formObservarCaixas.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuConsulta;
    private javax.swing.JMenu jMenuEstoque;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemCadastroCategorias;
    private javax.swing.JMenuItem jMenuItemCadastroDeCaixas;
    private javax.swing.JMenuItem jMenuItemCadastroFornecedores;
    private javax.swing.JMenuItem jMenuItemCadastroFuncoes;
    private javax.swing.JMenuItem jMenuItemCadastroMotivos;
    private javax.swing.JMenuItem jMenuItemCadastroPrecos;
    private javax.swing.JMenuItem jMenuItemCadastroProdutos;
    private javax.swing.JMenuItem jMenuItemCadastroUsuarios;
    private javax.swing.JMenuItem jMenuItemConsultaDeEntradasDeProdutos;
    private javax.swing.JMenuItem jMenuItemConsultaDeProdutosRetirados;
    private javax.swing.JMenuItem jMenuItemConsultaEstoque;
    private javax.swing.JMenuItem jMenuItemConsultaFornecedores;
    private javax.swing.JMenuItem jMenuItemConsultaProdutos;
    private javax.swing.JMenuItem jMenuItemConsultaUsuarios;
    private javax.swing.JMenuItem jMenuItemEncerrarSessao;
    private javax.swing.JMenuItem jMenuItemFinalizarCaixa;
    private javax.swing.JMenuItem jMenuItemIniciarCaixa;
    private javax.swing.JMenuItem jMenuItemRealizarVenda;
    private javax.swing.JMenuItem jMenuItemRegistrarEntradaProdutos;
    private javax.swing.JMenuItem jMenuItemRegistrarSaídaProdutos;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuVenda;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

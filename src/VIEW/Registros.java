/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DTO.Produto;
import com.google.protobuf.Empty;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import Componentes.Helper;
import DAO.ProdutoDAO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.Instant;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author flavi
 */
public class Registros extends javax.swing.JFrame {

    ProdutoDAO produtoDao = new ProdutoDAO();
    /**
     * Creates new form Registros
     */
    private Menu menu;

    public Registros(Menu controle) {
        this.menu = controle;
        initComponents();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        String dataFormat = format.format(Helper.getDate());
        txtData.setText(dataFormat);
    }

    public JPanel getFondo() {
        return conteudo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conteudo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new Componentes.TextField();
        cbcStatus = new Componentes.Combobox();
        txtNome = new Componentes.TextField();
        txtData = new Componentes.TextField();
        txtQuantidade = new Componentes.TextField();
        txtEstoqueMin = new Componentes.TextField();
        txtPrecoCompra = new Componentes.TextField();
        txtLucro = new Componentes.TextField();
        txtNcm = new Componentes.TextField();
        txtPrecoVenda = new Componentes.TextField();
        txtEstoqueMax = new Componentes.TextField();
        txtCodigoBarra = new Componentes.TextField();
        lblImagem = new javax.swing.JLabel();
        btnImagem = new Componentes.Buttont();
        textAreaScroll1 = new Componentes.TextAreaScroll();
        textArea1 = new Componentes.TextArea();
        jLabel2 = new javax.swing.JLabel();
        btnCadastar = new Componentes.MyButton();
        myButton3 = new Componentes.MyButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        conteudo.setBackground(new java.awt.Color(51, 51, 51));
        conteudo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRAR PRODUTO");
        conteudo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        conteudo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 770, 10));

        jPanel1.setBackground(new java.awt.Color(61, 61, 61));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(51, 51, 51));
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setText("Restrito");
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtCodigo.setLabelText("CODIGO");
        txtCodigo.setLineColor(new java.awt.Color(204, 204, 204));
        txtCodigo.setSelectionColor(new java.awt.Color(0, 0, 0));

        cbcStatus.setBackground(new java.awt.Color(51, 51, 51));
        cbcStatus.setForeground(new java.awt.Color(255, 255, 255));
        cbcStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "I - INATIVO", "A - ATIVO" }));
        cbcStatus.setSelectedIndex(-1);
        cbcStatus.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cbcStatus.setLabeText("STATUS");
        cbcStatus.setLineColor(new java.awt.Color(204, 204, 204));

        txtNome.setBackground(new java.awt.Color(51, 51, 51));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtNome.setLabelText("NOME");
        txtNome.setLineColor(new java.awt.Color(204, 204, 204));
        txtNome.setSelectionColor(new java.awt.Color(0, 0, 0));

        txtData.setEditable(false);
        txtData.setBackground(new java.awt.Color(51, 51, 51));
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtData.setLabelText("DATA");
        txtData.setLineColor(new java.awt.Color(204, 204, 204));
        txtData.setSelectionColor(new java.awt.Color(0, 0, 0));

        txtQuantidade.setBackground(new java.awt.Color(51, 51, 51));
        txtQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantidade.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtQuantidade.setLabelText("QUANTIDADE");
        txtQuantidade.setLineColor(new java.awt.Color(204, 204, 204));

        txtEstoqueMin.setBackground(new java.awt.Color(51, 51, 51));
        txtEstoqueMin.setForeground(new java.awt.Color(255, 255, 255));
        txtEstoqueMin.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtEstoqueMin.setLabelText("ESTOQUE MINIMO");
        txtEstoqueMin.setLineColor(new java.awt.Color(204, 204, 204));
        txtEstoqueMin.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtEstoqueMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstoqueMinActionPerformed(evt);
            }
        });

        txtPrecoCompra.setBackground(new java.awt.Color(51, 51, 51));
        txtPrecoCompra.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecoCompra.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPrecoCompra.setLabelText("PRE??O DE COMPRA");
        txtPrecoCompra.setLineColor(new java.awt.Color(204, 204, 204));
        txtPrecoCompra.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtPrecoCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrecoCompraMouseClicked(evt);
            }
        });

        txtLucro.setEditable(false);
        txtLucro.setBackground(new java.awt.Color(51, 51, 51));
        txtLucro.setForeground(new java.awt.Color(255, 255, 255));
        txtLucro.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtLucro.setLabelText("LUCRO");
        txtLucro.setLineColor(new java.awt.Color(204, 204, 204));
        txtLucro.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtLucro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLucroMouseClicked(evt);
            }
        });

        txtNcm.setBackground(new java.awt.Color(51, 51, 51));
        txtNcm.setForeground(new java.awt.Color(255, 255, 255));
        txtNcm.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtNcm.setLabelText("NCM");
        txtNcm.setLineColor(new java.awt.Color(204, 204, 204));
        txtNcm.setSelectionColor(new java.awt.Color(0, 0, 0));

        txtPrecoVenda.setBackground(new java.awt.Color(51, 51, 51));
        txtPrecoVenda.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecoVenda.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPrecoVenda.setLabelText("PRE??O DE VENDA");
        txtPrecoVenda.setLineColor(new java.awt.Color(204, 204, 204));
        txtPrecoVenda.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtPrecoVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrecoVendaMouseClicked(evt);
            }
        });

        txtEstoqueMax.setBackground(new java.awt.Color(51, 51, 51));
        txtEstoqueMax.setForeground(new java.awt.Color(255, 255, 255));
        txtEstoqueMax.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtEstoqueMax.setLabelText("ESTOQUE MAXIMO");
        txtEstoqueMax.setLineColor(new java.awt.Color(204, 204, 204));
        txtEstoqueMax.setSelectionColor(new java.awt.Color(0, 0, 0));

        txtCodigoBarra.setBackground(new java.awt.Color(51, 51, 51));
        txtCodigoBarra.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoBarra.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtCodigoBarra.setLabelText("CODIGO DE BARRA");
        txtCodigoBarra.setLineColor(new java.awt.Color(204, 204, 204));
        txtCodigoBarra.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtCodigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBarraActionPerformed(evt);
            }
        });

        lblImagem.setBackground(new java.awt.Color(153, 153, 153));
        lblImagem.setForeground(new java.awt.Color(153, 153, 153));
        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setText("Imagem do Produto");
        lblImagem.setToolTipText("");
        lblImagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblImagem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnImagem.setForeground(new java.awt.Color(204, 204, 204));
        btnImagem.setText("Procurar Imagem");
        btnImagem.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImagemMouseClicked(evt);
            }
        });
        btnImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagemActionPerformed(evt);
            }
        });

        textAreaScroll1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        textAreaScroll1.setLabelText("DESCRI????O");
        textAreaScroll1.setLineColor(new java.awt.Color(204, 204, 204));

        textArea1.setBackground(new java.awt.Color(51, 51, 51));
        textArea1.setColumns(20);
        textArea1.setForeground(new java.awt.Color(255, 255, 255));
        textArea1.setRows(5);
        textArea1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        textArea1.setSelectionColor(new java.awt.Color(0, 0, 0));
        textAreaScroll1.setViewportView(textArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbcStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                    .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textAreaScroll1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstoqueMin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecoCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstoqueMax, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNcm, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtCodigoBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbcStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstoqueMax, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNcm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE))
                    .addComponent(textAreaScroll1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        conteudo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 770, 390));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Etapa 2/2");
        conteudo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        btnCadastar.setBackground(new java.awt.Color(102, 102, 102));
        btnCadastar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnCadastar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastar.setText("CADASTRAR");
        btnCadastar.setBorderColor(new java.awt.Color(102, 102, 102));
        btnCadastar.setColor(new java.awt.Color(102, 102, 102));
        btnCadastar.setColorClick(new java.awt.Color(81, 81, 81));
        btnCadastar.setColorOver(new java.awt.Color(102, 102, 102));
        btnCadastar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCadastar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCadastar.setVerifyInputWhenFocusTarget(false);
        btnCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastarActionPerformed(evt);
            }
        });
        conteudo.add(btnCadastar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 130, 40));

        myButton3.setBackground(new java.awt.Color(51, 51, 51));
        myButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        myButton3.setForeground(new java.awt.Color(255, 255, 255));
        myButton3.setText("CANCELAR");
        myButton3.setBorderColor(new java.awt.Color(51, 51, 51));
        myButton3.setColor(new java.awt.Color(51, 51, 51));
        myButton3.setColorClick(new java.awt.Color(81, 81, 81));
        myButton3.setColorOver(new java.awt.Color(51, 51, 51));
        myButton3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        myButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        myButton3.setVerifyInputWhenFocusTarget(false);
        myButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton3ActionPerformed(evt);
            }
        });
        conteudo.add(myButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 130, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("OBS..  Preencha os campos para cadastrar um novo produto...");
        conteudo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBarraActionPerformed

    private void txtEstoqueMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstoqueMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstoqueMinActionPerformed

    private void btnCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastarActionPerformed
        // TODO add your handling code here:
        try {
            if (verificarCampos()) {
                Erro msg = new Erro();
                msg.setVisible(true);
            } else {
                Produto p = new Produto();

                if (cbcStatus.getSelectedIndex() == 0) {
                    p.setStatus("i");
                } else if (cbcStatus.getSelectedIndex() == 1) {
                    p.setStatus("a");
                }
                p.setNome(txtNome.getText());
                p.setDescricao(textArea1.getText());
                p.setCodigo_barra(Integer.parseInt(txtCodigoBarra.getText()));
                p.setEstoque_maximo(Integer.parseInt(txtEstoqueMax.getText()));
                p.setEstoque_minimo(Integer.parseInt(txtEstoqueMin.getText()));
                p.setImagem(lblImagem.getToolTipText());
                p.setNcm(Integer.parseInt(txtNcm.getText()));

                p.setFator(Float.parseFloat(txtLucro.getText().replace("%", "")));
                p.setQtd_estoque(Integer.parseInt(txtQuantidade.getText()));
                p.setPreco_compra((float) Double.parseDouble(txtPrecoCompra.getText()));
                p.setPreco_venda((float) Double.parseDouble(txtPrecoVenda.getText()));
                p.setData_cadastro(txtData.getText());
                produtoDao.inserirProduto(p);
                LimpaCampos();
                Sucesso msg = new Sucesso();
                msg.setVisible(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnCadastarActionPerformed

    private void myButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton3ActionPerformed
        // TODO add your handling code here:
        Content panel = new Content(menu);
        menu.abrirMDI(panel.getFondo());
    }//GEN-LAST:event_myButton3ActionPerformed

    private void btnImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImagemActionPerformed

    private void calculoLucro() {
        if (txtPrecoVenda.getText() != "" && txtPrecoCompra.getText() != "") {
            Produto p = new Produto();
            float lucro = p.obterFatorLucro(Float.parseFloat(txtPrecoVenda.getText()), Float.parseFloat(txtPrecoCompra.getText()));
      
            txtLucro.setText(String.valueOf(lucro));
        }
    }
    private void txtLucroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLucroMouseClicked
        // TODO add your handling code here:
        calculoLucro();
    }//GEN-LAST:event_txtLucroMouseClicked

    private void txtPrecoCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecoCompraMouseClicked
        // TODO add your handling code here:
        calculoLucro();
    }//GEN-LAST:event_txtPrecoCompraMouseClicked

    private void txtPrecoVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecoVendaMouseClicked
        // TODO add your handling code here:
        calculoLucro();
    }//GEN-LAST:event_txtPrecoVendaMouseClicked

    private void btnImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImagemMouseClicked
        // TODO add your handling code here:
        try {
            BufferedImage imageBuf = null;
            JFileChooser busca = new JFileChooser();
            busca.setFileFilter(new FileNameExtensionFilter("Imagem", "tmp", "png", "jpeg", "jpg"));
            busca.setAcceptAllFileFilterUsed(false);
            busca.setDialogTitle("Selecionando Imagem");
            busca.showOpenDialog(this);
            String caminho = busca.getSelectedFile().getAbsolutePath();
            imageBuf = ImageIO.read(new File(caminho));
            Image diminuir = imageBuf.getScaledInstance(200, 140, 0);
            lblImagem.setText("");
            lblImagem.setIcon(new ImageIcon(diminuir));
            lblImagem.setToolTipText(caminho.replace("/", "//"));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnImagemMouseClicked

    public void LimpaCampos() {

        txtNome.setText("");
        textArea1.setText("");
        txtCodigoBarra.setText("");
        txtEstoqueMax.setText("");
        txtEstoqueMin.setText("");
        lblImagem.setIcon(null);
        lblImagem.setText("");
        txtPrecoCompra.setText("");
        txtPrecoVenda.setText("");
        txtQuantidade.setText("");
        txtNcm.setText("");
        cbcStatus.setSelectedIndex(-1);
        txtLucro.setText("");
    }

    private Boolean verificarCampos() {
        if (txtNome.getText() == "" || textArea1.getText() == "" || txtCodigoBarra.getText() == "" || txtEstoqueMax.getText() == "" || txtEstoqueMin.getText() == "" || txtPrecoCompra.getText() == "" || txtPrecoVenda.getText() == "" || txtQuantidade.getText() == "" || txtNcm.getText() == "" || txtLucro.getText() == "" || lblImagem.getIcon() == null) {
            return true;
        } else {
            return false;
        }
    }

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
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.MyButton btnCadastar;
    private Componentes.Buttont btnImagem;
    private Componentes.Combobox cbcStatus;
    private javax.swing.JPanel conteudo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblImagem;
    private Componentes.MyButton myButton3;
    private Componentes.TextArea textArea1;
    private Componentes.TextAreaScroll textAreaScroll1;
    private Componentes.TextField txtCodigo;
    private Componentes.TextField txtCodigoBarra;
    private Componentes.TextField txtData;
    private Componentes.TextField txtEstoqueMax;
    private Componentes.TextField txtEstoqueMin;
    private Componentes.TextField txtLucro;
    private Componentes.TextField txtNcm;
    private Componentes.TextField txtNome;
    private Componentes.TextField txtPrecoCompra;
    private Componentes.TextField txtPrecoVenda;
    private Componentes.TextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}

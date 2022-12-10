/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Produto;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author flavio
 */
public class ProdutoDAO {

    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    ArrayList<Produto> lista = new ArrayList<>();

    public void inserirProduto(Produto produto) throws Exception {
        String sql = "INSERT INTO tb_produto(nome, descricao, qtd_estoque, estoque_minimo,"
                + "estoque_maximo, preco_compra, preco_venda, codigo_barra, ncm, fator,"
                + "data_cadastro, imagem) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        conn = new ConnectionFactory().Conexao();
        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.setInt(3, produto.getQtd_estoque());
            pstm.setInt(4, produto.getEstoque_minimo());
            pstm.setInt(5, produto.getEstoque_maximo());
            pstm.setFloat(6, produto.getPreco_compra());
            pstm.setFloat(7, produto.getPreco_venda());
            pstm.setInt(8, produto.getCodigo_barra());
            pstm.setInt(9, produto.getNcm());
            pstm.setFloat(10, produto.getFator());
            pstm.setString(11, produto.getData_cadastro());
            pstm.setString(12, produto.getImagem());
            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        }

    }

    public ArrayList<Produto> listarProduto() throws Exception {
        String sql = "select * from tb_produto";
        conn = new ConnectionFactory().Conexao();
        try {

            pstm = conn.prepareStatement(sql);
            rs = (ResultSet) pstm.executeQuery();

            while (rs.next()) {

                Produto objproduto = new Produto();
                objproduto.setId(rs.getInt("id"));
                objproduto.setStatus(rs.getString("status"));
                objproduto.setNome(rs.getString("nome"));
                objproduto.setDescricao(rs.getString("descricao"));
                objproduto.setQtd_estoque(rs.getInt("qtd_estoque"));
                objproduto.setEstoque_minimo(rs.getInt("estoque_minimo"));
                objproduto.setEstoque_maximo(rs.getInt("estoque_maximo"));
                objproduto.setPreco_compra(rs.getFloat("preco_compra"));
                objproduto.setPreco_venda(rs.getFloat("preco_venda"));
                objproduto.setCodigo_barra(rs.getInt("codigo_barra"));
                objproduto.setNcm(rs.getInt("ncm"));
                objproduto.setFator(rs.getFloat("fator"));
                objproduto.setData_cadastro(rs.getString("data_cadastro"));
                objproduto.setImagem(rs.getString("imagem"));
                lista.add(objproduto);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        }
        return lista;
    }
    public ArrayList<Produto> listarProdutoCodigo(int id) throws Exception {
        String sql = "select * from tb_produto where id="+id;
        conn = new ConnectionFactory().Conexao();
        try {

            pstm = conn.prepareStatement(sql);
            rs = (ResultSet) pstm.executeQuery();

            while (rs.next()) {

                Produto objproduto = new Produto();
                objproduto.setId(rs.getInt("id"));
                objproduto.setStatus(rs.getString("status"));
                objproduto.setNome(rs.getString("nome"));
                objproduto.setDescricao(rs.getString("descricao"));
                objproduto.setQtd_estoque(rs.getInt("qtd_estoque"));
                objproduto.setEstoque_minimo(rs.getInt("estoque_minimo"));
                objproduto.setEstoque_maximo(rs.getInt("estoque_maximo"));
                objproduto.setPreco_compra(rs.getFloat("preco_compra"));
                objproduto.setPreco_venda(rs.getFloat("preco_venda"));
                objproduto.setCodigo_barra(rs.getInt("codigo_barra"));
                objproduto.setNcm(rs.getInt("ncm"));
                objproduto.setFator(rs.getFloat("fator"));
                objproduto.setData_cadastro(rs.getString("data_cadastro"));
                objproduto.setImagem(rs.getString("imagem"));
                lista.add(objproduto);
                
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        }
        return lista;
    }

    public ArrayList<Produto> listarProdutoNome(String nome) throws Exception {
        String sql = "select * from tb_produto where nome like "+nome;
        conn = new ConnectionFactory().Conexao();
        try {

            pstm = conn.prepareStatement(sql);
            rs = (ResultSet) pstm.executeQuery();

            while (rs.next()) {

                Produto objproduto = new Produto();
                objproduto.setId(rs.getInt("id"));
                objproduto.setStatus(rs.getString("status"));
                objproduto.setNome(rs.getString("nome"));
                objproduto.setDescricao(rs.getString("descricao"));
                objproduto.setQtd_estoque(rs.getInt("qtd_estoque"));
                objproduto.setEstoque_minimo(rs.getInt("estoque_minimo"));
                objproduto.setEstoque_maximo(rs.getInt("estoque_maximo"));
                objproduto.setPreco_compra(rs.getFloat("preco_compra"));
                objproduto.setPreco_venda(rs.getFloat("preco_venda"));
                objproduto.setCodigo_barra(rs.getInt("codigo_barra"));
                objproduto.setNcm(rs.getInt("ncm"));
                objproduto.setFator(rs.getFloat("fator"));
                objproduto.setData_cadastro(rs.getString("data_cadastro"));
                objproduto.setImagem(rs.getString("imagem"));
                lista.add(objproduto);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        }
        return lista;
    }
    
    public void alterarProduto(Produto produto) throws Exception {
        String sql = "UPDATE tb_produto SET status = ? ,nome = ?,descricao = ?,"
                + "qtd_estoque = ?,estoque_minimo = ?,estoque_maximo = ? ,preco_compra = ?,"
                + "preco_venda = ?,codigo_barra = ?,ncm = ?,fator = ?,data_cadastro = ?,imagem = ? WHERE id = ?";
        conn = new ConnectionFactory().Conexao();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, produto.getStatus());
            pstm.setString(2, produto.getNome());
            pstm.setString(3, produto.getDescricao());
            pstm.setInt(4, produto.getQtd_estoque());
            pstm.setInt(5, produto.getEstoque_minimo());
            pstm.setInt(6, produto.getEstoque_maximo());
            pstm.setFloat(7, produto.getPreco_compra());
            pstm.setFloat(8, produto.getPreco_venda());
            pstm.setInt(9, produto.getCodigo_barra());
            pstm.setInt(10, produto.getNcm());
            pstm.setFloat(11, produto.getFator());
            pstm.setString(12, produto.getData_cadastro());
            pstm.setString(13, produto.getImagem());
            pstm.setInt(14, produto.getId());
            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        }
    }

    public void deletarProduto(Produto produto) throws Exception {
        String sql = "DELETE FROM tb_produto WHERE id=?";
        conn = new ConnectionFactory().Conexao();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, produto.getId());
            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        }
    }

}

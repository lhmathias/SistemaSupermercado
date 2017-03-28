
package sistemasupermercado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import sistemasupermercado.conexao.ConnectionFactory;
import sistemasupermercado.dominio.EntradaProduto;
import sistemasupermercado.interfaces.dao.EntradaProdutoDAO;

public class EntradaProdutoDAOImpl implements EntradaProdutoDAO {
    private final Connection conexao;

    public EntradaProdutoDAOImpl() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    @Override
    public boolean inserir(EntradaProduto obj) throws SQLException {
        String sql = "insert into entradas_produtos (codigo, id_fornecedor, quantidade, valor_unitario, data, id_sessao)"
                + " values (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setInt(1, obj.getProduto().getCodigo());
        pstm.setInt(2, obj.getFornecedor().getIdFornecedor());
        pstm.setDouble(3, obj.getQuantidade());
        pstm.setBigDecimal(4, obj.getValorUnitario());
        
        Timestamp tmstmp = new Timestamp(obj.getData().getTimeInMillis());
        pstm.setTimestamp(5, tmstmp);
        
        pstm.setInt(6, obj.getSessao().getIdSessao());
        int result = pstm.executeUpdate();
        pstm.close();
        return result == 1;
    }

    @Override
    public boolean alterar(EntradaProduto obj) throws SQLException {
        String sql = "update entradas_produtos set codigo = ?, id_fornecedor = ?, quantidade = ?, valor_unitario = ?, "
                + "data = ?, id_sessao = ? where id_entrada = ?";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setInt(1, obj.getProduto().getCodigo());
        pstm.setInt(2, obj.getFornecedor().getIdFornecedor());
        pstm.setDouble(3, obj.getQuantidade());
        pstm.setBigDecimal(4, obj.getValorUnitario());
        
        Timestamp tmstmp = new Timestamp(obj.getData().getTimeInMillis());
        pstm.setTimestamp(5, tmstmp);
        
        pstm.setInt(6, obj.getSessao().getIdSessao());
        pstm.setInt(7, obj.getIdEntrada());
        int result = pstm.executeUpdate();
        pstm.close();
        return result == 1;
    }

    @Override
    public boolean excluir(EntradaProduto obj) throws SQLException {
        String sql = "delete from entradas_produtos where id_entrada = ?";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setInt(1, obj.getIdEntrada());
        int result = pstm.executeUpdate();
        pstm.close();
        return result == 1;
    }

    @Override
    public EntradaProduto pesquisar(EntradaProduto obj) throws SQLException {
        EntradaProduto entradaProduto = null;
        String sql = "select * from entradas_produtos where id_entrada = ?";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setInt(1, obj.getIdEntrada());
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            entradaProduto = new EntradaProduto();
            entradaProduto.setIdEntrada(obj.getIdEntrada());
            
            Timestamp tmstmp = rs.getTimestamp("data");
            Calendar data = Calendar.getInstance();
            data.setTimeInMillis(tmstmp.getTime());
            entradaProduto.setData(data);
            
            entradaProduto.setFornecedor(rs.getInt("id_fornecedor"));
            entradaProduto.setProduto(rs.getInt("codigo"));
            entradaProduto.setQuantidade(rs.getDouble("quantidade"));
            entradaProduto.setSessao(rs.getInt("id_sessao"));
            entradaProduto.setValorUnitario(rs.getBigDecimal("valor_unitario"));
        }
        pstm.close();
        return entradaProduto;
    }

    @Override
    public List<EntradaProduto> listar(String filtro) throws SQLException {
        List<EntradaProduto> entradasProdutos = new ArrayList<>();
        String sql = "select * from entradas_produtos " + filtro;
        PreparedStatement pstm = conexao.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            EntradaProduto entradaProduto = new EntradaProduto();
            entradaProduto.setIdEntrada(rs.getInt("id_entrada"));
            
            Timestamp tmstmp = rs.getTimestamp("data");
            Calendar data = Calendar.getInstance();
            data.setTimeInMillis(tmstmp.getTime());
            entradaProduto.setData(data);
            
            entradaProduto.setFornecedor(rs.getInt("id_fornecedor"));
            entradaProduto.setProduto(rs.getInt("codigo"));
            entradaProduto.setQuantidade(rs.getDouble("quantidade"));
            entradaProduto.setSessao(rs.getInt("id_sessao"));
            entradaProduto.setValorUnitario(rs.getBigDecimal("valor_unitario"));
            
            entradasProdutos.add(entradaProduto);
        }
        pstm.close();
        return entradasProdutos;
    }
}

package sistemasupermercado.interfaces.dao;

import java.sql.SQLException;
import java.util.List;
import sistemasupermercado.dominio.PrecoProduto;

public interface PrecoProdutoDAO {
    
    public void fecharConexao() throws SQLException;
    
    public boolean inserir(PrecoProduto obj) throws SQLException;
    
    public PrecoProduto pesquisar(PrecoProduto obj) throws SQLException;
    
    public List<PrecoProduto> listar(int idProduto, int idUnidade) throws SQLException;
    
}

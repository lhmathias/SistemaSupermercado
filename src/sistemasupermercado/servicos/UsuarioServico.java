
package sistemasupermercado.servicos;

import java.sql.SQLException;
import java.util.List;
import sistemasupermercado.dao.UsuarioDAOImpl;
import sistemasupermercado.dominio.Usuario;
import sistemasupermercado.exceptions.DadosInvalidosException;
import sistemasupermercado.exceptions.PesquisaNulaException;
import sistemasupermercado.exceptions.RetornoDeAlteracaoDeDadosInesperadoException;
import sistemasupermercado.interfaces.dao.UsuarioDAO;

public class UsuarioServico {
    UsuarioDAO usuarioDAO;
    
    public void inserir(Usuario usuario) {
        validarDados(usuario);
        usuarioDAO = new UsuarioDAOImpl();
        try {
            verificarResultado(usuarioDAO.inserir(usuario));
        } catch(SQLException ex) {
            throw new RuntimeException("SQLException: " + ex.getMessage());
        }
    }
    
    public void alterar(Usuario usuario) {
        validarDados(usuario);
        usuarioDAO = new UsuarioDAOImpl();
        try {
            verificarResultado(usuarioDAO.alterar(usuario));
        } catch(SQLException ex) {
            throw new RuntimeException("SQLException: " + ex.getMessage());
        }
    }
    
    public void excluir(Usuario usuario) {
        usuarioDAO = new UsuarioDAOImpl();
        try {
            verificarResultado(usuarioDAO.excluir(usuario));
        } catch(SQLException ex) {
            throw new RuntimeException("SQLException: " + ex.getMessage());
        }
    }
    
    public Usuario pesquisar(Usuario usuario) {
        usuarioDAO = new UsuarioDAOImpl();
        try {
            usuario = usuarioDAO.pesquisar(usuario);
            validarPesquisa(usuario);
            return usuario;
        } catch(SQLException ex) {
            throw new RuntimeException("SQLException: " + ex.getMessage());
        }
    }
    
    public List<Usuario> listar(String pesquisarPor, String texto) {
        usuarioDAO = new UsuarioDAOImpl();
        try {
            return usuarioDAO.listar(pesquisarPor, texto);
        } catch(SQLException ex) {
            throw new RuntimeException("SQLException: " + ex.getMessage());
        }
    }
    
    public boolean validarSenha(String senha1, String senha2) {
        return senha1.equals(senha2);
    }

    private void validarDados(Usuario usuario) {
        StringBuilder mensagem = new StringBuilder();
        if (usuario.getFuncaoUsuario() == null) mensagem.append("Função\n");
        if (usuario.getLogin().equals("")) mensagem.append("Login\n");
        if (usuario.getNome().equals("")) mensagem.append("Nome\n");
        if (usuario.getSenha().equals("")) mensagem.append("Senha\n");
        
        throw new DadosInvalidosException("O(s) seguinte(s) dado(s) estão sem preenchimento ou foram preenchidos"
                + "incorretamente:\n" + mensagem);
    }

    private void verificarResultado(boolean result) {
        if (!result) throw new RetornoDeAlteracaoDeDadosInesperadoException();
    }

    private void validarPesquisa(Usuario usuario) {
        if (usuario == null) throw new PesquisaNulaException();
    }
}

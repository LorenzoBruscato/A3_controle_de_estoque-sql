package principal;

import view.FrmMenuPrincipal;
import db.Database;
import model.dao.DaoFactory;
import model.dao.ProdutoDao;

public class Principal {
//Atualização
    public static void main(String[] args) {
        try {
            Database.getConnection();
            ProdutoDao produtoDao = DaoFactory.instanciarProdutoDao();
            FrmMenuPrincipal janela = new FrmMenuPrincipal();
            janela.setVisible(true);
        } catch (Exception e) {
        } finally {
            Database.closeConnection(); // Fecha a conexão ao finalizar
        }
    }
}

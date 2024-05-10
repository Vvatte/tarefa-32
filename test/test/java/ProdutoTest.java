package test.java;

import main.java.dao.IProdutoDAO;
import main.java.dao.ProdutoDao;
import main.java.domain.Produto;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.Table;
import java.util.List;

public class ProdutoTest {

    private IProdutoDAO produtoDAO;

    public ProdutoTest() {
        produtoDAO = new ProdutoDao();
    }

    @After
    public void end() {
        List<Produto> listProdutos = produtoDAO.buscarTodos();
        listProdutos.forEach(prod -> produtoDAO.excluir(prod));
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo(1l);
        produto.setNome("Telefone");
        produto.setValor(1800d);
        produto =  produtoDAO.cadastrar(produto);

        Assert.assertNotNull(produto);
        Assert.assertNotNull(produto.getId());





    }




}

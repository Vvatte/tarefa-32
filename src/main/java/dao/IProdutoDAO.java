package main.java.dao;

import main.java.domain.Produto;

import java.util.List;

public interface IProdutoDAO {
    Produto cadastrar(Produto produto);

    List<Produto> buscarTodos();

    void excluir(Produto prod);
}

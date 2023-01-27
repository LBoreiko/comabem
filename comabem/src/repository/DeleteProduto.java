package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import comabemdb.Conexao;
import comabemmodel.Produto;

// Classe para realizar Exclusão de produtos no banco de Dados
public class DeleteProduto {
    private Conexao conexaoDB;
    private Connection conection;

    public DeleteProduto(){
        this.conexaoDB = new Conexao();
        this.conection = this.conexaoDB.getConexao();
    }

    public Produto deleteProduto(String nomeProduto){
        String sql = "DELETE FROM produtos WHERE nomeProduto = ?";
        try {
            PreparedStatement stmt = this.conection.prepareStatement(sql);
            stmt.setString(1, nomeProduto);
            stmt.execute();
            System.out.println("\n Produtos  excluído com sucesso!");
        } catch (Exception e) {
            System.out.println("Não foi possível excluir o produto: " + e.getMessage());
        }
        return null;
    }
}


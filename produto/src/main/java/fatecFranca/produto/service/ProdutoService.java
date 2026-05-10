package fatecFranca.produto.service;

import fatecFranca.produto.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private List<Produto> lista = new ArrayList<Produto>();
    private Long nextId = 1L;

    public List<Produto> listar(){
        return this.lista;
    }

    public Produto criar(Produto p){
        p.setId(nextId);
        nextId++;
        this.lista.add(p);
        return p;
    }

    public boolean remover(Long id){
        for (int i=0;i<this.lista.size();i++){
            if (lista.get(i).getId().equals(id)){
                this.lista.remove(i);
                return true;
            }
        }
        return false;
    }
    public Produto atualizar(Long id, Produto novo){
        for(int i=0;i<lista.size();i++){
            if (lista.get(i).getId().equals(id)){
                novo.setId(id);
                lista.set(i, novo);
                return novo; // atualizou
            }
        }
        return null; // não atualizou
    }

}

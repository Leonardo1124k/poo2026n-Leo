package exercicio.cliente.service;

import exercicio.cliente.model.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<Cliente> listaClientes = new ArrayList<Cliente>();
    private Long nextId = 1L;

    public List<Cliente> listar(){return this.listaClientes;}

    public Cliente criar(Cliente c){
        c.setId(nextId);
        nextId++;
        this.listaClientes.add(c);
        return c; //criado novo objeto cliente
    }

    public Cliente buscarPorId(Long id){
        for(int i = 0; i < this.listaClientes.size(); i++){
            if(listaClientes.get(i).getId().equals(id)){
                return this.listaClientes.get(i); //encontrado o cliente
            }
        }
        return null; //nao encontrou
    }

    public Cliente atualizar(Long id, Cliente novo) {
        if (novo.getNome() == null || novo.getNome().isBlank()) {
            return null;
        }

        if (novo.getEmail() == null || novo.getEmail().isBlank()) {
            return null;
        }

        if (novo.getIdade() == 0) {
            return null;
        }

        for (int i = 0; i < this.listaClientes.size(); i++) {
            if (listaClientes.get(i).getId().equals(id)) {
                novo.setId(id);
                listaClientes.set(i, novo);
                return novo; // novos dados implementados
            }
        }
        return null; // nada implementado, cliente nao encontrado ou dados incompativeis
    }

    public boolean remover(Long id){
        for (int i=0; i < this.listaClientes.size(); i++){
            if (listaClientes.get(i).getId().equals(id)){
                this.listaClientes.remove(i);
                return true; // cliente removido
            }
        }
        return false; // cliente não removido, ocorreu algum erro ou indice nao encontrado.
    }

}

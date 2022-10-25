package com.intensivaosp.app.model.repositories;

import com.intensivaosp.app.model.entities.Contato;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContatoRepository   {

    private static final List<Contato> contatos = new ArrayList<>();

    public Contato salvar(Contato contato) {
        contatos.add(contato);
        return contato;
    }
    //ele pega a lista e procura se tiver o contato que eu estou procurando ele altera, se ele achar o contato ele envia verdadeiro, senão envia falso
    public boolean alterar( String nome,  Contato contato){
        for (Contato contatoLista:contatos
        ) {
            if(contatoLista.getNome().equals(nome)){
                contatoLista.setNome(contato.getNome());
                contatoLista.setTelefone(contato.getTelefone());
                return true;
            }
        }
        return false;
    }

    public Contato findByName( String nome){
        for (Contato contatoLista: contatos
        ) {
            if(contatoLista.getNome().equals(nome)){
                return contatoLista;
            }
        }
        return null;
    }

    public List<Contato> findAll(){
        return contatos;
    }

    public boolean excluir( String nome){
        return contatos.remove(new Contato(nome));
    }


}

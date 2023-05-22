package br.com.cfarias.dao;

import java.util.Collection;
import java.util.HashSet;
import br.com.cfarias.domain.Cliente;

public class ClienteSetDAO implements IClienteDAO {
	
	private HashSet<Cliente>cadastrarCliente;
	Cliente clienteCadastrado = new Cliente(null, null, null, null, null, null, null, null);
	
	
	public ClienteSetDAO() {
		this.cadastrarCliente = new HashSet<>();
		
	}

	
	public Boolean cadastrar(Cliente cliente) {
		return null;
	}


	public void excluir(Long cpf) {
		

		
	}


	public void alterar(Cliente cliente) {

		
	}

	
	public Cliente consultar(Long cpf) {
		
		return null;
	}

	
	public Collection<Cliente> buscarTodos() {
		
		return null;
	}
	
	
	
	
}

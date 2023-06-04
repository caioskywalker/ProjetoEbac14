package br.com.cfarias.dao;

import java.util.Collection;

import br.com.cfarias.domain.Cliente;

import java.util.HashSet;

public class ClienteSetDAO implements IClienteDAO{
	
	private HashSet<Cliente>set;
	private HashSet<Long>cpfCadastrado;
	
	public ClienteSetDAO() {
		this.set = new HashSet<>();
		this.cpfCadastrado = new HashSet<>();
	}

	//Cadastro
	public Boolean cadastrar(Cliente cliente) {
		
		if(cpfCadastrado.contains(cliente.getCpf())) {
			System.out.println("Cliente já cadastrado!");
			return null;
		}
		else {
			set.add(cliente);
			System.out.println("Cadastro efetivado!");
		return true;
		}
		
	}

	//Excluir
	public void excluir(Long cpf) {
		Cliente cliente = consultar(cpf);
		if (cliente != null) {
			set.remove(cliente);
		}
		else {
			System.out.println("Cliente inexistente");
		}
		
	}

	//Alterar
	public void alterar(Cliente cliente) {
		if(set.contains(cliente)) {
			set.remove(cliente);
			set.add(cliente);
		}
		
	}

	//Consultar
	public Cliente consultar(Long cpf) {
		for (Cliente cliente : set) {
			if(cliente.getCpf().equals(cpf)) {
				return cliente;
			}
		}
		return null;
	}

	//BuscarTodos
	public Collection<Cliente> buscarTodos() {
		return set;
	}
	
	
}

package br.com.cfarias.dao;

import br.com.cfarias.domain.Cliente;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

public class ClienteMapDAO implements IClienteDAO {
	
	private Map<Long, Cliente> map;
	
	public ClienteMapDAO() {
		this.map = new HashMap<>();
		
	}
	//ALTERAR
	public void alterar(Cliente cliente) {
		Cliente clienteCadastrado = this.map.get(cliente.getCpf());
		
		if(clienteCadastrado != null) {
			clienteCadastrado.setNome(cliente.getNome());
			
			clienteCadastrado.setTel(cliente.getTel());
			clienteCadastrado.setNum(cliente.getNum());
			clienteCadastrado.setEnd(cliente.getEnd());
			clienteCadastrado.setCidade(cliente.getCidade());
			clienteCadastrado.setEstado(cliente.getEstado());
			
		}
		
		
	}
	
	//CADASTRAR
	public Boolean cadastrar(Cliente cliente) {
		if(this.map.containsKey(cliente.getCpf())) {
			return false;
		}
		this.map.put(cliente.getCpf(), cliente);
		return true;
	}
	
	//EXCLUIR
	public void excluir(Long cpf) {
		Cliente clienteCadastrado = this.map.get(cpf);
		
		if(clienteCadastrado != null) {
			this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
		}
	}
	
	//CONSULTAR
	public Cliente consultar(Long cpf) {
		return this.map.get(cpf);
	}
	
	//BUSCARTODOS
	public Collection<Cliente> buscarTodos() {
		
		return this.map.values();
	}
	
	
}

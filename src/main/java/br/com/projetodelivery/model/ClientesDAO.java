package br.com.projetodelivery.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projetodelivery.interfaces.ClienteInterface;
import br.com.projetodelivery.service.ConnectionFactory;

public class ClientesDAO implements ClienteInterface{
    
    // Parâmetros de conexão
    private Connection conn;
    private ConnectionFactory cf = new ConnectionFactory();
    
    public ClientesDAO() {
	try {
	    conn = cf.getConexao();
	} catch (ClassNotFoundException e) {
	    System.err.println(">>>>>>> "+e.getMessage());
	}
    }

    @Override
    public void inserir(Clientes cliente) throws ClassNotFoundException {
	// TODO Auto-generated method stub
	String sql = "INSERT INTO pidelivery "
		+ "(nome, cpf, telefone, email, endereco) "
		+ "values "
		+ "(?,?,?,?,?)";

	try {
	    
	    	PreparedStatement ps = conn.prepareStatement(sql);
	    	ps.setString(1, cliente.getClienteNome());
	    	ps.setString(2, cliente.getClienteCpf());
	    	ps.setString(3, cliente.getClienteTelefone());
	    	ps.setString(4, cliente.getClienteEmail());
	    	ps.setString(5, cliente.getClienteEndereco());
	    	ps.execute();
	    	
	} catch(SQLException e){
	    
	    	System.err.println(">>>>>> "+e.getMessage());
	    
	}
	
	
    }
    
    
    @Override
    public List<Clientes>lista(){
	// TODO Auto-generated method stub
	String sql = "SELECT * FROM Clientes";
	List<Clientes>lista = null;
	
	try {
	    
	    PreparedStatement ps = conn.prepareStatement(sql);
	    ResultSet rs = ps.executeQuery();
	    lista = new ArrayList<>();
	    while(rs.next()) {
		String nome = rs.getString("nome");
		String cpf = rs.getString("cpf");
		String telefone = rs.getString("telefone");
		String email = rs.getString("email");
		String endereco = rs.getString("endereco");
		Clientes cliente = new Clientes();
		lista.add(cliente);
	    }
	    
	} catch(SQLException e) {
	    System.err.println(">>> "+e.getMessage());
	}
	return lista;
	    
	    	
	
    }
   
    
}

    
    
    
    


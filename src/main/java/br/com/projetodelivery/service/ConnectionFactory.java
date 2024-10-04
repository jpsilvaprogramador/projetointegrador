package br.com.projetodelivery.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private static final String URL = "jdbc:mysql://localhost:3306/pidelivery";
    private static final String USER = "root";
    private static final String PASSWORD = "32pedra8946Admin*";
    
    private Connection conexao;
    
    private Connection novaConexao() throws ClassNotFoundException {
	
	Connection con = null;
	try {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    con = DriverManager.getConnection(URL, USER, PASSWORD);
	} catch(SQLException e) {
	    System.out.println("Driver não encontrado!");
	}
	return con;
	
    }
    
    public Connection getConexao() throws ClassNotFoundException {
	if(conexao == null) {
	    conexao = novaConexao();
	}else {
	    finalizarConexao();
	}
	return conexao;
	
    }
    
    public void finalizarConexao() {
	try {
	    conexao.close();
	}catch(SQLException e) {
	    
	}
	conexao = null;
    }
     
}

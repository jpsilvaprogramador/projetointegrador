package br.com.projetodelivery.model;

public class Clientes {

    private int clienteId;
    private String clienteNome;
    private String clienteCpf;
    private String clienteTelefone;
    private String clienteEmail;
    private String clienteEndereco;
    
    

    public Clientes() {
	super();
	// TODO Auto-generated constructor stub
    }
    
    

    public Clientes(int clienteId, String clienteNome, String clienteCpf, String clienteTelefone, String clienteEmail,
	    String clienteEndereco) {
	super();
	this.clienteId = clienteId;
	this.clienteNome = clienteNome;
	this.clienteCpf = clienteCpf;
	this.clienteTelefone = clienteTelefone;
	this.clienteEmail = clienteEmail;
	this.clienteEndereco = clienteEndereco;
    }



    public int getClienteId() {
        return clienteId;
    }
   
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    
    public String getClienteNome() {
        return clienteNome;
    }
    
    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }
    
    public String getClienteCpf() {
        return clienteCpf;
    }
    
    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }
    
    public String getClienteTelefone() {
        return clienteTelefone;
    }
    
    public void setClienteTelefone(String clienteTelefone) {
        this.clienteTelefone = clienteTelefone;
    }
    
    public String getClienteEmail() {
        return clienteEmail;
    }

    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }

    public String getClienteEndereco() {
        return clienteEndereco;
    }

    public void setClienteEndereco(String clienteEndereco) {
        this.clienteEndereco = clienteEndereco;
    }
    
    
}

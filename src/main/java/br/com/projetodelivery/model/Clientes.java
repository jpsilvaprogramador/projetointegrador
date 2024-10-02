package br.com.projetodelivery.model;

public class Clientes {

    private int clienteId;
    private String clienteNome;
    private String clienteCpf;
    private String clienteTelefone;
    
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
    
    
}

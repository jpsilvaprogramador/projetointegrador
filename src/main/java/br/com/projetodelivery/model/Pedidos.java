package br.com.projetodelivery.model;

import java.sql.Date;

public class Pedidos {

    private int pedidoId;
    private int clienteId;
    private Date pedidoData;
    private String pedidoTelefone;
    private Float pedidoTotal;
    private String situtacao;
    
    public int getPedidoId() {
        return pedidoId;
    }
    
    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }
    
    public int getClienteId() {
        return clienteId;
    }
    
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    
    public Date getPedidoData() {
        return pedidoData;
    }
    
    public void setPedidoData(Date pedidoData) {
        this.pedidoData = pedidoData;
    }
    
    public String getPedidoTelefone() {
        return pedidoTelefone;
    }
    public void setPedidoTelefone(String pedidoTelefone) {
        this.pedidoTelefone = pedidoTelefone;
    }
    public Float getPedidoTotal() {
        return pedidoTotal;
    }
    
    public void setPedidoTotal(Float pedidoTotal) {
        this.pedidoTotal = pedidoTotal;
    }
    
    public String getSitutacao() {
        return situtacao;
    }
    
    public void setSitutacao(String situtacao) {
        this.situtacao = situtacao;
    }
    
    
}


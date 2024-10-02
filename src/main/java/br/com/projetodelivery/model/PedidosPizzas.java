package br.com.projetodelivery.model;

public class PedidosPizzas {
    
    private int pedPizzaId;
    private int pizzaId;
    private int PedPizzaQuantidade;
    private Float PedPizzaPreco;
    
    public int getPedPizzaId() {
        return pedPizzaId;
    }
    
    public void setPedPizzaId(int pedPizzaId) {
        this.pedPizzaId = pedPizzaId;
    }
    
    public int getPizzaId() {
        return pizzaId;
    }
    
    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }
    
    public int getPedPizzaQuantidade() {
        return PedPizzaQuantidade;
    }
    
    public void setPedPizzaQuantidade(int pedPizzaQuantidade) {
        PedPizzaQuantidade = pedPizzaQuantidade;
    }
    
    public Float getPedPizzaPreco() {
        return PedPizzaPreco;
    }
    
    public void setPedPizzaPreco(Float pedPizzaPreco) {
        PedPizzaPreco = pedPizzaPreco;
    }
    
    
}

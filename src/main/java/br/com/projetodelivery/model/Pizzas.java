package br.com.projetodelivery.model;

public class Pizzas {

    private int pizzaId;
    private String pizzaNome;
    private String pizzaDescricao;
    private String pizzaIngrediente;
    private Float pizzaPreco;
    
    public int getPizzaId() {
        return pizzaId;
    }
    
    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }
    
    public String getPizzaNome() {
        return pizzaNome;
    }
    
    public void setPizzaNome(String pizzaNome) {
        this.pizzaNome = pizzaNome;
    }
    
    public String getPizzaDescricao() {
        return pizzaDescricao;
    }
    
    public void setPizzaDescricao(String pizzaDescricao) {
        this.pizzaDescricao = pizzaDescricao;
    }
    public String getPizzaIngrediente() {
        return pizzaIngrediente;
    }
    
    public void setPizzaIngrediente(String pizzaIngrediente) {
        this.pizzaIngrediente = pizzaIngrediente;
    }
    
    public Float getPizzaPreco() {
        return pizzaPreco;
    }
    
    public void setPizzaPreco(Float pizzaPreco) {
        this.pizzaPreco = pizzaPreco;
    }
    
    
    
}

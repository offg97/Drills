package Pratica;

public class Carro {

//   2. Atividade 2: Classe Carro
// A) Crie uma classe chamada Carro.
// B) Adicione os seguintes atributos privados:
// C) String marca
// D) String modelo
// E) int anoFabricacao
// F) double preco
// G) Crie um construtor para inicializar todos os atributos da classe.
// H) Crie métodos getters e setters para todos os atributos.
// I) Adicione um método informacoes() que retorna uma string contendo informações detalhadas sobre o carro.

private int id;
private String marca;
private String modelo;
private int anoFabricacao;
private double preco;

public Carro (int id, String marca,String modelo,int anoFabricacao,double preco){
    this.id = id;
    this.marca = marca;
    this.modelo = modelo;
    this.anoFabricacao = anoFabricacao;
    this.preco = preco;
    
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public int getAnoFabricacao() {
    return anoFabricacao;
}

public void setAnoFabricacao(int anoFabricacao) {
    this.anoFabricacao = anoFabricacao;
}

public double getPreco() {
    return preco;
}

public void setPreco(double preco) {
    this.preco = preco;
}

@Override
public String toString() {
    return "Carro" + "IDCar: " + id + "\n Marca: " + marca + "\n Modelo: " + modelo + "\n Ano de Fabricação: " + anoFabricacao
            + "\n Valor do Carro: " + preco + "";
}

public void informacoes(){
    System.out.println(toString());
}

    
}

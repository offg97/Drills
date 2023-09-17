package Pratica;

public class Pessoas {

// 1. Atividade 1: Classe Pessoa
// A) Crie uma classe chamada Pessoa.
// b) Adicione os seguintes atributos privados:
// C) String nome
// D) int idade
// E) String endereco
// F) Crie um construtor para inicializar todos os atributos da classe.
// G) Crie métodos getters e setters para todos os atributos.
// Adicione um método apresentar() que retorna uma string contendo uma breve apresentação da pessoa.

private String nome;
private int idade;
private String endereco;

public Pessoas(String nome, int idade, String endereco){
    this.nome = nome;
    this.idade = idade;
    this.endereco = endereco;

}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public String getEndereco() {
    return endereco;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

@Override
public String toString() {
    return "Pessoas" + "\n Nome da pessoa = " + nome + "\n Idade = " + idade + "\n Endereco = " + endereco + "";
}

public void Apresentar()
{
    System.out.println(toString());
}






    
}

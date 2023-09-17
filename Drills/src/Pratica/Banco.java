package Pratica;

import java.util.List;

public class Banco {

//     3. Atividade 3: Classe Banco
// A) Crie uma classe chamada Banco.
// B) Adicione os seguintes atributos privados:
// C) String nome
// D) String endereco
// E) List<ContaBancaria> contas (onde ContaBancaria é outra classe que você criará)
// F) Cr ie um construtor para inicializar o nome e o endereço do banco. Inicialize a lista de contas como uma lista vazia.
// G) Crie métodos getters e setters para os atributos nome e endereço.
// H) Adicione um método adicionarConta(ContaBancaria conta) que adiciona uma conta à lista de contas do banco.
// I( Adicione um método listarContas() que imprime os números das contas disponíveis no banco.

private String nome;
private String endereco;
private List<contaBancaria>contaBancaria;

public Banco(){

}

}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getEndereco() {
    return endereco;

}



public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public List<contaBancaria> getcontaBancaria() {
    return contaBancaria;
}

public void setcontaBancaria(List<contaBancaria> contaBancaria) {
    contaBancaria = contaBancaria;


}


@Override
public String toString() {
    return "Banco [nome=" + nome + ", endereco=" + endereco + ", contaBancaria=" + contaBancaria + "]";
}

public void adicionarConta(){
    System.out.println(toString());
    
}

public void listarContas(){
    
}
    
}

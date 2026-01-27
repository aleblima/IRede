Unidade 2 - Capítulo 1

1. Crie uma classe ContaBancaria com os atributos privados numero, titular e saldo.
   Implemente getters e setters, garantindo que o saldo não possa ser alterado
   diretamente (não crie setSaldo). Em vez disso, crie os métodos depositar() e sacar() para
   modicar o saldo.

2. Crie uma classe Aluno com atributos privados nome e nota. Implemente métodos get
   e set para ambos. No método setNota, adicione uma vericação para garantir que o
   valor da nota esteja entre 0 e 10. Caso esteja fora desse intervalo, não permita a
   alteração.

3. Crie uma classe Produto com atributos nome, preco e quantidadeEstoque. Garanta
   que apenas métodos setters possam alterar os valores de preco e quantidadeEstoque.
   Em seguida, instancie um produto e altere seus valores utilizando os setters.

Unidade 2 - Capítulo 2

4. Implemente uma hierarquia de classes com 3 níveis: Pessoa -> Funcionário ->
   Engenheiro. Cada classe deve possuir ao menos um atributo e um método. Demonstre a
   criação de um objeto Engenheiro e a chamada de métodos das 3 classes.

5. Crie uma hierarquia de classes em que Produto é a superclasse e ProdutoAlimenticio é
   a subclasse. A subclasse deve adicionar um atributo dataValidade e um método
   estaVencido() que retorna true ou false com base na data atual.

6. Implemente uma classe Funcionario com os atributos nome e salario. Crie uma
   subclasse Gerente que, além dos atributos herdados, possua um atributo
   departamento. Use um construtor com super para inicializar os atributos da superclasse.

Unidade 2 - Capítulo 3

7. Crie uma hierarquia de classes em que exista uma classe Animal com um método
   fazerSom(). Crie duas subclasses: Cachorro e Gato, que sobrescrevem esse método para
   imprimir "Latindo" e "Miando", respectivamente. Em seguida, crie uma classe Teste com
   o método main(), onde você instancia um array de Animal contendo objetos de
   Cachorro e Gato, e percorre o array chamando fazerSom() para cada item.

8. Crie uma classe Funcionario com o método double calcularSalario(). Depois, crie duas
   subclasses: FuncionarioCLT e FuncionarioPJ, cada uma com sua própria implementação
   do cálculo do salário. Na classe Teste, crie uma lista de funcionários com tipos mistos
   (CLT e PJ), percorra a lista e imprima o salário de cada um utilizando polimorsmo.

Unidade 2 - Capítulo 3

9. Crie uma classe abstrata chamada Veiculo com um método abstrato mover(). Depois,
   crie duas subclasses: Carro e Bicicleta, que implementam o método mover() com
   mensagens apropriadas. No main(), instancie as subclasses em variáveis do tipo Veiculo
   e invoque o método mover().

10. Crie uma classe Pagamento com um método processarPagamento(double valor)
    que imprime "Processando pagamento genérico de R$ valor".

Crie duas subclasses:

- PagamentoCartao, que sobrescreve o método para imprimir "Pagamento com cartão
  de crédito: R$ valor".
- PagamentoPix, que sobrescreve o método para imprimir "Pagamento via Pix: R$ valor".

No método main(), crie uma lista de Pagamento com instâncias das duas subclasses e
chame processarPagamento() em cada item.
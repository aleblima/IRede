Unidade 2 - Capítulo 4

1. Crie uma classe Motor com atributos como potencia. Em seguida, crie a classe Carro que
   compõe um Motor. No construtor de Carro, instancie um Motor. Demonstre em um método
   que o Carro não funciona sem o Motor.

2. Crie uma classe Departamento com um nome. Em seguida, crie a classe Professor, que
   recebe um Departamento como parâmetro, mas o departamento pode existir sem o
   professor (agregação). Implemente um método que imprime o nome do departamento de
   um professor.

3. Crie a classe Comodo com atributos como nome e tamanho. Depois crie a classe Casa,
   que possui uma lista de Comodo (composição). Implemente métodos para adicionar e listar
   os cômodos da casa.

4. Crie uma classe Curso com o nome e uma lista de alunos. A classe Aluno deve existir
   independentemente. O curso pode adicionar e remover alunos da sua lista, mas os alunos
   continuam existindo. Demonstre isso em uma classe principal.

5. Crie uma interface Autenticavel com o método autenticar(String senha). Implemente
   essa interface nas classes Usuario e Administrador, cada uma com uma lógica de
   autenticação diferente.

6. Crie uma classe abstrata Veículo com atributos comuns (como modelo e ano) e um
   método abstrato mover(). Depois crie as classes Bicicleta e Carro que estendem Veículo e
   implementam o método mover() com comportamento diferente.

Unidade 2 - Capítulo 5

7. Implemente um método lerNumeroInteiro() que solicita um número ao usuário e retorna
   o valor. Se o usuário digitar algo que não for um número inteiro, o programa deve exibir
   uma mensagem de erro e solicitar a entrada novamente.

8. Implemente um programa com um método que lança uma exceção personalizada
   chamada IdadeInvalidaException se a idade fornecida for menor que 18. Crie a exceção
   personalizada estendendo Exception.

9. Escreva um programa que simule um sistema bancário simples. Crie uma classe
   ContaBancaria com um método sacar(double valor) que lança uma exceção se o saldo for
   insuciente.

10. Crie uma função abrirArquivo(String caminho) que tente abrir um arquivo de texto e ler
    seu conteúdo. Caso o arquivo não exista, capture a exceção e informe o erro ao usuário.
package Java_básico;
import java.time.LocalDate;
import java.util.Scanner;

public class Unidade2_cap1_Alejandro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual questão você deseja acessar?");
        int question = scanner.nextInt();
        switch (question) {
            case (1):
                System.out.println("Qual o nome do titular da conta?");
                String titular = scanner.nextLine();
                System.out.println("Qual o saldo inicial da conta?");
                scanner.nextLine();
                double saldoInicial = scanner.nextDouble();
                Questao1.ContaBancaria conta = new Questao1.ContaBancaria();
                conta.saldo = saldoInicial;
                conta.titular = titular;
                System.out.println("Digite o valor a ser depositado: ");
                double deposito = scanner.nextDouble();
                conta.depositar(deposito);
                break;
            case (2):
                float nota = 7;
                Questao2.Aluno aluno = new Questao2.Aluno();
                aluno.setGrade(nota);
            case (3):
                Questao3.Produto produto = new Questao3.Produto();
                produto.setName("Caneta");
                produto.setPrice(2.5f);
                produto.setQuantity(100);
                produto.getInfo();
                break;
            case (4):
                Questao4.Engenheiro pessoa = new Questao4.Engenheiro();
                pessoa.setEspecialista(true);
                pessoa.saudacao();
                pessoa.renda();
                break;
            case (5):
                Questao5.ProdutoAlimenticio produtoAlimenticio = new Questao5.ProdutoAlimenticio();
                produtoAlimenticio.estaVencido();
                break;
            case (6):
                Questao6.Gerente gerente = new Questao6.Gerente(
                        "Alejandro", 3500.0, "Engenharia");
                break;
            case (7):
                Questao7.Animal[] animais = {new Questao7.Cachorro(), new Questao7.Gato()};
            //  ou Questao7.Animal[] animais = new Questao7.Animal[2]; porém aqui teria que instanciar os objetos depois
                for (Questao7.Animal animal : animais) {
                    animal.fazerSom();
                }
                break;
            case (8):
                Questao8.FuncionarioCLT clt = new Questao8.FuncionarioCLT();
                Questao8.FuncionarioPJ pj = new Questao8.FuncionarioPJ();
                System.out.println("Salário CLT: " + clt.calcularSalario());
                System.out.println("Salário PJ: " + pj.calcularSalario());
                break;
        }
    }

    public class Questao1{
        public static class ContaBancaria{
            private int numero;
            private double saldo;
            private String titular;

            public double getSaldo() {
                return saldo;
            }
            public void depositar(double valor){
                this.saldo += valor;
                System.out.println("Saldo atualizado para: " + this.saldo);
            }
            public void sacar(double valor){
                this.saldo -= valor;
                System.out.println("Saldo atualizado para: " + this.saldo);
            }
        }
    }
    public class Questao2{
        public static class Aluno{
            private String nome;
            private float grade;

            public String getAluno(){
                return this.nome;
            }
            public void setAluno(String nome){
                this.nome = nome;
            }
            public void setGrade(float grade){
                if (grade >= 0 && grade <= 10){
                    this.grade = grade;
                } else {
                System.out.println("A nota deve estar entre 0 e 10.");
                }
            }
            public float getGrade(){
                return this.grade;
            }
        }
    }
    public class Questao3{
        public static class Produto{
            private String name;
            private float price;
            private int quantity;

            public void setName(String name){
                this.name = name;
            }

            public void setPrice(float price){
                this.price = price;
            }

            public void setQuantity(int quantity){
                this.quantity = quantity;
            }
            public void getInfo(){
                System.out.printf("O nome do produto é %s%n", this.name);
                System.out.printf("O preço é R$%.2f%n", this.price);
                System.out.printf("A quantidade é %d%n", this.quantity);
            }
        }
    }
    public class Questao4{

        public static class Pessoa{
            private String nome = "Alejandro";

            public void saudacao(){
                System.out.printf("Olá, meu nome é %s%n", this.nome);
            }
        }

        public static class Funcionario extends Pessoa{
            private double salario = 1700;

            public void renda(){
                System.out.printf("Meu salário é R$%.2f%n", this.salario);
            }
        }

        public static class Engenheiro extends Funcionario{
            private boolean especialista;

            public void setEspecialista(boolean especialista){
                this.especialista = especialista;
                if (especialista){
                    System.out.println("Especialista em Engenharia de Software");
                }
            }
        }
    }
    public class Questao5{
        public static class Produto{
            private String name;
            private float price;
            private int quantity;
        }

        public static class ProdutoAlimenticio extends Produto{
            private LocalDate dataValidade = LocalDate.of(2026, 02, 02);
            
            public void estaVencido(){
                if (LocalDate.now().isAfter(dataValidade)){
                    System.out.println("O produto está vencido.");
                } else {
                    System.out.println("O produto não está vencido.");
                }
            }
        }
    }
    public class Questao6{
        public static class Funcionario{
            private String nome;
            private double salario;

            public Funcionario(String nome, double salario){
                this.nome = nome;
                this.salario = salario;
            }
        }

        public static class Gerente extends Funcionario{
            private String departamento;

            public Gerente(String nome, double salario, String departamento) {
                super(nome, salario);
                this.departamento = departamento;
            }
        }


    }
    public class Questao7{
        public static abstract class Animal{
            private String nome;

            public abstract void fazerSom();
        }
        public static class Cachorro extends Animal{
            @Override
            public void fazerSom(){
                System.out.println( "Au au au! ");
            }
        }
        public static class Gato extends Animal{
            @Override
            public void fazerSom(){
                System.out.println("Miau miau!");
            }
        }
    }
    public class Questao8{
        public static abstract class Funcionario{
            private String nome;
            protected double salario;

            public abstract double calcularSalario();
        }
        public static class FuncionarioCLT extends Funcionario{
            private float INSS = 0.075f;
            @Override
            public double calcularSalario() {
                salario = 500;
                salario -= salario * INSS;
                return salario;
            }
        }
        public static class FuncionarioPJ extends Funcionario{
            private float impostos = 0.1f;

            @Override
            public double calcularSalario() {
                salario = 700;
                salario -= salario * impostos;
                return salario;
            }
        }

    }
    public class Questao9{}
    public class Questao10{}
}

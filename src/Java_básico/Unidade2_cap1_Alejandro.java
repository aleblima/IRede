package Java_básico;
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
                }
                System.out.println("A nota deve estar entre 0 e 10.");
            }
        }
    }
}

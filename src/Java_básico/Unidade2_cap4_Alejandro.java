package Java_básico;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Unidade2_cap4_Alejandro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual questão você deseja acessar?");
        int question = scanner.nextInt();
        switch (question){
            case(1):
                System.out.println("Qual o modelo do carro? ");
                String model = scanner.nextLine();
                System.out.println("Qual a potência do motor? ");
                int potential = scanner.nextInt();
                Questao1.Carro Carro1 = new Questao1.Carro(potential, model);
                System.out.println("Selecione o teste a ser feito:");
                System.out.println("1 - Com motor");
                System.out.println("2 - Sem motor");
                int decision = scanner.nextInt();
                switch (decision){
                    case(1):
                        Carro1.ligarCarro();
                        break;
                    case(2):
                        Carro1.RemoverMotor();
                        Carro1.ligarCarro();
                        break;
                }
            case (2):
                System.out.println("Qual o nome do departamento?");
                scanner.nextLine();
                String nomeDepartamento = scanner.nextLine();
                Questao2.Departamento departamento = new Questao2.Departamento(nomeDepartamento);
                System.out.println("Qual o nome do professor?");
                String nomeProfessor = scanner.nextLine();
                Questao2.Professor professor = new Questao2.Professor(nomeProfessor, nomeDepartamento);
                System.out.println("Selecione a informação que deseja ver:");
                System.out.println("1 - Departamento");
                System.out.println("2 - Departamento e professor");
                decision = scanner.nextInt();
                    switch (decision) {
                        case (1):
                            departamento.MostrarDepartamento();
                            break;
                        case (2):
                            professor.DepartamentoProfessor();
                            break;
                    }
            case (3):
                ArrayList<Questao3.Comodo> comodo = new ArrayList<Questao3.Comodo>();
                Questao3.Comodo quarto = new Questao3.Comodo("quarto", 33);
                Questao3.Comodo cozinha = new Questao3.Comodo("cozinha", 43);
                Questao3.Comodo banheiro = new Questao3.Comodo("banheiro", 23);
                comodo.add(quarto);
                comodo.add(cozinha);
                comodo.add(banheiro);
                Questao3.Casa casa = new Questao3.Casa(comodo);
                ArrayList<Questao3.Comodo> comodos = casa.getComodos();
                for (Questao3.Comodo comodo1 : comodos){
                    System.out.println("Nome do comodo: "+ comodo1.nomeComodo + ", tamanho do comodo: " + comodo1.tamanho);
                }
                break;
            case (4):
                ArrayList<Questao4.Aluno> alunos = new ArrayList<>();
                Questao4.Aluno aluno1 = new Questao4.Aluno("João");
                Questao4.Aluno aluno2 = new Questao4.Aluno("Maria");
                Questao4.Aluno aluno3 = new Questao4.Aluno("José");
                alunos.add(aluno1);
                alunos.add(aluno2);
                alunos.add(aluno3);
                Questao4.Curso curso = new Questao4.Curso("Eng. Software");
                curso.addAluno(aluno1);
                curso.addAluno(aluno2);
                curso.addAluno(aluno3);
                break;
            case (5):
                System.out.println("insira a senha: ");
                scanner.nextLine();
                String senha = scanner.nextLine();
                Questao5.Usuario user = new Questao5.Usuario();
                Questao5.Admin admin = new Questao5.Admin();
                System.out.printf("Escolha entre usuário ou admin%n 1- usuário%n 2- admin");
                int num = scanner.nextInt();
                (num == 1 ? user : admin).autenticar(senha);
                break;
            case (6):
                Questao6.Carro carro = new Questao6.Carro("Opala", 2002);
                Questao6.Bicicleta bicicleta = new Questao6.Bicicleta("Caloi", 2025);
                bicicleta.mover();
                carro.mover();
                carro.getYear();
                bicicleta.getYear();
                break;
            case (7):
                int result = Questao7.lerNumeroInteiro(scanner);
                    System.out.println("Número inteiro: " + result);
                break;
            case (8):
                System.out.println("Digite a sua idade: ");
                int idade = scanner.nextInt();
                    try {
                        Questao8.checkAge(idade);
                    } catch (Questao8.IdadeInvalidaException e){
                        System.out.println(e.getMessage());
                    }
                break;
            case (9):
                Questao9.ContaBancaria conta = new Questao9.ContaBancaria();
                conta.setSaldo(1000);

                try {
                conta.sacar(500);
                }catch (Questao9.SaldoInsuficienteException e){
                    System.out.println(e.getMessage());
                }

                try {
                    conta.sacar(2000);
                }catch (Questao9.SaldoInsuficienteException e){
                    System.out.println(e.getMessage());
                }

                break;
            case (10):

                break;
        }

    }
    public class Questao1{
        public static class Motor{
            private int potential;
                public Motor(int potential) {
                    if (potential <= 0) {
                throw new IllegalArgumentException("Carro sem motor não funciona");
                }
                this.potential = potential;
                 }
        }
            public static class Carro{

                private String model;
                private Motor motor;
                public Carro(int potential,String model){
                    this.model = model;
                    motor = new Motor(potential);
                }
                public void ligarCarro(){
                    if (this.motor == null){
                    System.out.println("O carro não funciona sem motor!");
                    return;
                    }
                    System.out.printf("Motor do carro: %d%n" +
                    "Modelo do carro: %s%n" +
                    "Ligando..",motor, model);
                }
                public void RemoverMotor(){
                this.motor = null;
                }
            }
    }
    public class Questao2{
        public static class Departamento{
            private String nome;

            public Departamento(String nome){
                this.nome = nome;
            }

            public void MostrarDepartamento(){
                System.out.printf("O departamento é: %s%n", this.nome);
            }
        }
        public static class Professor{
            private String nome;
            private Departamento departamento;
            public Professor(String nome, String departamento){
                this.nome = nome;
                this.departamento = new Departamento(departamento);
            }
            public void DepartamentoProfessor(){
                System.out.printf("O departamento do %s é %s%n", nome, departamento.nome);
            }
        }
    }
    public class Questao3{
        public static class Comodo{
            private float tamanho;
            private String nomeComodo;

        public Comodo(String nomeComodo, float tamanho){
            this.nomeComodo = nomeComodo;
            this.tamanho = tamanho;
        }

        }

        public static class Casa{
            private ArrayList<Comodo> comodos;

             Casa(ArrayList<Comodo> comodos){
                this.comodos = comodos;
            }

            public ArrayList<Comodo> getComodos(){
                return comodos;
            }
        }
    }
    public class Questao4{
        public static class Curso{
            private String name;
            private ArrayList<Aluno> alunos;
            public Curso(String name){
                this.name = name;
                this.alunos = new ArrayList<>();
            }

            public void addAluno(Aluno aluno){
                alunos.add(aluno);
            }
            public void removeAluno(Aluno aluno){
                alunos.remove(aluno);
            }

        }

        public static class Aluno{
            private String name;

            public Aluno(String name){
                this.name = name;
            }
            public String getAluno(){
                return name;
            }
        }
    }
    public class Questao5{
        public interface Autenticavel{

            boolean autenticar(String senha);
        }

        public static class Usuario implements Autenticavel{

            @Override
            public boolean autenticar(String senha){
                System.out.println(senha.length() >= 6 ? "Acesso liberado" : "Acesso negado");
                return senha.length() >= 6;
            }
        }

        public static class Admin implements Autenticavel{

            @Override
            public boolean autenticar(String senha){
                boolean verificador = senha.equals("admin");
                System.out.println(verificador ? "Acesso liberado": "Acesso negado");
                return verificador;
            }
        }
    }
    public class Questao6{
        public static abstract class Veiculo{
            private String model;
            private LocalDate year;

            public abstract void mover();

            public Veiculo(String model, LocalDate year){
                this.model = model;
                this.year = year;
            }

            public int getYear() {
                return this.year.getYear();
            }
        }

        public static class Bicicleta extends Veiculo{

            public Bicicleta(String model, int year) {
                super(model, LocalDate.of(year,1, 1));
            }

            @Override
            public void mover() {
                System.out.println("Bicicleta andando");
            }
            @Override
            public int getYear() {
                System.out.printf("O ano da bicicleta é: %d%n", super.getYear());
                return super.getYear();
            }
        }

        public static class Carro extends Veiculo{

            public Carro(String model, int year) {
                super(model, LocalDate.of(year,1, 1));
            }

            @Override
            public void mover(){
                System.out.println("Carro se movendo");
            }

            @Override
            public int getYear() {
                System.out.printf("O ano do carro é: %d%n", super.getYear());
                return super.getYear();
            }
        }

    }
    public static class Questao7{
        public static int lerNumeroInteiro(Scanner scanner) {
            while (true) {
            try{
                System.out.println("Digite um número inteiro: ");
                return scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Erro: não foi digitado um número inteiro.");
                scanner.next();
            }
            }
        }
    }
    public class Questao8{
        public static class IdadeInvalidaException extends Exception{
            public IdadeInvalidaException(String msg){
                super(msg);
            }
        }
         public static int checkAge(int age) throws IdadeInvalidaException {
            if (age < 0 ) {
                throw new IdadeInvalidaException("Idade invalida");
           } else if (age < 18){
                throw new IdadeInvalidaException("Menor de idade não permitido");
            } else {
                System.out.println("Idade permitida");
                return age;
            }
           }
         }
    public class Questao9{
        public static class SaldoInsuficienteException extends Exception{
            public SaldoInsuficienteException(String msg){
                super(msg);
            }
        }

        public static class ContaBancaria{
            private int numero;
            private double saldo;
            private String titular;

            public void setSaldo(double saldo) {
                this.saldo = saldo;
            }

            public double sacar(double valor) throws SaldoInsuficienteException{
                if (valor > saldo){
                    throw new SaldoInsuficienteException("Saldo insuficiente");
                }
                System.out.printf("Saque realizado com sucesso!%n");
                saldo -= valor;
                System.out.printf("Saldo restante %.2f%n", saldo);
                return valor;
            }
        }
    }
    public class Questao10{}
}


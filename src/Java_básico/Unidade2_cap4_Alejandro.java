package Java_básico;
import java.lang.reflect.Array;
import java.util.ArrayList;
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
                scanner.close();
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
                    switch (decision){
                        case(1):
                            departamento.MostrarDepartamento();
                            break;
                        case (2):
                            professor.DepartamentoProfessor();
                            break;
                    }
                    scanner.close();
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

            case (4):

            case (5):

            case (6):

            case (7):

            case (8):

            case (9):

            case (10):

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
    public class Questao4{}
    public class Questao5{}
    public class Questao6{}
    public class Questao7{}
    public class Questao8{}
    public class Questao9{}
    public class Questao10{}
}


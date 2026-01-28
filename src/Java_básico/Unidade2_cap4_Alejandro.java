package Java_básico;

import java.util.Scanner;

public class Unidade2_cap4_Alejandro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

            case(2):
                Carro1.RemoverMotor();
                Carro1.ligarCarro();
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

    }

}


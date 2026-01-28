package Java_básico;

import java.util.Scanner;

public class Unidade1_Alejandro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Questao1 resposta1 = new Questao1();
        Questao2 resposta2 = new Questao2();
        Questao3 resposta3 = new Questao3();
        Questao4 resposta4 = new Questao4();
        Questao5 resposta5 = new Questao5();
        Questao6 resposta6 = new Questao6();
        Questao7 resposta7 = new Questao7();
        Questao8 resposta8 = new Questao8();
        Questao9 resposta9 = new Questao9();
        Questao10 resposta10 = new Questao10();

        System.out.println("Selecione uma das questões para executar (1-10): ");
        int questao = scanner.nextInt();

        switch (questao) {
            case 1:
                resposta1.executar();
                break;
            case 2:
                resposta2.executar();
                break;
            case 3:
                resposta3.executar();
                break;
            case 4:
                resposta4.executar();
                break;
            case 5:
                resposta5.executar();
                break;
            case 6:
                resposta6.executar();
                break;
            case 7:
                resposta7.executar();
                break;
            case 8:
                resposta8.executar();
                break;
            case 9:
                resposta9.executar();
                break;
            case 10:
                resposta10.executar();
                break;
            default:
                System.out.println("Questão inválida.");
        }
    }

    public static class Questao1 {
        public void executar() {
            int numero = 15;
            if (numero > 10 && numero < 20) {
                System.out.printf("O número %d está entre 10 e 20. %n", numero);
            } else {
                System.out.printf("O número %d não está entre 10 e 20. %n", numero);
            }
        }
    }

    public static class Questao2 {
        public void executar() {

            int num = 2;
            boolean istrue = false;
            char letter = 'A';
            float decimal = 4.5f;
            double bigDecimal = 3.14159;
            byte smallNum = 100;
            long bigNum = 100000L;
            short mediumNum = 30000;

            System.out.println("Valores das variáveis:");
            System.out.println("int num: " + num);
            System.out.println("boolean istrue: " + istrue);
            System.out.println("char letter: " + letter);
            System.out.println("float decimal: " + decimal);
            System.out.println("double bigDecimal: " + bigDecimal);
            System.out.println("byte smallNum: " + smallNum);
            System.out.println("long bigNum: " + bigNum);
            System.out.println("short mediumNum: " + mediumNum);
        }
    }

    public static class Questao3 {
        public void executar() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("--- Menu Questão 3 ---");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Subtrair dois números");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double n1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double n2 = scanner.nextDouble();
                    System.out.println("Resultado da Soma: " + (n1 + n2));
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    double s1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double s2 = scanner.nextDouble();
                    System.out.println("Resultado da Subtração: " + (s1 - s2));
                    break;
                case 3:
                    System.out.println("Saindo da Questão 3...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static class Questao4 {
        public void executar(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número (1 a 10) para saber sua tabuada: ");
            int numero = scanner.nextInt();
            int resultado = 0;
            if (numero < 1 || numero > 10) {
                System.out.println("Número inválido! Por favor, digite um número entre 1 e 10.");
                return;
            } else {
                    System.out.printf("Tabuada do %d:%n", numero);
                    for (int i = 1; i <= 10; i++) {
                        resultado = numero * i;
                        System.out.printf("%d x %d = %d%n", numero, i, resultado);
                    }
            }
        }
    }

    public static class Questao5 {
        public void executar() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escreva uma frase: ");
            String frase = scanner.nextLine();
            String frase_nova = frase.replaceAll("(?i)e", "*");
            System.out.println("Frase modificada: " + frase_nova);
        }
    }

    public static class Questao6 {
        public void executar() {
            Scanner scanner = new Scanner(System.in);
            String[] names ={"Maria","Joao","Carlos","Ana","Beatriz"};
            System.out.println("Digite um nome: ");
            String inputName = scanner.next();
            boolean found = false;

            for (String name : names) {
                if (name.equalsIgnoreCase(inputName)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("O nome " + inputName + " foi encontrado na lista.");
            } else {
                System.out.println("O nome " + inputName + " não foi encontrado na lista.");
            }

                   }
    }

    public static class Questao7 {
        public void executar() {
            Scanner scanner = new Scanner(System.in);
            int num = 0;
            int fatorial = 1;

            do {
                System.out.println("Digite um número inteiro:");
                num = scanner.nextInt();
                if (num < 1) {
                    System.out.println("O número é inválido.");
                }
            } while (num < 1);


            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
            System.out.printf("Fatorial de %d é %d%n", num, fatorial);

                   }
    }

    public static class Questao8 {
        public void executar() {
            Scanner scanner = new Scanner(System.in);
            int opcao = 0;
            do {
                System.out.println("--- Menu Questão 8 ---");
                System.out.println("1 - Dizer Olá");
                System.out.println("2 - Dizer Tchau");
                System.out.println("3 - Sair");

                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Olá!");
                        break;
                    case 2:
                        System.out.println("Tchau!");
                        break;
                    case 3:
                        System.out.println("Encerrando");

                }
            } while (opcao != 3);
        }
    }

    public static class Questao9 {
        public void executar() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite seu nome completo: ");
            String nomeCompleto = scanner.nextLine();
            String[] partesNome = nomeCompleto.trim().split(" ");
            String primeiroNome = partesNome[0];
            String ultimoNome = partesNome[partesNome.length - 1];
            System.out.println("Primeiro nome: " + primeiroNome);
            System.out.println("Último nome: " + ultimoNome);
                   }
    }

    public static class Questao10 {
        public void executar() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Escreva uma frase: ");
            String frase = scanner.nextLine();

            String[] palavras = frase.split(" ");
            System.out.println("Número de palavras na frase: " + palavras.length);

                    }
    }
}

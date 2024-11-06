package io.github.mqdev;

import io.github.mqdev.inventory.InventoryService;
import io.github.mqdev.legacy.Service;
import io.github.mqdev.utils.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("==== Testes de Software - Aula 11 ====");
            System.out.println("Escolha uma opção para executar:");
            System.out.println("1 - Aplicando Testes em Projetos Reais");
            System.out.println("2 - Boas Práticas em Testes");
            System.out.println("3 - Estratégias de Testes");
            System.out.println("4 - Integração Contínua e Desafios Futuros");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (choice) {
                case 1:
                    runLegacyServiceExample();
                    break;
                case 2:
                    runStringUtilsExample();
                    break;
                case 3:
                    runInventoryServiceExample();
                    break;
                case 4:
                    System.out.println("A integração contínua é configurada automaticamente via GitHub Actions.");
                    break;
                case 0:
                    exit = true;
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void runLegacyServiceExample() {
        Service service = new Service();
        service.increment();
        System.out.println("Contador após incremento: " + service.getCount());
        service.resetCount();
        System.out.println("Contador após reset: " + service.getCount());
    }

    private static void runStringUtilsExample() {
        StringUtils utils = new StringUtils();
        String reversed = utils.reverse("hello");
        System.out.println("Reverso de 'hello': " + reversed);

        boolean isPalindrome = utils.isPalindrome("A man a plan a canal Panama");
        System.out.println("É palíndromo (A man a plan a canal Panama): " + isPalindrome);
    }

    private static void runInventoryServiceExample() {
        InventoryService inventory = new InventoryService();
        inventory.addProduct("Laptop", 3);

        System.out.println("Disponibilidade de 'Laptop': " + inventory.isProductAvailable("Laptop"));

        inventory.addProduct("Smartphone", 0);
        System.out.println("Disponibilidade de 'Smartphone': " + inventory.isProductAvailable("Smartphone"));
    }
}
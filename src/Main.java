import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String continuar = "sim";

        Set<String> mascGroup = new HashSet<>();
        Set<String> femGroup = new HashSet<>();

        Scanner scanner  = new Scanner(System.in);

        while (continuar.equalsIgnoreCase("sim")) {

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite m se fores do sexo masculino ou f para sexo feminino: ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("m")) {
                mascGroup.add(nome);
            } else if (sexo.equalsIgnoreCase("f")) {
                femGroup.add(nome);
            } else {
                System.out.println("SEXO INVALIDO.");
            }

            System.out.println("GRUPO FEMININO: ");
            System.out.println(femGroup);

            System.out.println("GRUPO MASCULINO: ");
            System.out.println(mascGroup);

            System.out.println("DIGITE SIM SE DESEJA CONTINUAR");
            continuar = scanner.nextLine();
        }

        scanner.close();
    }
}
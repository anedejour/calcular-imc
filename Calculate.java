import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.printf("Sobrenome: ");
        String sobrenome1 = scanner.nextLine();
        System.out.printf("Dia: ");
        int dia1 = scanner.nextInt();
        System.out.printf("Mês: ");
        int mes1 = scanner.nextInt();
        System.out.printf("Ano: ");
        int ano1 = scanner.nextInt();
        System.out.printf("Altura: ");
        double altura1 = scanner.nextDouble();
        System.out.printf("Peso: ");
        double peso1 = scanner.nextInt();
        Register register1 = new Register(nome1, sobrenome1, dia1, mes1, ano1, altura1, peso1);

        System.out.printf("%n%s %s , tem %d anos, %.2f de altura e %.2f kilos. Portanto o seu imc é de: %.2f",
                register1.getFirstName(), register1.getLastName(), register1.getIdade(), register1.getAltura(),
                register1.getPeso(), register1.getImc());
    }
}

package provedorsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa implements InterfaceCliente {

    ArrayList<Cliente> Cliente1 = new ArrayList();
    Scanner scanner = new Scanner(System.in);
    String Cpf2;

    private int ClienteNumero, y;
    boolean c, w = true;
    String f;

    @Override
    public void cadastrarCliente() {
        Cliente cli = new Cliente();
        int limpar = 0;
        do {
            System.out.println("  ");
            limpar++;
        } while (limpar != 99);

        System.out.println("Digite o nome: ");
        cli.setNome(scanner.nextLine());

        System.out.println("Digite o CPF: ");
        cli.setCpf(scanner.nextLine());

        System.out.println("Digite o endereço: ");
        cli.setEndereco(scanner.nextLine());

        System.out.println("Digite o E-mail: ");
        cli.setEmail(scanner.nextLine());

        System.out.println("Digite o telefone: ");
        cli.setnumTelefone(scanner.nextLine());
        Cliente1.add(cli);

        System.out.println("Cliente cadastrado! <3");
    }

    @Override
    public void removerCliente() {

        int limpar = 0;
        do {
            System.out.println("  ");
            limpar++;
        } while (limpar != 99);

        System.out.println("Digite o CPF do Cliente");
        Cpf2 = scanner.nextLine();
        int resultado = 0;
        int voltas = 0;

        for (int i = 0; i < Cliente1.size(); i++) {
            voltas++;
            if (Cliente1.get(i).getCpf().equals(Cpf2)) {
                Cliente1.remove(i);
                System.out.println(Cpf2 + ", excluído com sucesso!");
                resultado++;
            } else if (voltas == Cliente1.size() && resultado == 0) {
                System.out.println("O CPF informado não existe");

            }
        }
    }

    @Override
    public void Buscar() {
        int limpar = 0;
        do {
            System.out.println("  ");
            limpar++;
        } while (limpar != 99);

        System.out.println("Digite o CPF do Cliente");
        Cpf2 = scanner.nextLine();
        int resultado = 0;
        int voltas = 0;

        for (int i = 0; i < Cliente1.size(); i++) {
            voltas++;
            if (Cliente1.get(i).getCpf().equals(Cpf2)) {
                System.out.println("--- DADOS DO USUÁRIO ---");
                System.out.println("Nome: " + Cliente1.get(i).getNome());
                System.out.println("E-mail: " + Cliente1.get(i).getEmail());
                System.out.println("Endereço: " + Cliente1.get(i).getEndereco());
                System.out.println("Telefone: " + Cliente1.get(i).getnumTelefone());
                System.out.println("CPF: " + Cliente1.get(i).getCpf());
                resultado++;

            } else if (voltas == Cliente1.size() && resultado == 0) {
                System.out.println("O CPF informado não existe");
            }

        }
    }
}

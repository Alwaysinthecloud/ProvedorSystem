package provedorsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuInicial {

    ArrayList<Funcionario> listaf = new ArrayList();
    Funcionario master = new Funcionario();
    Cliente mister = new Cliente();
    private int op;
    int i;

    public void primeiroMenu() {
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Escolha a opção desejada: ");
            System.out.println("--------------------------");
            System.out.println("1- Acesso aos Funcionários");
            System.out.println("2- Acesso aos Clientes");
            System.out.println("3- Encerrar sistema");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    do {
                        System.out.println("-------------------------");
                        System.out.println("1- Cadastrar Funcionário ");
                        System.out.println("2- Remover Funcionário ");
                        System.out.println("3- Aumentar Salário ");
                        System.out.println("4- Buscar Funcionário ");
                        System.out.println("5- Sair");
                        System.out.println("-------------------------");
                        System.out.print("Digite a opção desejada: ");
                        op = entrada.nextInt();
                        for (i = 0; i > 100; i++) {
                            System.out.println("");
                        }
                        switch (op) {
                            case 1:
                                master.adicionarFuncionario();
                                System.out.println("Funcionário cadastrado com sucesso! ");
                                break;
                            case 2:
                                master.removerFuncionario();
                                break;
                            case 3:
                                master.aumentarSalario();
                                break;
                            case 4:
                                master.buscar();
                                break;

                        }

                    } while (op != 5);
                case 2:
                    do {
                        System.out.println("-------------------------");
                        System.out.println("1- Cadastrar Cliente ");
                        System.out.println("2- Remover Funcionário ");
                        System.out.println("3- Buscar Cliente ");
                        System.out.println("4- Sair");
                        System.out.println("-------------------------");
                        System.out.print("Digite a opção desejada: ");
                        op = entrada.nextInt();
                        for (i = 0; i > 100; i++) {
                            System.out.println("");
                        }
                        switch (op) {
                            case 1:
                                mister.cadastrarCliente();
                                break;
                            case 2:
                                mister.removerCliente();
                                break;
                            case 3:
                                mister.Buscar();
                                break;

                        }
                    } while (op != 4);

            }
        } while (op != 3);

    }

}

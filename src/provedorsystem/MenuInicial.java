package provedorsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuInicial {

    ArrayList<Funcionario> listaf = new ArrayList();
    Funcionario master = new Funcionario();
    private int op;

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
                        System.out.println("4- Diminuir Salário ");
                        System.out.println("5- Sair");
                        System.out.println("-------------------------");
                        System.out.print("Digite a opção desejada: ");
                        op = entrada.nextInt();
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

                        }
                    } while (op != 5);
            }

        } while (op != 3);
    }

}

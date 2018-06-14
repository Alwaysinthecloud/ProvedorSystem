package provedorsystem;

import java.util.Scanner;
import java.util.ArrayList;

public class Funcionario extends Pessoa implements InterfaceFuncionario {

    private float salario;
    private int op;
    private float aumento;
    public String cpfc;
    //Funcionario funcionario = null;

    public Funcionario() {
    }

    Scanner entrada = new Scanner(System.in);
    ArrayList<Funcionario> listaf = new ArrayList();

    @Override
    public void menuPrincipal() {
    }

    @Override
    public void menuFuncionario() {

    }

    @Override
    public void adicionarFuncionario() {
        Funcionario funcionario = new Funcionario();
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
        System.out.println("Informe o nome: ");
        funcionario.setNome(entrada.nextLine());
        System.out.println("Informe o endereço: ");
        funcionario.setEndereco(entrada.nextLine());
        System.out.println("Informe o Email: ");
        funcionario.setEmail(entrada.nextLine());
        System.out.println("Informe o CPF: ");
        funcionario.setCpf(entrada.nextLine());
        System.out.println("Informe o RG: ");
        funcionario.setRg(entrada.nextLine());
        System.out.println("Informe o número de telefone: ");
        funcionario.setnumTelefone(entrada.nextLine());
        System.out.println("Informe o salário: ");
        funcionario.setSalario(entrada.nextFloat());
        entrada.nextLine();
        listaf.add(funcionario);

    }

    @Override
    public void removerFuncionario() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
        System.out.println("Informe o CPF do funcionário: ");
        cpfc = entrada.nextLine();
        int resultado = 0;
        int voltas = 0;

        for (int i = 0; i < listaf.size(); i++) {
            voltas++;
            if (listaf.get(i).getCpf().equals(cpfc)) {
                listaf.remove(i);
                System.out.println(cpfc + ", excluído com sucesso!");
                resultado++;
            } else if (voltas == listaf.size() && resultado == 0) {
                System.out.println("O CPF informado não existe");

            }
        }
    }

    @Override
    public void aumentarSalario() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
        System.out.println("CPF de quem irá receber aumento: ");
        cpfc = entrada.nextLine();
        System.out.println("Informe em R$ o valor do aumento: ");
        aumento = entrada.nextFloat();
        entrada.nextLine(); //Limpando o teclado 
        int resultado = 0;
        int voltas = 0;

        for (int i = 0; i < listaf.size(); i++) {
            voltas++;
            if (listaf.get(i).getCpf().equals(cpfc)) {
                listaf.get(i).setSalario(listaf.get(i).getSalario() + aumento);
                System.out.println("Novo salário: " + listaf.get(i).getSalario());
                resultado++;
            } else if (voltas == listaf.size() && resultado == 0) {
                System.out.println("O CPF informado não existe");
            }

        }

    }

    @Override
    public void buscar() {
        int voltas = 0;
        int resultado = 0;
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
        System.out.println("Informe o CPF para busca: ");
        cpfc = entrada.nextLine();
        for (int i = 0; i < listaf.size(); i++) {
            voltas++;
            if (listaf.get(i).getCpf().equals(cpfc)) {
                System.out.println("--- DADOS DO USUÁRIO ---");
                System.out.println("Nome: " + listaf.get(i).getNome());
                System.out.println("Endereço: " + listaf.get(i).getEndereco());
                System.out.println("E-mail: " + listaf.get(i).getEmail());
                System.out.println("CPF: " + listaf.get(i).getCpf());
                System.out.println("RG: " + listaf.get(i).getRg());
                System.out.println("Telefone: " + listaf.get(i).getnumTelefone());
                System.out.println("Salário: R$ " + listaf.get(i).getSalario());
                resultado++;
            } else if (voltas == listaf.size() && resultado == 0) {
                System.out.println("O CPF informado não existe");
            }

        }

    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}

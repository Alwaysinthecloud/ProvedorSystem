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
    Scanner pedecpf = new Scanner(System.in);
    Scanner entrada = new Scanner(System.in);
    Scanner pedenome = new Scanner(System.in);
    Scanner endereco = new Scanner(System.in);
    Scanner email = new Scanner(System.in);
    Scanner cpfcan = new Scanner(System.in);
    Scanner pederg = new Scanner(System.in);
    Scanner pedetelefone = new Scanner(System.in);
    Scanner pedesalario = new Scanner(System.in);
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

        System.out.println("Informe o nome: ");
        funcionario.setNome(pedenome.nextLine());
        System.out.println("Informe o endereço: ");
        funcionario.setEndereco(endereco.nextLine());
        System.out.println("Informe o Email: ");
        funcionario.setEmail(email.nextLine());
        System.out.println("Informe o CPF: ");
        funcionario.setCpf(cpfcan.nextLine());
        System.out.println("Informe o RG: ");
        funcionario.setRg(pederg.nextLine());
        System.out.println("Informe o número de telefone: ");
        funcionario.setnumTelefone(pedetelefone.nextLine());
        System.out.println("Informe o salário: ");
        funcionario.setSalario(pedesalario.nextFloat());
        listaf.add(funcionario);

    }

    @Override
    public void removerFuncionario() {
        System.out.println("Informe o CPF do funcionário: ");
        cpfc = pedecpf.nextLine();
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
        System.out.println("CPF de quem irá receber aumento: ");
        cpfc = pedecpf.nextLine();
        System.out.println("Informe em R$ o valor do aumento: ");
        aumento = entrada.nextFloat();
        int resultado = 0;
        int voltas = 0;

        for (int i = 0; i < listaf.size(); i++) {
            voltas++;
            if (listaf.get(i).getCpf().contains(cpfc)) {
                listaf.get(i).setSalario(salario + aumento);
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
        int resultado =0;
        System.out.println("Informe o CPF para busca: ");
        cpfc = pedecpf.nextLine();
                for (int i = 0; i < listaf.size(); i++) {
            voltas++;
            if (listaf.get(i).getCpf().contains(cpfc)) {
                System.out.println("--- DADOS DO USUÁRIO ---");
                System.out.println("Nome: " + listaf.get(i).getNome());
                System.out.println("Endereço: " + listaf.get(i).getEndereco());
                System.out.println("E-mail: " + listaf.get(i).getEmail());
                System.out.println("CPF: " + listaf.get(i).getCpf());
                System.out.println("RG: " + listaf.get(i).getRg());
                System.out.println("Telefone: " + listaf.get(i).getnumTelefone());
                System.out.println("Salário: " + listaf.get(i).getSalario());
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

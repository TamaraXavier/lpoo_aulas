package control;
import dao.ParticipanteDAO;
import model.Participante;

import java.util.List;
import java.util.Scanner;


public class ControllerLeilao {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int opiton = 0;
        do {
            System.out.print("\n _____________Selecione uma Operacao_______________\n");
            System.out.print("\n 1- Inserir Participante." +
                    "\n 2- Atualizar Participante." +
                    "\n 3- Listar todos Participante." +
                    "\n 4- Buscar Participante pelo codigo." +
                    "\n 5- Buscar Participante pelo nome." +
                    "\n 6- Deletar Participante." +
                    "\n 0- Sair.\n");
            opiton = input.nextInt();
            input.nextLine();
            switch (opiton) {
                case 1: inserir();
                    break;
                case 2: atualizar();
                    break;
                case 3: selectParticipantes();
                    break;
                case 4: selectParticipanteById();
                    break;
                case 5: selectParticipanteByNome();
                    break;
                case 6: deletar();
                    break;
                default:
                    if (opiton != 0)
                        System.out.print("Erro.");
            }
        } while (opiton != 0);

    }
    private static void inserir() {
        Participante participante = new Participante();
        System.out.print("\n Cadastro Participante");
        System.out.print("\nDigite o Nome: ");
        participante.setNome(input.nextLine());
        System.out.print("\nDigite o Login: ");
        participante.setLogin(input.nextLine());
        System.out.print("\nDigite a Senha: ");
        participante.setSenha(input.nextLine());
        System.out.print("\nDigite o E-mail: ");
        participante.setEmail(input.nextLine());
        System.out.print("\nDigite o Endereco: ");
        participante.setEndereco(input.nextLine());
        System.out.print("\nDigite o Telefone: ");
        participante.setTelefone(input.nextLine());


        if (ParticipanteDAO.insertParticipante(participante)) {
            System.out.print("\nParticipante cadastrado com sucesso");
        }
        else {
            System.out.print("\nErro!! Não cadastrado!");
        }
    }

    private static void atualizar() {
        System.out.print("\n Atualizar Participante");
        Participante participante = null;
        int option = 0;
        do {
            System.out.print("\nDigite o codigo do Participante.");
            int id_part = input.nextInt();
            input.nextLine();
            if (id_part == 0) {
                option = 0;
            }
            else {
                participante = ParticipanteDAO.selectParticipanteById(id_part);
                if (participante == null) {
                    System.out.print("\nCodigo invalido.");
                }
                else {
                    System.out.print("\nNome: " + participante.getNome());
                    System.out.print("\nFazer alteracao? (0- Sim / 1- Nao)");
                    if (input.nextInt() == 0) {
                        input.nextLine();
                        System.out.print("\n Novo nome: ");
                        participante.setNome(input.nextLine());
                    }
                    System.out.print("\nLogin: " + participante.getLogin());
                    System.out.print("\nFazer alteracao? (0- Sim / 1- Nao)");
                    if (input.nextInt() == 0) {
                        input.nextLine();
                        System.out.print("\nNovo Login: ");
                        participante.setLogin(input.nextLine());
                    }

                    System.out.print("\nSenha: " + participante.getSenha());
                    System.out.print("\nFazer alteracao? (0- Sim / 1- Nao)");
                    if (input.nextInt() == 0) {
                        input.nextLine();
                        System.out.print("\nDigite o novo senha: ");
                        participante.setSenha(input.nextLine());
                    }

                    System.out.print("\nE-mail: " + participante.getEmail());
                    System.out.print("\nFazer alteracao? (0- Sim / 1- Nao)");
                    if (input.nextInt() == 0) {
                        input.nextLine();
                        System.out.print("\nDigite o novo e-mail: ");
                        participante.setEmail(input.nextLine());
                    }

                    System.out.print("\nEndereco: " + participante.getEndereco());
                    System.out.print("\nFazer alteracao? (0- Sim / 1- Nao)");
                    if (input.nextInt() == 0) {
                        input.nextLine();
                        System.out.print("\nNovo Endereco: ");
                        participante.setEndereco(input.nextLine());
                    }
                    System.out.print("\nTelefone: " + participante.getTelefone());
                    System.out.print("\nFazer alteracao? (0- Sim / 1- Nao)");
                    if (input.nextInt() == 0) {
                        input.nextLine();
                        System.out.print("\nNovo Telefone: ");
                        participante.setTelefone(input.next());
                    }
                    //participante.setSituacao(true);
                    if (ParticipanteDAO.updateParticipante((participante))) {
                        System.out.println("\nCadastro atualizada com sucesso: " + participante);
                    }
                    else {
                        System.out.print("\nErro!! Não atualizado!");
                    }
                    option = 1;
                }
            }
        } while (option != 0);
    }

    private static void selectParticipantes() {
        System.out.println("\n Lista de Participantes cadastrados:\n" + ParticipanteDAO.selectParticipantes());
    }

    private static void selectParticipanteById() {
        System.out.print("\nDigite o codigo do Participante: ");
        Participante participante = ParticipanteDAO.selectParticipanteById(input.nextInt());
        input.nextLine();
        if(participante != null) {
            System.out.println(participante);
        }
        else {
            System.out.println("Nao encontrado.");
        }
    }

    private static void selectParticipanteByNome() {
        System.out.print("\nDigite o nome do Participante: ");
        String nome = input.next();
        System.out.println("\nChave da pesquisa: " + nome);
        List<Participante> participantes = ParticipanteDAO.selectParticipantesByName(nome);
        if (participantes.isEmpty()) {
            System.out.println("\nNão encontrado: " + nome);
        }
        else {
            System.out.println(participantes);
        }
    }


    private static void deletar() {
        System.out.print("\nDigite o codigo do Participante: ");
        int id_part = input.nextInt();
        Boolean r = ParticipanteDAO.DeleteParticipante(id_part);

        if (r) {
            System.out.print("\nParticipante deletado!!");
        }
        else {
            System.out.print("\nErro! Codigo nao encontrado!!");
        }
    }

}

package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Aluno;

import java.util.*;

public class AlunoController {

    public static void main(String[] args){
        //1A

        Aluno aluno1 = new Aluno(); //Construtor padrão
        Aluno aluno2 = new Aluno(); //Construtor padrão
        Aluno aluno3 = new Aluno(3, "12345678912", "Anderson", "Furtado", "furtado@gmail.com");
        Aluno aluno4 = new Aluno(4, "12345678913", "Jamily", "Xavier", "JXavier@gmail.com");
        Aluno aluno5 = new Aluno(5, "12345678914", "Vitória", "", "");
        Aluno aluno6 = new Aluno(6, "12345678915", "Samira", "", "");

        //Imprimindo as instâncias com ToString
        System.out.println("Alunos criados com construtores padrão e parametrizado");
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());
        System.out.println(aluno4.toString());
        System.out.println(aluno5.toString());
        System.out.println(aluno6.toString());

        //1B - Alterando aluno 1 e 2 com métodos setters e getters
        System.out.println("Alterando aluno 1 e 2 com métodos setters e getters:");
        System.out.println("Aluno 2");
        aluno1.setId(1);
        aluno1.setCpf("12345678999");
        aluno1.setNome("Alice");
        aluno1.setSobrenome("Har");
        aluno1.setEmail("alicehar@gmail.com");
        System.out.println(aluno1.getId());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getSobrenome());
        System.out.println(aluno1.getEmail());

        System.out.println("Aluno 2");
        aluno2.setId(2);
        aluno2.setCpf("12345678977");
        aluno2.setNome("Tatiana");
        aluno2.setSobrenome("Bandeira");
        aluno2.setEmail("tatib@gmail.com");
        System.out.println(aluno2.getId());
        System.out.println(aluno2.getCpf());
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getSobrenome());
        System.out.println(aluno2.getEmail());

        //2 Coleções List e Map
        // Coleção do tipo List
        List<Aluno> alunosList = new ArrayList<>();
        alunosList.add(aluno1);
        alunosList.add(aluno2);
        alunosList.add(aluno3);
        alunosList.add(aluno4);
        alunosList.add(aluno5);
        alunosList.add(aluno6);
        System.out.println("\nColeção do tipo List\n" + alunosList);

        //Pesquisando id=5 (método filter)
        System.out.println();
        System.out.print("Localizando o Aluno pela chave de pesquisa (id=5): ");
        Aluno AlunoFind = alunosList.stream().filter(c -> c.getCpf().equals(5)).findAny().orElse(null);
        System.out.println(AlunoFind);

        //Ordenando na ordem Decrescente
        System.out.print("Ordenando na ordem decrescente: ");
        alunosList.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println(alunosList);

        //Coleção do Tipo Map
        Map<Integer, Aluno> alunosMap = new HashMap<>();
        alunosMap.put(aluno1.getId(), aluno1);
        alunosMap.put(aluno2.getId(), aluno2);
        alunosMap.put(aluno3.getId(), aluno3);
        alunosMap.put(aluno4.getId(), aluno4);
        alunosMap.put(aluno5.getId(), aluno5);
        alunosMap.put(aluno5.getId(), aluno6);
        System.out.println("\nColeção tipo Map\n" + alunosMap);

        //Pesquisando id=5 (método filter)
        System.out.println("Localizando o Aluno pela chave de pesquisa (id=5): ");
        System.out.println(alunosMap.get(3));



    }

}

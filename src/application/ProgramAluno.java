package application;

import entities.Students;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramAluno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Students> set = new HashSet<>();

        System.out.print("Quantos alunos para o curso A? ");
        int nA = sc.nextInt();
        for (int i = 0; i < nA; i++) {
            int number = sc.nextInt();
            set.add(new Students('A', number));
        }

        System.out.print("Quantos alunos para o curso B? ");
        int nB = sc.nextInt();
        for (int i = 0; i < nB; i++) {
            int number = sc.nextInt();
            set.add(new Students('B', number));
        }

        System.out.print("Quantos alunos para o curso C? ");
        int nC = sc.nextInt();
        for (int i = 0; i < nC; i++) {
            int number = sc.nextInt();
            set.add(new Students('C', number));
        }

        System.out.println("Número de alunos " + set.size());
    }
}

    /*Em um portal de cursos online, cada usuário possui um código único, representado por
    um número inteiro.
    Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
    matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
    é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
    alunos repetidos em mais de um curso.
    O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
    Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
    quantidade total e alunos dele, conforme exemplo.*/

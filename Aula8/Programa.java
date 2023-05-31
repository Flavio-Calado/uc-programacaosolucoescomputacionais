package Aula8;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.setCurso("MEDVET");
        aluno1.setNome("Nilson");
        aluno1.setNotaFinal(70.5);
        aluno1.setRA(12121212);

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("SI");
        aluno2.setNome("Natalia");
        aluno2.setNotaFinal(85.0);
        aluno2.setRA(45454545);        

        Aluno aluno3 = new Aluno();

        aluno3.setCurso("ADM");
        aluno3.setNome("Leonardo");
        aluno3.setNotaFinal(65.0);
        aluno3.setRA(7878787);

        ArrayList<Aluno> turma = new ArrayList<Aluno>();
        // incluir na lista
        turma.add(aluno3);
        turma.add(aluno1);
        turma.add(aluno2);
        turma.add(aluno1);
        // quantos alunos tem na lista?
        System.out.println(turma.size());
        // como é que eu faço para remover?
        turma.remove(aluno2);
        turma.remove(0);
        // quantos alunos tem na lista?
        System.out.println(turma.size());
        // como percorrer todos os itens da lista?
        for(int i = 0; i < turma.size(); i++) {
            Aluno item = turma.get(i);
            System.out.println(item.getNome());
        }        
    }
}

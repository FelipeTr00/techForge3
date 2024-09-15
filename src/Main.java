import Model.Aluno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        dataFormatada.setLenient(false);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();


        // Aniversário
        System.out.println("Data de nascimento (dd/mm/aaaa): ");
        String dataInput = sc.nextLine();
        Date dataNascimento = null;
        dataNascimento = dataFormatada.parse(dataInput);


        // Peso
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        // Altura
        System.out.print("Altura (metros): ");
        double altura = sc.nextDouble();

        // New Aluno
        Aluno aluno = new Aluno(nome, dataNascimento, peso, altura);

        // Retornos
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + aluno.getImc());
        System.out.println("Tenha um ótimo treino =)");



        sc.close();
    }
}

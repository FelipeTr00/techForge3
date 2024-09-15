package Model;

import java.util.Calendar;
import java.util.Date;

import static java.lang.Math.pow;
import static java.lang.Math.round;

public class Aluno {

    private String nome;
    private Date dataNascimento;
    private Double peso;
    private Double altura;
    private int idade;
    private Float imc;


    public Aluno(String nome, Date dataNascimento, Double peso, Double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.altura = altura;
        this.idade = calcularIdade();
        this.imc = calcularIMC();
    }

    public int calcularIdade() {

        Calendar aniversario = Calendar.getInstance();
        aniversario.setTime(dataNascimento);
        int anoNascimento = aniversario.get(Calendar.YEAR);

        Calendar hoje = Calendar.getInstance();
        int anoatual = hoje.get(Calendar.YEAR);

        return anoatual - anoNascimento;
    }

    public void idadeAtual() {
        this.idade = calcularIdade();
    }

    public Float calcularIMC() {
        // IMC = peso / altura ^ 2.
        Float imc = (float) (peso / Math.pow(altura, 2));
        return imc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Float getImc() {
        return imc;
    }

    public void setImc(Float imc) {
        this.imc = imc;
    }
}



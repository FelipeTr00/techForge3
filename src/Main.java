public class Main {
    public static void main(String[] args) {

        // #### NEW UNIVERSIDADE ####
        Universidade princeton = new Universidade("Princeton (Nova Jersey - Estados Unidos da América)");
        Universidade cambridge = new Universidade("Cambridge (Inglaterra)");

        // #### NEW PESSOA ####
        Pessoa albertEinstein = new Pessoa("Albert Einstein", "14/3/1879", princeton);
        Pessoa isaacNewton = new Pessoa("Isaac Newton", "4/1/1643", cambridge);

        System.out.println("- " + albertEinstein.getNome() + " trabalhou como professor em " +
                albertEinstein.getUniversidade() + ".");
        System.out.println("- " + isaacNewton.getNome() + " trabalhou como professor em " +
                isaacNewton.getUniversidade() + ".");
    }
}
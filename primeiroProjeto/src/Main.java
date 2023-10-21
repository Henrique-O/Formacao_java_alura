public class Main {
    public static void main(String[] args) {
        System.out.println("#########################");
        System.out.println("# Esse é o Screen Match #");
        System.out.println("#########################");
        System.out.println("Filme: A noiva Cadáver");

        String nome = "Noiva Cadáver";
        String sinopse = "Filme onde um homem pede a mão de um cadáver em casamento";
        int anoDeLancamento = 2005;
        boolean incluidoNoPlano = true;
        double nota = 9.0;

        System.out.println("Ano de lançamento: " + anoDeLancamento);

        //Média calculada pelas 3 notas de 3 pessoas diferentes
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println("A média é:" + media);
        System.out.println(sinopse);

        /* String nomeP = "Henrique";
        int idade = 20;
        String msg = """
                Olá, eu me chamo %s!
                tenho %d anos
                """.formatted(nomeP, idade);
        System.out.println(msg);

         int x = 10;
        double y = x;
        System.out.println(y);

         */

        double temp = 32;
        double fahren= (temp * 1.8) + 32;
        System.out.println("A temperatura em fahrenheit é: " + fahren);

        int resultadoInt = (int) (fahren);
        System.out.println(resultadoInt);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);











    }
}
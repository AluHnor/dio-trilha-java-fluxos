public class Resultado2 {
    public static void main(String[] args) {
        // Condição ternária
        
        int nota = 9;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}

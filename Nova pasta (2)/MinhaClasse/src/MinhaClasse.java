public class MinhaClasse {

    public static void main(String[] args) {

        String primeironome = "AI QUE";
        String segundonome = "DILIÇA";

        String nomeCompleto = nomeCompleto (primeironome, segundonome);
        System.out.println(nomeCompleto);
    }
    
public static String nomeCompleto (String primeironome, String segundonome) {
    return primeironome.concat(" ").concat(segundonome);
}

}

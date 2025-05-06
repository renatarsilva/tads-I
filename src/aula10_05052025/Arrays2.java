package aula10_05052025;

public class Arrays2 {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        nomes[1] = "";
        for (int i = 0; i < nomes.length; i++) {

            // abaixo, se usar somente um & gerarÃ¡ uma Exception
            if(nomes[i] != null && nomes[i].isEmpty()) {
                System.out.println("EstÃ¡ vazia");
            }

            // um array de Strings inicializa com cada posiÃ§Ã£o null
            if(nomes[i] == null) {
                System.out.println("EstÃ¡ nula");
            }else if(nomes[i].isEmpty()) {
                System.out.println("EstÃ¡ vazia");
            }
        }
    }
}

package aula12_19052025;

//3 - Crie um mÃ©todo que procura um valor em um array bidimensional e retorna um array com a coordenada de onde o valor foi encontrado.
public class ExArray3 {
    public static void main(String[] args) {
        char[][] letras = {
                { 'a', 'b', 'c' },
                { 'd', 'e', 'f' },
                { 'j', 'k', 'l', 'm', 'n' }
        };
        int[] coord = buscar(letras, 'm');
        System.out.println(coord[0]);
        System.out.println(coord[1]);
    }

    public static int[] buscar(char[][] array, char valor) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == valor) {
                    /*
                     * int[] coordenada = new int[2]; coordenada[0] = i; coordenada[1] = j; return
                     * coordenada;
                     */
                    /*
                     * int[] coordenada = {i, j}; return coordenada;
                     */
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}

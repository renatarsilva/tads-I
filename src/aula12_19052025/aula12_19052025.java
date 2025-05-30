package aula12_19052025;

public class aula12_19052025 {
        public static void main(String[] args) {
            String[][] array = new String[15][10];
            preencher(array);
            exibir(array);
        }

        public static void exibir(String[][] array) {
            for(String[] arr : array) {
                for(String s : arr) {
                    System.out.print(s);
                }
                System.out.println();
            }
        }

        public static void preencher(String[][] array) {
            int limite = array[0].length;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == 0 || i == array.length - 1) {
                        array[i][j] = "=";
                    } else if (j < limite) {
                        array[i][j] = "*";
                    } else {
                        array[i][j] = "";
                    }
                }
                limite--;
            }
        }
    }


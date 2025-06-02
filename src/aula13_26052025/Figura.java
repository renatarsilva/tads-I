package aula13_26052025;

public class Figura {
    public static void main(String[] args) {

        String[][] figura = new String[6][10];
        for (int i = 0; i <= figura.length - 1; i++) {
            for (int j = 0; j <= figura[i].length - 1; j++) {
                if (i == 0) {
                    figura[i][j] = ":";
                }
                if (i == 5) {
                    figura[i][j] = "-";
                }

                if (i >= 1 && i <= 4 && j == 0) {
                    figura[i][j] = ".";
                }

                if (i >= 1 && i <= 4 && j == 9) {
                    figura[i][j] = "-";
                }

                if (!(i >= 1) && !(i <= 4) && !(j == 0) || !(j == 9) && figura[i][j] == null) {
                    figura[i][j] = " ";
                }

                System.out.print(figura[i][j]);
            }
            System.out.println("");
        }
    }
}

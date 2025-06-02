package arrays;

public class Arvore {
    public static void main(String[] args) {
        String v[][] = new String[7][11];
        int cont = 0;

        for (int i = 0; i < v.length; i++) {

            for (int j = 0; j < v[i].length; j++) {
                if (i < 5) {
                    if (j < (v[i].length / 2) - cont || j > (v[i].length / 2) + cont) {
                        v[i][j] = " ";
                    }
                    else {
                        v[i][j] = "*";
                    }
                }
                    else if (i == v.length - 1) {
                        if (j == v[i].length / 2) {
                            v[i][j] = "|";
                        }
                        else {
                            v[i][j] = " ";
                        }
                    }
                    else {
                        v[i][j] = "-";
                    }
                }
            cont++;
            }

        for (int i = 0; i < v.length; i++) {

            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j]);
            }
            System.out.println();
        }
    }
}
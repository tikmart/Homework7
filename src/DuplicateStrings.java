public class DuplicateStrings {
    public static void main(String[] args) {
        String[][] matrixStr = {{"a","b","c"},{"d","b","t"},{"d","r","l"}};

        for (int i = 0; i < matrixStr.length; i++) {
            String[] temp = new String[matrixStr[i].length];
            for (int j = 0; j < matrixStr[i].length; j++) {
                temp[j] = matrixStr[i][j];
            }
            for (int m = 0; m < temp.length; m++){
                for (int j =i + 1; j < matrixStr.length; j++) {
                    for (int k = 0; k < matrixStr[j].length; k++) {
                        if (temp[m].equals(matrixStr[j][k])){
                            System.out.println(temp[m] + " is duplicate with index: " + i + " and " + m);
                        }
                    }

                }
            }
        }
    }
}

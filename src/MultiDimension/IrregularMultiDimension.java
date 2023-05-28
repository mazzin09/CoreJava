package MultiDimension;

public class IrregularMultiDimension {
    public static void main(String[] args) {
        int[][] irr= new int[4][];
        irr[0] = new int[1];
        irr[1] = new int[2];
        irr[2] = new int[3];
        irr[3] = new int[4];

        int i, j, k = 0;

        for(i = 0; i < 4; i++){
            for (j = 0; j < i+1; j++){
                irr[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < 4; i++){
            for (j = 0; j < i + 1; j ++){
                System.out.print(irr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

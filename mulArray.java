public class mulArray {
    public static void main(String[] args) {
        int row,col;
        int a [][] ={{1,2,3},{4,5,6},{7,8,9}};
        int b [][] = {{10,11,12},{13,14,15},{16,17,18}};

        row=a.length;
        col=a[0].length;
        
        int mul[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mul[i][j] = a[i][j]*b[i][j];
            }
        }
        for(int k=0;k<row;k++){
            for(int l=0;l<col;l++){
                System.out.print(mul[k][l]+" ");
            }
            System.out.println( );
        }
    }
}

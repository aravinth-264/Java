public class MultiDimendionalArray
{
    public static void main(String[] args)
    {
        int[][] matrix = new int[3][4];
        matrix[0][0]=10;
        matrix[0][1]=10;
        matrix[0][2]=10;
        matrix[1][0]=10;
        matrix[1][1]=10;
        matrix[1][2]=10;
        matrix[2][0]=10;
        matrix[2][1]=10;
        matrix[2][2]=10;
        System.out.println(matrix.length);//it will display the number of rows
        System.out.println(matrix[1].length);//it will display the number of columns present in the 1st row.(because matrix[1])
    }
}

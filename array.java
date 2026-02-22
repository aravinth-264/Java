public class array {
    public static void main(String[] args) {
        int[] number = {10,20,30,40,50};
        System.out.println(number.length);
        for(int i=0;i<number.length;i++)
        {
            System.out.println("The Number "+ number[i]+" present at the index "+i);
        }

        int[] number2= new int[5];
        number2[0]=100;
        number2[1]=200;
        number2[2]=300;
        number2[3]=400;
        number2[4]=500;
        System.out.println("\n");
        for(int i=0;i<number2.length;i++)
        {
            System.out.println("The Number "+ number2[i]+" present at the index "+i);
        }

    }
}

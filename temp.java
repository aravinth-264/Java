public class temp {
    public static void main(String[] args) {
        // Step 1: Declare and initialize array
        int[] temperature = {18,21,19,25,22,20,17};
        int hitemp=temperature[0];
        int lotemp=temperature[0];
        int sum=0;
        for(int i=0;i<temperature.length;i++)
        {
            if(hitemp<temperature[i])
            {
                hitemp=temperature[i];
            }
            if(lotemp>temperature[i])
            {
                lotemp=temperature[i];
            }
            sum+=temperature[i];

        }
        System.out.println("Highest temperature:"+hitemp);
        System.out.println("Lowest temperature:"+lotemp);
        System.out.println("templen"+temperature.length);
        System.out.println("sum:"+sum);
        double avg;
        avg=((double)sum/temperature.length);
        System.out.printf("Average temperature:%.2f",avg);
    }
}

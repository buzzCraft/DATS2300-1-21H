import java.util.Arrays;
public class AlgDat2021_live {
    public static void main (String[] args){
        int[] values = {29,8,7,5,19,1,2};
        final long startTime = System.nanoTime();


        for(int i=0; i< values.length; ++i) {
            int max_index = findMaxValue(values, i);
            //System.out.println("Største tall er: " + values[max_index] + " og er på plass " + max_index);
            values = moveElement(values, max_index, i);
            System.out.println(Arrays.toString(values));

        }


        final long endTime = System.nanoTime();
        System.out.println("Total execution time ns: " + (endTime - startTime));
    }

    /**
     *  findMaxValue
     *  Finner index til største tallet i en array
     * @param val
     * @param y - plass du starter på
     * @return index
     */
    public static int findMaxValue(int[] val, int y){
        int index = y;                                                          // indeks det startes fra
        int length = val.length;                                                //lengden av array
        int max_val = val[index];                                               //henter verdien i plass y det skal sjekkes mot
        for (int i = index+1 ; i < length; i++)                                 // starter med index + 1 (siden index == max_val)
        {
            if (val[i] > max_val)                                                   // Hvis verdien val[i] er større enn max_val
            {
                max_val = val[i];                                                   // settes ny min_val
                index = i;                                                          // index oppdateres
            }
        }
        return index;  // returnerer indeksen/posisjonen til største verdi
    }


    public static int[] moveElement(int[] val, int from, int to){
        int tmp = val[to];
        val[to] = val[from];
        System.out.println("Moving " +val[from] + " from " + from + " to " + to) ;
        val[from] = tmp;
        return val;
    }
}

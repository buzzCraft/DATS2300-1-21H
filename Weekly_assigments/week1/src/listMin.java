import java.util.Arrays;
public class listMin {
    public static void main (String[] args){

        int[] values = {10,8,7,5,19,1};
        final long startTime = System.nanoTime();
/*        for (int i = 0; i < values.length; i++)
        {
            int pos = findMinValue(values, i);
            values=moveElement(values, pos, i);
        }

        System.out.println(Arrays.toString(values));*/
        int[] b = {0,0};
        //b = minMax(values);
        //System.out.println(Arrays.toString(b));
        int n = 10;
        System.out.println(fak(n));
//        System.out.println(("Min = " + values[findMinValue(values, 0)]));
//       System.out.println("Max = " + (values[findMaxValue(values, 0)]));
        final long endTime = System.nanoTime();

        System.out.println("Total execution time ns: " + (endTime - startTime));

    }
    // Funksjon for å finne minste verdi i et array (val), starter fra plassen y
    public static int findMinValue(int[] val, int y){
        if (val.length < 1)                                                     // Array check tatt fra kompendiet
            throw new java.util.NoSuchElementException("Tabellen a er tom!");
        int index = y;                                                          // indeks det startes fra
        int length = val.length;                                                //lengden av array
        int min_val = val[index];                                               //henter verdien i plass y det skal sjekkes mot
        for (int i = index+1 ; i < length; i++)                                 // starter med index + 1 (siden index == min_val)
        {
            if (val[i] < min_val)                                                   // Hvis verdien val[i] er mindre enn min_val
            {
                min_val = val[i];                                                   // settes ny min_val
                index = i;                                                          // index oppdateres
            }
        }
        return index;  // returnerer indeksen/posisjonen til største verdi
    }

    // Funksjon for å finne minste verdi i et array (val), starter fra plassen y
    public static int findMaxValue(int[] val, int y){
        if (val.length < 1)                                                     // Array check tatt fra kompendiet
            throw new java.util.NoSuchElementException("Tabellen a er tom!");
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

    //Funksjon for å bytte to elementer i listen
    public static int[] moveElement(int[] val, int from, int to){
        if (val.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");
        int a = val[from];
        int b = val[to];
        // System.out.println("Moving " +val[from] + " from " + from + " to " + to) ;
        val[from] = b;
        val[to] = a;
        return val;
    }

    //Funksjon for å finne første plassering til minste og største verdi i en tabell
    public static int[] minMax(int[] val){

        int length = val.length;                                                //lengden av array
        int max_val = val[0];
        int min_val = val[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < length; ++i) // 1+n-1+n =2N
        {
            if (val[i] > max_val){ //n-2
                max_val = val[i]; //2log(n)
                maxIndex = i;

            }
            else if (val[i] < min_val){  //n-2
                min_val = val[i];  //2log(n)
                minIndex = i;

            }

        }
        int[] b = {minIndex, maxIndex};
        return b;

    }
    //Regner ut n! med n-1 multiplikasjoner
    public static long fak(int n){
        long fakt = n;
        for (int i = 1; i < n; ++i){
            fakt = (fakt *(n-i));
        }
        return fakt;
    }

}


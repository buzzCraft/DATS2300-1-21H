import java.util.Arrays;
class kortsort2 {
    public static void main (String[] args){
        int[] values = {9,8,1,7,6,5,4,3,2,2,2,2,2,2,3,5,4,2,4,2,1};
        final long startTime = System.nanoTime();
        for (int i = 0; i < values.length; i++)
        {
            int pos = findMinValue(values, i);
            values=moveElement(values, pos, i);
        }
        System.out.println(Arrays.toString(values));
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
}
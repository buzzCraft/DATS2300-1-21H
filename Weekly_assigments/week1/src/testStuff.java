import java.util.Arrays;
public class testStuff {
    public static void main(String[] args) {

        int[] values = {10,8,7,5,19,1};
        final long startTime = System.nanoTime();
        for (int i = 0; i < values.length; i++) {
            int pos = listMin.findMinValue(values, i);
            values = listMin.moveElement(values, pos, i);
        }

        System.out.println(Arrays.toString(values));
        int[] b = {0, 0};
        b = listMin.minMax(values);
        System.out.println(Arrays.toString(b));
        int n = 10;
        System.out.println(listMin.fak(n));
        System.out.println(("Min = " + values[listMin.findMinValue(values, 0)]));
        System.out.println("Max = " + (values[listMin.findMaxValue(values, 0)]));
        final long endTime = System.nanoTime();

        System.out.println("Total execution time ns: " + (endTime - startTime));
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        ArrayBT arrayBT = new ArrayBT();
        arrayBT.SumEvenNumberArrays(new int[]{5, 1, 6, 7, 8, 3, 10, 15, 21});

        int max = arrayBT.maxInArray(new int[]{5, 1, 6, 7, 8, 3, 10, 15, 21});
        System.out.println("Max = " + max);

        arrayBT.CountOccurrences(new int[]{5, 1, 6, 7, 5, 6, 10, 5, 21}, 5);
        arrayBT.CountOccurrences(new int[]{5, 1, 6, 7, 5, 6, 10, 15, 21}, 6);

        arrayBT.SumOfSquaresElements();
    }
}

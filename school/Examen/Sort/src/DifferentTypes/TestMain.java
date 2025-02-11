package DifferentTypes;

public class TestMain {
    public static void main(String[] args) {
        int [] test1 =  {  5, 3, 534, 345, 23, 10, 44, 88, 56, 1};
        int [] result1 = Bubblesort.sort(test1);
        for (int r: result1) {
            System.out.println(r);
        }


    }
}

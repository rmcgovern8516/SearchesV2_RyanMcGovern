public class Runner {

    public static void main(String[] args)
    {
        int[] arr1 = {-20,3,15,81,432};

        // test when the target is in the middle
        int index1 = SearchUtil.binarySearch(arr1,15);
        System.out.println(index1);

        // test when the target is the frst item in the array
        int index2 = SearchUtil.binarySearch(arr1,-20);
        System.out.println(index2);

        // test when the target is in the array - last
        int index3 = SearchUtil.binarySearch(arr1,432);
        System.out.println(index3);

        // test when the target is not in the array
        int index4 = SearchUtil.binarySearch(arr1,53);
        System.out.println(index4);
    }
}

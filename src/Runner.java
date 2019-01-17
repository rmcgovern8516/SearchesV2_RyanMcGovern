public class Runner {

    public static void main(String[] args)
    {
        int[] arr1 = {-20,3,15,81,432};

        int index1 = SearchUtil.binarySearch(arr1,15);
        System.out.println(index1);

        int index2 = SearchUtil.binarySearch(arr1,-20);
        System.out.println(index2);

        int index3 = SearchUtil.binarySearch(arr1,432);
        System.out.println(index3);

        int index4 = SearchUtil.binarySearch(arr1,53);
        System.out.println(index4);
    }
}

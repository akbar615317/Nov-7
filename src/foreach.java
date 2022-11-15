public class foreach {

    public static void main(String[] args) {
        int[] arr = {1,200,3,4,15,6,7,81,9,10};
        for(int i=0;i<=arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    System.out.println("\n");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

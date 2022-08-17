public class LargestAndSmallestArray {
    public static void main(String[] args){
        int arr[] = {1,4,56,3,43,45,98,4,6,9};
        int large,small;
        large = arr[0];
        small = arr[0];
        for(int i=1; i< arr.length; i++)
        {
            if(arr[i] > large)
                large = arr[i];
            else if (arr[i] < small)
                small = arr[i];

        }
        System.out.println("Smallest Number is : " + small);
        System.out.println("Largest Number is : " + large);
    }
}


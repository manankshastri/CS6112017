import java.util.Scanner;

class MergeExample
{
    int[] merge(int arr[], int left, int middle, int right)
    {
        // Find sizes of two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

		/* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

		/*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[left + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[middle + 1+ j];


		/* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = left;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

		/* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

		/* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }

        return arr;
    }

    // Main function that sorts arr[l..r] using
    // merge()
    int[] split(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            split(arr, l, m);
            split(arr , m+1, r);

            // Merge the sorted halves
            return merge(arr, l, m, r);
        }
        return null;
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the limit: ");
        int y = num.nextInt();
        int[] arr = new int[y];

        System.out.println("The Array");
        for(int i=0;i<y;i++)
        {
            arr[i]=num.nextInt();
        }

        MergeExample ob = new MergeExample();
        int[] mergedArray = ob.split(arr, 0, y-1);

        System.out.println("\nSorted array");
        printArray(mergedArray);
    }
}


public class SelectionSort {
    public static void main(String[] args) {
        int[] sample = {4,8,1,9,11,7};

        ascending(sample);
        printArray(sample);
        descending(sample);
        printArray(sample);

    }
    public static int[] ascending(int[] A){
        System.out.println("Ascending sort initiated:");
        for(int i = 0; i < A.length -1; i++){
                int minIndex = i;
            for(int j = i+1; j < A.length; j++){
                if(A[j] < A[minIndex]){
                    minIndex = j;
                }
            }

            int temp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;
        }
        return A;
    }

    public static int[] descending(int[] A){
        System.out.println("Descending sort initiated:");
        for(int i = 0; i<A.length - 1; i++){
            int maxIndex = i;
            for(int j = i+1; j < A.length; j++){
                if(A[j] > A[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = A[maxIndex];
            A[maxIndex] = A[i];
            A[i] = temp;
        }
        return A;
    }

    public static void printArray(int[] A){
        /*for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + ", ");
        }*/
        int i = 0;
        while(i < A.length){
            if(i == A.length -1){
                System.out.print(A[i] + ". \nSorting finished :)\n" );
            }else {
                System.out.print(A[i] + ", ");
            }i++;
        }
    }
}
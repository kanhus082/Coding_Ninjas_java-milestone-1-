public class solution{

    public static void print(int n) {
        //Write your code here
            
            // for(int i = 1; i < n*2; i++){
            //     for(int j = 1; j < n*2; j++){
            //         if(i == 1 || i == n*2-1 || j == 1 || j == n*2-1){
            //             System.out.print(n);
            //         }
            //     }
            // }
            
            int size = 2 * n - 1; 
            int front = 0;
            int back = size - 1;
            int a[][] = new int[size][size];
            while (n != 0) {
                for (int i = front; i <= back; i++) {
                    for (int j = front; j <= back;
                                            j++) {
                        if (i == front || i == back ||
                             j == front || j == back)
                            a[i][j] = n;
                    }
                }
                ++front;
                --back;
                --n;
            }
            print(a,size);
        }
        public static void print(int a[][], int size)
        {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
        }
    }

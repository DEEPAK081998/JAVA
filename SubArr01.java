import java.util.*;

class SubArr01{
    public static void main(String[]args){
        System.out.println("\n!!!!!!!  THE PROGRAM PRINTS SUBARRAY OF THE FIRST ARRAY STARTING FROM THE INDEX WHERE 0 IS PRESENT IN THE SECOND ARRAY !!!!!!!");
        Scanner scn=new Scanner(System.in);
        System.out.println("\nEnter the size of the arrays : ");
        int n=scn.nextInt();

        System.out.println("Enter the first array : ");
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Enter the second array (0's and 1's): ");
        int arr2[]=new int [n];
        for(int i=0;i<n;i++){
            arr2[i]=scn.nextInt();
        }

        System.out.println("\nThe number of subarrays is : "+sortSubArr(arr,arr2));
    }

    public static int sortSubArr(int a[], int b[]){
        int n=b.length;
        int count=0;

        for(int i=0;i<n;i++){
            if(b[i]==0){
                for(int j=i;j<n;j++){
                    System.out.println();
                    for(int k=i;k<=j;k++){
                        System.out.print(a[k]+" ");
                    }
                    count++;
                }
                System.out.println();
            }
        }
        return count;
    }
}
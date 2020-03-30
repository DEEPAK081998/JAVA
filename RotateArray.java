import java.io.*;
import java.util.*;

//ROTATE ARRAY
//RIGHT ROTATION : 1 2 3 4 5 -->  1-> 2-> 3-> 4-> 5->  --> 5 1 2 3 4
//LEFT ROTATION : 1 2 3 4 5 -->  <-1 <-2 <-3 <-4 <-5  --> 2 3 4 5 1

class RotateArray{
    public static void main(String [] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("\nEnter the size of the array : ");
        int n=scn.nextInt();
        
        System.out.print("\nEnter the elements of the array : ");
        int [] arr=new int[n]; 
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
    
        System.out.print("\nEnter the no. of rotations (+ve for right , -ve for left) : ");
        int k=scn.nextInt();

        RotateArray(arr,k);

    }

    public static void reverse(int [] arr,int start,int end){ //function that reverses the array
            while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }

    public static void RotateArray(int [] arr, int k){
        int effc=0; //effective rotations;
        if(k<0){
            effc=k%arr.length+arr.length; //converting negative rotations into positive rotations
        }
        else{
            effc=k%arr.length;  //when rotations increase the array size they begin generating same results hence this gives effective rotations
        }

        reverse(arr,0,arr.length-effc-1);
        reverse(arr,arr.length-effc,arr.length-1);
        reverse(arr,0,arr.length-1);

        System.out.print("\nThe array after rotation is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


import java.util.*;
import java.io.*;

class firstLast{
    public static void main(String[]args) {
        Scanner s=new Scanner(System.in);
        int [] n; int size;
        n=new int[10];  //input array
    
        int first_place=-1;  //stores first place
        int last_place=-1;    //stores last place

        System.out.println(" Enter the number of elements in the array : ");
        size=s.nextInt(); 
        
        int low=0;int high=size-1;
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<size;i++){
            n[i]=s.nextInt();
        }

        int ele;
        System.out.println(" Enter the element you want to search : ");
        ele=s.nextInt();

        while(low<=high){
            int mid=(low+high)/2;
            int temp=mid;

            if(ele==n[mid]){
                first_place=mid;
                last_place=mid;
                while(mid-1>=0&&ele==n[mid-1]){          
                    first_place=mid-1;
                    mid--;
                }
                while(temp+1<=size-1&&ele==n[temp+1]){        
                    last_place=temp+1;
                    temp++;
                }
                break;
            }
            else if(ele<n[mid]){
                high=mid-1;
            }
            else if(ele>n[mid]){
                low=mid+1;
            }
        }

        if(first_place==-1){
            System.out.println(" ELEMENT IS NOT PRESENT IN THE ARRAY.");
        }
        else{
            System.out.println("\n[From index : "+first_place + " to index : " + last_place+"]");
        }
    }
}


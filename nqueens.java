import java.util.*;
import java.io.*;

// possible formations of placing 'n' queens in an 'n*m' size chessboard.

class nqueens{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the dimensions of the chess board (N*M) : ");
        int n=scn.nextInt();
        int m=scn.nextInt();
        int board[][]=new int [n][m];
        System.out.println("\nThe possible formations are ('1' denotes a queen) : ");
        nqueens(board,0);
    }

    static boolean isSafe(int [][]board,int row,int col){
        
        //left diagonal
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        //right diagonal
        for(int i=row-1,j=col+1;i>=0&&j<board[0].length;i--,j++){
            if(board[i][j]==1){
                return false;
            }
        }

        //straight up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]==1){
                return false;
            }
        }

        return true;
    }

    static void displayboard(int [][]board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void nqueens(int [][]board,int n){
    if(n==board.length){
        System.out.println();
        displayboard(board);
        return;
    }

        for(int i=0;i<board[0].length;i++){
            if(n==0||isSafe(board,n,i)==true){
                board[n][i]=1;
                nqueens(board,n+1);
            }
            board[n][i]=0;
        }
    }
}
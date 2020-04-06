import java.util.*;

class mincostMaze{
    public static void main(String [] args){
        //!!!!!! RECURSIVE ALGORITHM !!!!!!//
        Scanner scn=new Scanner(System.in);
        System.out.println("\n Enter the no of row and columns of the maze : ");
        int r=scn.nextInt();
        int c=scn.nextInt();
        int maze[][]=new int [r][c];
        System.out.println("\n Enter the elements of the maze : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                maze[i][j]=scn.nextInt();
            }
        }
        System.out.println("\n The minimum cost of travelling in the maze from top left to bottom right corner is : "+mincostMaze(maze,0,0));
    }

    public static int mincostMaze(int maze[][],int row,int col){
        int n=maze.length;
        int m=maze[0].length;
        if(row==n-1&&col==m-1){  
            return maze[row][col];
        }

        int cost=0;
        int hor=Integer.MAX_VALUE;
        int ver=Integer.MAX_VALUE;
        if(col+1<m){
            hor=mincostMaze(maze,row,col+1);  //calculates the cost of travelling from the next cell horizontally to the destination.
        }
        if(row+1<n){
            ver=mincostMaze(maze,row+1,col);  //calculates the cost of travelling from the next cell vertically to the destination.
        }
        cost=maze[row][col]+Math.min(hor,ver);  //the cost of a cell is the sum of its cost ans the minimum of the next horizontal and vertical cell.
        return cost;
    }
}
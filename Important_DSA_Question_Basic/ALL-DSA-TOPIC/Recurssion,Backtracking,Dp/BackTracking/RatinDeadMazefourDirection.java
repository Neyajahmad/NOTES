public class RatinDeadMazefourDirection {
    private static void print(int sr,int sc, int er,int ec,String s,int maze[][],boolean[][] isVisited){
       if(sr<0 || sc<0 || sr>er || sc>ec) return;
       if (isVisited[sr][sc]==true) return ;
       if (sr==er && sc==ec) {
        System.out.println(s);
        return;
       }

       if(maze[sr][sc]==0) return;
       isVisited[sr][sc]=true;
       // go up
       print(sr-1, sc, er, ec, s+"U", maze,isVisited);

       // go down
       print(sr+1, sc, er, ec, s+"D",maze, isVisited);

       //left
       print(sr, sc-1, er, ec, s+"L",maze, isVisited);

       // right
       print(sr, sc+1, er, ec, s+"R",maze, isVisited);

       // backtracking
       isVisited[sr][sc]=false;
    }
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        int maze[][]={{1,0,1},
                      {1,1,1},
                      {0,0,1}};
        boolean[][] isVisited=new boolean[rows][cols]; // O(n*m).
        print(0,0,rows-1,cols-1,"",maze,isVisited);
    }
    
}

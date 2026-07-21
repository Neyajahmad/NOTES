public class RatmazeOptimize {
        private static void print(int sr,int sc, int er,int ec,String s,int maze[][]){
           if(sr<0 || sc<0 || sr>er || sc>ec) return;
           if (sr==er && sc==ec) {
           System.out.println(s);
           return;
           }

           if(maze[sr][sc]==0) return; //blocked 
           if (maze[sr][sc]==-1) return ; //this was already visited
           //check
           maze[sr][sc]=-1;
           // go up
           print(sr-1, sc, er, ec, s+"U", maze);
    
           // go down
           print(sr+1, sc, er, ec, s+"D",maze);
    
           //left
           print(sr, sc-1, er, ec, s+"L",maze);
    
           // right
           print(sr, sc+1, er, ec, s+"R",maze);
    
           // backtracking
           maze[sr][sc]=1;
        }
        public static void main(String[] args) {
            int rows=3;
            int cols=3;
            int maze[][]={{1,0,1},
                          {1,1,1},
                          {0,0,1}};
            // boolean[][] isVisited=new boolean[rows][cols]; // O(n*m).
            print(0,0,rows-1,cols-1,"",maze);
        }
        
    }

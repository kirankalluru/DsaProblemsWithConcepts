package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(noOfPaths(3,3));
//        path("",2,1);
//        System.out.println(pathRet("",3,3));
//        System.out.println(pathDiagonal("",3,3));
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        System.out.println(pathWithRestrictionsBackTrack("",maze,0,0));
        int[][] path = new int[maze.length][maze[0].length];
        pathPrint("",maze,0,0,path,1);
    }

    static  int noOfPaths(int r,int c){
        if(r==1 || c==1){
            return  1;
        }
        return noOfPaths(r-1,c) + noOfPaths(r,c-1);
    }

    static  void path(String p,int r,int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r>1){
            path(p+"D",r-1,c);
        }

        if (c>1){
            path(p+"R",r,c-1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathRet(p+"D",r-1,c));
        }

        if (c>1){
            list.addAll(pathRet(p+"R",r,c-1));
        }

        return list;
    }


    // if we go in digonal path also--->
    static ArrayList<String> pathDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathDiagonal(p+"D",r-1,c-1));
        }
        if(r>1){
            list.addAll(pathDiagonal(p+"V",r-1,c));
        }

        if (c>1){
            list.addAll(pathDiagonal(p+"H",r,c-1));
        }

        return list;
    }


    // here the maze have some obstacles so we cant pass through them so we have to stop that
    //particular function call;
    //obstacles can be represented on boolean board as false;
    static ArrayList<String> pathWithRestrictions(String p,boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (!maze[r][c]){
            return new ArrayList<>();
        }
        if(r<maze.length-1 && c<maze[0].length-1){
            list.addAll(pathWithRestrictions(p+"D",maze,r+1,c+1));
        }
        if(r < maze.length-1){
            list.addAll(pathWithRestrictions(p+"V",maze,r+1,c));
        }

        if (c < maze[0].length-1){
            list.addAll(pathWithRestrictions(p+"H",maze,r,c+1));
        }

        return list;
    }


    static ArrayList<String> pathWithRestrictionsBackTrack(String p,boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (!maze[r][c]){
            return new ArrayList<>();
        }

        maze[r][c] = false;

        if(r<maze.length-1 && c<maze[0].length-1){
            list.addAll(pathWithRestrictionsBackTrack(p+"d",maze,r+1,c+1));
        }

        if(r < maze.length-1){
            list.addAll(pathWithRestrictionsBackTrack(p+"D",maze,r+1,c));
        }

        if(r > 0){
            list.addAll(pathWithRestrictionsBackTrack(p+"U",maze,r-1,c));
        }


        if (c < maze[0].length-1){
            list.addAll(pathWithRestrictionsBackTrack(p+"R",maze,r,c+1));
        }

        if (c > 0){
            list.addAll(pathWithRestrictionsBackTrack(p+"L",maze,r,c-1));
        }

        //This function is about to over so please make sure to change all the changes has been made just revert those changes
        maze[r][c] = true;

        return list;
    }



    static void pathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            for (int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if(r<maze.length-1 && c<maze[0].length-1){
            pathPrint(p+"d",maze,r+1,c+1,path,step+1);
        }

        if(r < maze.length-1){
            pathPrint(p+"D",maze,r+1,c,path,step+1);
        }

        if(r > 0){
            pathPrint(p+"U",maze,r-1,c,path,step+1);
        }


        if (c < maze[0].length-1){
            pathPrint(p+"R",maze,r,c+1,path,step+1);
        }

        if (c > 0){
            pathPrint(p+"L",maze,r,c-1,path,step+1);
        }

        //This function is about to over so please make sure to change all the changes has been made just revert those changes
        maze[r][c] = true;
        path[r][c] = 0;
    }


}

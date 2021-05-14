import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class Blockade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minesweeper
{
    public static void Runner()
    {
    boolean d = false;
    Random r = new Random();
    Scanner s = new Scanner(System.in);
    System.out.println("grid size");
    int l = s.nextInt();
    String [] [] grid = new String [l+1] [l+1];
    String [] [] mines = new String [l] [l];
    String [] [] numbers = new String [l+2] [l+2];
    boolean [] [] uncovered = new boolean [l+1] [l+1];
    System.out.println("how many mines");
    int m = s.nextInt();
    populateGrids();
    while(d==false)
    {
        
    }
}
public populateGrids()
{
    int c = 0;
    while(c<m)
    {
        int a = r.nextInt(l);
        int b = r.nextInt(l);
        if(!(mines[a][b].equals("☣"))
        {
            mines[a][b]="☣";
            c++;
        }
    }
    for(int i = 1; i < l; i++)
    {
        for(int j = 1; j < l; j++)
        {
            grid[i][j]="■";
        }
    }
    for(int i = 0; i < l; i++)
    {
        grid[i][0]= i + "";
    }
    for(int i = 0; i < l; i++)
    {
        grid[0][i]= i + "";
    }
    for(int i = 1; i < l+1; i++)
    {
        for(int j = 1; j < l+1; j++)
        {
            int v = 0;
            for(int k = -1; k < 2; k++)
            {
                for(int n = -1; n < 2; n++)
                {
                    if(mines[i+k][j+n].equals("☣"))
                    {
                        v = v + 1;
                    }
                }
            }
            if(v==0)
            {
                numbers[i][j] = "□";
            }
            else
            {
                numbers[i][j] = v + "";
            }
        }
    }
    for(int i = 1; i < l+1; i++)
    {
        for(int j = 1; j < l+1; j++)
        {
            uncovered[i][j]=false;
        }
    }
}
public userMove()
{
    System.out.println("row");
    int x = s.nextInt+1;
    System.out.println("column");
    int y = s.nextInt+1;
    thing(x,y)
}
thing(int x, int y)
{
    if(numbers.equals("□")
    {
        for(int i = -1; i < 2; i++)
        {
            for(int j = -1; j < 2; j++)
            {
                uncovered[x+i][y+j]=true;
                if(numbers[x+i][y+j].equals("□")
                {
                    thing(x+i,y+j);
                }
            }
        }
    }
}
printGrid()
{
    for(int i = 0; i < l+1; i++)
    {
        for(int j = 0; j < l+1; j++)
        {
            if(uncovered[i][j])
            {
                
            }
        }
    }
}
}

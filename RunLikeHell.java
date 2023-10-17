// Rhami Thrower
// rh270888 
// COP 3503, Spring 2023

import java.util.*;
import java.io.*;

public class RunLikeHell
{
   
    public static int maxGain(int [] blocks)
    {
        // variables
        int size = blocks.length;
        int [] matrix = new int[size + 1];

        // update matrix base cases
        matrix[0] = 0;
        matrix[1] = blocks[0];

        // dynamic program time 
        for (int i = 2; i < (size + 1); i++)
        {
            matrix[i] = Math.max(matrix[i-1], matrix[i-2] + blocks[i-1]);
        }
        
        return matrix[size];
    }

    public static double difficultyRating()
    {
        return 1.0;
    }
    public static double hoursSpent()
    {
        return 4.5;
    }
}
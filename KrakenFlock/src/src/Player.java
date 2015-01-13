package src;

import java.util.ArrayList;

/**
 *
 * @author Kyle Amos, Kevin Ye
 */
public class Player {

    // Variable Declaration
    private ArrayList<Ship> m_shipList;
    private int[][][] m_placeGrid;
    private int[][][] m_guessingGrid;
    
    /**
     *  Default Constructor
     *  Instantiates and populates the two integer 'grids' with zeros.
     */
    public Player()
    {
        m_placeGrid = new int[10][10][10];
        m_guessingGrid = new int[10][10][10];
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                for(int k = 0; k < 10; k++)
                {
                    m_placeGrid[i][j][k] = 0;
                    m_guessingGrid[i][j][k] = 0;
                }
            }
        }
    }
    
}

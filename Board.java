public class Board
{
  private String[][] squares = new String[10][10]; 

  public Board()
  {
    for(int r = 0; r < squares.length; r++)
    {
      for(int c = 0; c < squares[0].length; c++)
      {
        squares[r][c] = "-";
      }
    }
  }

  public String toString()
  {
    for(int r = 0; r < squares.length; r++)
    {
      for(int c = 0; c < squares[0].length; c++)
      {
        System.out.print(squares[r][c] + " ");
      }
      System.out.println();
    }
    return "";
  }

  public boolean addShip(int row, int col, int len, boolean horizontal)
  {
    if (row < 0 || col < 0 || row >= squares.length || col >= squares[0].length)
    {
      return false;
    }
    if (horizontal)
    {
      if (col + len > squares.length)
      {
        return false;
      }
      for (int i = col; i < col + len; i++)
      {
        if(!squares[row][i].equals("-"))
        {
          return false;
        }
      }

      for (int i = col; i < col + len; i++)
      {
        squares[row][i] = "b";
      }
    }
    else
    {
      // If end of ship is off grid, we return false
      if (row + len > squares[0].length)
      {
        return false;
      }
      
      for (int i = row; i < row + len; i++)
      {
        if(!squares[i][col].equals("-"))
        {
          return false;
        }
      }

      for (int i = row; i < row + len; i++)
      {
        squares[i][col] = "b";
      }
      return true;
    }
  }

  public boolean foundShip(int len)
  {
    return false;
  }

  public int shoot(int row, int col)
  {
    return 0;
  }

  public boolean gameOver()
  {
    for (String[] r : squares)
    {
      for (String s : r)
      {
        if (s.equals("b"))
        {
          return false;
        }
      }
    }
    return true;
  }
}

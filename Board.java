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
    return false;
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
    return false;
  }
}

public class Board
{
  private int ships;
  private int boardHeight;
  private int boardLength;
  private char[][] playerBoard;
  private char[][] computerBoard;
  private int placedShips = 0;
  private int[][][] shipLocations; // First is the ship. Second is the x. Third is the y.

  /**
  * Default ships are 5.
  * The ship number cannot be changed after instantiation to prevent
  * any changes during the game.
  * Default board is 10x10.
  */
  public board()
  {
    playerBoard = new char[10][10];
    computerBoard = new char[10][10];
    boardHeight = 10;
    boardLength = 10;
    for (int i = 0; i < boardHeight; i++)
    {
      for (int j = 0; j < boardLength; j++)
      {
        playerBoard[i][j] = '.';
        computerBoard[i][j] = '.';
      }
    }
    ships = 5;
    shipLocations = new int[][][];
  }
  public board(int ships)
  {
    playerBoard = new char[10][10];
    computerBoard = new char[10][10];
    boardHeight = 10;
    boardLength = 10;
    for (int i = 0; i < boardHeight; i++)
    {
      for (int j = 0; j < boardLength; j++)
      {
        playerBoard[i][j] = '.';
        computerBoard[i][j] = '.';
      }
    }
    this.ships = ships;
  }
  public board(int length, int height)
  {
    playerBoard = new char[height][length];
    computerBoard = new char[height][length];
    boardLength = length;
    boardHeight = height;
    for (int i = 0; i < boardHeight; i++)
    {
      for (int j = 0; j < boardLength; j++)
      {
        playerBoard[i][j] = '.';
        computerBoard[i][j] = '.';
      }
    }
    ships = 5;
  }
  public board(int length, int height, int ships)
  {
    playerBoard = new char[height][length];
    computerBoard = new char[height][length];
    boardLength = length;
    boardHeight = height;
    for (int i = 0; i < boardHeight; i++)
    {
      for (int j = 0; j < boardLength; j++)
      {
        playerBoard[i][j] = '.';
        computerBoard[i][j] = '.';
      }
    }
    this.ships = ships;
  }

  public int getTotalShips()
  {
    return ships;
  }

  public int getPlacedShips()
  {
    return placedShips;
  }

  /**
  * shipType is either 'v' or 'h' (vertical/horizontal).
  * Returns true for success, false for failure.
  * Precondition: xStart and yStart are given as indexes of the array.
  * Ships will be created going down and right for vertical and horizontal respectively.
  */
  public boolean addShip(int xStart, int yStart, int length, char shipType)
  {
    if (placedShips == ships)
    {
      return false;
    }
    if (Character.toUpperCase(shipType).equals(Character.toUpperCase('h')))
    {
      if ((xStart + length < boardLength) && xStart > -1 && length > 0 && yStart > -1)
      {
        for (int i = xStart; i <= xStart + length; i++)
        {
          playerBoard[yStart][i] = 'O';
        }
        placedShips++;
        return true;
      }
    }
    return false;
    else if (Character.toUpperCase(shipType).equals(Character.toUpperCase('v')))
    {
      if ((yStart + length < boardHeight) && xStart > -1 && length > 0 && yStart > -1)
      {
        for (int i = yStart; i <= yStart + length; i++)
        {
          playerBoard[i][xStart] = 'O';
        }
        placedShips++;
        return true;
      }
    }
    return false;
    else
    {
      return false
    }
  }
  
  /**
  * Returns true if ship doesn't border any other ship. False otherwise.
  * Also returns false if ship is unplaceable ie. xStart or yStart are out of bounds etc
  */
  private boolean shipBorders(int xStart, int yStart, )
  {
  }
}

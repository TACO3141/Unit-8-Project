public class Board
{
  private int ships;
  private int boardHeight;
  private int boardLength;
  private char[][] playerBoard;
  private char[][] computerBoard;
  private int placedShips = 0;

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
    playerBoard = new char[length][height];
    computerBoard = new char[length][height];
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
    playerBoard = new char[length][height];
    computerBoard = new char[length][height];
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

  /**
  * shipType is either 'v' or 'h' (vertical/horizontal)
  */
  public void addShip(int xStart, int yStart, int xEnd, int yEnd, char shipType)
  {
    if ()
  }
}

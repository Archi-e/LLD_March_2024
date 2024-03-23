package projects.tictactoe.models;

import java.util.Scanner;

public class Player {
    private int id;
    private String name;
    private PlayerType playerType;
    private char symbol;

    public Player() {

    }

    public Player(int id, String name, PlayerType playerType, char symbol) {
        this.id = id;
        this.name = name;
        this.playerType = playerType;
        this.symbol = symbol;
    }


    public int getId() {
        return id;
    }

    public Move makeMove(Board board){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row number of cell");
        int row = sc.nextInt();

        System.out.println("Enter the col number of cell");
        int col = sc.nextInt();

        //get the played cell
        Cell playedCell = board.getMatrix().get(row).get(col);

        playedCell.setCellStatus(CellStatus.FILLED);
        playedCell.setPlayer(this);

        return new Move(playedCell, this);

    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public char getSymbol() {
        return this.symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return this.playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}

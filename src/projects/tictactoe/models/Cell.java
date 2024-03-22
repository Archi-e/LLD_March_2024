package projects.tictactoe.models;

public class Cell {
    private int row;
    private int col;
    private CellStatus cellStatus;
    private Player player;

    public CellStatus getCellStatus() {
        return cellStatus;
    }

    public void setCellStatus(CellStatus cellStatus) {
        this.cellStatus = cellStatus;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.player = null;
        this.cellStatus = CellStatus.EMPTY;
    }

    public void displayCell(){
        if(player == null){
            System.out.print("| |");
        }
        else{
            System.out.print("| " + player.getSymbol() + " |");
        }
    }
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}

package com.AltaTech.boardgame;

public class Position {

    private int row;
    private int columen;

    public Position(int row, int columen) {
        this.row = row;
        this.columen = columen;
    }

    public int getColumen() {
        return columen;
    }

    public void setColumen(int columen) {
        this.columen = columen;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
    @Override
    public String toString() {
        return row + ", " + columen;
    }
}

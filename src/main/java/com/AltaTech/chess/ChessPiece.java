package com.AltaTech.chess;

import com.AltaTech.boardgame.Board;
import com.AltaTech.boardgame.Piece;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}

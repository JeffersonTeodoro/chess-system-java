package com.AltaTech.chess.pieces;

import com.AltaTech.boardgame.Board;
import com.AltaTech.chess.ChessPiece;
import com.AltaTech.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString() {
        return "R";
    }
}

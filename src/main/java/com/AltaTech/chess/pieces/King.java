package com.AltaTech.chess.pieces;

import com.AltaTech.boardgame.Board;
import com.AltaTech.chess.ChessPiece;
import com.AltaTech.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString() {
        return "K";
    }

}

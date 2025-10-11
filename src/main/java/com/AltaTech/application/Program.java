package com.AltaTech.application;

import com.AltaTech.boardgame.Board;
import com.AltaTech.chess.ChessMatch;

public class Program {
    public static void main(String[] args){

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}

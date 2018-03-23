package fr.purplegiraffe.lependu;

import java.util.ArrayList;

/**
 * Created by mbritto on 06/03/2018.
 */

public class GameController {
    private String _secretWord;
    private ArrayList<Character> _testedChars;
    private int _errorCount = 0;

    public void startNewGame(String secretWord) {
        _secretWord = secretWord.toUpperCase();
        _testedChars = new ArrayList<>();
        _errorCount = 0;
    }

    public void stopGame() {

    }

    public boolean checkWord(String word) {
        return false;
    }

    public boolean checkCharacter(Character character) {
        _testedChars.add(character);
        boolean exists = _secretWord.contains(character.toString().toUpperCase());
        if (exists == false) {
            _errorCount++;
        }
        return exists;
    }

    public boolean hasWon() {
        return false;
    }

    public boolean hasLost() {
        return false;
    }

    public int getErrorCount() {
        return _errorCount;
    }
}

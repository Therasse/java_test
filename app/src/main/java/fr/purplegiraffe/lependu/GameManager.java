package fr.purplegiraffe.lependu;

import java.util.ArrayList;

/**
 * Created by mbritto on 05/03/2018.
 */

public class GameManager {
    enum Status {
        RUNNING,
        WON,
        LOST
    }
    private Status _status;
    private String _secretWord;
    private ArrayList<String> _attempts;
    private int _errorCount = 0;

    public GameManager() {
        startNewGame("HELLO");
    }

    public int getMaxErrorCount() {
        return _secretWord.length();
    }

    public int getCurrentErrorCount() {
        return _errorCount;
    }

    public int getCurrentAttemptCount() {
        return _attempts.size();
    }

    public String getCurrentValue() {
        String value = "";
        char[] letters =  _secretWord.toCharArray();
        for (char letter:letters) {
            if (_attempts.contains(letter+"")) {
                value += letter;
            } else {
                value += "*";
            }
        }
        return value;
    }

    public void startNewGame(String secretWord) {
        _secretWord = secretWord.toUpperCase();
        _attempts = new ArrayList<>();
        _errorCount = 0;
        _status = Status.RUNNING;
    }


    public void addAttempt(char attempt) {
        String normalizedAttempt = (attempt+"").toUpperCase();
        _attempts.add(normalizedAttempt);
        if (_secretWord.contains(normalizedAttempt) == false) {
            _errorCount += 1;
        }
    }

    public Status getStatus() {
        return _status;
    }
}

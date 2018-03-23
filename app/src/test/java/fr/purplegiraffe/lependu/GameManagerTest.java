package fr.purplegiraffe.lependu;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mbritto on 05/03/2018.
 */
public class GameManagerTest {
    GameManager _gameManager;
    final String SECRET_WORD = "HELLO";

    @Before
    public void setup() {
        _gameManager = new GameManager();
        _gameManager.startNewGame(SECRET_WORD);
    }
    @Test
    public void getMaxErrorCount() throws Exception {
        assertEquals(SECRET_WORD.length(),_gameManager.getMaxErrorCount());
    }

    @Test
    public void getCurrentAttemptCount() throws Exception {
        assertEquals(0,_gameManager.getCurrentAttemptCount());
        _gameManager.addAttempt('h');
        assertEquals(1,_gameManager.getCurrentAttemptCount());

    }

    @Test
    public void getCurrentValue() throws Exception {
        assertEquals("*****", _gameManager.getCurrentValue());
        _gameManager.addAttempt('h');
        assertEquals("H****", _gameManager.getCurrentValue());
        _gameManager.addAttempt('a');
        assertEquals("H****", _gameManager.getCurrentValue());
        _gameManager.addAttempt('L');
        assertEquals("H*LL*", _gameManager.getCurrentValue());
    }

    @Test
    public void startNewGame() throws Exception {
    }

    @Test
    public void addAttempt() throws Exception {
    }

}
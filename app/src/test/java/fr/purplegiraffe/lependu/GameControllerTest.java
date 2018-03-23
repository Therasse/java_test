package fr.purplegiraffe.lependu;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mbritto on 06/03/2018.
 */
public class GameControllerTest {
    private GameController _gameController;

    @Before
    public void setUp() throws Exception {
        _gameController = new GameController();
        _gameController.startNewGame("HELLO");
    }

    @Test
    public void startNewGame() throws Exception {
    }

    @Test
    public void stopGame() throws Exception {
    }

    @Test
    public void checkWord() throws Exception {
    }

    @Test
    public void checkCharacter() throws Exception {
    }

    @Test
    public void hasWon() throws Exception {
        assertFalse(_gameController.hasWon());
        _gameController.checkCharacter('h');
        assertFalse(_gameController.hasWon());
        _gameController.checkCharacter('e');
        assertFalse(_gameController.hasWon());
        _gameController.checkCharacter('l');
        assertFalse(_gameController.hasWon());
        _gameController.checkCharacter('o');
        assertTrue(_gameController.hasWon());

        _gameController.checkCharacter('i');
        assertTrue(_gameController.hasWon());
    }

    @Test
    public void hasLost() throws Exception {
    }

    @Test
    public void getErrorCount() throws Exception {
        assertEquals(0, _gameController.getErrorCount());
        _gameController.checkCharacter('A');
        assertEquals(1, _gameController.getErrorCount());
        _gameController.checkCharacter('H');
        assertEquals(1, _gameController.getErrorCount());
        _gameController.checkCharacter('A');
        assertEquals(2, _gameController.getErrorCount());
        _gameController.checkCharacter('l');
        assertEquals(2, _gameController.getErrorCount());

        _gameController.startNewGame("hello");
        assertEquals(0, _gameController.getErrorCount());
        _gameController.checkCharacter('A');
        assertEquals(1, _gameController.getErrorCount());
        _gameController.checkCharacter('H');
        assertEquals(1, _gameController.getErrorCount());
    }











}
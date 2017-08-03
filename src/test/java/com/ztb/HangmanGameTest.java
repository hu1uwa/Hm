package com.ztb;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by z on 2017/8/3.
 */
public class HangmanGameTest {
    HangmanGame hangmanGame;

    @Before
    public void setUp() throws Exception {

        hangmanGame = new HangmanGame("TEST");
    }

    @Test
    public void should_return_answer() throws Exception {
        assertEquals("TEST", hangmanGame.getAnswer());
    }

    @Test
    public void should_return_length_of_the_answer() throws Exception {
        assertEquals(4,hangmanGame.getLength());
    }

    @Test
    public void should_return_used_words() throws Exception {
        assertEquals("AEIOU",hangmanGame.getUsedWords());

    }

    @Test
    public void should_return__E__when_the_game_begin() throws Exception {
        assertEquals("_E__",hangmanGame.getResult());
    }

    @Test
    public void test_guess_one_word() throws Exception {
        assertEquals("TE_T",hangmanGame.guess('T'));

    }
}
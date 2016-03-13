package models;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by michaelhilton on 1/25/16.
 */
public class testGame {

    @Test
    public void testGameCreation(){
        Game g = new Game();
        assertNotNull(g);
    }

    @Test
    public void testGameBuildDeck(){
        Game g = new Game();
        assertEquals(52,g.deck.size());
    }

    @Test
    public void testInitialDeal() {
        Game g = new Game();
<<<<<<< HEAD
        g.theUser.initialDeal();
=======
        User u = new User();
        u.hostGame = g;
        u.initialDeal();

>>>>>>> 1b2dfabfa0f0e24676867cd0f898f50f0b88632b
        assertEquals(2, g.cols.get(0).size());
    }

    @Test //test if the col size increase after hitting
    public void testColSizeAfterHit(){
        Game g = new Game();
<<<<<<< HEAD

=======
        User u = new User();
        u.hostGame = g;
>>>>>>> 1b2dfabfa0f0e24676867cd0f898f50f0b88632b
        g.cols.add(new ArrayList<Card>());
        g.theUser.hit(0);

        assertEquals(1, g.cols.get(0).size());
    }

    @Test //test if user can hit when isStay is true
    public void testisStayForHit() {
        Game g = new Game();
<<<<<<< HEAD

=======
        User u = new User();
        u.hostGame = g;
>>>>>>> 1b2dfabfa0f0e24676867cd0f898f50f0b88632b
        g.cols.add(new ArrayList<Card>());
        g.theUser.zeroStayed = true;
        g.theUser.hit(0);

        //assertEquals(false, u.isBusted);
    }

    @Test //test if user can hit after busted
    public void testisStayAfterBusted() {
        Game g = new Game();
<<<<<<< HEAD
=======
        User u = new User();
        u.hostGame = g;
>>>>>>> 1b2dfabfa0f0e24676867cd0f898f50f0b88632b
        Card card1 = new Card(10, Suit.Clubs, true);
        Card card2 = new Card(10, Suit.Diamonds, true);
        Card card3 = new Card(10, Suit.Hearts, true);
        g.cols.add(new ArrayList<Card>());
        g.theUser.dealCardToCol(0,card1);
        g.theUser.dealCardToCol(0,card2);
        g.theUser.dealCardToCol(0,card3);
        //g.colScore(0);
        g.theUser.isBusted(0);
        assertEquals(true, g.theUser.isBusted);
    }

<<<<<<< HEAD
=======
    @Test
    public void testHitFor3rdCol() {
        Game g = new Game();
        User u = new User();
        u.hostGame = g;
        Card card1 = new Card(10, Suit.Clubs, true);
        Card card2 = new Card(10, Suit.Diamonds, true);
        g.cols.add(new ArrayList<Card>());
        g.dealCardToCol(3,card1);
        g.dealCardToCol(3,card2);
>>>>>>> 1b2dfabfa0f0e24676867cd0f898f50f0b88632b


    @Test
    public void testStay(){
        Game g = new Game();
<<<<<<< HEAD

=======
        User u = new User();
        u.hostGame = g;
>>>>>>> 1b2dfabfa0f0e24676867cd0f898f50f0b88632b
        Card card1 = new Card(8, Suit.Clubs, true);
        Card card2 = new Card(10, Suit.Diamonds, true);
        g.cols.add(new ArrayList<Card>());
        g.theUser.dealCardToCol(0,card1);
        g.theUser.dealCardToCol(0,card2);
        g.theUser.stay(0);

        assertEquals(true, g.theUser.zeroStayed);
    }

    @Test
    public void testNotStay(){
        Game g = new Game();
<<<<<<< HEAD

         
=======
        User u = new User();
        u.hostGame = g;
>>>>>>> 1b2dfabfa0f0e24676867cd0f898f50f0b88632b
        Card card1 = new Card(8, Suit.Clubs, true);
        Card card2 = new Card(10, Suit.Diamonds, true);
        g.cols.add(new ArrayList<Card>());
        g.theUser.dealCardToCol(0,card1);
        g.theUser.dealCardToCol(0,card2);
        g.theUser.stay(3);

        assertEquals(false, g.theUser.zeroStayed);
    }

    @Test
    public void testStayForBusted(){
        Game g = new Game();
<<<<<<< HEAD


=======
        User u = new User();
        u.hostGame = g;
>>>>>>> 1b2dfabfa0f0e24676867cd0f898f50f0b88632b
        Card card1 = new Card(10, Suit.Clubs, true);
        Card card2 = new Card(10, Suit.Diamonds, true);
        Card card3 = new Card(10, Suit.Hearts, true);
        g.cols.add(new ArrayList<Card>());
        g.theUser.dealCardToCol(0,card1);
        g.theUser.dealCardToCol(0,card2);
        g.theUser.dealCardToCol(0,card3);
        //g.colScore(0);
        g.theUser.isBusted(0);

        assertEquals(true, g.theUser.isBusted);
    }

    @Test
    public void testStayFor0ColBusted(){
        Game g = new Game();
<<<<<<< HEAD

=======
        User u = new User();
        u.hostGame = g;
>>>>>>> 1b2dfabfa0f0e24676867cd0f898f50f0b88632b
        Card card1 = new Card(10, Suit.Clubs, true);
        Card card2 = new Card(10, Suit.Diamonds, true);
        g.cols.add(new ArrayList<Card>());
        g.theUser.dealCardToCol(0,card1);
        g.theUser.dealCardToCol(0,card2);
        //g.colScore(0);
        g.theUser.stay(0);

        assertEquals(true, g.theUser.zeroStayed);
    }

    @Test
    public void testStayFor1ColBusted(){
        Game g = new Game();
<<<<<<< HEAD

=======
        User u = new User();
        u.hostGame = g;
>>>>>>> 1b2dfabfa0f0e24676867cd0f898f50f0b88632b
        Card card1 = new Card(10, Suit.Clubs, true);
        Card card2 = new Card(10, Suit.Diamonds, true);
        g.cols.add(new ArrayList<Card>());
        g.theUser.dealCardToCol(1,card1);
        g.theUser.dealCardToCol(1,card2);
        //g.colScore(0);
        g.theUser.stay(1);

        assertEquals(true, g.theUser.oneStayed);
    }

    @Test
    public void testDoubleDown(){
        Game g = new Game();
<<<<<<< HEAD

        int result = g.theUser.doubleDown(20);
=======
        User u = new User();
        u.hostGame = g;
        int result = u.doubleDown(20);
>>>>>>> 1b2dfabfa0f0e24676867cd0f898f50f0b88632b

        assertEquals(40, result);
    }

    @Test
    public void testSplit(){
        Game g = new Game();
<<<<<<< HEAD
=======
        User u = new User();
        u.hostGame = g;
>>>>>>> 1b2dfabfa0f0e24676867cd0f898f50f0b88632b
        Card card1 = new Card(8, Suit.Clubs, true);
        Card card2 = new Card(8, Suit.Diamonds, true);
        g.theUser.dealCardToCol(0, card1);
        g.theUser.dealCardToCol(0, card2);
        g.theUser.split();

        assertEquals(true, g.theUser.isSplit);

    }

    @Test
    public void testNotSplit() {
        Game g = new Game();
<<<<<<< HEAD
=======
        User u = new User();
        u.hostGame = g;
>>>>>>> 1b2dfabfa0f0e24676867cd0f898f50f0b88632b
        Card card1 = new Card(8, Suit.Clubs, true);
        Card card2 = new Card(10, Suit.Diamonds, true);
        g.theUser.dealCardToCol(0, card1);
        g.theUser.dealCardToCol(0, card2);
        g.theUser.split();

        assertEquals(false, g.theUser.isSplit);
    }

    @Test
    public void testSplitForOneCard(){
        Game g = new Game();
<<<<<<< HEAD

=======
        User u = new User();
        u.hostGame = g;
>>>>>>> 1b2dfabfa0f0e24676867cd0f898f50f0b88632b
        Card card1 = new Card(8, Suit.Clubs, true);
        g.theUser.dealCardToCol(0, card1);
        g.theUser.split();

        assertEquals(false, g.theUser.isSplit);
    }

    @Test
    public void testSplitWithOneCardIn2ndCol(){
        Game g = new Game();
<<<<<<< HEAD

=======
        User u = new User();
        u.hostGame = g;
>>>>>>> 1b2dfabfa0f0e24676867cd0f898f50f0b88632b
        Card card1 = new Card(8, Suit.Clubs, true);
        Card card2 = new Card(9, Suit.Clubs, true);
        Card card3 = new Card(7, Suit.Clubs, true);
        g.theUser.dealCardToCol(0, card1);
        g.theUser.dealCardToCol(0, card2);
        g.theUser.dealCardToCol(1, card3);
        g.theUser.split();

        assertEquals(false, g.theUser.isSplit);
    }




}

package unityTest;


import bowling.Game;

import org.junit.*;
import static org.junit.Assert.*;

public class TestBowling {
	private Game g = new Game();

	// @Test
	public void testGameOneThrow() {

		g.add(5);
		assertEquals(5, g.score());

	}

	@Test
	public void testSimpleStrike() {//

		g.add(10);
		g.add(3);
		g.add(6);
		assertEquals(19, g.scoreForFrame(1));
		assertEquals(28, g.score());

	}

	@Test
	public void testPerfectGame() {//

		for (int i = 0; i < 12; i++) {
			g.add(10);
		}
		assertEquals(300, g.score());

	}

	@Test
	public void testEndOfArray() {//

		for (int i = 0; i < 9; i++) {
			g.add(0);
			g.add(0);
		}
		g.add(2);
		g.add(8);
		g.add(10);
		assertEquals(20, g.score());
	}

	@Test
	public void testSampleGame() {//

		g.add(1);
		g.add(4);//5
		g.add(4);
		g.add(5);//14
		g.add(6);
		g.add(4);//29
		g.add(5);
		g.add(5);//49
		g.add(10);//60
		g.add(0);
		g.add(1);//61
		g.add(7);
		g.add(3);//77
		g.add(6);
		g.add(4);//97
		g.add(10);//116
		g.add(2);
		g.add(8);//125
		g.add(6);//-
		assertEquals(133, g.score());
	
	}
	
	@Test
	public void testHeartBreak() {//
		for(int i = 0; i<11; i++)
			g.add(10);
			g.add(9);
			assertEquals(299,g.score());
	}
	@Test
	public void testTenthFrameSpare() {//
		for(int i=0; i<9; i++) 
			g.add(10);
			g.add(9);
			g.add(1);
			g.add(1);
			assertEquals(270, g.score());
		
	}

	@Test
	public void testGameTwoThorwsNoMark() {//

		g.add(5);
		g.add(4);
		assertEquals(9, g.score());
	}

	@Test
	public void testGameForThorwsNoMark() {//

		g.add(5);
		g.add(4);
		g.add(7);
		g.add(2);
		assertEquals(18, g.score());
		assertEquals(9, g.scoreForFrame(1));
		assertEquals(18, g.scoreForFrame(2));

	}

	@Test
	public void testGameSimpleSpare() {//

		g.add(3);
		g.add(7);
		g.add(3);
		assertEquals(13, g.scoreForFrame(1));

	}

	@Test
	public void testGameAfterSpare() {//

		g.add(3);
		g.add(7);
		g.add(3);
		g.add(2);
		assertEquals(13, g.scoreForFrame(1));
		assertEquals(18, g.scoreForFrame(2));
		assertEquals(18, g.score());

	}



}

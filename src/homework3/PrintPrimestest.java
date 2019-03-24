package homework3;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class PrintPrimestest {

	private PrintPrimes p;
    ByteArrayOutputStream out;
    PrintStream ps;
	@Before
	public void setUp(){
		out = new ByteArrayOutputStream();
		ps = new PrintStream(out);
		System.setOut(ps);
	}
	@Test
	public void test() throws IOException{
		out.flush();
		p = new PrintPrimes();
		p.printPrimes(5);
		assertEquals("Prime: 2\r\nPrime: 3\r\nPrime: 5\r\nPrime: 7\r\nPrime: 11\r\n",out.toString());
	}
}

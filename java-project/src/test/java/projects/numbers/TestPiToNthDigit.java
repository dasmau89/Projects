package projects.numbers;

import org.junit.Assert;
import org.junit.Test;

public class TestPiToNthDigit {

	@Test
	public void test() {
		Assert.assertEquals("3.1", PiToNthDigit.calculatePi(1));
		Assert.assertEquals("3.14", PiToNthDigit.calculatePi(2));
		Assert.assertEquals("3.141", PiToNthDigit.calculatePi(3));
		Assert.assertEquals("3.1415", PiToNthDigit.calculatePi(4));
		Assert.assertEquals("3.14159", PiToNthDigit.calculatePi(5));
		Assert.assertEquals("3.141592", PiToNthDigit.calculatePi(6));
		Assert.assertEquals("3.1415926", PiToNthDigit.calculatePi(7));
		Assert.assertEquals("3.14159265", PiToNthDigit.calculatePi(8));
		Assert.assertEquals("3.141592653", PiToNthDigit.calculatePi(9));
		Assert.assertEquals("3.14159265359", PiToNthDigit.calculatePi(10));
	}

}

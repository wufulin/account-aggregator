package com.wufulin.account.captcha;
import static org.junit.Assert.assertFalse;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.wufulin.account.captcha.RandomGenerator;

public class RandomGeneratorTest {

	@Test
	public void testGetRandomString() throws Exception {
		Set<String> randoms = new HashSet<String>(100);

		for (int i = 0; i < 100; i++) {
			String random = RandomGenerator.getRandomString();
			assertFalse(randoms.contains(random));
			randoms.add(random);
		}
	}
}

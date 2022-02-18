package com.desafio1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.MatcherAssert.*;

@SpringBootTest
class Desafio1ApplicationTests {

	@Test
	void contextLoads() {
	}



   @Test
    public void testCustom() {
      assertTrue("Is equal compare", 1==2);
    }

}

package com.example.demotest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



class DemotestApplicationTests {

	Calculator calculator = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void testSum()
	{
		int expected = 3;

		int sum = calculator.doSum(1,1,1);

		assertThat(expected).isEqualTo(sum);
	}

	@Test
	void testProduct()
	{
		int expected = 6;

		int actual = calculator.doProduct(3,2);

		assertThat(actual).isEqualTo(expected);
	}


	@Test
	void testCompare()
	{
		Boolean actual = calculator.doComapre(2,2);

		assertThat(actual).isTrue( );
	}



}

package com.example.AddingTwoNumbers;

import com.example.AddingTwoNumbers.utility.AdditionUtility;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class AddTwoNumbersApplicationTests {
	AdditionUtility addition = new AdditionUtility();
	//
	@Test
	public void testAdd1(){
		assertNotEquals(7, addition.add(5, 4));
	}

}

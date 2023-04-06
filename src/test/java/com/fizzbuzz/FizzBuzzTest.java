package com.fizzbuzz;



import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class FizzBuzzTest {

 
@Test
public void test_should_return_Fizz() {
    int num = 3;
    FizzbuzzPart1 fizzBuzz = new FizzbuzzPart1();
    String result = fizzBuzz.fizzBuzz(num);
    assertEquals("Fizz", result);
}

@Test
public void test_should_return_Buzz() {
    int num = 5;
    FizzbuzzPart1 fizzBuzz = new FizzbuzzPart1();
    String result = fizzBuzz.fizzBuzz(num);
    assertEquals("Buzz", result);
}
@Test
public void test_should_return_Fizzbuzz() {
   int num = 15 ;
   FizzbuzzPart1 fizzBuzz = new FizzbuzzPart1();
   String result = fizzBuzz.fizzBuzz(num);
   assertEquals("FizzBuzz", result);
}
@Test 
public void test_should_return_FIZZ() {
   int number = 33;
   FizzbuzzPart1 fizzBuzz = new FizzbuzzPart1();
   String result = fizzBuzz.fizzOrBuzz(number);
   assertEquals("FIZZ", result);
}

@Test 
public void test_should_return_BUZZ() {
   int number = 5;
   FizzbuzzPart1 fizzBuzz = new FizzbuzzPart1();
   String result = fizzBuzz.fizzOrBuzz(number);
   assertEquals("BUZZ", result);
}

}

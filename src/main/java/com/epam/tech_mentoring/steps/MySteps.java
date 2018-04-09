package com.epam.tech_mentoring.steps;

import com.epam.tech_mentoring.app.Calculator;
import org.jbehave.core.annotations.Given;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.assertj.core.api.Assertions.*;


public class MySteps {
    private Calculator calculator;
    private double result;

    @Given("a calculator")
    public void givenACalculator() {
        calculator = new Calculator();
    }

    @When("I add $number1 and $number2")
    public void whenIAddNumber1AndNumber2(int number1, int number2) {
        result = calculator.sum(number1, number2);
    }

    @When("I multiply $number1 and $number2")
    public void whenIMullNumber1AndNumber2(int number1, int number2) {
        result = calculator.multiply(number1, number2);
    }

    @Then("the result is $result")
    public void thenTheResultIsRes(int expRes) {
        assertThat(result).isEqualTo(expRes).as("Summ is not correct");
    }
    
}

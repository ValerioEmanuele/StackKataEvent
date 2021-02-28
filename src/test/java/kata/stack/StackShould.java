package kata.stack;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackShould {
	private Stack stack;
	
	@BeforeEach
	void init() {
		stack = new Stack();
	}

	@Test
	void notAuthorizePop_when_isEmpty() {
		assertThatExceptionOfType(RuntimeException.class).isThrownBy(() -> {
			stack.pop();
		})
		.withMessage("The stack is empty!");
	}
	
	@Test
	void pushTwoIntegers_and_popTheLastOne() {
		stack.push(67);
		stack.push(100);
		
		assertThat(stack.pop()).isEqualTo(100);
	}
	
	@Test
	void peekLastInteger() {
		stack.push(5);
		assertThat(stack.peek()).isEqualTo(5);
		assertThat(stack.peek()).isEqualTo(5);
	}
	
	@Test
	void notAuthorizePeek_when_isEmpty() {
		assertThatExceptionOfType(RuntimeException.class).isThrownBy(() -> {
			stack.peek();
		})
		.withMessage("The stack is empty!");
	}
	
	@Test
	void notAuthorizePop_when_isFull() {
		stack.push(67);
		stack.push(100);
		stack.push(2);
		stack.push(5);
		stack.push(12);
		
		assertThatExceptionOfType(RuntimeException.class).isThrownBy(() -> {
			stack.push(43);
		})
		.withMessage("The stack is full!");
		
	}

}

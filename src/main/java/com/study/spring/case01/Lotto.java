package com.study.spring.case01;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

		private Set<Integer> numbers;

		public Lotto(){
			// Lotto 539
			numbers = new LinkedHashSet<>();
			Random r = new Random();
			while (numbers.size() <5) {
				numbers.add(r.nextInt(39) + 1);
			}
		}

		public Set<Integer> getNumber() {
			return numbers;
		}

		public void setNumber(Set<Integer> number) {
			this.numbers = numbers;
		}
		
		
}

package org.openl.tablets.tutorial1;

import org.openl.rules.runtime.RuleEngineFactory;
import static java.lang.System.out;

public class Tutorial1DynamicMain {
	public static void main(String[] args) {
		// define the interface
		RuleEngineFactory<HelloDynamic> rulesFactory = new RuleEngineFactory<HelloDynamic>(
				"rules/Tutorial_1.xls", HelloDynamic.class);
		HelloDynamic rules = rulesFactory.makeInstance();
		rules.hello1(12);
		
		// Step 2
		String greeting = null;
		greeting = rules.hello2(20);
		//greeting = tut1.hello21(hour);
		//greeting = tut1.hello22(hour);
		
		
		//Step 3
		//greeting = tut1.hello3(hour);
		if (greeting != null)
			out.println("greeting: " + greeting);		
	}
}
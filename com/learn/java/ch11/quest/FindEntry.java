package com.learn.java.ch11.quest;
import java.util.*;

import com.learn.java.ch10.InvalidOperationException;

enum Operators{
	GREATER , LESSER , EQUAL , NOTEQUAL , AND , OR;
	public static Operators findCondOperator(String condition) throws InvalidOperationException{
		String [] operators = condition.split("[^\\\\W]+");
		String message = "";
		switch(operators[1]) {
			case ">"	:	return GREATER;
			case "<"	:	return LESSER;
			case "="	:	return EQUAL;
			case "!="	:	return NOTEQUAL;
			case "&&"	:	message = "&& cannot be used here :"+condition;
			case "||"	:	message = "|| cannot be used here :"+condition;
			default		:	throw new InvalidOperationException(message==null?"Invalid Operation":message);
		}
	}
	public static Operators findLogOperator(String condition) throws InvalidOperationException{
		String [] operators = condition.split("[^\\\\W]+");
		String message = "";
		switch(operators[1]) {
			case ">"	:	message = "> cannot be used here :"+condition;
			case "<"	:	message = "< cannot be used here :"+condition;
			case "="	:	message = "= cannot be used here :"+condition;
			case "!="	:	message = "!= cannot be used here :"+condition;
			case "&&"	:	return AND;
			case "||"	:	return OR;
			default		:	throw new InvalidOperationException(message==null?"Invalid Operation":message);
		}
	}
	
}
public class FindEntry {	
	boolean currentBoolean;
	public static boolean checkCondition(String condition){
//		int currentOperandIndex = 0;
//		for(Operators operator : operators) {
//			switch(operator) {
//			case GREATER:
//				if(!operands[currentOperandIndex].equalsIgnoreCase("name")) {
//					if(operands[currentOperandIndex].equalsIgnoreCase("age")) {
//						return person.age>Integer.parseInt(operands[currentOperandIndex++]);
//					}
//					return person.salary>Integer.parseInt(operands[currentOperandIndex++]);
//				}	
//				throw new InvalidOperationException("Cannot use \'>\' to compare names");
//			case LESSER:
//				if(!operands[currentOperandIndex].equalsIgnoreCase("name")) {
//					if(operands[currentOperandIndex].equalsIgnoreCase("age")) {
//						return person.age<Integer.parseInt(operands[currentOperandIndex++]);
//					}
//					return person.salary<Integer.parseInt(operands[currentOperandIndex++]);
//				}	
//				throw new InvalidOperationException("Cannot use \'<\' to compare names");
//			case EQUAL:
//				if(operands[currentOperandIndex].equalsIgnoreCase("name")) {
//					return person.toString().equalsIgnoreCase(operands[currentOperandIndex++]);
//				}
//				if(operands[currentOperandIndex].equalsIgnoreCase("age")) {
//						return person.age==Integer.parseInt(operands[currentOperandIndex++]);
//				}
//				return person.salary==Integer.parseInt(operands[currentOperandIndex++]);
//				
//			case NOTEQUAL:
//				if(operands[currentOperandIndex].equalsIgnoreCase("name")) {
//					return !(person.toString().equalsIgnoreCase(operands[currentOperandIndex++]));
//				}
//				if(operands[currentOperandIndex].equalsIgnoreCase("age")) {
//						return !(person.age==Integer.parseInt(operands[currentOperandIndex++]));
//				}
//				return person.salary!=Integer.parseInt(operands[currentOperandIndex++]);
//			
//			default:	
//				throw new InvalidOperationException("Invalid operation!");
//			}
//		}
//		return currentBoolean;
//	}	
		
		String[] operands = condition.split("\\W+");
		
		return true;
	}
	public static StringTokenizer splitConditions(String conditionalStatement) {
		conditionalStatement = conditionalStatement.trim();	
		StringTokenizer conditions = new StringTokenizer(conditionalStatement,"&|");
		int i=0;
		String ithCondition;
		StringTokenizer abc;
		while(conditions.hasMoreElements()) {
			ithCondition = conditions.nextToken();
			System.out.println(ithCondition);
			checkCondition(ithCondition);
		}
		return conditions;
		
	}
	public static void main(String[] args) {
		System.out.println("Enter condition to search : ");
		try(Scanner scanner = new Scanner(System.in)){
			String conditionalStatement = scanner.nextLine();
			StringTokenizer conditions = splitConditions(conditionalStatement);
			
				
		}
	}
}


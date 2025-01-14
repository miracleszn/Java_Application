import java.util.Scanner;

public class GlobalWarmingFactsQuiz{
	
	public static int score;
	public static int option;
	public static int correctOption;
	public static int wrongOption;
	
	public static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args){
		
		
		
		System.out.println("WELCOME TO GLOBAL WARMING FACTS QUIZ");
		GlobalWarmingFactsQuiz.instruction();
		
		// calling question all questions;
		GlobalWarmingFactsQuiz.question1();
		GlobalWarmingFactsQuiz.question2();
		GlobalWarmingFactsQuiz.question3();
		GlobalWarmingFactsQuiz.question4();
		GlobalWarmingFactsQuiz.question5();
		GlobalWarmingFactsQuiz.totalScoring();
	}
	
	
	public static void instruction(){
		System.out.println("Enter the correct option from 1 - 4");
	}
	
	// Question 1 - prompt
	public static void question1(){
		System.out.println("Question 1: What is the primary argument made by global \n\t warming skeptics regarding the role of CO2 in climate change?");
		System.out.printf("1. CO2 is not a greenhouse gas.%n");
		System.out.printf("2. CO2 is a greenhouse gas, but its impact on climate change is negligible.%n");
		System.out.printf("3. CO2 is a greenhouse gas, but its increase in the atmosphere is not caused by human activities.%n");
		System.out.printf("4. CO2 is a greenhouse gas, and its increase in the atmosphere is caused by human activities, but it has a positive impact on the environment.%n");
		System.out.print("Enter Here: ");
		option = input.nextInt();
		GlobalWarmingFactsQuiz.scoringQuestion1();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
	}
	
	// Question 1 - Scoring
	public static void scoringQuestion1(){
		if(option == 2){
			correctOption++;
		} else if(option == 1 || option == 3 || option == 4){
			wrongOption++;
		} else{
			System.out.println("Invalid Option");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------");
			GlobalWarmingFactsQuiz.question1();
		}
	}
	
	// Question 2 - prompt
	public static void question2(){
		System.out.println("Question 2: Which of the following statements is often \n\t made by global warming skeptics regarding climate models?");
		System.out.printf("1. Climate models are too complex and take into account too many variables.%n");
		System.out.printf("2. Climate models are too simplistic and fail to account for important variables.%n");
		System.out.printf("3. Climate models are accurate and reliable predictors of future climate change.%n");
		System.out.printf("4. Climate models are only used by scientists who support the idea of human-caused climate change..%n");
		System.out.print("Enter Here: ");
		option = input.nextInt();
		GlobalWarmingFactsQuiz.scoringQuestion2();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
	}
	
	// Question 2 - Scoring
	public static void scoringQuestion2(){
		if(option == 2){
			correctOption++;
		} else if(option == 1 || option == 3 || option == 4){
			wrongOption++;
		} else{
			System.out.println("Invalid Option");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------");
			GlobalWarmingFactsQuiz.question2();
		}
	}
	
	// Question 3 - prompt
	public static void question3(){
		System.out.println("Question 3: What is the argument made by some global warming skeptics \n\t regarding the Medieval Warm Period?");
		System.out.printf("1. The Medieval Warm Period was a global phenomenon that was warmer than the current period.%n");
		System.out.printf("2. The Medieval Warm Period was a regional phenomenon that only occurred in Europe.%n");
		System.out.printf("3. The Medieval Warm Period was not warmer than the current period.%n");
		System.out.printf("4. The Medieval Warm Period is not relevant to the current discussion of climate change.%n");
		System.out.print("Enter Here: ");
		option = input.nextInt();
		GlobalWarmingFactsQuiz.scoringQuestion3();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
	}
	
	// Question 3 - Scoring
	public static void scoringQuestion3(){
		if(option == 1){
			correctOption++;
		} else if(option == 2 || option == 3 || option == 4){
			wrongOption++;
		} else{
			System.out.println("Invalid Option");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------");
			GlobalWarmingFactsQuiz.question3();
		}
	}
	
		// Question 4 - prompt
	public static void question4(){
		System.out.println("Question 4: Which of the following statements is often made by global warming skeptics regarding \n\t the impact of climate change on global sea levels?");
		System.out.printf("1. Climate change will cause a significant increase in global sea levels.%n");
		System.out.printf("2. Climate change will cause a small increase in global sea levels.%n");
		System.out.printf("3. Climate change will have no impact on global sea levels.%n");
		System.out.printf("4. Climate change will cause a decrease in global sea levels.%n");
		System.out.print("Enter Here: ");
		option = input.nextInt();
		GlobalWarmingFactsQuiz.scoringQuestion4();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
	}
	
	// Question 4 - Scoring
	public static void scoringQuestion4(){
		if(option == 3){
			correctOption++;
		} else if(option == 2 || option == 1 || option == 4){
			wrongOption++;
		} else{
			System.out.println("Invalid Option");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------");
			GlobalWarmingFactsQuiz.question4();
		}
	}
	
	// Question 5 - prompt
	public static void question5(){
		System.out.println("Question 5: What is the argument made by some global warming skeptics \n\t regarding the consistency of global temperature records?");
		System.out.printf("1. The global temperature records are consistent and reliable.%n");
		System.out.printf("2. The global temperature records are inconsistent and unreliable due to the urban heat island effect.%n");
		System.out.printf("3. The global temperature records are inconsistent and unreliable due to changes in measurement techniques.%n");
		System.out.printf("4. The global temperature records are only available for the past few decades.%n");
		System.out.print("Enter Here: ");
		option = input.nextInt();
		GlobalWarmingFactsQuiz.scoringQuestion5();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
	}
	
	// Question 5 - Scoring
	public static void scoringQuestion5(){
		if(option == 2){
			correctOption++;
		} else if(option == 3 || option == 1 || option == 4){
			wrongOption++;
		} else{
			System.out.println("Invalid Option");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------");
			GlobalWarmingFactsQuiz.question5();
		}
	}
	
	public static void totalScoring(){
		System.out.println(correctOption);
		System.out.println(wrongOption);
		if(correctOption == 5){
			System.out.println("Excellent");
		} else if(correctOption == 4){
			System.out.println("Very Good");
		} else if(correctOption <= 3){
			System.out.println("Time to brush up on your knowledge of global warming");
		} else
			System.out.println("Unexpected Error");
	}
}










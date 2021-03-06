package com.amazonaws.lambda.studytime.responses;

public final class ResponseGeneral {

	public static final String WELCOME = "Welcome to Study Time, powered by Quizlet. Say study followed by your set's name to study one of your sets. For help say help.";
	public static final String HELP = "To study one of your sets, say, study set name. You can shuffle, flipover, and go to the previous and next cards when in a set. Once you have finished a card, ask for the next one and I will provide the answer to the previous question as well. Note that you can only study your personal sets.";
	public static final String NO_ACCESS_TOKEN = "You haven't yet linked your Quizlet account. Please do so before moving forward.";
	public static final String ERROR = "An unexpeted error occured, please try again.";
}

package com.amazonaws.lambda.studytime;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;
 
public class PreviousIntentHandler implements RequestHandler {
 
     @Override
     public boolean canHandle(HandlerInput input) {
    	 return false;
     }
 
     @Override
     public Optional<Response> handle(HandlerInput input) {
         String speechText = "Welcome to the Study Time, powered by Quizlet";
         return input.getResponseBuilder()
                 .withSpeech(speechText)
                 .withSimpleCard("HelloWorld", speechText)
                 .withReprompt(speechText)
                 .build();
     }
 
}
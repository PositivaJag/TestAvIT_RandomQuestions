/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.TestAvIT;

/**
 *
 * @author Jenni
 */
public class Main {
    
    public static void main(String[] args) throws Exception{
    
    String filePath = "C:\\Users\\Jenni\\OneDrive - ltu.se\\2021 VT\\Test av IT-system\\3 Data\\QuestionsTestAvIT\\src\\main\\java\\org\\TestAvIT\\Questions.txt";
    
    QuestionsList listOfQuestions = new QuestionsList(filePath);
    System.out.println(listOfQuestions.toString());
    
    listOfQuestions.getAllQuestions();
    
    listOfQuestions.printRandomQuestion();
    
    
    
    
}
}
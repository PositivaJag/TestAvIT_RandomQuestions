/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.TestAvIT;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jenni
 */
public final class QuestionsList {
    private File file;
    private Scanner input;
    private ArrayList<Question> questionList;
    
    public QuestionsList(String file) throws Exception{
            File tempFile = new File(file);
            if (tempFile.exists()){
                this.file = tempFile;
                input = new Scanner(this.file);
                    }
           else
               throw new Exception("File "+tempFile.getName()+" don´t exist");
    }
    
    public void getAllQuestions(){
      
        String temp;
        int count = 0;
        
        while (input.hasNextLine()){
            temp = input.nextLine();
            this.questionList.add(new Question(temp, count));
            count++;
//            System.out.println(this.questionList.get(count-1).toString());
        }
    }
    
    public void printRandomQuestion(){
        int num = getRandomNumber(questionList.size());
        System.out.println(this.questionList.get(num).toString());
        
    }
    
    public int getRandomNumber(int max){
        Random rand = new Random();
        int randomInt = rand.nextInt(max);
        return randomInt;
    }

   
    @Override
    public String toString(){
       return "File: "+file.getName();
    }
    
   
    
}

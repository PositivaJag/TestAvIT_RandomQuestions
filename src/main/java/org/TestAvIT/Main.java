/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.TestAvIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jenni
 */
public class Main {

    private static File file;
    private static Scanner input;
    private static Scanner userIn = new Scanner(System.in);
    private static String keyIn;
    private static ArrayList<String> questionList;
    
    //Change to your path. 
    private static String filePath = "QuestionsTestAvIT\\src\\main\\java\\org\\TestAvIT\\Questions.txt"; 
    
    private static int qCount = 1;
    public static void main(String[] args) throws Exception {

        //List questions to questionList.
        listQuestions();
        System.out.println("Press ENTER for the NEXT question");
        System.out.println("Press Q+Enter to QUIT\n");

        do{
        printRandomQuestion();
       // System.out.println("Next? Press ENTER");
        keyIn = userIn.nextLine();
        }while(!keyIn.equalsIgnoreCase("Q"));

    }

    public static void listQuestions() throws Exception {
        try {
            checkInputFile();
            //Create Scanner for reading file.
            questionList = new ArrayList<>(100);
            input = new Scanner(file);
            while (input.hasNextLine()) {
                String temp = input.nextLine();
                questionList.add(temp);
                //System.out.println(temp);

            }
            //System.out.println(questionList.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkInputFile() throws FileNotFoundException, Exception {
        File tempFile = new File(filePath);
        if (tempFile.exists()) {
            file = tempFile;
        } else {
            throw new Exception("File " + tempFile.getName() + " don´t exist");
        }
    }

    public static void printRandomQuestion() throws Exception {
        //Get random question.
        int num = getRandomQuestion();

        //Print and set question as seen.
        System.out.println(questionList.get(num));
        questionList.set(num, null);
    }

    public static int getRandomQuestion() throws Exception{
        int count = 0;  //Use to control the number of tries.
        int num;
        //while a question cant be fount
        do{
            num = getRandomNumber();
            count ++;
          //  System.out.println(questionList.get(num));
        } while (questionList.get(num) == null && count<20);
        //If the loop have run more than
        if (count >= 20){
            listQuestions();
            num = getRandomQuestion();
        }
        return num;

    }

    public static int getRandomNumber() {
        Random rand = new Random();
        int randomInt = rand.nextInt(questionList.size());

        return randomInt;
    }
}

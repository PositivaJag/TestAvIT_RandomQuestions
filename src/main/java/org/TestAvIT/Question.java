package org.TestAvIT;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jenni
 */
public class Question {
    String question;
    int id; 

    public Question(String question, int id) {
        this.question = question;
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "Question #"+this.id+":\n"+question+"\n";
    }
}

package com.dohru.myenglish.model;

public class Question {
    private String Question;
    private String AnswerA;
    private String AnswerB;
    private String AnswerC;
    private String AnswerD;
    private String CorrectAnswer;
    private String CategoryId;
    private String IsImageQuestion;

    public Question() {

    }

    public Question(String question, String answerA, String answerB, String answerC, String answerD, String correctAnswer,
                    String categoryId, String isImageQuestion) {
        setQuestion(question);
        setAnswerA(answerA);
        setAnswerB(answerB);
        setAnswerC(answerC);
        setAnswerD(answerD);
        setCorrectAnswer(correctAnswer);
        setCategoryId(categoryId);
        setIsImageQuestion(isImageQuestion);
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswerA() {
        return AnswerA;
    }

    public void setAnswerA(String answerA) {
        AnswerA = answerA;
    }

    public String getAnswerB() {
        return AnswerB;
    }

    public void setAnswerB(String answerB) {
        AnswerB = answerB;
    }

    public String getAnswerC() {
        return AnswerC;
    }

    public void setAnswerC(String answerC) {
        AnswerC = answerC;
    }

    public String getAnswerD() {
        return AnswerD;
    }

    public void setAnswerD(String answerD) {
        AnswerD = answerD;
    }

    public String getCorrectAnswer() {
        return CorrectAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        CorrectAnswer = correctAnswer;
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(String categoryId) {
        CategoryId = categoryId;
    }

    public String getIsImageQuestion() {
        return IsImageQuestion;
    }

    public void setIsImageQuestion(String isImageQuestion) {
        IsImageQuestion = isImageQuestion;
    }
}
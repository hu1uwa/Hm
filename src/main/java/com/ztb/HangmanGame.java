package com.ztb;

/**
 * Created by z on 2017/8/3.
 */
public class HangmanGame {
    private String answer ="";
    private String usedwords = "AEIOU";
    private String result="";
    private char[] resultArray;

    public HangmanGame(){}

    public HangmanGame(String answer) {
        this.answer = answer;
    }


    public String getAnswer() {
        return answer;
    }

    public int getLength() {
        return answer.length();
    }

    public String getUsedWords() {
        return usedwords;
    }

    public String getResult() {
        resultArray = new char[answer.length()];
        for (int i = 0; i < answer.length(); i++) {
            if (include(answer.charAt(i))) {
                resultArray[i]=answer.charAt(i);
            }else{
                resultArray[i]='_';
            }
        }
        return String.valueOf(resultArray);
    }

    private boolean include(char c) {
        for (int i = 0; i < usedwords.length(); i++) {
            if (usedwords.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    public String guess(char guessChar) {
        usedwords +=guessChar;
        return getResult();
    }
}

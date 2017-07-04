package com.example.codetribe.quiz;

/**
 * Created by Codetribe on 2017/06/22.
 */

public class Question {
    int q1;

    public int getQ1() {
        return q1;
    }

    public void setQ1(int q1) {
        this.q1 = q1;
    }

    public int getQ2() {
        return q2;
    }

    public void setQ2(int q2) {
        this.q2 = q2;
    }

    int q2;
    public Question(int q1, int q2) {
        this.q1 = q1;
        this.q2 = q2;
    }
    public Question(){

    }


}

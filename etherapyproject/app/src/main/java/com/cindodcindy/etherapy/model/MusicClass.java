package com.cindodcindy.etherapy.model;

public class MusicClass {
    String title;
    int score=10;
    int score_dua=10;

    int score_tiga=0;
    int score_empat=0;

    String jawabA, jawabB, jawabC, jawabD;

    public int getScore_tiga() {
        return score_tiga;
    }

    public void setScore_tiga(int score_tiga) {
        this.score_tiga = score_tiga;
    }

    public int getScore_empat() {
        return score_empat;
    }

    public void setScore_empat(int score_empat) {
        this.score_empat = score_empat;
    }

    public int getScore() {
        return score;
    }

    public MusicClass(int score, int score_dua) {
        this.score = score;
        this.score_dua=score_dua;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public MusicClass() {
    }

    public int getScore_dua() {
        return score_dua;
    }

    public void setScore_dua(int score_dua) {
        this.score_dua = score_dua;
    }

    public MusicClass(String jawabA, String jawabB, String jawabC, String jawabD){
        this.jawabA=jawabA;
        this.jawabB=jawabB;
        this.jawabC=jawabC;
        this.jawabD=jawabD;
    }


    public String getJawabA() {
        return jawabA;
    }

    public void setJawabA(String jawabA) {
        this.jawabA = jawabA;
    }

    public String getJawabB() {
        return jawabB;
    }

    public void setJawabB(String jawabB) {
        this.jawabB = jawabB;
    }

    public String getJawabC() {
        return jawabC;
    }

    public void setJawabC(String jawabC) {
        this.jawabC = jawabC;
    }

    public String getJawabD() {
        return jawabD;
    }

    public void setJawabD(String jawabD) {
        this.jawabD = jawabD;
    }

    public MusicClass(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

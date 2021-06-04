package com.cindodcindy.etherapy.model;

public class MusicClass {
    String title;
    String score;
    String score_dua;

    String score_tiga;
    String score_empat;

    String jawabA, jawabB, jawabC, jawabD;

    public MusicClass(String title,  String jawabA, String jawabB, String jawabC, String jawabD) {
        this.title = title;
        this.jawabA = jawabA;
        this.jawabB = jawabB;
        this.jawabC = jawabC;
        this.jawabD = jawabD;
    }



    public MusicClass() {
    }

    public MusicClass(String jawabA, String jawabB, String jawabC, String jawabD){
        this.jawabA=jawabA;
        this.jawabB=jawabB;
        this.jawabC=jawabC;
        this.jawabD=jawabD;
    }

    public String getScore_tiga() {
        return score_tiga;
    }

    public void setScore_tiga(String score_tiga) {
        this.score_tiga = score_tiga;
    }

    public String getScore_empat() {
        return score_empat;
    }

    public void setScore_empat(String score_empat) {
        this.score_empat = score_empat;
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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getScore_dua() {
        return score_dua;
    }

    public void setScore_dua(String score_dua) {
        this.score_dua = score_dua;
    }
}

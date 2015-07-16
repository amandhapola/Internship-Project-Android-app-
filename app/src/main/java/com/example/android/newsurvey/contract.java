package com.example.android.newsurvey;

import android.provider.BaseColumns;

/**
 * Created by amandhapola on 03/07/15.
 */
public class contract {
    public contract() {}

    public class questions implements BaseColumns {

//        Log.v("contract","inside contract");
        public   String TABLE_NAME = "questions";
//        public   String COLUMN_ENTRY_ID = "entryid";
        public   String COLUMN_QUESTION = "question";
        public   String COLUMN_CHOICE1 = "choice1";
        public   String COLUMN_CHOICE2 = "choice2";
        public   String COLUMN_CHOICE3 = "choice3";
        public   String COLUMN_CHOICE4 = "choice4";
        public   String COLUMN_CHOICE5 = "choice5";
        public   String COLUMN_CHOICE6 = "choice6";
        public   String COLUMN_CHOICE7 = "choice7";
        public   String COLUMN_CHOICE8 = "choice8";
        public   String COLUMN_CHOICE9 = "choice9";
        public   String COLUMN_CHOICE10 = "choice10";
        public   String COLUMN_CHOICE11 = "choice11";
        public   String COLUMN_DESC = "desc";
        public   String ANSWER="answer";
        public   String question,answer,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,desc;
        public questions(){

        }
        public questions(String ques,String c1,String c2,String c3,String c4,String c5,String c6,String c7,String c8,
                         String c9,String c10,String c11,String desc,String ans){
            this.question=ques;
            this.c1=c1;
            this.c2=c2;
            this.c3=c3;
            this.c4=c4;
            this.c5=c5;
            this.c6=c6;
            this.c7=c7;
            this.c8=c8;
            this.c9=c9;
            this.c10=c10;
            this.c11=c11;
            this.desc=desc;
            this.answer=ans;
        }
        public  String getQuestion(){
            return this.question;
        }
        public  String getAnswer(){
            return this.answer;
        }
        public  String getC1(){
            return this.c1;
        }
        public  String getC2(){
            return this.c2;
        }
        public  String getC3(){
            return this.c3;
        }
        public  String getC4(){
            return this.c4;
        }
        public  String getC5(){
            return this.c5;
        }
        public  String getC6(){
            return this.c6;
        }
        public  String getC7(){
            return this.c7;
        }
        public  String getC8(){
            return this.c8;
        }
        public  String getC9(){
            return this.c9;
        }
        public  String getC10(){
            return this.c10;
        }
        public  String getC11(){
            return this.c11;
        }
        public  String getDesc(){
            return this.desc;
        }
    }

}

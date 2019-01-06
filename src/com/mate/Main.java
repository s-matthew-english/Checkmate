package com.mate;


import board.*;
import java.io.*;
import java.lang.*;
import java.util.*;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;



import org.json.simple.parser.JSONParser;


public class Main{





    public static void main(String[] args) throws Exception {

        /*
        if (arg == null){
            throw new IOException("Proper Usage: Check data.json\n");
        }
        */


        //read in Chess Data file
        FileReader f = new FileReader("ChessData.json");


        Object fileObj = new JSONParser().parse(f);


        //type casting obj to json array -- this is the array of rows
        JSONArray rowArr = (JSONArray) fileObj;

        /*
        String test = rowArr.get(0).toString();
        System.out.println(test);

        String test1 = test.substring(10);
        System.out.println(test1);

        int len = test1.length();
        String test2 = test1.substring(0,(len-2));
        System.out.println(test2);

        String [] arr1 = test2.split(",");
        String test3 = arr1[0];
        System.out.println(test3);


        String test4 = test3.substring(13, (test3.length() - 2));
        System.out.println(test4);

        for (int i = 0; i < arr1.length; i++){
            arr1[i] = arr1[i].substring(13, (arr1[i].length() - 2));
            System.out.println(arr1[i]);
        }
        */

        /*
        String pic = "BlackRook";
        if (pic.charAt(0) == 'B'){
            System.out.println("Black");
            String picT = pic.replaceAll("Black","");
            System.out.println("picT");
            System.out.println(picT.charAt(0));
        }
        */
        /*
        // Breaks after this
        Square[][] boardArr = new Board().fillBoard(rowArr);

        //b.fillBoard(rowArr);

        System.out.println(boardArr[0][1].color);

        /*
        should have filled out board by now

         */

        Board b = new Board(rowArr);




    }
}



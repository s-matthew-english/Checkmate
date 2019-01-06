package com.mate;


import board.*;
import java.io.*;
import java.lang.*;

import org.json.simple.JSONArray;
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



        Board b = new Board(rowArr);




    }
}



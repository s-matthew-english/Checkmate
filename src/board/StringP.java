package board;

public class StringP{

    public Character[] id(String str){
        if (str.charAt(0) == 'B'){

            String nm = str.replaceAll("Black","");

            Character[] retArr = {'B', nm.charAt(0)};

            return retArr;

        }else{
            String nm = str.replaceAll("White","");
            Character[] retArr = {'W', nm.charAt(0)};
            return retArr;
        }
    }


    //takes in string representing row in json file, returns array of string names, including blanks
    public String[] SqArr(String s){

        String fst = s.substring(10, (s.length() - 2));

        System.out.println(fst);

        //should get us too
        String [] arr = fst.split(",");

        for (int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);
            if( arr[i].length() == 2){
                arr[i] = "Empty";
                System.out.println(arr[i]);
            }else {
                arr[i] = arr[i].substring(13, (arr[i].length() - 2));
                System.out.println(arr[i]);
            }
        }
        return arr;
    }


}

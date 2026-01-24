
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Comparator;


       class Main{
                        //static String [] words = {"abnBanana", "abnCherry", "abnMango", "abnOrange"};

            static String compare(String[] strs){

                    String st = "";
                    String common="";
                    int flag = 0;
                    Arrays.sort(strs, Comparator.comparingInt(String::length));

                    if(strs.length == 1){
                        return strs[0];
                    }
                    for(int y = 0; y<strs[0].length(); y++){
                        st +=strs[0].charAt(y);
                        for(int x = 1; x<strs.length; x++){

                            if(strs[x].startsWith(st) !=true){
                                flag = 1;

                            }
                        }
                            if(flag == 0){
                                common = st;
                            }else{
                                flag = 0;
                            }
                    }
    
                     return common;
                                
                       }


            public static void main(String[] a){
                    String s = "Hello there";

                    String [] words = {"flower","flow","flight"};
                    //String [] words = {"abab","aba","abc"};

                        s = compare(words);
                    System.out.println(s);


                }
}
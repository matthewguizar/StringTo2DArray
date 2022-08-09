import java.lang.reflect.Array;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){

    String s="[[4, 2, 2, 4], [3, 4, 5, 6], [6, 7, 8, 9], [3, 2, 1, 4]]";
    s=s.replace("[","");//replacing all [ to ""
    // System.out.println(s);
    s=s.substring(0,s.length()-2);//ignoring last two ]]
    // System.out.println(s);
    String s1[]=s.split("],");//splitting all by "],"
    // System.out.println(Arrays.toString(s1));
    String matrics[][] = new String[s1.length][s1.length];//declaring two dimensional matrix for input

    for(int i=0;i<s1.length;i++){
        s1[i]=s1[i].trim();//ignoring all extra space if the string s1[i] has
        String singleInt[]=s1[i].split(", ");//separating integers by ", "
        ;
        for(int j=0;j<singleInt.length;j++){
            matrics[i][j]=singleInt[j];//adding single values
        }
    }

    //printing result
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            System.out.print(matrics[i][j]+" ");
        }
        System.out.println("");
     }

    }
}
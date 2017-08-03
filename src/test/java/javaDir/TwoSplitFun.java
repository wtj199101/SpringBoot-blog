package javaDir;

/**
 * Created by Administrator on 2017/08/01.
 */
public class TwoSplitFun {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        int value=7;
        System.out.println(TwoSplitFun(array,array.length-1,0,value));
    }

    private static int TwoSplitFun(int[] array,int max,int min, int value) {
        if(max<value||min>value){
            return value;
        }
        if(array[(max+min)/2]==value){
             return (max+min)/2;
        }
        if(array[(max+min)/2]>value){
           return TwoSplitFun(array,(max+min)/2,0,value);
        }else if(array[(max+min)/2]<value){
          return  TwoSplitFun(array,max,(max+min)/2,value);
        }
        return -1;
    }

}

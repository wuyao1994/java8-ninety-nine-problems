package com.elvis.Genericity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BoxDemo {
    /**
     * 1.类型变量只在方法参数列表或返回值中的一处被调用,
     * 那么类型推测的结点就是直接传递 的参数类型或返回的值的类型
     * @param <T>
     * @param value
     */
    public static<T> void onlyOneCall(T value){
        System.out.println(value);
    }
    /**
     *参数多次调用且传递参数类型相同,那么就会传入参数的实际类型
     * @param <T>
     * @param a
     * @param b
     * @return
     */
    public static<T> T sameParam(T a,T b){
        return a;
    }
    /**
     * 有多个参数,且传入实参的类型都不一样,推断的出的类型则是它们的交集,运行时可能会错误
     * 如: noSamePram(new Integer[2],new Float(2.0))//此时推断出来的类型为 Number,但会运行错误
     * @param <T>
     * @param array
     * @param b
     */
    public static<T> void noSameParam(T[]array,T b){
        int len = array.length;
        for(int i=0;i<len;i++)
            array[i] = b;
    }
    /**
     * 有多个参数,传入值类型不同,而且有返回值,那么会优先考虑返回 值
     * @param <T>
     * @param a
     * @param b
     * @return
     */
    public static<T> T noSameParamWithReturn(T a,T b){
        return b;
    }
    /**
     * 类型推断具有传递性,如果参数中有需要推断的类型,如果list<T>此的T就是传递进来的参数的值的类型,如
     * copy(new List<String> list,new Integer(1)),T就为 string,而此时array为integer,两者不现,不会再取
     * 交集,会编译错误,因此,在参数中的泛型的泛型方法中,传递的参数一定保持一致
     * 如: copy(Collection<T> col,T[]array),copy(new List<String>,new Integer[]) 首先推断出 T 类型为  string,而后面的是 Integer,所以错误
     * @param <T>
     * @param col
     * @param array
     */
    public static<T> void copy(Collection<T> col,T[] array){

    }
    public static<T> T copycopy(T[] array, Collection<T> col){
        return array[0];
    }

    public static<T> T copy(T a,T b){
        return a;
    }

    public static void main(String args[]){
        Integer a  = new Integer(1);
        Long b = new Long(2);
//        noSameParam(new Integer[3],new Float(1));
        List<String> list = new ArrayList<String>();
        Integer [] array = new Integer[]{1,2,3};
        copy(list,array);
        copy(array,list);
        copy(new String(),new Integer(2));
    }
}

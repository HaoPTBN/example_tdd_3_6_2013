package org.qsoft.tdd;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 6/3/13
 * Time: 2:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class MathService {
    public static int methodAdd(String numbers) {
        int numberReturn = 0;
        if (numbers == null || numbers.equals("")) {
            numberReturn = 0;
        } else {
            numbers = numbers.replace("/","");
            numbers = numbers.replace(";",",");
            numbers = numbers.replace("\n",",");
            numbers = numbers.replace("*",",");
            numbers = numbers.replace("[",",");
            numbers = numbers.replace("]",",");
            numbers = numbers.replace("%",",");

            System.out.println("       XXX:" + numbers);
            String[] arrayString = numbers.split(",");
            int index = arrayString.length;
            for (int i = 0; i < index; i++) {
                if(!arrayString[i].equals("")){
                    int intAdd = Integer.valueOf(arrayString[i]);
                    if(intAdd>0 && intAdd<1000){
                        numberReturn += intAdd;
                    }
                }
            }
        }
        return numberReturn;
    }
}

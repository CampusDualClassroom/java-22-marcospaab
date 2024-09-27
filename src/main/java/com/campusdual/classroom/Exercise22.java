package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> l = new ArrayList<>();
        l.add("GKFFD");
        l.add("TNANA");
        l.add("MPMSL");
        l.add("PSWME");
        l.add("LZMLF");
        l.add("JYEBV");
        l.add("YELNT");
        l.add("JSNKR");
        l.add("JFESF");
        l.add("TMJLL");
        return l;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            System.out.println(customList.get(i).toString());
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        int tamAnt = customList.size();
        customList.add(element);
        int tamNue = customList.size();

        if(tamAnt<tamNue){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        List<String> aList = createArrayList();

        addElementToList(aList, "AAAAA");

        printElementsAndIndex(aList);


    }


}

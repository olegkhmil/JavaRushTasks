package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> list = new LinkedList<>();
        File dir = new File(root);
        for(File f: dir.listFiles()){
            System.out.println(f.getName());
            if(f.isDirectory()){
                    addList(f.getAbsolutePath(),list);
            }else {
                list.add(f.getAbsolutePath());
            }
        }
        return list;

    }
    public static void addList(String subDir, List list1){
        File p = new File(subDir);
        for (File ff:p.listFiles()){
            if(ff.isDirectory()){
                addList(ff.getAbsolutePath(),list1);
            }else list1.add(ff.getAbsolutePath());
        }
    }


    public static void main(String[] args) throws IOException {
        List<String> l = getFileTree("d:\\Test");
        System.out.println(l.size() + l.toString());

    }
}

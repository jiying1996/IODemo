package com.day21.zuoye;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        /*
        2.删除指定目录下的文件及文件夹，包括子目录中的内容(当前的工程目录)
         */
        deleteAllFiles("E:\\test");
    }

    public static void deleteAllFiles(String pathName) {
        File file = new File(pathName);
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else {
                File[] files = file.listFiles();
                for (File file1 : files) {
                    deleteAllFiles(file1.toString());
                    file1.delete();
                }
            }
        }
    }
}

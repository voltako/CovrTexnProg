package com.example.demo;

import java.io.File;
import java.util.List;

public class FileFinder {
    static void fileFinder(File rootFile, List<File> fileList,String searchingFile){
        if (rootFile.isDirectory()){
            System.out.println("searching at: " + rootFile.getAbsolutePath());
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null){
                for(File file: directoryFiles){
                    if (file.isDirectory()){
                        fileFinder(file,fileList,searchingFile);
                    }else {
                        if (file.getName().matches(searchingFile)){
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }

}

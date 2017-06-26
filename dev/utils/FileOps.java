package dev.utils;

import java.io.File;
import java.nio.file.*;

public class FileOps{
   public static String contentsOf(String fileName){
      Path fileHandle = new File(fileName).toPath();
      
      try{
         return new String(Files.readAllBytes(fileHandle));
      }
      catch(Exception exc){
         return "ERROR READING FILE";
      }
   } // contentsOf reads from the MyJava directory
}
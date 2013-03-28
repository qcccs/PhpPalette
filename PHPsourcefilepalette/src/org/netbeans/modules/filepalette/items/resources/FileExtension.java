package org.netbeans.modules.filepalette.items.resources;
import java.io.File;
import javax.swing.filechooser.*;



public class FileExtension extends FileFilter {
    private String fFormat = "php";

    public boolean accept(File f){
        if(f.isDirectory()){
            return true;
        }
        if(extension(f).equalsIgnoreCase(fFormat) ) {
            return true;
        }else{
            return false;
        }
    }
    public String getDescription(){
        return "php only";
    }

    public String extension(File f){
        String fileName = f.getName();
        int indexFile = fileName.lastIndexOf(".");
        if(indexFile > 0 && indexFile < fileName.length() - 1){
            return fileName.substring(indexFile+1);
            
        }else{
            return "";
        }
    }
    
}

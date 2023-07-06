import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import javax.swing.JDialog;
import javax.swing.JFrame;
import java.util.*;
;


public class FindFolder {	
	String dir;
	public FindFolder(String a){
		this.dir=a;
	}
	static JFrame f; 
	
	public void Create(){
		boolean success=false;
		File directory=new File(dir+"/Images");
		File directory1=new File(dir+"/Videos");
		File directory2=new File(dir+"/Audio");
		File directory3=new File(dir+"/Pdf");
		File directory4=new File(dir+"/Document");
		
		
		if(directory.exists()){
			
		}else{
			
			success=directory.mkdir();
			
		}	
		if(directory1.exists()){
		}else{
			success=directory1.mkdir();
		}	
		if(directory2.exists()){
					
		}else{
			
			success=directory2.mkdir();
			
		}
		if(directory4.exists()){
			
		}else{
			success=directory4.mkdir();
			
		}	
		
		if(directory3.exists()){
		}else{
			success=directory3.mkdir();
				
		}
		}	
		
		
		public void Rename(String abc) {
			
			File ol=new File(dir);
			String fileName = ol.toString();
			String extension="";
		    int index = fileName.lastIndexOf('.');
		    if(index > 0) {
		      extension = fileName.substring(index + 1);
		    }
			File n=new File(ol.getParent()+"\\"+abc+"."+extension);
			
			if(ol.renameTo(n)){
				
				          
				       } 
					              	
			
			
		
		}
	
	public void Delete(){
		File directory=new File(dir);
		if(directory.exists()){
			
			directory.delete();
			
		}
	}
	
	
	public void OpenFile() {
		File f=new File(dir);
		 Desktop desktop = Desktop.getDesktop();
	        if(f.exists())
				try {
					desktop.open(f);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		
		
		
	}
	
	
	


	
	
	
	public void sot(Linkedlist a) throws IOException {
		
		Node tmp=a.head;
		while(tmp!=null) {
			
		if(tmp.dire.endsWith(".rtf")||tmp.dire.endsWith(".doc")||tmp.dire.endsWith(".docx")||tmp.dire.endsWith(".txt")) {
			
			File file = new File(tmp.dire); 
  	         
  	         
	        if(file.renameTo 
	           (new File(tmp.parent+"/Document/"+tmp.getName()) ))
	        { 
	            // if file copied successfully then delete the original file 
	            file.delete(); 
	            //System.out.println("File moved successfully"); 
	        } 
	        else
	        { 
	            //System.out.println("Failed to move the file"); 
	        
	        } 
	    }
		else if(tmp.dire.endsWith(".bmp")||tmp.dire.endsWith(".jpg")||tmp.dire.endsWith(".JPG")||tmp.dire.endsWith(".png")||tmp.dire.endsWith(".PNG")||tmp.dire.endsWith(".jpeg")||tmp.dire.endsWith(".JPEG")||tmp.dire.endsWith(".gif")||tmp.dire.endsWith(".GIF")||tmp.dire.endsWith(".WEBP")) {
			
			File file = new File(tmp.dire); 
  	         
  	         
	        if(file.renameTo 
	           (new File(tmp.parent+"/Images/"+tmp.getName()) ))
	        { 
	            // if file copied successfully then delete the original file 
	            file.delete(); 
	            //System.out.println("File moved successfully"); 
	        } 
	        else
	        { 
	           // System.out.println("Failed to move the file"); 
	        
	        } 
	    }	
else if(tmp.dire.endsWith(".wav")||tmp.dire.endsWith(".mp3")||tmp.dire.endsWith(".ogg")||tmp.dire.endsWith(".wma")||tmp.dire.endsWith(".aac")||tmp.dire.endsWith(".mid")||tmp.dire.endsWith(".raw")) {
			
			File file = new File(tmp.dire); 
  	         
  	         
	        if(file.renameTo 
	           (new File(tmp.parent+"/Audio/"+tmp.getName()) ))
	        { 
	            // if file copied successfully then delete the original file 
	            file.delete(); 
	         //   System.out.println("File moved successfully"); 
	        } 
	        else
	        { 
	           // System.out.println("Failed to move the file"); 
	        
	        } 
	    }	
else if(tmp.dire.endsWith(".webm")||tmp.dire.endsWith(".mkv")||tmp.dire.endsWith(".flv")||tmp.dire.endsWith(".avi")||tmp.dire.endsWith(".mov")||tmp.dire.endsWith(".wmv")||tmp.dire.endsWith(".mp4")||tmp.dire.endsWith(".mpg")||tmp.dire.endsWith(".mpeg")||tmp.dire.endsWith(".3gp")) {
	
	File file = new File(tmp.dire); 
       
       
    if(file.renameTo 
       (new File(tmp.parent+"/Videos/"+tmp.getName()) ))
    { 
        // if file copied successfully then delete the original file 
        file.delete(); 
       // System.out.println("File moved successfully"); 
    } 
    else
    { 
        //System.out.println("Failed to move the file"); 
    
    } 
}	
else if(tmp.dire.endsWith(".pdf")||tmp.dire.endsWith(".html")||tmp.dire.endsWith(".htm")) {
	
	File file = new File(tmp.dire); 
       
       
    if(file.renameTo 
       (new File(tmp.parent+"/Pdf/"+tmp.getName()) ))
    { 
        // if file copied successfully then delete the original file 
        file.delete(); 
    //    System.out.println("File moved successfully"); 
    } 
    else
    { 
      //  System.out.println("Failed to move the file"); 
    
    } 
}
else if(tmp.dire.endsWith(".dir")) {
	
	
}




  
		tmp=tmp.next;	
		      
	    } 		
		
		}
			
			
		}
		
	
	
	
	
	
	
	

	

package com.Attacker.Controller;

	import java.security.MessageDigest;
	import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

	public class HashCodeGenerator {
		 public  String generate(String filename) 
		    {
			 System.out.println("in Hash Code...");
		        String TitleToHash = filename;
		        String generatedHashcode = null;
		        String newgeneratedHashcode = null;
		        try {
		            // Create MessageDigest instance for MD5
		            MessageDigest md = MessageDigest.getInstance("MD5");
		            
		            //Add title bytes to digest
		            md.update(TitleToHash.getBytes());
		            
		            //Get the hash's bytes 
		            byte[] bytes = md.digest();
		            //This bytes[] has bytes in decimal format;
		            //Convert it to hexadecimal format
		            
		            StringBuilder sb = new StringBuilder();
		            for(int i=0; i< bytes.length ;i++)
		            {
		                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
		                
		            }
		            
		            
		            
		            
		            
		            
		            //Get complete hashed password in hex format
		            generatedHashcode = sb.toString();
		            System.out.println("Hash value is:::"+generatedHashcode);
		            
		            
		            StringBuffer hexString = new StringBuffer();
		        	for (int i=0;i<bytes.length;i++) {
		        		String hex=Integer.toHexString(0xff & bytes[i]);
		       	     	if(hex.length()==1) hexString.append('0');
		       	     	hexString.append(hex);
		        	}
		        	
		        	 newgeneratedHashcode = hexString.toString();
			         System.out.println("Hash value is:::"+newgeneratedHashcode);
		        	
		            
		        	
		            
		        	
		        	
		        } 
		        catch (NoSuchAlgorithmException e) 
		        {
		            e.printStackTrace();
		        }
		        return generatedHashcode;
		        
		        
		    }
		 
		 
	}



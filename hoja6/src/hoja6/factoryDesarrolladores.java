/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja6;
import java.util.*;

/**
 *
 * @author michel
 */
public class factoryDesarrolladores {
    
    public Set getSet (int num){
		int i= num;
		if (i==1){
	  return new HashSet<String>(); 
		}
 
		if(i== 2){
      return new LinkedHashSet<String>(); 
   }
   
   if(i== 3){
      return new TreeSet<String>(); 
   }
   
   else{
	   return new HashSet<String>();
   }
   }

}


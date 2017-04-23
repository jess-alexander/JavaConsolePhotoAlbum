/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltshowcase;

import ltshowcase.model.*;
import java.util.LinkedHashSet;
import java.util.Set;
 
public class RemoveDuplicates 
{   
    static Object[] removeDuplicates(Photo[] arrayWithDuplicates)
    {
               
        Set<Integer> set = new LinkedHashSet<Integer>();      //Use HashSet if you don't want insertion order
         
        for (int i = 0; i < arrayWithDuplicates.length; i++) 
        {
            set.add(arrayWithDuplicates[i].albumId);
        }
         
        //Converting set into an array
         
        Object[] arrayWithoutDuplicates = set.toArray();
         
        return arrayWithoutDuplicates;
    }
    
}
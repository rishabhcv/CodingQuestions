package com.esp.interviews.hackerrank;

import java.util.ArrayList;
import java.util.List;

class GoldHunt
{
    public static void main(String[] args)
    { 
        List<Character> listA = new ArrayList<Character>();
        List<Character> listB = new ArrayList<Character>();
        List<Character> listC = new ArrayList<Character>();
         
        for(int i=0;i<3;i++)
        {
          listA.add('.');
          listB.add('.');
          listC.add('.');
        }
        
        listA.add(0, '#');
        listA.add(2, '#');
        listC.add(1, '#');
        
        List<List<Character>> box = new ArrayList<List<Character>>();
        
      
            box.add(listA);
            box.add(listB);
            box.add(listC);
   
             
        System.out.println(getCount(box, 2));
        
    }
    
    static int getCount(List<List<Character>> box, int k)
    {
     
        int j =0;
        int n = box.size();
        int count = 0;
        int ns = 0;
        for(int i = 0 ; i<n ; i++){
          ns+=box.get(i).size();
        }
        int m =ns/n;
        
        if(n<k)
        {
            return 0;
        }
        else if(n==k)
        {
        
            for(int i=0;i<m;i++)
            {
                if(k>1)
                {
                if( box.get(0).get(i)!='#')
                {
                    
                    for(j=1;j<k;j++)
                    {
                        if(box.get(j).get(i)=='#')
                        {
                            break;
                        }
                        
                    }
                    if(j==k)
                    {
                        count++;
                    }
                }
                }
                else
                {
                    if(box.get(0).get(i)!='#')
                    {
                        count++;
                    }
                }
            }
        }
        else if(n>k)
        {
            //System.out.println("Here1!!!!!!");
            for(int p=0;p<n;p++)
            {
            for(int i=0;i<m;i++)
            {
                if(k>1)
                {
                    //System.out.println("k>1");
                if(box.get(p).get(i)!='#')
                {
                    //System.out.println("box[p][i]!='#'");
                    
                    for(j=1;j<k;j++)
                    {
                        if(box.get(j).get(i)=='#')
                        {
                            //System.out.println("box[p][i]" + box[j][i]);
                            break;
                        }
                        
                    }
                    //System.out.println("j=" + j);
                    /*if(j==k)
                    {
                        //System.out.println("j==k");
                        count++;
                        for(int l=1;l<k;l++)
                        {
                           box.get(0).get(i) ='#' ;
                           
                           box.add(0, element);
                        }
                    }*/
                }
                }
                else
                {
                    
                        if(box.get(p).get(i)!='#')
                        {
                            count++;
                        } 
                    
                    
                }
            }
            }
        }
        
        return count;
    } 
}
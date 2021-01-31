package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import sort.Sortbyid;
import sort.Sortbysalary;
import sort.Sortbyname;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Sort by What?\n1 for id\n2 for name\n3 for salary");
        int ch=sc.nextInt();
        
        if(ch==1) 
        	{
        	System.out.println("Choose\n  a for asc\n  d for desc");
        	char c=sc.next().charAt(0);
      
        	List<Sortbyid> sid=new ArrayList<>();
            sid.add(new Sortbyid(2,"Raj",12000));
            sid.add(new Sortbyid(1,"Ramesh",14000));
            sid.add(new Sortbyid(3,"Vikash",17000));
            if(c=='a') 
            	{
            		Comparator<Sortbyid> sortid=new Comparator<Sortbyid>() 
            		{
            			public int compare(Sortbyid s1, Sortbyid s2)
            			{
            				if(s1.getId() > s2.getId())
            					return 1;
            				else
            					return -1;	
            			}
            		};
           
            		Collections.sort(sid,sortid);
            		for(Sortbyid s: sid)
                	{
                		System.out.println(s);
                	}
            	}
            else if(c=='d')
            	{
            		Comparator<Sortbyid> sortid=new Comparator<Sortbyid>() 
            		{
            			public int compare(Sortbyid s1, Sortbyid s2)
            			{
            				if(s1.getId() < s2.getId())
            					return 1;
            				else
            					return -1;	
            			}
            		};
           
            		Collections.sort(sid,sortid);
            		for(Sortbyid s: sid)
                	{
                		System.out.println(s);
                	}
            	}
            else 
            	{
            		System.out.println("Invalied choice...");
            	}
            	
        	}
           	
        //.....................................................................................................
        
        else if(ch==2)
        	{
        	System.out.println("Choose\n  a for asc\n  d for desc");
        	char c=sc.next().charAt(0);
      
        	List<Sortbyname> sname=new ArrayList<>();
            sname.add(new Sortbyname(2,"Raj",12000));
            sname.add(new Sortbyname(1,"Ramesh",14000));
            sname.add(new Sortbyname(3,"Ajay",17000));
            if(c=='a') 
            	{
            		Comparator<Sortbyname> sortnm=new Comparator<Sortbyname>() 
            		{
            			public int compare(Sortbyname s1, Sortbyname s2)
            			{
            					return s1.getName().compareTo(s2.getName());
            			}
            		};
           
            		Collections.sort(sname,sortnm);
            		for(Sortbyname s: sname)
                	{
                		System.out.println(s);
                	}
            	}
            else if(c=='d')
            	{
            		Comparator<Sortbyname> sortnm=new Comparator<Sortbyname>() 
            		{
            			public int compare(Sortbyname s1, Sortbyname s2)
            			{
            					return s2.getName().compareTo(s1.getName());	
            			}
            		};
           
            		Collections.sort(sname,sortnm);
            		for(Sortbyname s: sname)
                	{
                		System.out.println(s);
                	}
            	}
            else 
            	{
            		System.out.println("Invalied choice...");
            	}
        		
        	}
        	
        
        //................................................................................................................
        
        
        else if(ch==3) 
        	{
        		System.out.println("Choose\n  a for asc\n  d for desc");
        		char c=sc.next().charAt(0);
        		List<Sortbysalary> ssal=new ArrayList<>();
        		ssal.add(new Sortbysalary(2,"Raj",12000));
        		ssal.add(new Sortbysalary(1,"Ramesh",10000));
        		ssal.add(new Sortbysalary(3,"Vikash",17000));
        		if(c=='a') 
        			{
        				Comparator<Sortbysalary> sortsal=new Comparator<Sortbysalary>() 
        				{
        					public int compare(Sortbysalary s1, Sortbysalary s2)
        					{
        						if(s1.getSalary() > s2.getSalary())
        							return 1;
        						else
        							return -1;	
        					}
        				};
        				Collections.sort(ssal,sortsal);
        				for(Sortbysalary s: ssal)
                		{
                			System.out.println(s);
                		}
        			}
        		else if(c=='d') 
        			{
        			Comparator<Sortbysalary> sortsal=new Comparator<Sortbysalary>() 
        				{
        					public int compare(Sortbysalary s1, Sortbysalary s2)
        					{
        						if(s1.getSalary() < s2.getSalary())
        							return 1;
        						else
        							return -1;	
        					}
        				};
        				Collections.sort(ssal,sortsal);
        				for(Sortbysalary s: ssal)
                		{
                			System.out.println(s);
                		}
        			}
        		else
        		{
        			System.out.println("Invalied choice...");
        		}
        		
        	}
        
        
        
        else
        	{
        		System.out.println("Invalied choice");
        	}
           	
        }
       	
	}

	



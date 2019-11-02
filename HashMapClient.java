
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapClient {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a={1,1,2,2,2,3,5};
		int[] b={1,1,1,2,2,4,5};
		int[] c={12,2,3,8,11,9,10,15,16};
		// TODO Auto-generated method stub
//		HashMap<String,Integer> popmap=new HashMap<String,Integer>();
//		popmap.put("India",120);
//		popmap.put("China",200);
//		popmap.put("Pak",80);
//		popmap.put("US",25);
//		popmap.put("UK",20);
//		System.out.println(popmap);
//		popmap.remove("Pak");
//		System.out.println(popmap);
//		System.out.println(popmap.containsKey("India"));
//		System.out.println(popmap.get("China"));
//		
		highestFreq("aasdfghjilka") ;
//		System.out.println(gce1(a,b));
//		System.out.println(gce2(a,b));
//		System.out.println(highestconsfreq(c));
	}
    
	public static void highestFreq(String ab)
	{
		HashMap<Character, Integer> keys=new HashMap<Character, Integer>();
		for(int i=0;i<ab.length();i++)
		{
			Character ch=ab.charAt(i);
			if(keys.containsKey(ch))
			{
				keys.put(ch,keys.get(ch)+1);
			}
			else
			{
				keys.put(ch,1);
			}
		}
		ArrayList<Character> k=new ArrayList<Character>(keys.keySet());
		
		Character fc=' ';
		Integer fmc=0;
		
//		for(int i=0;i<k.size();i++)
		for(Character c : k)
		{
			if(keys.get(c) > fmc){
				fmc = keys.get(c);
				fc = c;
			}
			
		}		
		System.out.println(fc + " " + fmc);
	}
	
	public static ArrayList<Integer> gce1(int[] one,int[] two)
	{
		HashMap<Integer,Integer> fm=new HashMap<Integer,Integer>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int val:one)
		{
			if(fm.containsKey(val))
			{
				fm.put(val,fm.get(val)+1);
			}
			else
			{
				fm.put(val, 1);
			}
		}
		for(int val:two)
		{
			if(fm.containsKey(val))
			{
				list.add(val);
				fm.remove(val);
			}
		}
		return list;
	}
	
	public static ArrayList<Integer> gce2(int[] one,int[] two)
	{
		HashMap<Integer,Integer> fm=new HashMap<Integer,Integer>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int val:one)
		{
			if(fm.containsKey(val))
			{
				fm.put(val,fm.get(val)+1);
			}
			else
			{
				fm.put(val, 1);
			}
		}
		for(int val:two)
		{
			if(fm.containsKey(val))
			{
				if(fm.get(val)>1)
				{
					list.add(val);
					fm.put(val, fm.get(val)-1);
				}
			else
			{
				list.add(val);
				fm.remove(val);
			}
			}
		}
		return list;
	}
	
	public static ArrayList<Integer> highestconsfreq(int[] one)
	{
	      HashMap<Integer,Boolean> fm=new HashMap<Integer,Boolean>();
	     
	      ArrayList<Integer> flist=new ArrayList<Integer>();
	      for(int val:one)
	      {
	    		  fm.put(val,true);
	      }
	      
	      ArrayList<Integer> keys=new ArrayList<Integer>(fm.keySet());
	      for(int key:keys)
	      {
	    	  if(fm.containsKey(key-1))
	    	  {
	    		  fm.put(key,false);
	    	  }
	      }
	     
	    //  System.out.println(fm);
	      for(int key:keys)
	      {
	    	 if(fm.get(key)==true)
	    	 {
	    		 ArrayList<Integer> tlist=new ArrayList<Integer>();
	    		 int count=0;
	    		 while(fm.containsKey(key+count))
	    		 {
	    			 tlist.add(key+count);
	    			 count++;
	    		 }
	    		 if(tlist.size()>flist.size())
	    		 {
	    			 flist=tlist;
	    			 tlist=new ArrayList<Integer>();
	    		 }
	    	 }
	      }
	      return flist;
	}
	
}

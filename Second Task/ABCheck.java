import java.util.*;


public class ABCheck {
	

	public static boolean ABCheck(String str) {
		char[] arr = str.toCharArray();
		for(int i =0; i < arr.length;i++){
			
			if(arr[i]=='a' && i+4 < arr.length && arr[i+4]=='b'){	
					return true;
				}
			
			else if (arr[i]=='b' && i+4 < arr.length && arr[i+4]=='a'){		   
					 return true;
				}
			}
		
		return false;
	}
	public static void main (String []Args){
		
		ABCheck check = new ABCheck();
	         boolean tr = check.ABCheck("after badly");
	         boolean fs = check.ABCheck("Laura sobs");		
	            System.out.println(tr);
             	System.out.print(fs);
	
	}
	    }	
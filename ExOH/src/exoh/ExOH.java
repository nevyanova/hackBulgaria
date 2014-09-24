
package exoh;

public class ExOH {

  
    public boolean ExOH(String str){
		
	int count = str.length() - str.replace("x", "").length();
	int count1 = str.length() - str.replace("o", "").length();
	
	if(count == count1){
		return true;
	}else 
		return false;
	
	}
	public static void main (String[]Args){
		
		ExOH obj = new ExOH ();
		boolean tr = obj.ExOH("xoxoox");
		boolean fs = obj.ExOH("oooxoo");
		System.out.println(tr);
		System.out.println(fs);
		
	}

}

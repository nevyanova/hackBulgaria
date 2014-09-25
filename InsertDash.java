import java.util.List;
import java.util.ArrayList;

public class InsertDash {

	public static String InsertDash(int num) {
		int[] digit = toArrayDigits(num);
		String result = digit[0]+"";
		for(int i=1;i<digit.length;i++){
			if(isOdd(digit[i])&&isOdd(digit[i-1])){
				result= result+"-"+digit[i];
			}else{
				result = result+digit[i];
			}
		}
		return  result;
	}
	
	private static int[] toArrayDigits(int num){
		List<Integer> digits = new ArrayList<>();
		while(num>0) {
			digits.add(num%10);
			num = num / 10;
		}
		int[] result = new int[digits.size()];
		for(int i = digits.size()-1,j=0;i>=0;i--,j++){
			result[j] = digits.get(i);
		}
		return result;
	}
	
	private static boolean isOdd(int number) {
        if (number % 2 == 0){
            return false;
        }else{
            return true;
        }	
	}
	public static void main(String[]Args){
		InsertDash idash = new InsertDash();
		String h = idash.InsertDash(99946);
		String hh = idash.InsertDash(56730);
		System.out.println(h);
		System.out.println(hh);
	}

}
package recursion;

public class testRecursion {

	public static void main(String[] args) {
		System.out.println(addHyphen("zzzzzz",1));
		System.out.println(addHyphen("hello",1));
		System.out.println(addHyphen("good food",1));
		System.out.println(addHyphen("haaahha",1));
	}
	

	
	public static String addHyphen(String word1,int count) {
		if(count+1 > word1.length()) return word1;
		if(word1.substring(count, count+1).equals(word1.substring(count-1, count))) word1 = word1.substring(0,count) + "-" + word1.substring(count, word1.length());
		return addHyphen(word1,count+1);	
	}
	

}

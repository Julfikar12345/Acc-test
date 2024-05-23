package com.acc.lkm.javaDay2;
public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//indexOf(),lastIndex
      //Scanner sc = new Scanner(System.in);
     // String str= sc.next();
		String str=" Md Julfikar Rahaman";
		int index=str.indexOf("Rahman");
		System.out.println("index of Rahaman: "+index);
		int lastIndex=str.lastIndexOf("R");
		System.out.println("Last index of R: "+lastIndex);
        String replaced =str.replace('d','D');
        System.out.println("Replace 'd' with 'D': "+replaced);
        String upperCaseStr=str.toUpperCase();
        System.out.println("UpperCase: "+upperCaseStr);
        String substring=str.substring(10);
        System.out.println("subString: "+substring);
        String str1= "MD JULFIKAR Rahaman";
         boolean equalsIgnoreCase=str.equalsIgnoreCase(str1);
         System.out.println("Equals Ignore Case: "+equalsIgnoreCase);
         boolean endwith=str.endsWith("an");
         System.out.println("Ends with en: "+endwith);
         boolean isEmpty = str.isEmpty();
         System.out.println("Is empty: "+isEmpty);
    }

}

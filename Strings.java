public class Strings {
	public static void main(String [] args){
		String text = "Object Oriented Programming";
		System.out.println("Orignal Text: "+text);
		System.out.println("\nThe given text is empty-> " +text.isEmpty());
		System.out.println("\n Length of the given text: "+text.length());
System.out.println("\n To Upper Case: "+text.toUpperCase());
System.out.println("\n To Lower Case: "+text.toLowerCase());
System.out.println("\n Substring: "+text.substring(7));
System.out.println("\n Subsequence: "+text.subSequence(7,15));

System.out.println("\n Replace 0 with $: "+text.replace('0','$'));
System.out.println("\n Replace all text with 'Java La': "+text.replaceAll(text, "java Lab"));
System.out.println("\n Replace first word: "+text.replaceFirst("Object","Java"));
System.out.println("\n Character at index 8: "+text.charAt(8));
int ascii = text.charAt(8);
System.out.println("\n ASCII value of charactter at index 8: "+ascii);
System.out.println("\n First index of Character '0': "+text.indexOf('0'));
System.out.println("\n Last index of Character '0': "+text.lastIndexOf('0'));
String text1 = "lab";
System.out.println("\n Concatenation with 'Lab': "+text.concat(" ").concat(text1));
System.out.println("\n __Comparison__");
System.out.println("\n If the value is 0, both are equal. Otherwise unequal!");
System.out.println("\n Text for comparison:Object oriented programmin-> "+text.compareTo("Object"));
System.out.println("\n Text for comparison:Object Oriented Programming-> "+text.compareTo("Object"));
}
}
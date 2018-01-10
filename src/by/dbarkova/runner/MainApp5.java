package by.dbarkova.runner;

public class MainApp5 {

	public static void main(String[] args) {


		// гл. 7, вар. C, задание 2
		// »сключить из текста подстроку максимальной длины, начинающуюс€ и заканчивающуюс€ одним и тем же символом. (использу€ String / StringBuilder)

		
		StringBuilder sb = new StringBuilder("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		
		String symbolDel = "r";
		
		System.out.println("Text before substring removal: " + sb);
		
		sb = sb.delete(sb.indexOf(symbolDel), sb.lastIndexOf(symbolDel));
		
		System.out.println("Text after substring removal: " + sb);
		
	}

}

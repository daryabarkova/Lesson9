package by.dbarkova.runner;

public class MainApp1 {

	public static void main(String[] args) {
		
		// ��. 7, ���. �, ������� 1
		// � ������ ����� ������ k-� ����� �������� �������� ��������. ���� k ������ ����� �����, ������������� �� ���������.
		
		String s = "Merry Christmas and Happy New Year!!!";
		
		System.out.println(s);
		
		int charPosition = 5;
		String replace = "#";
		
		String[] str = s.split(" ");
		
		for(int i = 0; i < str.length; i++) {
			if(str[i].length() > charPosition - 1) {
				str[i] = str[i].replaceFirst(str[i].charAt(charPosition - 1) + "", replace);
			}
		}
		for(String string : str) {
			System.out.print(string + " ");
		}
	
	}

}

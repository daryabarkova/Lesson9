package by.dbarkova.runner;

public class MainApp3 {

	public static void main(String[] args) {
		
		// ��. 7, ���. �, ������� 4
		// � ������ ����� k-�� ������� �������� �������� ���������. (��������� StringBuilder)
		
		StringBuilder sb = new StringBuilder ("An apple a day keeps a doctor away!");
		
		System.out.println(sb);
		
		String subs = " FAR";
		
		sb = sb.insert(sb.indexOf("away") - 1, subs);
		
		System.out.println(sb);

	}
	
}

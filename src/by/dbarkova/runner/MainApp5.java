package by.dbarkova.runner;

public class MainApp5 {

	public static void main(String[] args) {


		// ��. 7, ���. C, ������� 2
		// ��������� �� ������ ��������� ������������ �����, ������������ � ��������������� ����� � ��� �� ��������. (��������� String / StringBuilder)

		
		StringBuilder sb = new StringBuilder("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		
		String symbolDel = "r";
		
		System.out.println("Text before substring removal: " + sb);
		
		sb = sb.delete(sb.indexOf(symbolDel), sb.lastIndexOf(symbolDel));
		
		System.out.println("Text after substring removal: " + sb);
		
	}

}

package MavenJava.MavenTest;

import java.io.IOException;
import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExcelData d = new ExcelData();
		ArrayList<String> data= d.getData("Purchase");
		
		System.out.println(data.get(0));
		
	}

}
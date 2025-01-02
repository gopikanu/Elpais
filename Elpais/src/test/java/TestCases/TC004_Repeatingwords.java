package TestCases;

import org.testng.annotations.Test;

public class TC004_Repeatingwords {
	@Test
	public void verifyRepeatationwords() {
		
String header ="Institutional shock in Venezuela Canary Islands, the unsustainable and the accomplices What can be delegated to Catalonia in immigration New Year, New Society? Bonanza ( the line of conception)";
	int count;
	String lheader=header.toLowerCase();
	String words[]=lheader.split(" ");
	int c=words.length;
	System.out.println("Count of the words in the senetence:"+c);
	
	for(int i=0;i<c;i++) {
		 count=1;
		// System.out.println(count);
		for(int j=i+1;j<c;j++)
		{
			if((words[i]).equals (words[j]) ){
				count++;
				//System.out.println(count);
				words[j]="o";
				
			}
	}
		if(count>2 && words[i]!="o") {
			System.out.println("Reapeated word: "+words[i]);
			System.out.println("occureneces: "+count+"times");
		}
	}
}
}

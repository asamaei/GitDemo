import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class main {
	
	

	public static void main(String[] args)    {
		
	
	int arr[][] = { {232,4,5},{23,1,554},{123,234,9} };
	
	int mini = arr[0][0];
	int k=0 ;
	int max = arr[0][0];
	for (int i=0 ; i<3 ; i++)		
		
	{
		
		for (int j=0 ; j<3; j++ )
		{
			if (mini > arr[i][j])
			{
				mini = arr[i][j];
				k = j;
				
			}
			
			
		}
		
	}
	
	System.out.println(k);
	for (int a=0 ;a<3;a++)
	
	{
		if (max	 < arr[a][k])
		{
			max = arr[a][k];
		}
	}


	System.out.println(max);
	System.out.println(mini);
	}
}
	
	
	


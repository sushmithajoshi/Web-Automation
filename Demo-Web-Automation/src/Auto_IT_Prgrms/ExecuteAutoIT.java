package Auto_IT_Prgrms;

public class ExecuteAutoIT {

	public static void main(String[] args) {
		executeAutoITFile();

	}
	
	static void executeAutoITFile()
	{
		try
		{
			String FilePath="E:\\ExampleAutomation\\AutoIT\\Sample.exe";
			Runtime.getRuntime().exec(FilePath);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}





public class ReadInputs {

	public static void main(String[]args){
	
		File file = new File("src/Test.txt");
		
		try(FileReader fileReader = new FileReader(file)){
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line = null;
			
			while ((line = bufferedReader.readLine()) !=null){
			}
			
		}
		
		catch (Exception e){
		}
		
	}
}
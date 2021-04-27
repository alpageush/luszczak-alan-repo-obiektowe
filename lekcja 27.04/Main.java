import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Main{
	public static void main(String[] args){
		DateTimeFormatter dTF = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss.N");
		LocalDateTime lDT1 = LocalDateTime.now();
		System.out.println(dTF.format(lDT1));
		
		LocalDateTime lDT2 = LocalDateTime.parse("2021-04-26T09:30:42.826682289");
		System.out.println(lDT2);
	}
	
	private static void testSaveToFile(){
		FileUtils fu = new FileUtils();
		fu.saveToFile(new ToDo("Drugi wpis",
			"Drugi wiersz???"));
		fu.readFromFile();
	}	
	
	private static void testReadFromKeyBoard(){
		ReadFromKeyboard rfk = new ReadFromKeyboard();
		ToDo td = rfk.readOneToDo();
		System.out.println(td);
	}
	
	private static void test(){
		ToDo td1 = new ToDo("Pierwsza",
		"To jest pierwsza notatka");
		ToDo td2 = new ToDo("Dwa","Druga notatka z autorem",
		"adams");
		System.out.println(td1);
		System.out.println(td2);
	}
} 
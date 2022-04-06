package april5;
interface Language
{
	void getName(String name);
	
}
class ProgrammingLanguage implements Language
{
	public void getName(String name)
	{
		System.out.println("programming language: " + name);
	}
}
public class Interfac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProgrammingLanguage language = new ProgrammingLanguage();
language.getName("java");
	}

}

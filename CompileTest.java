import javax.tools.*;

class CompileTest
{
	public static void main(String... s)
	{
		JavaCompiler comp = ToolProvider.getSystemJavaCompiler();
		int i = comp.run(System.in, System.out, System.err, " .java");
		
		System.out.println(i);
	}
}
class     SetClasspath
{

public static void  main(String  s[])
{

String cp=System.getProperty("java.class.path");
System.out.println(cp);
System.setProperty("java.class.path","c:\\f1;");
String cp1=System.getProperty("java.class.path");
System.out.println(cp1);


}
}
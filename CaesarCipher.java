class CaesarCipher
{
public static void main(String args[])
	{String pt="Hello";
	String ct="";
	int key=2;					//(here change to typecasting(#,?,?,^,etc.) in char.)

	for(int i=0;i<pt.length();i++)
	{
		ct=ct+(char)(pt.charAt(i)+key);		//type casting(to change integer to char.)
	}
	System.out.println(ct);
}}
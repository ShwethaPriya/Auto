package ecom;

public class Char {
	public static void main(String[] args) {
		String s="imran";
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]<ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for(int k=0;k<ch.length;k++)
		{
			System.out.print(ch[k]);
		}

	}
}



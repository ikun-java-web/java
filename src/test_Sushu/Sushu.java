package test_Sushu;

public class Sushu {
	public static void main(String[] args)
	{
		System.out.println("��ӭ����С��ϵͳ��");
		System.out.println("��ϵͳ�ṩ���·���");
		System.out.println("1 ż�� 2 ���� 3 3�ı��� 4 4�ı��� 5 5�ı��� 6 6�ı��� 7 7�ı��� 8 8�ı��� 9 9�ı��� 10 ����");
		System.out.println("��ѡ����ش���������");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int service=s.nextInt();
		System.out.println("��������ʼ���֣�");
		int num1=s.nextInt();
		System.out.println("������������֣�");
		int num2=s.nextInt();
		boolean Sushu;
		if(num1<=num2)
		{
			switch(service)
			{
				case 1:
					System.out.println(num1+"��"+num2+"֮���ż���У�");
					for(int i=num1;i<=num2;)
					{
						if(i%2==0)
						{ 
							System.out.print(i+"\t");
							i+=2;
						}
						else
						{
							i++;
							System.out.print(i+"\t");
							i+=2;
						}
					}
					break;
				case 2:
					System.out.println(num1+"��"+num2+"֮��������У�");
					for(int i=num1;i<=num2;)
					{
						if(i%2==0)
						{ 
							i++;
							System.out.print(i+"\t");
							i+=2;
						 }
						else
						{
							System.out.print(i+"\t");
							i+=2;
						}
					}
					break;
				case 3:
					System.out.println(num1+"��"+num2+"֮���3�ı����У�");
					for(int i=num1;i<=num2;)
					{
						if(i%3==0)
						{ 
							System.out.print(i+"\t");
							i+=3;
						 }
						else
						{
							i=i+3-(i%3);
							System.out.print(i+"\t");
							i+=3;
						}
					}
					break;
				case 4:
					System.out.println(num1+"��"+num2+"֮���4�ı����У�");
					for(int i=num1;i<=num2;)
					{
						if(i%4==0)
						{ 
							System.out.print(i+"\t");
							i+=4;
						}
						else
						{
							i=i+4-(i%4);
							System.out.print(i+"\t");
							i+=4;
						}
					}
					break;
				case 5:
					System.out.println(num1+"��"+num2+"֮���5�ı����У�");
					for(int i=num1;i<=num2;)
					{
						if(i%5==0)
						{ 
							System.out.print(i+"\t");
							i+=5;
						}
						else
						{
							i=i+5-(i%5);
							System.out.print(i+"\t");
							i+=5;
						}
					}
					break;
				case 6:
					System.out.println(num1+"��"+num2+"֮���6�ı����У�");
					for(int i=num1;i<=num2;)
					{
						if(i%6==0)
						{ 
							System.out.print(i+"\t");
							i+=6;
						 }
						else
						{
							i=i+6-(i%6);
							System.out.print(i+"\t");
							i+=6;
						}
					}
					break;
				case 7:
					System.out.println(num1+"��"+num2+"֮���7�ı����У�");
					for(int i=num1;i<=num2;)
					{
						if(i%7==0)
						{ 
							System.out.print(i+"\t");
							i+=7;
						}
						else
						{
							i=i+7-(i%7);
							System.out.print(i+"\t");
							i+=7;
						}
					}
					break;
				case 8:
					System.out.println(num1+"��"+num2+"֮���8�ı����У�");
					for(int i=num1;i<=num2;)
					{
						if(i%8==0)
						{ 
							System.out.print(i+"\t");
							i+=8;
						 }
						else
						{
							i=i+8-(i%8);
							System.out.print(i+"\t");
							i+=8;
						}
					}
					break;
				case 9:
					System.out.println(num1+"��"+num2+"֮���9�ı����У�");
					for(int i=num1;i<=num2;)
					{
						if(i%9==0)
						{ 
							System.out.print(i+"\t");
							i+=9;
						 }
						else
						{
							i=i+9-(i%9);
							System.out.print(i+"\t");
							i+=9;
						}
					}
					break;
				case 10:
					System.out.println(num1+"��"+num2+"֮��������У�");
					if(num1>1)
					{	
						for(int i=num1;i<=num2;i++)
						{
							Sushu=true;
							for(int j=2;j<=i/2;j++)
							{ 
								if(i%j==0)
								{	
									Sushu=false;
									break;
								}
							} 
							if(Sushu==true)
								{System.out.print(i+"\t");}
						}
					}
					else if(num1<=1)
					{	
						for(int i=2;i<=num2;i++)
						{
							Sushu=true;
							for(int j=2;j<i;j++)
							{ 
								if(i%j==0)
								{	
									Sushu=false;
									break;
								}
							} 
							if(Sushu==true)
								{System.out.print(i+"\t");}
						}
					}
					break;
				default:
					System.out.println("��Ǹ��������ʱ��δ�ṩ����Ҫ��ķ���");
			}	
		}
		else if(num1>num2)
			{System.out.println("���������������");}
	}
}

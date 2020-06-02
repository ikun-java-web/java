package test_Sushu;

public class Sushu {
	public static void main(String[] args)
	{
		System.out.println("欢迎进入小智系统！");
		System.out.println("本系统提供以下服务：");
		System.out.println("1 偶数 2 奇数 3 3的倍数 4 4的倍数 5 5的倍数 6 6的倍数 7 7的倍数 8 8的倍数 9 9的倍数 10 素数");
		System.out.println("请选择相关代码进入服务。");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int service=s.nextInt();
		System.out.println("请输入起始数字！");
		int num1=s.nextInt();
		System.out.println("请输入结束数字！");
		int num2=s.nextInt();
		boolean Sushu;
		if(num1<=num2)
		{
			switch(service)
			{
				case 1:
					System.out.println(num1+"到"+num2+"之间的偶数有：");
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
					System.out.println(num1+"到"+num2+"之间的奇数有：");
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
					System.out.println(num1+"到"+num2+"之间的3的倍数有：");
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
					System.out.println(num1+"到"+num2+"之间的4的倍数有：");
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
					System.out.println(num1+"到"+num2+"之间的5的倍数有：");
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
					System.out.println(num1+"到"+num2+"之间的6的倍数有：");
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
					System.out.println(num1+"到"+num2+"之间的7的倍数有：");
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
					System.out.println(num1+"到"+num2+"之间的8的倍数有：");
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
					System.out.println(num1+"到"+num2+"之间的9的倍数有：");
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
					System.out.println(num1+"到"+num2+"之间的素数有：");
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
					System.out.println("抱歉，我们暂时还未提供您所要求的服务！");
			}	
		}
		else if(num1>num2)
			{System.out.println("您输入的数据有误！");}
	}
}

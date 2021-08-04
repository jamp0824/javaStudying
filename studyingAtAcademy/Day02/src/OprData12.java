public class OprData12 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;	//12
		System.out.println("x="+x); //12
		
		y--;
		--y;	//8
		System.out.println("y="+y); //8
		
		z=x++; //z변수에 12를 먼저 대입하고 나중에 1증가해서 x변수값이 13
		System.out.println("z="+z+",x="+x);
		
		z=++x;	//13을 먼저 1증가한 14값을 z변수에 대입
		System.out.println("z="+z+",x="+x);
		
		
		z=++x + y++; //x변수값 14를 먼저 1증가한 15+8=23을 z변수에 대입. 나중에 y변수값 8을 1증가해서
		//y 변수값은 9
		System.out.println("z="+z+",y="+y+",x="+x);
		
		
	}

}

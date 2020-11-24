import java.math.*;
class  ATM extends Thread{
	static int money ;
	String name;
	public ATM(String name) {
		this.money = 10000;
		this.name = name;
	}
	public synchronized void draw(String n) {
		double y = 1;
		while (y > 0.2) {
			y = Math.random();
		}
		y*=10000;
		
		if(this.money - y > 0){
			this.money -=(int)y ;
			System.out.println(n+"領取"+(int)y+"元，剩餘"+this.money+"元");
		}else{
			System.out.println("餘額不足");
		}
		
	}
	public void run(){
		for(int i = 0 ;i < 8; i++){
			try {
				sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {

			}
			draw(this.name);
		}
	}
	
}
public class Q7_4 {
	public static void main( String args[]) {
		ATM a1 = new ATM("光復路郵局");
		ATM a2 = new ATM("彰師大郵局");
		a1.start();
		a2.start();
	}
}

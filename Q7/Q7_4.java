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
			System.out.println(n+"���"+(int)y+"���A�Ѿl"+this.money+"��");
		}else{
			System.out.println("�l�B����");
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
		ATM a1 = new ATM("���_���l��");
		ATM a2 = new ATM("���v�j�l��");
		a1.start();
		a2.start();
	}
}

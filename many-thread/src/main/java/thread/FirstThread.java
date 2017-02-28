package thread;
/**
 * @author 梁汝健(lrj@cndatacom.com) @date 2017年2月27日 下午5:38:21
 */
public class FirstThread extends Thread{
	private int i ;
	//重写run()方法，run()方法的方法体就是线程的执行体
	public void run(){
		for( ; i < 100 ; i++){
			System.out.println(getName() + " " + i);
		}
	}
}

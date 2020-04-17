import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class RunSpring{
	
	public static void main(String []arg){
		ApplicationContext context1=new ClassPathXmlApplicationContext("SpringBeans.xml");
		Game cust=(Game) context1.getBean("G-Bean");
		
		System.out.println("THE GAME IS "+cust);
		for(int i=0;i<50;i++){
			System.out.println(".................................battel number : "+(i+1)+".....................");
			cust.battle();
			System.out.println();
		}
	}	
}
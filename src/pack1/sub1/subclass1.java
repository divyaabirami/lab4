package pack1.sub1;
import pack1.class1;
import pack2.class2;
import pack2.sub2.*;
public class subclass1 {
public void show()
{
	System.out.println("inside sub pack1");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 obj1=new class1();
		subclass1 obj=new subclass1();
		obj1.display();
		obj.show();
		class2 obj2=new class2();
		subclass2 obj3=new  subclass2();
		obj2.present();
		obj3.exibit();
	}

}

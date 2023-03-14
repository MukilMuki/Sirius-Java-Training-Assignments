package day_1_modified;

public class Exercise7 {
	public static void main(String args[]) {
		boolean a=true;
		boolean b=a;
		ObjData obd=new ObjData();
		System.out.println("Primitive values before Modifications:"+a+" , "+b);
		b=false;
		System.out.println("Primitive values after Modifications:"+a+" , "+b);//Original Value doesn't get affected
		System.out.println("Object value before Modification:"+obd.size);
		new ChangeObj().ref(obd);
		System.out.println("Object value after Modification:"+obd.size); //Original Object value changed when its instance value got changed
	}
}
class ObjData{
	int size=10;
}
class ChangeObj{
	public void ref(ObjData newSize) {
		newSize.size=5;
	}
}

package cn.gyx.oo;
interface A{
	void testa();
}
interface B{
	void testb();
}
/**�ӿڿ��Զ�̳У��ӿ�C�̳нӿ�A��B*/
interface C extends A, B{
	void testc();
}
public class MySubclass implements C{
	public void testc(){	
	};

	@Override
	public void testa() {	
	}

	@Override
	public void testb() {	
	}
}


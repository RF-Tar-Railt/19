package Chapter3;

interface OnOffDev{
	boolean isOn();
	void change();
}

class Light implements OnOffDev{
	private boolean status;
	public void show(){
		if(status)
			System.out.println("on");
		else
			System.out.println("off");
	}
	public boolean isOn(){
		if(status)
			return true;
		else
			return false;
	}
	public void change(){
		status=!status;
	}
}

class Switch{
	OnOffDev obj=new Light();
	public Switch(OnOffDev obj){
		this.obj=obj;
	}
	public void on(){
		if(obj.isOn())
			return;
		else
			obj.change();
	}
	public void off(){
		if(obj.isOn())
			obj.change();
		else
			return;
	}
	
}

public class TestLight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Light a=new Light();
		Switch b=new Switch(a);
		b.on();
		a.show();
		b.off();
		a.show();
	}
}
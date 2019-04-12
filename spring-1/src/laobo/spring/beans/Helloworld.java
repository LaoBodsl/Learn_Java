package laobo.spring.beans;

public class Helloworld {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public void hello() {
		System.out.println("hello"+name);
	}
	public Helloworld() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

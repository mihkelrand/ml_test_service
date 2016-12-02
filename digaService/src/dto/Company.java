package dto;

public class Company {

	private int id;
	private int code;
	private String name;

	public Company() {

	}

	public Company(int id, int code, String name) {
		this.id = id;
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

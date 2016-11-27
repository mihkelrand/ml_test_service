package dto;

public class Document {

	private int id;
	private String name;
	private int year;
	private String series;
	
	private Company company;
	
	public Document(){
		
	}
	
	public Document(int id, String name, int year, String series){
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.series = series;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public String geSseries(){
		return series;
	}
	
	public void setSeries(String series){
		this.series = series;
	}
	
	public Company getCompany(){
		return company;
	}
	
	public void setCompany(Company company){
		this.company = company;
	}
}



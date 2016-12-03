package dto;

public class Document {

	private int id;
	private String name;
	private String mark;
	private String year;
	private String exitYear;
	private String intakeAct;
	private String destructionAct;
	private String containerCode;
	private String documentCode;
	private String placeCode;
	private String description;
	
	private Series series;

	private Company company;

	public Document() {

	}

	public Document(int id, String name, String mark, String year, String exitYear, 
					String intakeAct, String destructionAct, String containerCode,
					String documentCode, String placeCode, String description) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.year = year;
		this.exitYear = exitYear;
		this.intakeAct = intakeAct;
		this.destructionAct = destructionAct;
		this.containerCode = containerCode;
		this.documentCode = documentCode;
		this.placeCode = placeCode;
		this.description = description;
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

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getExitYear() {
		return exitYear;
	}

	public void setExitYear(String exitYear) {
		this.exitYear = exitYear;
	}

	public String getIntakeAct() {
		return intakeAct;
	}

	public void setIntakeAct(String intakeAct) {
		this.intakeAct = intakeAct;
	}

	public String getDestructionAct() {
		return destructionAct;
	}

	public void setDestructionAct(String destructionAct) {
		this.destructionAct = destructionAct;
	}

	public String getContainerCode() {
		return containerCode;
	}

	public void setContainerCode(String containerCode) {
		this.containerCode = containerCode;
	}

	public String getDocumentCode() {
		return documentCode;
	}

	public void setDocumentCode(String documentCode) {
		this.documentCode = documentCode;
	}

	public String getPlaceCode() {
		return placeCode;
	}

	public void setPlaceCode(String placeCode) {
		this.placeCode = placeCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Series geSseries(){
		return series;
	}

	public void setSeries(Series series){
		this.series = series;
	}

	public Company getCompany(){
		return company;
	}

	public void setCompany(Company company){
		this.company = company;
	}
}



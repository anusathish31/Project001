package Employee;

public class EmployeeDTO {

	private String fname;
	private String lname;
	private String gender;
	private String jobTitle;
	private String addLine1;
	private String addLine2;
	private String city;
	private String state;
	private String zipcode;
	private String phNum;
	private String altPhNum;
	private String dob;
	private String bloodGroup;
	private String entryDate;
	private String country;
	private Integer empid;
	
	
	
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
		
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPhNum() {
		return phNum;
	}
	public void setPhNum(String phNum) {
		this.phNum = phNum;
	}
	public String getAltPhNum() {
		return altPhNum;
	}
	public void setAltPhNum(String altPhNum) {
		this.altPhNum = altPhNum;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
			
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getAddLine1() {
		return addLine1;
	}
	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}
	public String getAddLine2() {
		return addLine2;
	}
	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "EmployeeDTO [fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", jobTitle=" + jobTitle
				+ ", addLine1=" + addLine1 + ", addLine2=" + addLine2 + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + ", phNum=" + phNum + ", altPhNum=" + altPhNum + ", dob=" + dob
				+ ", bloodGroup=" + bloodGroup + ", entryDate=" + entryDate + ", country=" + country + ", empid="
				+ empid + "]";
	}
	
}

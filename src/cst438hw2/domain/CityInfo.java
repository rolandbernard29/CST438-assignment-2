package cst438hw2.domain;

public class CityInfo {

	private int id;
	private String name;
	private Country country;
	private String district;
	private long population;
	private double temp;
	private String time;
	
	public CityInfo() {
		
	}
	
	public CityInfo(int id, String name, Country country, String district, long population, double temp, String time) {
		this.id = id;
		this.name = name;
		this.country = country;
		this.district = district;
		this.population = population;
		this.temp = temp;
		this.time = time;
	}
	
	//ID
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	//name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	//Country
	public Country getCountry() {
		return country;
	}
	
	public void setCountry(Country country) {
		this.country = country;
	}
	//district
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	//population
	public long getPopulation() {
		return population;
	}
	
	public void setPopulation(long population) {
		this.population = population;
	}
	//temperature
	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}
	//time
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
}
	
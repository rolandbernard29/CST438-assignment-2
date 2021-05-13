package cst438hw2.domain;

public class City {
	
	private int id;
	private String name;
	private Country country;
	private String district;
	private long population;
	
	
	public City() {
		
	}
	
	public City(int id, String name, Country country, String district, 
			long population) {
		this.id = id;
		this.name = name;
		this.country = country;
		this.district = district;
		this.population = population;
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

	
// country
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
	
}

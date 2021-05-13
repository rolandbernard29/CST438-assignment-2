package cst438hw2.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cst438hw2.domain.*;

@Service
public class CityService {
	
//	@Autowired
//	private CityRepository cityRepository;
//	
//	@Autowired
//	private CountryRepository countryRepository;

	@Autowired
	private WeatherService weatherService;
	
	public CityInfo getCityInfo(String cityName) {		
		
		
		TempAndTime tempAndTime = weatherService.getTempAndTime(cityName);
		
		City city = new City();


		return new CityInfo();
     }
}

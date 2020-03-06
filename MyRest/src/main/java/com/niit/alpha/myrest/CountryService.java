package com.niit.alpha.myrest;

import java.util.HashMap;
import java.util.*;

public class CountryService {
	static HashMap<Integer,Country>countryIdMap;
	CountryService()
	{
		if(countryIdMap==null) {
			countryIdMap=new HashMap<Integer, Country>();
			Country india=new Country(1,"India",10000);
			Country nepal=new Country(2,"Nepal",500);
			Country bhutan=new Country(3,"Bhutan",100);
			Country uae=new Country(4,"UAE",1000);
			
			countryIdMap.put(1, india);
			countryIdMap.put(4, nepal);
			countryIdMap.put(3, bhutan);
			countryIdMap.put(2, uae);
		}
	}
	public List getAllCountries()
	{
		List countries = new ArrayList(countryIdMap.values());
		return countries;
		}
	public Country getCountry(int id)
	{
		Country country=countryIdMap.get(id);
		return country;
		
	}
	public Country addCountry(Country country) {
		country.setId(countryIdMap.size()+1);
		countryIdMap.put(country.getId(), country);
		return country;
		
	}
	public Country updateCountry(Country country) {
		if(country.getId()<=0) return null;
		country.setId(countryIdMap.size()+1);
		countryIdMap.put(country.getId(), country);
		return country;
	}
	public Country deleteCountry(Country country) {
	
	countryIdMap.remove(id);
	}
	public static HashMap<Integer,Country> getCountryIdMap()
	{
		return countryIdMap;
	}
	
}

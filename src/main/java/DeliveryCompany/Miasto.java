package DeliveryCompany;
import java.util.*;

// klasa zawierajace list miast obslugiwanch przez oddzial
public class Miasto {
	String adrMain;
	List<String> cityList = new ArrayList<String>();
	Miasto(String... city) {
		if(city[0]!= null) {
			adrMain = city[0];
		}
		for(String c: city) {
			cityList.add(c);
		}
	}
	boolean contain(String city) {
		for(String s: cityList) {
			if(s.equals(city.toLowerCase()))
				return true;
		}
		return false;
	}
}

package week_14;

public class Nation {
	private String country;	// 나라
	private String capital;	// 수도 

    public Nation(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }

}

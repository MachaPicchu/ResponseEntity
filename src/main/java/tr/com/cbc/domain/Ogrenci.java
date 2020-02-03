package tr.com.cbc.domain;

public class Ogrenci {

	private String firstName;
	private String lastName;
	private int ogrenciId;
	private Adres adres;

	public Ogrenci() {

	}

	public Ogrenci(String firstName, String lastName, int ogrenciId) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.ogrenciId = ogrenciId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getOgrenciId() {
		return ogrenciId;
	}

	public void setOgrenciId(int ogrenciId) {
		this.ogrenciId = ogrenciId;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	@Override
	public String toString() {
		return "Ogrenci Bilgileri[firstName=" + firstName + ", lastName=" + lastName + ", ogrenciId=" + ogrenciId
				+ ", adres=" + adres + "]";
	}

}

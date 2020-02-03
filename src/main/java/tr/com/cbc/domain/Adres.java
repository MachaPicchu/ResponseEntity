package tr.com.cbc.domain;

public class Adres {

	private String sokak;
	private String cadde;
	private String mahalle;

	public Adres() {

	}

	public Adres(String sokak, String cadde, String mahalle) {
		super();
		this.sokak = sokak;
		this.cadde = cadde;
		this.mahalle = mahalle;
	}

	public String getSokak() {
		return sokak;
	}

	public void setSokak(String sokak) {
		this.sokak = sokak;
	}

	public String getCadde() {
		return cadde;
	}

	public void setCadde(String cadde) {
		this.cadde = cadde;
	}

	public String getMahalle() {
		return mahalle;
	}

	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}

	@Override
	public String toString() {
		return "Adres [sokak=" + sokak + ", cadde=" + cadde + ", mahalle=" + mahalle + "]";
	}

}

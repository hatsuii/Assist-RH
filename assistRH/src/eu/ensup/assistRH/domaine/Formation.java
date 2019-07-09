package eu.ensup.assistRH.domaine;

public class Formation {

	private String theme;
	private String date;
	private String duree;
	private String description;
	private String avis;
	
	public Formation(String theme, String date, String duree, String description, String avis) {
		super();
		this.theme = theme;
		this.date = date;
		this.duree = duree;
		this.description = description;
		this.avis = avis;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAvis() {
		return avis;
	}
	public void setAvis(String avis) {
		this.avis = avis;
	}
	
}

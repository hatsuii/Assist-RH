package eu.ensup.assistRH.domaine;

public class Compte {
	private String login;
	private String mdp;
	private String profil;
	public Compte(String login, String mdp, String profil) {
		super();
		this.login = login;
		this.mdp = mdp;
		this.profil = profil;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getProfil() {
		return profil;
	}
	public void setProfil(String profil) {
		this.profil = profil;
	}
	@Override
	public String toString() {
		return "Compte [login=" + login + ", mdp=" + mdp + ", profil=" + profil + "]";
	}
	

}

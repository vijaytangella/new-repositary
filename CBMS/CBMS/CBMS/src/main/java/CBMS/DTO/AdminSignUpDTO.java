package CBMS.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminSignUpDTO {

	@Id
	private long phone;
	private String userAdmin;
	private String createPass;
	private String confirmPass;
	private String mail;
	private String gender;
	private String address;

	public String getUserAdmin() {
		return userAdmin;
	}

	public void setUserAdmin(String userAdmin) {
		this.userAdmin = userAdmin;
	}

	public String getCreatePass() {
		return createPass;
	}

	public void setCreatePass(String createPass) {
		this.createPass = createPass;
	}

	public String getConfirmPass() {
		return confirmPass;
	}

	public void setConfirmPass(String confirmPass) {
		this.confirmPass = confirmPass;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
package full.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import full.validation.ValidEmail;

import full.validation.FieldMatch;



@FieldMatch.List({
    @FieldMatch(first = "password", second = "matchingPassword", message = "The password fields must match")
})
public class CrmUser {

	@NotNull(message="{userName.blind}")
	@Size(min=5, max=30, message="{userName.size}")
	private String userName;

	@NotNull(message="{password.blind}")
	@Size(min=5, max=30, message="{password.size}")
	private String password;
	
//	@NotNull(message="{matchingPassword.blind}")
//	@Size(min=5, max=30, message="{matchingPassword.size}")
	private String matchingPassword;

	@NotNull(message="{firstName.blind}")
	@Size(min=5, max=30, message="{firstName.size}")
	private String firstName;

	@NotNull(message="{lastName.blind}")
	@Size(min=5, max=30, message="{lastName.size}")
	private String lastName;

	@ValidEmail(message="{email.form}")
	@NotNull(message="{email.blind}")
	@Size(min=5, max=30, message="{email.size}")
	private String email;

	public CrmUser() {

	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMatchingPassword() {
		return matchingPassword;
	}

	public void setMatchingPassword(String matchingPassword) {
		this.matchingPassword = matchingPassword;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

Feature: SignUp to Amazon

	Scenario: SignUp with Invalid Credentials will give an error message.
		
		Given user is on home page of the amazon website
		When user clicks on the signup button
		And inputs an tteesstt112233@gmail.com wrong email address
		And clicks on the continue button after entering the email address
		Then the user will be able to see an error message contains Your password is incorrect.
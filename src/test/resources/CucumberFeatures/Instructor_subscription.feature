Feature: Instructor subscription
 
	Scenario Outline: Login to user to make payment
    Given goto website
    When enter username <username> and password <password>
    Then payment page should display and payment is made with card number <num> expiry <exp> and cvv 789
    
		Examples:
	  |username                             |password      |num              |exp     |cvv|
 		|"vinaykumarap.16is@saividya.ac.in"   |"Vinay76765@" |"4242424242424242" |"0131"  |789|
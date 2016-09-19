Feature: As a User, I want that the Careers page displays the number of open positions, 
and it should also match the amount of open positions displayed in the job location page.

@ignore
Scenario Outline: Successfully display the amount of open positions for a job location
	Given I visit Avenue Code website
	And I'm in the Careers page
	When I click in '<jobLocation>' location
	Then I should see '<openPostionAmount>' open positions

Examples:
	| jobLocation 						| openPostionAmount	|
	| San Francisco Bay Area	| 15								|
	| Belo Horizonte					| 14								|
	| São Paulo								| 12								|
	| Jacksonville, FL				| 1									|
	| New York								| 7									|
	| Pittsburgh							| 1									|
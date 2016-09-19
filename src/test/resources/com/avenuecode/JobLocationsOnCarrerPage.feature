Feature: As a User, I want to see all job location in Careers Page

@ignore
Scenario Outline: Successfully display all job location
	Given I visit Avenue Code website
	When I access to Careers page
	Then I should see '<jobLocationAmount>' job locations
	
Examples:
	| jobLocationAmount |
	| 7					|
Feature: As a User, I want to see more informations about a specific talent in the Talent page 

@ignore
Scenario Outline: Successfully open a modal with informations about a specific talent
	Given I visit Avenue Code website
	And I access the 'Talent Page'
	When I select a specific Talent
	And I click in 'Show more' information of '<talent>'
	Then I should see a window with more informations about '<talent>'
Examples:

	| talent                |
	| Project Management 	  |
	| Business Analysis   	|
  | Software Development  |
  | Quality Assurance   	|
  | Development Operations|
  | Product Management  	|
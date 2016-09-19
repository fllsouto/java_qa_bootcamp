Feature: As a User, I want sign-up for a course at Academy page, and be redirected to the Contact page

@ignore
Scenario Outline: Successfully redirect to Contact page when sign up a course
	Given I visit Avenue Code website
	And I access the 'Academy Page'
	When I click in the '<courses>' for more informations
	And I click to register in the '<courses>'
	Then I should be in the Contact page

Examples:
	| courses 						|
	| Chef fundamentals 			|
	| Scrum master certificantion 	|
	| Introduction to ATG			|
	| Advanced ATG					|
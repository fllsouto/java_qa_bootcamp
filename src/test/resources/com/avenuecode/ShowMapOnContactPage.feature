Feature: As a User, I want to see a Map of a office location when I click in the "Show 	map" in the Contact page, and I want to hide the map if I click in "Hide Map"

@ignore
Scenario: Successfully show the map in the Contact page
  Given I visit Avenue Code website
  And I access the Contact Page
  When I click in the 'Show map' button "1" time
  Then I should 'see' the map of a office location

@ignore
Scenario: Successfully show the map in the Contact page
	Given I visit Avenue Code website
	And I access the Contact Page
	When I click in the 'Show map' button "2" time
	Then I should 'not see' the map of a office location
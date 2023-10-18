Feature: login
@test1
 Scenario: After successful login user land on homepage
    Given user launched chrome browser
    When user open url "https://demo.guru99.com/V1/index.php"
    And user enter username "mngr530249" and password "hEsyguv"
    And user click on login button
    Then  page tiltle should be "GTPL Bank Manager HomePage"
    And  user close browser
 
 
@test2
 Scenario Outline : Login with diff set of data
    Given user launched chrome browser
    When user open url "https://demo.guru99.com/V1/index.php"
    And user enter  <username> and <password>
    And user click on login button
    Then  page tiltle should be "GTPL Bank Manager HomePage"
    And  user close browser
    
   Example:
          |username|password|
          |"mngr530249"|"hEsyguv"|
  ## go to webTable page, enter username and password, then load
  Feature: Login to Web table page

    Background: # for command
      Given User goes to web table page


    # @Winp
    Scenario: login with valid credentials
      When User enters username
      And User enters password
      And User click login button
      Then User is on dashboard

    #  @wip
    Scenario: login with invalid credentials
      When User enters wrong username
      And User enters wrong password
      And User click login button
      Then User see warning popup

    # parameterization
#    @And
    Scenario: Login with parameters
      When User enters "username"
      And User enters "password"
      And  User click login button
      Then  User is on dashboard
#    @wip
      Scenario: login with 2 parameters
        When User enter "Test" and "Tester"
        And User click login button
        Then User is on dashboard


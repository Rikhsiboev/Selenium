Feature: Google search countries capital city

  @wip
  Scenario Outline: Google Search countries capital city
    Given  User goes to Google.com
    When User search for capital of "<country name>"
    Then  User should see capital city as "<capital city>"
    Examples:
      | country name | capital city     |
      | USA          | Washington, D.C. |
      | Japan        | Tokyo            |
      | Turkey       | Ankara           |
      | Morocco      | Rabat            |

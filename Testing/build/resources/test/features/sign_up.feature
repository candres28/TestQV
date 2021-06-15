Feature: I as a user of the page
  I need to register
  to access the page

  Scenario: Successful registration
    Given that the user is on the main page
    When enter the data for registration
      | firstName | lastName | email             | month    | day | year  | city     | zip   | country   | computer | version | languages | mobile  | model       | so                | password      |
      | Pedro    | Garcia   | candres43@gmail.com | February | 12  | 1995  | Medellín | 050042 | Colombia |   Linux  | CentOS  | English   | Samsung | Galaxy A30s | Android 9.0 (Pie) | Medellin1234$ |
    Then he should see a successful log message Welcome to the world's largest community of freelance software testers!
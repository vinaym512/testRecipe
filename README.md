This is a BDD test framework using java, junit, cucumber and Mevan
To run this, clone or download this project and import in an IDE (I have used Intellij)
Import all the mevan dependencies
Set a Run/Debug configuration for mevan  using command  - <clean test -DbrowserToTest=chrome>
Pass the tags to @CucumberOptions in the TestRunner_QA file
Click on run button after selecting the configuration created in step 4.
Reports can be seen at ./target/CucumberReport/index.html

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
${symbol_pound} ${artifactId}

A Web Application Project using Spring Boot

${symbol_pound}${symbol_pound} Getting started

1. Install postgres, and set the corresponding user, password and database, or set application properties to use a remote postgres database.

2. Change working directory to ```<project-root>```

3. Install project modules

	``` 
	$ mvn clean install
	```

4. Build the project
	
	``` 
	$ mvn clean package
	```

5. Run the application
	
	``` 
	$ java -jar <-Dproperties> <project-root>/${artifactId}-webapp/target/${artifactId}-webapp-${version}.jar
	```


${symbol_pound}${symbol_pound} Acknowledgement
Project created using 
[com.bellotapps.archetypes.spring-boot-archetype](https://github.com/juanmbellini/spring-boot-archetype) archetype

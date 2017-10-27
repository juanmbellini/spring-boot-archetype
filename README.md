# Spring Boot Archetype [![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)

A Maven archetype for a multi-module project using Spring Boot (and other Spring projects), 
which includes core, persistence interfaces, persistence, service interfaces, service and webapp modules.

## Overview
This is a Maven archetype for creating a multi-module project including the following modules:


* Core
* Persistence Interfaces
* Persistence
* Services Interfaces
* Services
* Webapp

#### Core
This module includes the business domain models, general exceptions and error handling stuff.

#### Persistence Interfaces
This module defines Data Access Object interfaces, as well as query helpers interfaces 
(which help de DAOs consumers perform queries, by supplying query predicates)

#### Persistence
This module defines configuration for spring data, and implement the query helpers

#### Services Interfaces
This module defines Services and some security stuff interfaces

#### Services
This module implements the services and security stuff interfaces.
It also defines configuration for spring security global method security.

#### Webapp
This is the main module. It contains the runnable class.
It defines main configuration for the application.
It implements the web layer using Jersey, including the authentication mechanism (Bearer authentication using JWT).


## Getting Started

These instructions will install the archetype into your local machine

### Prerequisites

1. Clone the repository or download source code:

	```
	$ git clone https://github.com/juanmbellini/spring-boot-archetype.git
	```
	or
	
	```
	$ wget https://github.com/juanmbellini/spring-boot-archetype/archive/master.zip
	```

2. Install Maven

	#### Mac OS X
	```
	$ brew install maven
	```
	
	#### Ubuntu
	```
	$ sudo apt-get install maven
	```
	
	#### Other OSes
	Check https://maven.apache.org/install.html.
	

### Build

1. Change working directory to ```./spring-boot-archetype```

	```
	$ cd ./spring-boot-archetype
	```
	
2. Install the archetype

	```
	$ mvn clean install
	```

## Usage

1. Create a new project from a local archetype

	```
	$ mvn archetype:generate -DarchetypeCatalog=local
	```

2. Select the ```com.bellotapps.archetypes:spring-boot-archetype``` option.

3.	Follow the instructions, setting ```groupId```, ```artifactId```, ```version```,  ```package```, 
```dbHost```, ```dbPort```, ```dbName```, ```dbUsername```, ```dbPassword```.

## License

Copyright 2017 BellotApps

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

## Author
* [Juan Marcos Bellini](https://github.com/juanmbellini)
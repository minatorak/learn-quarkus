dev:
	./gradlew quarkusDev

package:
	./gradlew build -Dquarkus.package.type=uber-jar

native:
	./gradlew build -Dquarkus.package.type=native

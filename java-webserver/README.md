# Java application

## How to build the Java application

1. Make sure you have at least JDK 11 installed.
2. Optional: Make sure you have Gradle 6 (older versions might also work, not tested) installed. (Or use the provided `gradlew`)
3. Run `gradle bootJar` in this directory (project root) to build a jar containing the application code including dependencies.
4. You can find the generated jar in the folder `java-webserver/build/libs/`

## How to run the Java application
`java -Xmx64M -jar java-webserver-0.1.0.jar`

The heap size of 64MB is just an example. It is able to run with that amount, but of course also with more.

## Contributing code

This project uses the [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html).
If you're using IntelliJ IDEA, please add `.idea/codeStyles/intellij-java-google-style.xml` as Code Style for Java
in the project's settings.
Also, please consider installing the [google-java-format plugin](https://plugins.jetbrains.com/plugin/8527-google-java-format)
and the [Save Actions plugin](https://plugins.jetbrains.com/plugin/7642-save-actions).
The configuration file in this repository will apply the style then while saving. For more information on the google-java-formatter
plugin, please see: https://github.com/google/google-java-format.

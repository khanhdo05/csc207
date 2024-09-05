### Setting Up a Maven Project and Configuration

#### a. Set Up a New Maven Project

1. **Open your terminal** and navigate to the directory where you want to create your Maven project.
2. **Create a new Maven project** using the following command:

    ```bash
    mvn archetype:generate -DgroupId=edu.grinnell.csc207 -DartifactId=maven-sample -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
    ```

    - `-DgroupId=edu.grinnell.csc207` sets the group ID.
    - `-DartifactId=maven-sample` sets the artifact ID.
    - `-DarchetypeArtifactId=maven-archetype-quickstart` specifies the archetype (template) to use.
    - `-DinteractiveMode=false` runs the command non-interactively.

3. **Navigate to your project directory**:

    ```bash
    cd maven-sample
    ```

#### b. Review the `App.java` File

1. **Navigate to the `src/main/java/edu/grinnell/csc207` directory** where you should find the `App.java` file.
2. **Open the file** in a text editor or IDE to review its contents. It should contain a basic `main` method that prints "Hello World!" to the console.

#### c. Compile the Project

1. **Compile the project** using Maven:

    ```bash
    mvn compile
    ```

    Or, to suppress most of the output:

    ```bash
    mvn compile -q
    ```

#### d. Determine Where the `.class` Files End Up

1. After compilation, **check the `target` directory**:

    ```bash
    ls target/classes/edu/grinnell/csc207/
    ```

    The `.class` files should be located in `target/classes/edu/grinnell/csc207/`.

#### e. Run the Compiled `App.java`

1. **Run the compiled `App.java`** using the following command:

    ```bash
    java -cp target/classes edu.grinnell.csc207.App
    ```

    This command runs the `App` class from the compiled `.class` file.

#### f. Modify and Recompile `App.java`

1. **Open `App.java`** and modify the `System.out.println` statement to print something else.
2. **Recompile the project** using:

    ```bash
    mvn compile
    ```

3. **Re-run the application** to verify the changes:

    ```bash
    java -cp target/classes edu.grinnell.csc207.App
    ```

#### g. Results of Running `mvn clean`

1. **Run the clean command**:

    ```bash
    mvn clean
    ```

    Or, to suppress most of the output:

    ```bash
    mvn clean -q
    ```

2. **Check the `target` directory**. After running `mvn clean`, the `target` directory (and thus the compiled `.class` files) should be deleted.

#### h. Update `pom.xml` to Use Java 17

1. **Open the `pom.xml` file** in the root directory of your project.
2. **Update the `maven-compiler-plugin`** configuration to use Java 17. Add or modify the following inside the `<build>` section:

    ```xml
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>17</source>
                    <target>17</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
    ```

3. **Save the `pom.xml` file** and recompile your project to ensure everything is configured correctly:

    ```bash
    mvn compile
    ```

This process should set up your Maven project, allowing you to compile, run, and modify your Java application efficiently.

#### Create a `.jar` file

1. 
    ```bash
    mvn package
    ```
2. 
    ```bash
    java -cp target/maven-sample-1.0-SNAPSHOT.jar edu.grinnell.csc207.main.HelloWorld
    ```

### Test name convention
`*Test.java`
method `testSomething`

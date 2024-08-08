### Overview
The Wikipedia Search is a Java-based application that allows users to search for specific words or phrases on Wikipedia and retrieves the top 10 related links. Built using JavaFX for the user interface, JDBC for database connectivity, and Jsoup for web scraping, this tool provides an efficient way to quickly access relevant Wikipedia articles based on user input.

### Features
- **Search Functionality:** Users can enter any word or phrase in the search bar.
- **Top 10 Results:** The scraper fetches the first 10 Wikipedia links related to the search term.
- **Database Integration:** Search results are stored in a database for future reference.
- **User-Friendly Interface:** Built with JavaFX for a smooth and intuitive user experience.

### Installation

#### Prerequisites
- Java Development Kit (JDK) 21 or higher
- JavaFX SDK
- JDBC-compatible database (Mariadb in my case)
- Gradle (for dependency management)

#### Steps
1. **Clone the Repository:**
   ```sh
   git clone https://github.com/Hackeemlunar/wikipediaSearch.git
   cd wikipediaSearch
   ```
2. **Configure Database:**
   - Set up your JDBC-compatible database.
   - Update the `src/main/resources/database.properties` file with your database connection details.

3. **Install Dependencies:**
   - Use Gradle to install required dependencies:
     ```sh
     ./gradlew clean build
     ```

4. **Run the Application:**
   - Use Gradle to compile and run the application:
     ```sh
     ./gradlew run
     ```

### Usage
1. **Launch the Application:**
   - Run the application using the steps above.
2. **Enter Search Term:**
   - Enter the word or phrase you want to search for in the search bar.
3. **View Results:**
   - The application will display the top 10 related Wikipedia links.
   - Results are stored in the database for future reference.

### Contributing
1. Fork the repository.
2. Create a new branch:
   ```sh
   git checkout -b feature-branch
   ```
3. Make your changes and commit them:
   ```sh
   git commit -m "Description of your changes"
   ```
4. Push to the branch:
   ```sh
   git push origin feature-branch
   ```
5. Create a new Pull Request.

### License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

### Acknowledgements
- Wikipedia API documentation
- Jsoup documentation
- JavaFX documentation
- JDBC documentation

### Contact
For any questions or suggestions, please contact [hackeem@aceking.me].

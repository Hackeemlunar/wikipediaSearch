package me.aceking.wikipediasearch.repository;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import me.aceking.wikipediasearch.model.SearchResult;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WikiSearchRepositoryImpl implements WikiSearchRepository {
    private static volatile WikiSearchRepositoryImpl instance;
    private HikariDataSource dataSource;
    private static final String DATABASE_URL = "jdbc:mariadb://localhost:3306/wikiSearch";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "3321";
    private ResultSet resultSet;
    private PreparedStatement statement;

    private WikiSearchRepositoryImpl() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(DATABASE_URL);
        config.setUsername(DATABASE_USERNAME);
        config.setPassword(DATABASE_PASSWORD);
        dataSource = new HikariDataSource(config);
    }

    public static WikiSearchRepositoryImpl getInstance() {
        if (instance == null) {
            synchronized (WikiSearchRepositoryImpl.class) {
                if (instance == null) {
                    instance = new WikiSearchRepositoryImpl();
                }
            }
        }
        return instance;
    }

    private Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    @Override
    public List<SearchResult> search(String title) {
        // Implement database search logic using getConnection()
        List<SearchResult> searchResults = new ArrayList<>();
        String query = "select * from searchresult where title like ?";
        try(Connection connection = getConnection()) {
            statement = connection.prepareStatement(query);
            statement.setString(1, "%" + title + "%");
            resultSet = statement.executeQuery();
            int i = 0;
            while (resultSet.next()) {
                String searchTitle = resultSet.getString("title");
                String snippet = resultSet.getString("snippet");
                String url = resultSet.getString("url");
                searchResults.add(new SearchResult(searchTitle, snippet, url));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return searchResults;
    }

    @Override
    public void save(SearchResult searchResult) {
        // Implement save logic using getConnection()
    }

    @Override
    public void delete(String title) {
        // Implement delete logic using getConnection()
    }

    @Override
    public void update(SearchResult searchResult) {
        // Implement update logic using getConnection()
    }
}
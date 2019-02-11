package ppeck.githubapi;

import ppeck.githubapi.model.Github;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GithubAPI {
    String baseURL = "https://api.github.com";

    @GET("/search/repositories")
    Call<Github> getRepositories (
    @Query("q") String q,
    @Query("sort") String sort,
    @Query("order") String order);
}

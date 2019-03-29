package com.bernardino.gistsearch.network;

import com.bernardino.gistsearch.data.Gist;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {
    @GET("gists/public")
    Call<List<Gist>> listGists();

    @GET("gists/{id}")
    Call<Gist> listRepos(@Path("id") String id);
}

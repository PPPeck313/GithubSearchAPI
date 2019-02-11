package ppeck.githubapi;

import android.app.Activity;
import android.hardware.input.InputManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ppeck.githubapi.model.Github;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MAIN";
    private EditText searchEditText;
    private Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.repositoryList);

        final RepositoryAdapter repositoryAdapter = new RepositoryAdapter();
        recyclerView.setAdapter(repositoryAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL,
                false));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(GithubAPI.baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        final GithubAPI client = retrofit.create(GithubAPI.class);

        searchEditText = (EditText) findViewById(R.id.searchEditText);
        searchEditText.setImeOptions(EditorInfo.IME_ACTION_DONE);
        searchEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    InputMethodManager inputManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);;
                    inputManager.hideSoftInputFromWindow(searchEditText.getWindowToken(), 0);
                        searchButton.performClick();
                        return true;
                }

                return false;
            }
        });

        searchButton = (Button) findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<Github> call = client.getRepositories(searchEditText.getText().toString(), "stars", "desc");

                Log.i(TAG, "ENQUEUING CALL");
                call.enqueue(new Callback<Github>() {
                    @Override
                    public void onResponse(Call<Github> call, Response<Github> response) {
                        if (response.body() != null) {
                            Github git = response.body();
                            repositoryAdapter.setRepositoryList(git.getItems());
                            Log.i(TAG, git.toString());
                        }

                        else {
                            Log.i(TAG, "BODY IS EMPTY");
                        }
                    }

                    @Override
                    public void onFailure(Call<Github> call, Throwable t) {
                        Log.e(TAG, t.toString());
                    }
                });
            }
        });
    }
}

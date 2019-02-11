package ppeck.githubapi;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import ppeck.githubapi.model.Repository;

public class RepositoryAdapter extends RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder> {
    private List<Repository> RepositoryList;

    public RepositoryAdapter() {
        RepositoryList = new ArrayList<Repository>();
    }

    public void setRepositoryList(List<Repository> RepositoryList) {
        this.RepositoryList = RepositoryList;
        notifyDataSetChanged();
    }

    @Override
    public RepositoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.item_repository, parent, false);

        return new RepositoryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RepositoryViewHolder viewHolder, int position) {
        Repository RepositoryModel = RepositoryList.get(position);

        Picasso.get().load(Uri.parse(RepositoryModel.getOwner().getAvatar_url())).into(viewHolder.avatar);

        StringBuilder stars = new StringBuilder();
        viewHolder.stars.setText(RepositoryModel.getStargazers_count() + " ★");
        viewHolder.title.setText(RepositoryModel.getName());
        viewHolder.description.setText(RepositoryModel.getDescription());
    }

    @Override
    public int getItemCount() {
        return RepositoryList.size();
    }


    public static class RepositoryViewHolder extends RecyclerView.ViewHolder {
        ImageView avatar;
        TextView stars;
        TextView title;
        TextView description;

        public RepositoryViewHolder(View view) {
            super(view);
            avatar = (ImageView)view.findViewById(R.id.avatar);
            stars = (TextView)view.findViewById(R.id.stars);
            title = (TextView)view.findViewById(R.id.title);
            description = (TextView) view.findViewById(R.id.description);
        }
    }
}
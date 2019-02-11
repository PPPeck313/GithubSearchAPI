package ppeck.githubapi.model;

import com.google.gson.annotations.SerializedName;

public class Repository {
    private int id;
    private String node_id;
    private String name;
    private String full_name;
    private Owner owner;
    @SerializedName("private")
    private Boolean isPrivate;
    private String html_url;
    private String description;
    private Boolean fork;
    private String url;
    private String created_at;
    private String updated_at;
    private String pushed_at;
    private String homepage;
    private int size;
    private int stargazers_count;
    private int watchers_count;
    private String language;
    private int forks_count;
    private int open_issues_count;
    private String master_branch;
    private String default_branch;
    private float score;

    public Repository(int id, String node_id, String name, String full_name, Owner owner, Boolean isPrivate, String html_url,
                      String description, Boolean fork, String url, String created_at, String updated_at, String pushed_at,
                      String homepage, int size, int stargazers_count, int watchers_count, String language, int forks_count,
                      int open_issues_count, String master_branch, String default_branch, int score) {
        this.id = id;
        this.node_id = node_id;
        this.name = name;
        this.full_name = full_name;
        this.owner = owner;
        this.isPrivate = isPrivate;
        this.html_url = html_url;
        this.description = description;
        this.fork = fork;
        this.url = url;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.pushed_at = pushed_at;
        this.homepage = homepage;
        this.size = size;
        this.stargazers_count = stargazers_count;
        this.watchers_count = watchers_count;
        this.language = language;
        this.forks_count = forks_count;
        this.open_issues_count = open_issues_count;
        this.master_branch = master_branch;
        this.default_branch = default_branch;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getPushed_at() {
        return pushed_at;
    }

    public void setPushed_at(String pushed_at) {
        this.pushed_at = pushed_at;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStargazers_count() {
        return stargazers_count;
    }

    public void setStargazers_count(int stargazers_count) {
        this.stargazers_count = stargazers_count;
    }

    public int getWatchers_count() {
        return watchers_count;
    }

    public void setWatchers_count(int watchers_count) {
        this.watchers_count = watchers_count;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getForks_count() {
        return forks_count;
    }

    public void setForks_count(int forks_count) {
        this.forks_count = forks_count;
    }

    public int getOpen_issues_count() {
        return open_issues_count;
    }

    public void setOpen_issues_count(int open_issues_count) {
        this.open_issues_count = open_issues_count;
    }

    public String getMaster_branch() {
        return master_branch;
    }

    public void setMaster_branch(String master_branch) {
        this.master_branch = master_branch;
    }

    public String getDefault_branch() {
        return default_branch;
    }

    public void setDefault_branch(String default_branch) {
        this.default_branch = default_branch;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String toString(Boolean delimited) {
        String tab = "";

        if (delimited) {
            tab = "\t\t";
        }

        StringBuilder s = new StringBuilder();
        s.append(tab + "Id: " + Integer.toString(id) + "\n" +
                tab + "Node Id: " + node_id + "\n" +
                tab + "Name: " + name + "\n" +
                tab + "Full Name: " + full_name + "\n" +
                tab + "Owner: " + "\n" + owner.toString(true) +
                tab + "Private: " + isPrivate + "\n" +
                tab + "HTML URL: " + html_url + "\n" +
                tab + "Description: " + description + "\n" +
                tab + "Fork: " + fork.toString() + "\n" +
                tab + "URL: " + url + "\n" +
                tab + "Created At: " + created_at + "\n" +
                tab + "Updated At: " + updated_at + "\n" +
                tab + "Pushed At: " + pushed_at + "\n" +
                tab + "Homepage: " + homepage + "\n" +
                tab + "Size: " + Integer.toString(size) + "\n" +
                tab + "Stargazers Count: " + Integer.toString(stargazers_count) + "\n" +
                tab + "Watchers Count: " + Integer.toString(watchers_count) + "\n" +
                tab + "Language: " + language + "\n" +
                tab + "Forks Count: " + Integer.toString(forks_count) + "\n" +
                tab + "Open Issues Count: " + Integer.toString(open_issues_count) + "\n" +
                tab + "Master Branch: " + master_branch + "\n" +
                tab + "Default Branch: " + default_branch + "\n" +
                tab + "Score: " + Float.toString(score));

        if (delimited) {
            s.append("\n");
        }

        return s.toString();
    }
}

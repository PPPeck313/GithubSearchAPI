package ppeck.githubapi.model;

public class Owner {
    private String login;
    private int id;
    private String node_id;
    private String avatar_url;
    private String gravatar_id;
    private String url;
    private String received_events_url;
    private String type;

    public Owner(String login, int id, String node_id, String avatar_url, String gravatar_id, String url, String received_events_url, String type) {
        this.login = login;
        this.id = id;
        this.node_id = node_id;
        this.avatar_url = avatar_url;
        this.gravatar_id = gravatar_id;
        this.url = url;
        this.received_events_url = received_events_url;
        this.type = type;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getGravatar_id() {
        return gravatar_id;
    }

    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReceived_events_url() {
        return received_events_url;
    }

    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(Boolean delimited) {
        String tab = "";

        if (delimited) {
            tab = "\t\t\t";
        }

        StringBuilder s = new StringBuilder();
        s.append(tab + "Login: " + login + "\n" +
                tab + "Id: " + Integer.toString(id) + "\n" +
                tab + "Node Id: " + node_id + "\n" +
                tab + "Avatar URL: " + avatar_url + "\n" +
                tab + "Gravatar Id: " + gravatar_id + "\n" +
                tab + "URL: " + url + "\n" +
                tab + "Received Events URL: " + received_events_url + "\n" +
                tab + "Type: " + type);

        if (delimited) {
            s.append("\n");
        }

        return s.toString();
    }
}

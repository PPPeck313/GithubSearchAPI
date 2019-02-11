package ppeck.githubapi.model;

import java.util.ArrayList;

public class Github {
    private int total_count;
    private Boolean incomplete_results;
    private ArrayList<Repository> items;

    public Github(int total_count, Boolean incomplete_results, ArrayList<Repository> items) {
        this.total_count = total_count;
        this.incomplete_results = incomplete_results;
        this.items = items;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public Boolean getIncomplete_results() {
        return incomplete_results;
    }

    public void setIncomplete_results(Boolean incomplete_results) {
        this.incomplete_results = incomplete_results;
    }

    public ArrayList<Repository> getItems() {
        return items;
    }

    public void setItems(ArrayList<Repository> items) {
        this.items = items;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\n" + "Total Count: " + total_count + "\n" +
                "Incomplete Results: " + incomplete_results.toString() + "\n" +
                "Items : " + "\n");

        for (int i = 0; i < items.size(); i++) {
            s.append("\t" + "Item " + Integer.toString(i) + ": " + "\n");
            s.append(items.get(i).toString(true));
        }

        return s.toString();
    }
}

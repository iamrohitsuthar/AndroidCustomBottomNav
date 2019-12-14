package com.rohitsuthar.androidcustombottomnav.models;

public class ContestsModel {
    private int img_thumb, img_status;
    private boolean isLive;
    private String game_name, game_type, date_and_time;
    private int coins, current_users, total_users;

    public ContestsModel(int img_thumb, int img_status, boolean isLive, String game_name, String game_type, String date_and_time, int coins, int current_users, int total_users) {
        this.img_thumb = img_thumb;
        this.img_status = img_status;
        this.isLive = isLive;
        this.game_name = game_name;
        this.game_type = game_type;
        this.date_and_time = date_and_time;
        this.coins = coins;
        this.current_users = current_users;
        this.total_users = total_users;
    }

    public int getImg_thumb() {
        return img_thumb;
    }

    public int getImg_status() {
        return img_status;
    }

    public boolean isLive() {
        return isLive;
    }

    public String getGame_name() {
        return game_name;
    }

    public String getGame_type() {
        return game_type;
    }

    public String getDate_and_time() {
        return date_and_time;
    }

    public int getCoins() {
        return coins;
    }

    public int getCurrent_users() {
        return current_users;
    }

    public int getTotal_users() {
        return total_users;
    }
}

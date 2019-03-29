package com.bernardino.gistsearch.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "owner")
public class Owner {
    @PrimaryKey
    private String login;

    @ColumnInfo(name = "avatar_url")
    private String avatarUrl;
}
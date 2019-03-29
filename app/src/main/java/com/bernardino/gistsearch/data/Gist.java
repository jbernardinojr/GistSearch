package com.bernardino.gistsearch.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "gists")
public class Gist {

    @PrimaryKey
    private String id;

    @ColumnInfo(name = "description")
    private String description;

    private Owner owner;

}

package com.helpplusapp.amit.helpplus.datahelpler;

import ckm.simple.sql_provider.annotation.SimpleSQLColumn;
import ckm.simple.sql_provider.annotation.SimpleSQLTable;

/**
 * Created by amit on 8/30/2016.
 */
@SimpleSQLTable(table = "helpPlusDBTable", provider = App.HELPPLUS_PROVIDER)
public class HelpPlusDBTable {

    @SimpleSQLColumn(value = "_id",primary = true)
    public long id;

    @SimpleSQLColumn("tagname")
    public String tagName;

    @SimpleSQLColumn("timecreated")
    public String timeCreated;

    public HelpPlusDBTable() {
    }

    public HelpPlusDBTable(String tagName, String timeCreated) {
        this.tagName = tagName;
        this.timeCreated = timeCreated;
    }
}
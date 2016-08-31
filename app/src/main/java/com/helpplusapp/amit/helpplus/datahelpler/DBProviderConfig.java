package com.helpplusapp.amit.helpplus.datahelpler;

import ckm.simple.sql_provider.UpgradeScript;
import ckm.simple.sql_provider.annotation.ProviderConfig;
import ckm.simple.sql_provider.annotation.SimpleSQLConfig;

/**
 * Created by amit on 8/30/2016.
 */
@SimpleSQLConfig(
        name = App.HELPPLUS_PROVIDER,
        authority = "com.helpplusapp.amit.helpplus",
        database = "helpplus.db",
        version = 3)
public class DBProviderConfig implements ProviderConfig {
    @Override
    public UpgradeScript[] getUpdateScripts() {
        return new UpgradeScript[0];
    }
}
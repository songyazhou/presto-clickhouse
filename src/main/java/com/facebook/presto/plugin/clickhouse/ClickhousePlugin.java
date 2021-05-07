package com.facebook.presto.plugin.clickhouse;

import com.facebook.presto.plugin.jdbc.JdbcPlugin;

public class ClickhousePlugin extends JdbcPlugin {
    public ClickhousePlugin() {
        super("clickhouse", new ClickhouseClientModule());
    }
}

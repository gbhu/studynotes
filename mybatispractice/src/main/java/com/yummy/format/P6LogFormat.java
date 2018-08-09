package com.yummy.format;

import com.alibaba.druid.sql.SQLUtils;
import com.p6spy.engine.spy.appender.MessageFormattingStrategy;
import org.apache.log4j.Logger;

public class P6LogFormat implements MessageFormattingStrategy {
    private static final Logger LOG = Logger.getLogger(P6LogFormat.class);

    public String buildMessage(String now, long elapsed, String sql) {
        StringBuffer content = new StringBuffer();
        if (org.apache.commons.lang3.StringUtils.isNotEmpty(now) && org.apache.commons.lang3.StringUtils.isNotEmpty(Long.valueOf(elapsed).toString())
                && org.apache.commons.lang3.StringUtils.isNotEmpty(sql)) {
            content.append("当前时间:" + now);
            content.append(" SQL执行耗时(毫秒)为" + elapsed);
            content.append(" SQL执行的语句是\n" + SQLUtils.formatMySql(sql)+"\n\n");
        }
        LOG.info(content);
        return content.toString();
    }
    @Override
    public String formatMessage(int connectionId, String now, long elapsed, String category, String prepared, String sql) {
        return buildMessage(now, elapsed, sql);
    }
}

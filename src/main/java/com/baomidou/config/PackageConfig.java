package com.baomidou.config;

import org.apache.maven.plugins.annotations.Parameter;

/**
 * 跟包相关的配置项
 *
 * @author YangHu
 * @since 2016/8/30
 */
public class PackageConfig {

    /**
     * 父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名
     */
    @Parameter(defaultValue = "com.kingdowin.xiugr.server.dao")
    private String parent;
    /**
     * Entity包名
     */
    @Parameter(defaultValue = "entity")
    private String entity;

    /**
     * dao包名
     */
    @Parameter(defaultValue = "daoName")
    private String daoName;

    /**
     * Mapper包名
     */
    @Parameter(defaultValue = "mapper")
    private String mapper;

    /**
     * Mapper XML包名
     */
    @Parameter(defaultValue = "mapper.xml")
    private String xml;

    public String getParent() {
        return parent;
    }

    public String getEntity() {
        return entity;
    }

    public String getDaoName() {
        return daoName;
    }


    public String getMapper() {
        return mapper;
    }

    public String getXml() {
        return xml;
    }

}

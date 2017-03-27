package com.baomidou.config;

import java.io.File;
import java.nio.charset.Charset;

/**
 * 定义常量
 *
 * @author YangHu
 * @since 2016/8/31
 */
public class ConstVal {

    public static final String ENTITY = "Entity";
    public static final String DAO = "DAO";
    public static final String MAPPER = "Mapper";
    public static final String XML = "Xml";
    public static final String MODEL = "Model";
    public static final String SERVICE = "Service";
    public static final String SERVICE_IMPL = "ServiceImpl";

    public static final String ENTITY_PATH = "entity_path";
    public static final String DAO_PATH = "dao_path";
    public static final String MAPPER_PATH = "mapper_path";
    public static final String XML_PATH = "xml_path";
    public static final String MODEL_PATH  = "model_path";
    public static final String SERVICE_PATH  = "service_path";
    public static final String SERVICE_IMPL_PATH  = "serviceImpl_path";

    public static final String JAVA_TMPDIR = "java.io.tmpdir";
    public static final String UTF8 = Charset.forName("UTF-8").name();
    public static final String UNDERLINE = "_";

    public static final String JAVA_SUFFIX = ".java";
    public static final String XML_SUFFIX = ".xml";

    public static final String TEMPLATE_ENTITY = "/template/entity.java.vm";
    public static final String TEMPLATE_MAPPER = "/template/mapper.java.vm";
    public static final String TEMPLATE_XML = "/template/mapper.xml.vm";
    public static final String TEMPLATE_DAO = "/template/DAO.java.vm";
    public static final String TEMPLATE_MODEL = "/template/model.java.vm";
    public static final String TEMPLATE_SERVICE = "/template/service.java.vm";
    public static final String TEMPLATE_SERVICE_IMPL = "/template/serviceImpl.java.vm";

    public static final String ENTITY_NAME = File.separator + "%s" + JAVA_SUFFIX;
    public static final String MAPPER_NAME = File.separator + "%s" + MAPPER + JAVA_SUFFIX;
    public static final String XML_NAME = File.separator + "%s" + MAPPER + XML_SUFFIX;
    public static final String DAO_NAME = File.separator + "%s" + DAO + JAVA_SUFFIX;
    public static final String MODEL_NAME = File.separator + "%s" + MODEL + JAVA_SUFFIX;
    public static final String SERVICE_NAME = File.separator + "%s" + SERVICE + JAVA_SUFFIX;
    public static final String SERVICE_IMPL_NAME = File.separator + "%s" + SERVICE_IMPL + JAVA_SUFFIX;

    // 配置使用classloader加载资源
    public static final String VM_LOADPATH_KEY = "file.resource.loader.class";
    public static final String VM_LOADPATH_VALUE = "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader";
}

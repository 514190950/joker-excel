package com.tincery.starter.convert;


/**
 * @author gongxuanzhang
 */
public class BooleanConverter implements Converter<Boolean> {
    @Override
    public String convert(Boolean value) {
        if (value == null) {
            return "否";
        }
        return value ? "是" : "否";
    }

    @Override
    public Boolean reconvert(String cellValue, Class<? extends Boolean> clazz) throws Exception {
        if (cellValue.isEmpty()) {
            return null;
        }
        return Boolean.valueOf(cellValue);
    }


}

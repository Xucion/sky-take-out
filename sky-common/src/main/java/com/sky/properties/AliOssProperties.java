package com.sky.properties;

import lombok.Data;
@Data
@Deprecated
public class AliOssProperties {

    private String endpoint;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;

}

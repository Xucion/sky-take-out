package com.sky.utils;

/**
 * @deprecated 已改用 {@link MinioUtil}，仅保留类名以兼容旧代码。
 */
@Deprecated
public class AliOssUtil {
    private final MinioUtil delegate;

    public AliOssUtil(MinioUtil delegate) {
        this.delegate = delegate;
    }

    public String upload(byte[] bytes, String objectName) {
        return delegate.upload(bytes, objectName);
    }
}

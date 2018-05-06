package com.vs.shcherbakov.savy.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b&\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004BO\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0011J\b\u00101\u001a\u00020\u0006H\u0016R$\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR$\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R(\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR(\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0018\"\u0004\b\'\u0010\u001aR(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR(\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001aR(\u0010,\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR(\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001a\u00a8\u00062"}, d2 = {"Lcom/vs/shcherbakov/savy/model/ResItem;", "", "resource", "Lcom/yandex/disk/rest/json/Resource;", "(Lcom/yandex/disk/rest/json/Resource;)V", "path", "", "name", "contentLength", "", "lastUpdated", "dir", "", "etag", "contentType", "publicUrl", "mediaType", "(Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "<set-?>", "getContentLength", "()J", "setContentLength", "(J)V", "getContentType", "()Ljava/lang/String;", "setContentType", "(Ljava/lang/String;)V", "getEtag", "setEtag", "isDir", "()Z", "setDir", "(Z)V", "getLastUpdated", "setLastUpdated", "getMediaType", "setMediaType", "modified", "getModified", "setModified", "getName", "setName", "getPath", "setPath", "previewUrl", "getPreviewUrl", "setPreviewUrl", "getPublicUrl", "setPublicUrl", "toString", "app_debug"})
public final class ResItem {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String path;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String etag;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String contentType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String publicUrl;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mediaType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String previewUrl;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String modified;
    private boolean isDir;
    private long contentLength;
    
    /**
     * * @return time in milliseconds
     */
    private long lastUpdated;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    private final void setName(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPath() {
        return null;
    }
    
    private final void setPath(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEtag() {
        return null;
    }
    
    private final void setEtag(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContentType() {
        return null;
    }
    
    private final void setContentType(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPublicUrl() {
        return null;
    }
    
    private final void setPublicUrl(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMediaType() {
        return null;
    }
    
    private final void setMediaType(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPreviewUrl() {
        return null;
    }
    
    private final void setPreviewUrl(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getModified() {
        return null;
    }
    
    private final void setModified(java.lang.String p0) {
    }
    
    public final boolean isDir() {
        return false;
    }
    
    private final void setDir(boolean p0) {
    }
    
    public final long getContentLength() {
        return 0L;
    }
    
    private final void setContentLength(long p0) {
    }
    
    public final long getLastUpdated() {
        return 0L;
    }
    
    private final void setLastUpdated(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ResItem(@org.jetbrains.annotations.NotNull()
    com.yandex.disk.rest.json.Resource resource) {
        super();
    }
    
    public ResItem(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    java.lang.String name, long contentLength, long lastUpdated, boolean dir, @org.jetbrains.annotations.NotNull()
    java.lang.String etag, @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    java.lang.String publicUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String mediaType) {
        super();
    }
}
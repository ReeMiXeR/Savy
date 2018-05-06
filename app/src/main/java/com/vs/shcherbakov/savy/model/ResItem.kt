package com.vs.shcherbakov.savy.model

import com.yandex.disk.rest.json.Resource

class ResItem {

    var name: String? = null
        private set
    var path: String? = null
        private set
    var etag: String? = null
        private set
    var contentType: String? = null
        private set
    var publicUrl: String? = null
        private set
    var mediaType: String? = null
        private set
    var previewUrl: String? = null
        private set
    var modified: String? = null
        private set
    var isDir: Boolean = false
        private set
    var contentLength: Long = 0
        private set
    /**
     * @return time in milliseconds
     */
    var lastUpdated: Long = 0
        private set

    constructor(resource: Resource) {
        this.name = resource.name
        this.path = if (resource.path != null) resource.path.path else null  // Must throw an exception in real life code
        this.etag = resource.md5
        this.contentType = resource.mimeType
        this.publicUrl = resource.publicUrl
        this.mediaType = resource.mediaType
        this.isDir = resource.isDir
        this.modified = resource.modified.toString()
        this.contentLength = resource.size
        this.previewUrl = resource.preview
        this.lastUpdated = if (resource.modified != null) resource.modified.time else 0
    }

    constructor(path: String, name: String, contentLength: Long, lastUpdated: Long, dir: Boolean,
                etag: String, contentType: String, publicUrl: String, mediaType: String) {
        this.path = path
        this.name = name
        this.contentLength = contentLength
        this.lastUpdated = lastUpdated
        this.isDir = dir
        this.etag = etag
        this.contentType = contentType
        this.publicUrl = publicUrl
        this.mediaType = mediaType
    }

    override fun toString(): String {
        return "ResItem{" +
                "name='" + name + '\''.toString() +
                ", path='" + path + '\''.toString() +
                ", etag='" + etag + '\''.toString() +
                ", contentType='" + contentType + '\''.toString() +
                ", publicUrl='" + publicUrl + '\''.toString() +
                ", mediaType='" + mediaType + '\''.toString() +
                ", dir=" + isDir +
                ", contentLength=" + contentLength +
                ", lastUpdated=" + lastUpdated +
                '}'.toString()
    }
}
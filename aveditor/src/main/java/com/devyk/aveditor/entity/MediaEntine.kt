package com.devyk.aveditor.entity

import android.os.Parcel
import android.os.Parcelable

/**
 * <pre>
 *     author  : devyk on 2020-08-15 23:38
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is MediaEntine
 * </pre>
 */
data class MediaEntine(var path: String?, var startDuration: Long, var stopDuration: Long) : Parcelable {
    constructor(source: Parcel) : this(
        source.readString(),
        source.readLong(),
        source.readLong()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(path)
        writeLong(startDuration)
        writeLong(stopDuration)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<MediaEntine> = object : Parcelable.Creator<MediaEntine> {
            override fun createFromParcel(source: Parcel): MediaEntine =
                MediaEntine(source)
            override fun newArray(size: Int): Array<MediaEntine?> = arrayOfNulls(size)
        }
    }
}
// QQMusicLyricsProvider.kt

package com.momi.music.lyrics

import android.content.Context
import com.music.directlyrics.QQMusic
import com.momi.music.constants.EnableQQMusicKey
import com.momi.music.utils.dataStore
import com.momi.music.utils.get

object QQMusicLyricsProvider : LyricsProvider {
    override val name = "QQMusic"
    override fun isEnabled(context: Context): Boolean = context.dataStore[EnableQQMusicKey] ?: true

    override suspend fun getLyrics(
        id: String,
        title: String,
        artist: String,
        duration: Int,
        album: String?,
    ): Result<String> = QQMusic.getLyrics(title, artist, duration)
}

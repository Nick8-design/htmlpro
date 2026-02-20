package com.nickdieda.htmlpro.store



import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import com.nickdieda.htmlpro.data.model.NoteModule

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "app_preferences")

class DataStoreManager(private val context: Context) {


    private object PreferencesKeys {
        val ONBOARDING_COMPLETE = booleanPreferencesKey("onboarding_complete")
      val LAST_SUBTOPIC_ID = intPreferencesKey("last_subtopic_id")
    val LAST_SCROLL_INDEX = intPreferencesKey("last_scroll_index")
    val LAST_SCROLL_OFFSET = intPreferencesKey("last_scroll_offset")

        val COMPILER_SCRATCH_CODE = stringPreferencesKey("compiler_scratch_code")
        val PROJECT_FOLDER_KEY = stringPreferencesKey("project_folder_uri")
        val USERNAME = stringPreferencesKey("username")

        val HAS_RATED_APP = booleanPreferencesKey("has_rated_app")
        val CERTIFICATE_CLAIMED = booleanPreferencesKey("certificate_claimed")
    }


    val isCertificateClaimed: Flow<Boolean> = context.dataStore.data.map { it ->
        it[PreferencesKeys.CERTIFICATE_CLAIMED] ?: false
    }

    suspend fun setCertificateClaimed(claimed: Boolean) {
        context.dataStore.edit { prefs ->
            prefs[PreferencesKeys.CERTIFICATE_CLAIMED] = claimed
        }
    }
    val hasRatedApp: Flow<Boolean> = context.dataStore.data.map {
        it[PreferencesKeys.HAS_RATED_APP] ?: false
    }

    suspend fun markAsRated() {
        context.dataStore.edit { it[PreferencesKeys.HAS_RATED_APP] = true }
    }
    val username: Flow<String> = context.dataStore.data.map {
        it[PreferencesKeys.USERNAME] ?: "User"
    }

    suspend fun saveUsername(name: String) {
        context.dataStore.edit { it[PreferencesKeys.USERNAME] = name }
    }

    suspend fun saveProjectFolderUri(uri: String) {
        context.dataStore.edit { it[PreferencesKeys.PROJECT_FOLDER_KEY] = uri }
    }

    val projectFolderUri: Flow<String> = context.dataStore.data.map {
        it[PreferencesKeys.PROJECT_FOLDER_KEY] ?: ""
    }

    // Add these methods
    suspend fun saveCompilerCode(code: String) {
        context.dataStore.edit { it[PreferencesKeys.COMPILER_SCRATCH_CODE] = code }
    }

    val compilerCode: Flow<String> = context.dataStore.data.map {
        it[PreferencesKeys.COMPILER_SCRATCH_CODE] ?: "// Start coding here..."
    }

    fun getCompletedTopicsCount(topics: List<NoteModule>): Flow<Int> = context.dataStore.data.map { prefs ->
        topics.count { topic ->
            topic.subtopics.all { sub ->
                val progress = prefs[floatPreferencesKey("progress_${sub.sutopicId}")] ?: 0f
                progress >= 1f
            }
        }
    }

    suspend fun saveLastPosition(subId: Int, index: Int, offset: Int) {
        context.dataStore.edit { prefs ->
            prefs[PreferencesKeys.LAST_SUBTOPIC_ID] = subId
            prefs[PreferencesKeys.LAST_SCROLL_INDEX] = index
            prefs[PreferencesKeys.LAST_SCROLL_OFFSET] = offset
        }
    }


    // Get the last subtopic ID (used for the "Continue" button)
    val lastSubtopicId: Flow<Int?> = context.dataStore.data.map { it[PreferencesKeys.LAST_SUBTOPIC_ID] }

    // Get scroll position for a specific subtopic
    fun getScrollPosition(subId: Int): Flow<Pair<Int, Int>> = context.dataStore.data.map { prefs ->
        val savedId = prefs[PreferencesKeys.LAST_SUBTOPIC_ID]
        if (savedId == subId) {
            val index = prefs[PreferencesKeys.LAST_SCROLL_INDEX] ?: 0
            val offset = prefs[PreferencesKeys.LAST_SCROLL_OFFSET] ?: 0
            Pair(index, offset)
        } else Pair(0, 0)
    }




    suspend fun completeOnboarding() {
        context.dataStore.edit { preferences ->
            preferences[PreferencesKeys.ONBOARDING_COMPLETE] = true
        }
    }

    val isOnboardingComplete: Flow<Boolean> = context.dataStore.data
        .map { preferences ->
            preferences[PreferencesKeys.ONBOARDING_COMPLETE] ?: false
        }




//    suspend fun saveSubtopicProgress(subId: Int, progress: Float) {
//        context.dataStore.edit { prefs ->
//            // Only update if the new progress is higher to prevent "scrolling back up" from decreasing progress
//            val current = prefs[floatPreferencesKey("progress_$subId")] ?: 0f
//            if (progress > current) {
//                prefs[floatPreferencesKey("progress_$subId")] = progress
//            }
//        }
//    }
//
//    fun getSubtopicProgress(subId: Int): Flow<Float> = context.dataStore.data.map { prefs ->
//        prefs[floatPreferencesKey("progress_$subId")] ?: 0f
//    }


    // Inside DataStoreManager.kt

    suspend fun saveSubtopicProgress(subId: Int, readingProgress: Float) {
        context.dataStore.edit { prefs ->
            val currentReading = prefs[floatPreferencesKey("read_$subId")] ?: 0f
            if (readingProgress > currentReading) {
                prefs[floatPreferencesKey("read_$subId")] = readingProgress
            }
            updateTotalSubtopicProgress(prefs, subId)
        }
    }

    suspend fun saveQuizProgress(subId: Int, quizScore: Float) {
        context.dataStore.edit { prefs ->
            prefs[floatPreferencesKey("quiz_$subId")] = quizScore
            updateTotalSubtopicProgress(prefs, subId)
        }
    }

    private fun updateTotalSubtopicProgress(prefs: MutablePreferences, subId: Int) {
        val read = prefs[floatPreferencesKey("read_$subId")] ?: 0f
        val quiz = prefs[floatPreferencesKey("quiz_$subId")] ?: 0f

        // Formula: 50% from Reading + 50% from Quiz
        val totalProgress = (read * 0.5f) + (quiz * 0.5f)
        prefs[floatPreferencesKey("progress_$subId")] = totalProgress
    }

    fun getSubtopicProgress(subId: Int): Flow<Float> = context.dataStore.data.map { prefs ->
        prefs[floatPreferencesKey("progress_$subId")] ?: 0f
    }

    // Total progress: average of all completed subtopics
    fun getTotalProgress(allSubIds: List<Int>): Flow<Float> = context.dataStore.data.map { prefs ->
        if (allSubIds.isEmpty()) return@map 0f
        val totalProgress = allSubIds.sumOf { (prefs[floatPreferencesKey("progress_$it")] ?: 0f).toDouble() }
        (totalProgress / allSubIds.size).toFloat()
    }


}



package com.nickdieda.htmlpro.presentation.onboarding


import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore // Required import
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

// 1. Declare the DataStore at the top level of the file
private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "app_preferences")

class OnboardingManager(private val context: Context) {

    companion object {
        private val ONBOARDING_KEY = booleanPreferencesKey("onboarding_complete")
    }

    // 2. Access it via the context
    val isOnboardingComplete: Flow<Boolean> = context.dataStore.data
        .map { preferences ->
            preferences[ONBOARDING_KEY] ?: false
        }

    suspend fun completeOnboarding() {
        context.dataStore.edit { preferences ->
            preferences[ONBOARDING_KEY] = true
        }

    }
}
package com.nickdieda.htmlpro.navigation



import androidx.lifecycle.ViewModel
import com.nickdieda.htmlpro.data.notesRepository.NotesRepository
import com.nickdieda.htmlpro.store.DataStoreManager

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
     val dataStore: DataStoreManager,
     val notesRepository: NotesRepository
) : ViewModel() {


//    val isOnboardingComplete = dataStore.isOnboardingComplete
//
//
//
//    fun completeOnboarding() {
//        viewModelScope.launch {
//            dataStore.completeOnboarding()
//        }
//    }

    fun updateTitle(subtopicId: Int) {
        // Handle logic here instead of in the Composable
    }



}
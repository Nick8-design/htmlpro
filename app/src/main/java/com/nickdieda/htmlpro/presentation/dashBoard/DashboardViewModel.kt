package com.nickdieda.htmlpro.presentation.dashBoard

import androidx.lifecycle.ViewModel
import com.nickdieda.htmlpro.data.notesRepository.NotesRepository
import com.nickdieda.htmlpro.store.DataStoreManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    val dataStoreManager: DataStoreManager,
    private val repository: NotesRepository
) : ViewModel() {

    // You can move the logic for currentSubtopic here to keep the Composable clean
    fun getSubtopic(id: Int?) = id?.let { repository.getSubtopicById(it) }
    fun getPosition(id: Int?) = id?.let { repository.getSubtopicPosition(it) } ?: Pair(0,0)



}
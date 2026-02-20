package com.nickdieda.htmlpro.presentation.search



import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nickdieda.htmlpro.data.model.Headline
import com.nickdieda.htmlpro.data.notes.HtmlNotes
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*

class SearchViewModel : ViewModel() {

    private val _searchText = MutableStateFlow("")
    val searchText = _searchText.asStateFlow()

    private val _isSearching = MutableStateFlow(false)
    val isSearching = _isSearching.asStateFlow()

    // High-performance search flow
    val searchResults = _searchText
        .debounce(300L) // Wait for user to stop typing (saves CPU)
        .onEach { _isSearching.update { true } }
        .combine(flowOf(HtmlNotes)) { text, notes ->
            if (text.isBlank()) {
                emptyList<SearchMatch>()
            } else {
                // Search in background thread
                kotlinx.coroutines.withContext(Dispatchers.Default) {
                    notes.flatMap { topic ->
                        topic.subtopics.flatMap { subtopic ->
                            subtopic.headlines
                                .filter { headline ->
                                    headline.headline?.contains(text, ignoreCase = true) == true ||
                                            headline.majorHeadline?.contains(text, ignoreCase = true) == true ||
                                            headline.explaination?.contains(text, ignoreCase = true) == true
                                }
                                .map { SearchMatch(topic.topic, subtopic.sutopicId, it) }
                        }
                    }
                }
            }
        }
        .onEach { _isSearching.update { false } }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            emptyList()
        )

    fun onSearchTextChange(text: String) {
        _searchText.value = text
    }
}

// Data wrapper to know where the result came from
data class SearchMatch(
    val topicName: String,
    val subtopicId: Int,
    val headline: Headline
)
package com.nickdieda.htmlpro.data.notesRepository


import com.nickdieda.htmlpro.data.model.Headline
import com.nickdieda.htmlpro.data.model.Subtopic
import com.nickdieda.htmlpro.data.notes.HtmlNotes
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NotesRepository @Inject constructor() {

    // Helper to find a subtopic object by its ID
    fun getSubtopicById(subId: Int): Subtopic? {
        return HtmlNotes.flatMap { it.subtopics }
            .find { it.sutopicId == subId }
    }
    fun getSubtopicName(subId: Int): String {
        return HtmlNotes.flatMap { it.subtopics }
            .find { it.sutopicId == subId }
            ?.subTopicName ?: ""
    }

    // Helper to find position (e.g., 3 out of 10)
    fun getSubtopicPosition(subId: Int): Pair<Int, Int> {
        val parentTopic = HtmlNotes.find { topic ->
            topic.subtopics.any { it.sutopicId == subId }
        } ?: return Pair(0, 0)

        val index = parentTopic.subtopics.indexOfFirst { it.sutopicId == subId } + 1
        val total = parentTopic.subtopics.size

        return Pair(index, total)
    }

    private val subtopicLookup: Map<Int, List<Headline>> by lazy {
        HtmlNotes.flatMap { it.subtopics }
            .associate { it.sutopicId to it.headlines }
    }

    fun fetchSubtopicNotes(subtopicId: Int): List<Headline> {
        return subtopicLookup[subtopicId] ?: emptyList()
    }
}
package com.nickdieda.htmlpro.data.model



data class Headline(
    val  majorHeadline: String? ="",
    val majorHeadileExplanation :String?="",
    val  headline:String?= "",
    val explaination:String?="",
    val tip:String?="",
    val codeExample:String?="",
    val codeOutput: String?="",
    val afterCodeEplainations:String?="",

    )

data class QuizQuestion(
    val question: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)

data class Subtopic(
    val  sutopicId: Int=0,
    val subTopicName: String="",
    val headlines:List<Headline> = emptyList(),
    val questions: List<QuizQuestion> = emptyList(),
)

data class NoteModule(
    val topicId: Int =0,
   val  topic: String ="",
   val  subtopics: List<Subtopic> = emptyList()

    )




package com.nickdieda.htmlpro.presentation.quiz

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.nickdieda.htmlpro.data.model.QuizQuestion

@Composable
fun Quiz(

    questions: List<QuizQuestion>,
    onQuizComplete: (Float) -> Unit // returns percentage (0.0 to 1.0)
) {
    val selectedAnswers = remember { mutableStateMapOf<Int, Int>() }
    var showResultDialog by remember { mutableStateOf(false) }
    var finalScore by remember { mutableStateOf(0) }

    val goldGradient = Brush.verticalGradient(
        colors = listOf(
            MaterialTheme.colorScheme.background.copy(alpha = 0.8f),
            MaterialTheme.colorScheme.background.copy(alpha = 0.3f),
//                MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)

        )
    )
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
//        Text("Topic Quiz", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(modifier = Modifier.weight(1f)) {
            itemsIndexed(questions) { index, q ->
                Card(modifier = Modifier.fillMaxWidth()
                    .padding(vertical = 8.dp)


                ) {
                    Column(modifier = Modifier.fillMaxWidth().background(brush = goldGradient).padding(12.dp)) {
                        Text("${index + 1}. ${q.question}", fontWeight = FontWeight.SemiBold)
                        q.options.forEachIndexed { optIndex, option ->
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                RadioButton(
                                    selected = selectedAnswers[index] == optIndex,
                                    onClick = { selectedAnswers[index] = optIndex }
                                )
                                Text(option)
                            }
                        }
                    }
                }
            }
        }

        Button(
            onClick = {
                var correct = 0
                questions.forEachIndexed { i, q -> if (selectedAnswers[i] == q.correctAnswerIndex) correct++ }
                finalScore = correct
                showResultDialog = true
            },
            modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp),
            enabled = selectedAnswers.size == questions.size
        ) {
            Text("Submit Answers")
        }
    }

    if (showResultDialog) {
        AlertDialog(
            onDismissRequest = { },
            title = { Text("Quiz Results") },
            text = { Text("You got $finalScore out of ${questions.size} correct!") },
            confirmButton = {
                TextButton(onClick = {
                    showResultDialog = false
                    val percentage = finalScore.toFloat() / questions.size
                    onQuizComplete(percentage)
                }) { Text("Finish") }
            }
        )
    }
}
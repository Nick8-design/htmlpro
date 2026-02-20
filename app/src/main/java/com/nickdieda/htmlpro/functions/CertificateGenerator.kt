package com.nickdieda.htmlpro.functions


import android.content.Context
import android.graphics.*
import android.graphics.pdf.PdfDocument
import android.os.Environment
import android.widget.Toast
import com.nickdieda.htmlpro.R
import java.io.File
import java.io.FileOutputStream

object CertificateGenerator {
    fun generateCertificate(context: Context, userName: String) {
        val pdfDocument = PdfDocument()

        // A4 Landscape Dimensions (842 x 595)
        val pageInfo = PdfDocument.PageInfo.Builder(842, 595, 1).create()
        val page = pdfDocument.startPage(pageInfo)
        val canvas: Canvas = page.canvas

        // 1. Background and Border
        val paint = Paint().apply { isAntiAlias = true }

        // Soft Cream Background
        paint.color = Color.parseColor("#FFFEFA")
        canvas.drawRect(0f, 0f, 842f, 595f, paint)

        // Elegant Double Border
        paint.color = Color.parseColor("#1A237E") // Navy Blue
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 15f
        canvas.drawRect(30f, 30f, 812f, 565f, paint)

        paint.strokeWidth = 2f
        canvas.drawRect(45f, 45f, 797f, 550f, paint)

        // 2. Draw App Logo
        val logoBitmap = BitmapFactory.decodeResource(context.resources, R.drawable.icon)
        if (logoBitmap != null) {
            val scaledLogo = Bitmap.createScaledBitmap(logoBitmap, 80, 80, true)
            canvas.drawBitmap(scaledLogo, 381f, 70f, null) // Centered at top
        }


        // 3. Text Content
        val textPaint = Paint().apply {
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
            color = Color.parseColor("#1A237E")
        }

        // Title
        textPaint.textSize = 45f
        textPaint.typeface = Typeface.create(Typeface.SERIF, Typeface.BOLD)
        canvas.drawText("CERTIFICATE OF ACHIEVEMENT", 421f, 200f, textPaint)

        // Subtitle
        textPaint.color = Color.GRAY
        textPaint.textSize = 18f
        textPaint.typeface = Typeface.create(Typeface.DEFAULT, Typeface.NORMAL)
        canvas.drawText("This acknowledges that", 421f, 250f, textPaint)

        // User Name (The Highlight)
        textPaint.color = Color.BLACK
        textPaint.textSize = 55f
        textPaint.typeface = Typeface.create("cursive", Typeface.BOLD_ITALIC) // Uses system cursive if available
        canvas.drawText(userName, 421f, 330f, textPaint)

        // Achievement Detail
        textPaint.color = Color.GRAY
        textPaint.textSize = 20f
        textPaint.typeface = Typeface.create(Typeface.DEFAULT, Typeface.NORMAL)
        canvas.drawText("has successfully mastered the fundamentals of", 421f, 380f, textPaint)

        textPaint.color = Color.parseColor("#1A237E")
        textPaint.textSize = 24f
        textPaint.typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        canvas.drawText("Modern HTML Development", 421f, 420f, textPaint)

        // 4. Signature Section (Bottom Right)
        val sigBitmap = BitmapFactory.decodeResource(context.resources, R.drawable.sygnat)
        if (sigBitmap != null) {
            val scaledSig = Bitmap.createScaledBitmap(sigBitmap, 150, 60, true)
            canvas.drawBitmap(scaledSig, 550f, 450f, null)
        }

        // Line under signature
        paint.color = Color.BLACK
        paint.strokeWidth = 1f
        canvas.drawLine(530f, 515f, 720f, 515f, paint)

        textPaint.textSize = 14f
        textPaint.color = Color.BLACK
        canvas.drawText("Authorized Signature", 625f, 535f, textPaint)

        // 5. Designer Name (Bottom Left)
        textPaint.textAlign = Paint.Align.LEFT
        textPaint.typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        canvas.drawText("Lead Instructor: Nick Dieda", 100f, 510f, textPaint)
        canvas.drawText("Date: ${java.text.SimpleDateFormat("MMM dd, yyyy").format(java.util.Date())}", 100f, 535f, textPaint)

        pdfDocument.finishPage(page)

        // 6. Save to Storage
        val directory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
        val file = File(directory, "Html_Pro_Certificate_${userName.replace(" ", "_")}.pdf")

        try {
            pdfDocument.writeTo(FileOutputStream(file))
            Toast.makeText(context, "Certificate Saved to Downloads!", Toast.LENGTH_LONG).show()
        } catch (e: Exception) {
            Toast.makeText(context, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
        } finally {
            pdfDocument.close()
        }
    }
}
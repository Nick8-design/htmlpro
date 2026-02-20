package com.nickdieda.htmlpro.presentation.aboutUs

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Shop
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AboutUs(modifier: Modifier = Modifier) {

    val uriHandler = LocalUriHandler.current
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "JS",
            fontSize = 32.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFFFFD600)
        )

        Text(
            text = "Memorize JavaScript",
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "About the Developers",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Divider(
            thickness = 1.dp,
            modifier = Modifier.fillMaxWidth(0.6f)
        )

        Spacer(modifier = Modifier.height(24.dp))

        DeveloperCardCentered(
            name = "Nick Dieda Dieda",
            role = "Lead Developer",
            portfolioUrl = "https://nickdieda.web.app/"
        )

        Spacer(modifier = Modifier.height(16.dp))

        DeveloperCardCentered(
            name = "Alizen Juma",
            role = "Content Creator",
            portfolioUrl = "https://alizenjuma.vercel.app/"
        )

        Spacer(modifier = Modifier.height(14.dp))

        Button(
            onClick = {

                val developerName = "Nick Dieda Dieda"

                val playStoreIntent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("market://search?q=pub:$developerName")
                )

                val fallbackIntent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/search?q=pub:$developerName&c=apps")
                )

                try {
                    context.startActivity(playStoreIntent)
                } catch (e: Exception) {
                    context.startActivity(fallbackIntent)
                }
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFD600),
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(14.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
        )
        {
            Icon(
                imageVector = Icons.Filled.Shop,
                contentDescription = "Play Store",
                modifier = Modifier.size(22.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = "More apps by this developer",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(28.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Divider(
                thickness = 1.dp,
                modifier = Modifier.weight(1f)
            )

            Text(
                text = " Contact ",
                fontSize = 14.sp
            )

            Divider(
                thickness = 1.dp,
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Email: nickdieda888@gmail.com",
            modifier = Modifier.clickable {
                uriHandler.openUri("mailto:nickdieda888@gmail.com")
            },
            textDecoration = TextDecoration.Underline
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = "Phone: +254 700 742 362",
            modifier = Modifier.clickable {
                uriHandler.openUri("tel:+254700742362")
            },
            textDecoration = TextDecoration.Underline
        )
    }
}

@Composable
fun DeveloperCardCentered(
    name: String,
    role: String,
    portfolioUrl: String
) {
    val uriHandler = LocalUriHandler.current

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp),
        shape = RoundedCornerShape(18.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 18.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = name,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = role,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(6.dp))

            ClickableText(
                text = AnnotatedString(
                    text = portfolioUrl,
                    spanStyle = SpanStyle(
                        color = MaterialTheme.colorScheme.primary.copy(alpha = 0.8f),
                        textDecoration = TextDecoration.Underline
                    )
                ),
                onClick = { uriHandler.openUri(portfolioUrl) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AboutDevelopersPreview() {
    MaterialTheme {
        AboutUs()
    }
}

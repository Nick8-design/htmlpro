package com.nickdieda.htmlpro.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Notes
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.nickdieda.htmlpro.navigation.ScreenRoutes


val CurvedBarShape = GenericShape { size, _ ->
    val width = size.width
    val height = size.height
    val curveHeight = 40f // Adjust the "arch" intensity here

    moveTo(0f, curveHeight)
    // Create the top arch
    quadraticTo(
        x1 = width / 2f, y1 = -curveHeight, // Control point for the peak
        x2 = width, y2 = curveHeight
    )
    // Draw the rest of the rectangle with rounded corners
    lineTo(width, height)
    lineTo(0f, height)
    close()
}



@Composable
fun LuxuryBottomBar(navController: NavHostController) {
    val goldGradient = Brush.verticalGradient(
        colors = listOf(
            MaterialTheme.colorScheme.primary,
            MaterialTheme.colorScheme.inverseOnSurface,
            MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)

    )
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(110.dp)

        ,
        contentAlignment = Alignment.BottomCenter
    ) {
        // 1. The Main Background Bar
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .graphicsLayer {
                    shape = CurvedBarShape
                    clip = true
                }
                // Border for the metallic edge
                .border(2.dp, goldGradient, CurvedBarShape),

            color = MaterialTheme.colorScheme.background,
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Home Item
                NavigationItem(
                    icon = Icons.Default.Home,
                    label = "Home",
                    isSelected = currentRoute == ScreenRoutes.DashBoard.route,
                    onClick = {

                        if (currentRoute == ScreenRoutes.Notes.route) {
                            navigateToTab(navController, ScreenRoutes.DashBoard.route)
                        } else {
                            navController.popBackStack(ScreenRoutes.DashBoard.route, inclusive = false)

                        }
                    }
                )
//
                Spacer(modifier = Modifier.width(80.dp))


                NavigationItem(
                    icon = Icons.AutoMirrored.Filled.Notes,
                    label = "Notes",
                    isSelected = currentRoute == ScreenRoutes.Notes.route,
                    onClick = { navigateToTab(navController, ScreenRoutes.Notes.route) }
                )

                // Spacer for the center button


            }
        }


        Box(
            modifier = Modifier
                .size(75.dp)
                .offset(y = (-35).dp) // Pull it upwards
                .background(
                    MaterialTheme.colorScheme.inverseOnSurface, CircleShape)
                .border(3.dp, goldGradient, CircleShape)
                .shadow(1.dp, CircleShape)
                .clickable{
                    navigateToTab(navController, ScreenRoutes.Search.route)

                          }
            ,

            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search",
                modifier = Modifier.size(40.dp),
//                tint = Color(0xFFD4AF37)
            )
        }
    }
}
private fun navigateToTab(navController: NavController, route: String) {
    navController.navigate(route) {

    }
}

@Composable
fun NavigationItem(
    icon: ImageVector,
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(CircleShape) // Adds a nice ripple effect
            .clickable { onClick() }
            .padding(8.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = label,
            // Bright gold if selected, muted gold if not
            tint = if(isSelected) MaterialTheme.colorScheme.primary
//                Color(0xFFF9E498)
            else
                MaterialTheme.colorScheme.primary.copy(alpha = 0.6f)
//                Color(0xFF7A5920)
        )
        Text(
            text = label,
            fontSize = 12.sp,
            color = if(isSelected) MaterialTheme.colorScheme.primary
            else
                MaterialTheme.colorScheme.primary.copy(alpha = 0.6f)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun LuxuryBottomBarPreview() {
    LuxuryBottomBar(rememberNavController())
}


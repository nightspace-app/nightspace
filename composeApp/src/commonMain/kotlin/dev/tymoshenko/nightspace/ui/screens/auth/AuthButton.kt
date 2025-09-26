package dev.tymoshenko.nightspace.ui.screens.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AuthButton(
    onClick: () -> Unit,
    text: String,
    leadingIcon: (@Composable () -> Unit)? = null
) {
    Button(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .heightIn(min = 48.dp),
        onClick = onClick,
//        colors = ButtonDefaults.buttonColors().copy(
//            containerColor = Color.DarkGray
//        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .align(Alignment.CenterStart)
            ) {
                leadingIcon?.invoke()
            }

            Text(
                text = text,
                fontStyle = FontStyle.Italic,
                fontSize = 20.sp,
            )
        }
    }
}
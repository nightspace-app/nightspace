package dev.tymoshenko.nightspace.ui.screens.auth.initial

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import dev.tymoshenko.nightspace.nav.screens.AuthScreens
import dev.tymoshenko.nightspace.ui.screens.auth.AuthButton
import nightspace.composeapp.generated.resources.Res
import nightspace.composeapp.generated.resources.auth_img
import nightspace.composeapp.generated.resources.google_icon
import org.jetbrains.compose.resources.painterResource

@Composable
fun Initial(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .padding(16.dp),
                painter = painterResource(Res.drawable.auth_img),
                contentDescription = ""
            )

            Spacer(Modifier.size(32.dp))

            AuthButton(
                onClick = { },
                text = "Sign in with Google",
                leadingIcon = {
                    Image(
                        modifier = Modifier
                            .size(30.dp),
                        painter = painterResource(Res.drawable.google_icon),
                        contentDescription = ""
                    )
                }
            )

            Spacer(Modifier.size(16.dp))

            AuthButton(
                onClick = { navController.navigate(AuthScreens.Login) },
                text = "Sign in with Email"
            )

            Spacer(Modifier.size(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                TextButton(onClick = { navController.navigate(AuthScreens.Register) }) {
                    Text("Register with Email")
                }
            }
        }
    }
}
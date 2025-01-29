package com.example.loginform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginform.ui.theme.LoginformTheme
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.Color
import com.example.loginform.ui.theme.composables.OutlinedTextFieldWithIconForLoginform

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginformTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TrailingIconApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun TrailingIconApp(modifier: Modifier= Modifier){
    Column(
        modifier = modifier
    ) {
        OutlinedTextFieldWithIconForLoginform(
            "User",
            Icons.Filled.Person,
            contentDescription = "Person icon"
        )
        OutlinedTextFieldWithIconForLoginform("Password", Icons.Filled.Lock)

        Button(
            onClick = { /* Handle login action */ },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
        ) {
            Text("Submit", color = Color.White)
        }
    }
}